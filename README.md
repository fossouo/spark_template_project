# spark_template_project
Template of a spark project using maven

1. move to the folder containing the project 

2. Run : mvn clean package;
copy the table.csv from the project path to C:\\tmp\\table.csv

3. after that launch this command on windows : 

spark-submit --conf spark.local.dir=C:\tmp\spark --class com.donald.scala.MaxPrice target\sparkproject-1.0-SNAPSHOT.jar C:\\tmp\\table.csv