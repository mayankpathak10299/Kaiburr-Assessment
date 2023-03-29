# Task_2-Swagger codegen.

---

#### Please install all the required mvn packages
#### All the project related files are in springboot-mongodb folder.All other files are just screenshots

#### A Simple Backend Application is Designed with help of SpringBoot and MongoDB.

---

## Requirement:
#### 1.Java JDK 8
#### 2.IDE for Running SpringBoot Application eg. IntelliJ
#### 3.MongoDB Compass
#### 4.Postman

#### PORT : 8080 is use for running the Application

---

## Application is able to 
#### create an object
#### fetching all stored objects in MongoDB
#### delete an object by id
#### search objects by name

---

## Create an object:
### endpoint: http://localhost:8080/create
## fetching all stored object in MongoDB
### endpoint : http://localhost:8080/getAll
## delete an object by id
### endpoint : http://localhost:8080/delete/{id}
## search objects by name
- All the objects with required name will be given as response
### endpoint : http://localhost:8080/name/{name}
## MongoDB server is running locally