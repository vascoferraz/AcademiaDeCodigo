CREATE DATABASE ac;
USE ac;
CREATE TABLE user(
  id integer AUTO_INCREMENT,
  username CHAR(64),
  password CHAR(64),
  email CHAR(64),
  firstname CHAR(64),
  lastname CHAR(64),
  phone CHAR(64),
  primary key (id)
);
