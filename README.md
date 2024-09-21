# Todo List (Backend)

Welcome to the Backend of todolist-react! This application consists of both a frontend and backend.   
The frontend is built with [Create React App](https://github.com/facebook/create-react-app).   
To run the full application, you'll also need to set up the frontend.

## Frontend Repository

You can find the frontend repository: [Todo List](https://github.com/jslee124/todolist-react)

## Setting up the MySQL Database

Before you can build your application, you first need to configure a MySQL database.  
You should first create a database called spring_mysql by running:    

`CREATE DATABASE spring_mysql;`  

Then run:  

`CREATE USER 'springuser'@'localhost' IDENTIFIED BY 'spirng123';`  

`GRANT select, insert, delete, update ON spring_mysql.* TO 'springuser'@'host';` 

## How to Run Locally

Lauch the project in IntelliJ IDEA after gradle finished building.
