CREATE DATABASE newsport;
\c newsport

CREATE TABLE departments (
id SERIAL PRIMARY KEY,
name VARCHAR,
description VARCHAR,
size int
);

CREATE TABLE news (
id SERIAL PRIMARY KEY,
news_type VARCHAR,
department_id INT,
user_id INT,
title VARCHAR,
description VARCHAR
);

CREATE TABLE staff (
id SERIAL PRIMARY KEY,
name VARCHAR,
position VARCHAR,
staff_role VARCHAR
);

CREATE TABLE users_departments (
id SERIAL PRIMARY KEY,
user_id INT,
department_id INT
);





CREATE DATABASE newsport_test WITH TEMPLATE newsport;
