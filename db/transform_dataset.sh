#!/bin/bash
<<script_info
  This script transforms the .txt training and test data files into valid csv files.
  More specifically, the train_FD00*.txt and test_FD00*.txt files
script_info

transform(){
  local regex_1=$1;
  local regex_2=$2;

  for regex in ${regex_1} ${regex_2}
  do
    for file in ./db/data/${regex}*.txt
    do
        #The following operation removes two spaces at the end of the line.
        sed -e 's/  $//g' ${file} > ./db/data/tmp/${file##*/}

        #The following operation replaces each space with a comma
        sed -e "s/ /,/g" ./db/data/tmp/${file##*/} > ./db/data/cleaned/${file##*/}
    done
  done
}

mv_rul(){
    for file in ./db/data/RUL*.txt
    do
        mv "${file}" ./db/data/cleaned/${file##*/}
    done
}

change_extension(){
  for file in ./db/data/cleaned/*.txt
  do
      mv -- "${file}" "${file%.txt}.csv"
  done
}

run(){
  echo "Running the delimiter_update.sh script"
  mkdir -p ./db/data/tmp
  mkdir -p ./db/data/cleaned

  echo "Transforming the .txt files into valid .csv files!..."
  transform "train" "test"

  echo "Transformation completed, removing tmp dir"
  rm -rf ./db/data/tmp

  echo "Moving the RUL dataset"
  mv_rul

  echo "Changing extension"
  change_extension

  echo "DONE!"
  echo "The train and test data can now be found in .db/data/cleaned/"
}

run