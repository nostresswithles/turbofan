# About
This document aims to transform the [kaggle turbofan dataset](https://www.kaggle.com/datasets/behrad3d/nasa-cmaps) in such way it can be inserted in a Postgres Database deployed on a Linode server. <br>
First, all the text files are transformed into csv files. <br>
Then, a Dockerfile and schema.sql are copied into the remote Linode server. <br>
After, Postgres database docker image is created and is deployed. <br>
Finally, the cleaned data is inserted into the postgres databases' tables.

## Transforming datasets
The train and test datasets are text files that can not directly be transformed into a valid csv file. <br>
First, it has two trailing spaces at the end of each line. <br>
Second, between the values are spaces as delimiter instead of commas.

For that reason a script is made that transforms both these datasets in valid csv files.<br>
You can run this script as follows from the root of your project:
```bash
./db/transform_dataset.sh
```
The train and test data can now be found in .db/data/cleaned


## Get the Dockerfile and schema to linode
From the root of the project type the following command
```bash
 scp ./db/Dockerfile ./db/schema.sql root@139.162.146.253:~/projects/db
``` 

## Deploy the container in Linode
Enter your linode object using `ssh` and `cd` to where the Dockerfile is located. <br>
Run the following command to build the docker image: <br> 
```bash
 docker build -t nostresswithles/turbofan_db .
```

Run the following command to deploy the docker container with the postgres database in detached mode.
```bash 
    docker run --rm --name turbofan_db -v ${HOME}/Sync/turbofan_db/pgdata:/var/lib/postgresql/data -e POSTGRES_PASSWORD=1234 -e POSTGRES_DB=turbofan_data -d -p 6666:5432 nostresswithles/turbofan_db    
```

## Copy the contents of cleaned data to Linode
The csv files need to be placed inside the /pgdata folder so that the database can read it from inside Docker
From the root of the project type the following command
```bash
 scp -r ./db/data/cleaned/* root@139.162.146.253:~/Sync/turbofan_db/pgdata
```

## Import CSV into database
First run psql inside the docker container
```bash
    docker exec -it turbofan_db psql -U postgres -d turbofan_data
```

in the psql terminal run the command that copies all csv files as tables into the database
```postgresql
    \copy train_fd001 FROM '/var/lib/postgresql/data/train_FD001.csv' DELIMITER ',' CSV
    \copy train_fd002 FROM '/var/lib/postgresql/data/train_FD002.csv' DELIMITER ',' CSV
    \copy train_fd003 FROM '/var/lib/postgresql/data/train_FD003.csv' DELIMITER ',' CSV
    \copy train_fd004 FROM '/var/lib/postgresql/data/train_FD004.csv' DELIMITER ',' CSV
    \copy test_fd001 FROM '/var/lib/postgresql/data/test_FD001.csv' DELIMITER ',' CSV
    \copy test_fd002 FROM '/var/lib/postgresql/data/test_FD002.csv' DELIMITER ',' CSV
    \copy test_fd003 FROM '/var/lib/postgresql/data/test_FD003.csv' DELIMITER ',' CSV
    \copy test_fd004 FROM '/var/lib/postgresql/data/test_FD004.csv' DELIMITER ',' CSV
    \copy rul_fd001 FROM '/var/lib/postgresql/data/RUL_FD001.csv' DELIMITER ',' CSV
    \copy rul_fd002 FROM '/var/lib/postgresql/data/RUL_FD002.csv' DELIMITER ',' CSV
    \copy rul_fd003 FROM '/var/lib/postgresql/data/RUL_FD003.csv' DELIMITER ',' CSV
    \copy rul_fd004 FROM '/var/lib/postgresql/data/RUL_FD004.csv' DELIMITER ',' CSV;
```

 
### CleanUP
To delete all containers including its volumes use,
```bash
    docker rm -vf $(docker ps -aq)  OR docker rm -vf turbofan_db
```


To delete all the images,
```bash
    docker rmi -f $(docker images -aq) OR docker rmi -f $(docker images -aq)
```

#### appendix
https://sherryhsu.medium.com/how-to-import-csv-into-docker-postgresql-database-22d56e2a1117