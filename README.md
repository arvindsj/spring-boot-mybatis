# Spring Boot Mybatis H2 & Postgres Example

Setup Instructions:
1) Install H2 DB and create a DB named "multitest"
2) Install Postgres DB and create a DB named testDB
3) Execute the following script in Postgres DB 
CREATE TABLE EMP(ID INT PRIMARY KEY,NAME VARCHAR(255),SALARY INT);
insert into EMP(id,name,salary) values(1,'Youtube',2333);
4) Run maven build
5) Run the Spring-boot project
6) Access http://localhost:3000//v1/users
