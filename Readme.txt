Spring boot, Hibernate, MySQL REST API
A simple Spring boot application that demonstrates the usage of RESTful API using Spring boot, Hibernate and MySQL.

Tools and Technologies used
Java 1.8
Spring boot 2.1.1
MySQL
JPA
Hibernate
Maven
Eclipse Oxygen
Steps to install
1. Clone the application

git clone https://github.com/scbushan05/spring-boot-hibernate-mysql-rest-api.git
2. Create MySQL database

CREATE DATABASE crudapi
3. Create table or Run the SQL script file

CREATE TABLE tbl_employee
(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    	name VARCHAR(255),
    	gender VARCHAR(255),
    	department VARCHAR(255),
    	dob DATE
)
4. Change MySQL Username and Password as per your MySQL Installation

open src/main/resources/application.properties file.

change spring.datasource.username and spring.datasource.password as per your installation
