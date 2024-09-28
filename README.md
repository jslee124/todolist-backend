# Todo List (Backend)

Welcome to the Backend of todolist-react! This application consists of both a frontend and backend.   
The frontend is built with [Create React App](https://github.com/facebook/create-react-app).   
To run the full application, you'll also need to set up the frontend.

## Frontend Repository

You can find the frontend repository: [Todo List](https://github.com/jslee124/todolist-react)

## 设置 MySQL 数据库  
在构建应用程序之前，您需要先配置一个 MySQL 数据库。  
首先，您应该运行以下命令创建一个名为 spring_mysql 的数据库：  

```
CREATE DATABASE spring_mysql;
```

然后通过以下指令来创建MySQL用户并授予相关权限：  

```
CREATE USER 'springuser'@'localhost' IDENTIFIED BY 'spirng123';
GRANT select, insert, delete, update ON spring_mysql.* TO 'springuser'@'host';
```

## Setting up the MySQL Database

Before you can build your application, you first need to configure a MySQL database.  
You should first create a database called spring_mysql by running:    

```
CREATE DATABASE spring_mysql;
```

Then create a MySQL user and grant relevant privileges by running:  

```
CREATE USER 'springuser'@'localhost' IDENTIFIED BY 'spirng123';
GRANT select, insert, delete, update ON spring_mysql.* TO 'springuser'@'host';
```

## How to Run Locally

Launch the project in IntelliJ IDEA after gradle finished building.
