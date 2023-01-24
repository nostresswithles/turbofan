https://sherryhsu.medium.com/how-to-import-csv-into-docker-postgresql-database-22d56e2a1117
## Transforming datasets
The train and test datasets are text files that can not directly be transformed into a valid csv file. <br>
First, it has two trailing spaces at the end of each line. <br>
Second, between the values are spaces as delimiter instead of commas.

For that reason a script is made that transforms both these datasets in valid csv files.<br>
You can run this script as follows from the root of your project:
```bash
./db/delimiter_update.sh
```
The train and test data can now be found in .db/data/cleaned
<br>
++++++

scp db/* <user>@<Private IP>>:~/projects/db

docker build -t nostresswithles/turbofan_db .

docker run --rm --name turbofan_db -v ${HOME}/Sync/turbofan_db/pgdata:/var/lib/postgresql/data -e POSTGRES_PASSWORD=1234 -e POSTGRES_DB=turbofan_data -p 6666:5432 nostresswithles/turbofan_db
scp db/data/* root@139.162.146.253:~/Sync/turbofan_db/pgdata


docker exec -it turbofan_db psql -U postgres -d turbofan_data

\copy data_model FROM '/var/lib/postgresql/data/train_FD001.txt' DELIMITER ' ' CSV;
\copy data_model (unit_number, time_in_cycles, op_setting_1, op_setting_2, op_setting_3, sensor_measurement_1, sensor_measurement_2, sensor_measurement_3, sensor_measurement_4, sensor_measurement_5, sensor_measurement_6, sensor_measurement_7, sensor_measurement_8, sensor_measurement_9, sensor_measurement_10, sensor_measurement_11, sensor_measurement_12, sensor_measurement_13, sensor_measurement_14, sensor_measurement_15, sensor_measurement_16, sensor_measurement_17, sensor_measurement_18, sensor_measurement_19, sensor_measurement_20, sensor_measurement_21) FROM '/var/lib/postgresql/data/train_FD001.txt' DELIMITER ' ' CSV; 

To delete all containers including its volumes use,

docker rm -vf $(docker ps -aq)
To delete all the images,

docker rmi -f $(docker images -aq)

