# newsPort
this is a Java/Spark application with a rest REST API for querying and retrieving scoped news and information. News, articles and posts are available to all users without navigating into any department, and others that are housed or classified within departments.

### author name
* Lulu Thuku

### Project setup instructions
* install INTELLIJ IDEA
* JAVA as programming language
* Have POSTGRES and MAVEN
* Access to HEROKU

#### Setup Requirements for Database
* CREATE DATABASE newsport;
* \c newsport;
* CREATE TABLE departments(id serial PRIMARY KEY, name VARCHAR, description VARCHAR);
* CREATE TABLE users(id serial PRIMARY KEY, name VARCHAR, position VARCHAR, department VARCHAR ,departments_id INTEGER);
* CREATE TABLE news(id serial PRIMARY KEY, title VARCHAR, writtenby VARCHAR, content VARCHAR, type VARCHAR, users_id INTEGER, departments_id INTEGER, createdat timestamp);
* CREATE TABLE users_departments(id serial PRIMARY KEY, users_id INTEGER, departments_id INTEGER);
* CREATE TABLE general_news(id serial PRIMARY KEY,title VARCHAR, writtenby VARCHAR, content VARCHAR,createdat timestamp, users_id INTEGER);
* CREATE TABLE users_generalnews(id serial PRIMARY KEY, users_id INTEGER,generalnews_id INTEGER);
* CREATE TABLE departments_news(id serial PRIMARY KEY,title VARCHAR, writtenby VARCHAR, content VARCHAR,createdat timestamp, users_id INTEGER,departments_id INTEGER);
* CREATE TABLE users_departmentnews(id serial PRIMARY KEY, users_id INTEGER, departmentnews_id INTEGER);
* CREATE TABLE departments_departmentnews(id serial PRIMARY KEY, departments_id INTEGER, departmentnews_id INTEGER);
* CREATE DATABASE newsport_test WITH TEMPLATE newsport;

## copyright and license information
For any further explaination, questions or suggestions, feel free to contact me thukululu@gmail.com

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details

Copyright (c) {2022} 

**Made with pride for <a href="https://moringaschool.com" target="_blank"> Moringa School</a>**
