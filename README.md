# HealthCare
This project was generated with Spring MVC.JPA (Hibernate)
## TASK
backend & database ucun :
15 muxtelif obyekin muxtelif 1-10 bolmeleri var. 
Bu obyeklerin  bölmeleri arasinda eyni olanlari ve ferqli olanlari da var. 
Axtaris verilen zaman, (her hansi bir obyekt ve ya bolmesi):
obyekt axtarisi: bolmeleri;
bolmeleri axtarisi : hansi  oytektin daxilinde ise onlarda gosterilir

## Before Build
Import AHC.sql () file in MYSQL database.If you are using other database.Just change 
`hibernate.hbm2ddl.auto=update` to `create-drop` 
and Also configure application properties for your machine.
P.S:application.properites locales in `src/main/resources`.
it will create table and columns for you.
You will need just fill with data.

## Build

It is a Maven project. Therefore before deploying server.You should Clean,Compile and Install Maven dependencies.
After Successfully Running.There should be [target] folder which is war file locale inside.
mvn clean;
mvn compile;
mvn install;

## RUN 
Place War file inside Tomcat or whatever server you are using.

## Further help

[naguliyev2018@ada.edu.az](mailTo:naguliyev2018@ada.edu.az).
Contact:[055-974-3736](********).

