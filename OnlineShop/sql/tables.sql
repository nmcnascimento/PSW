CREATE TABLE suser (
  username varchar(100) NOT NULL PRIMARY KEY,
  password varchar(100) NOT NULL,
);

CREATE TABLE customer (
  username varchar(100) NOT NULL REFERENCES user(username),
  password varchar(100) NOT NULL,
  email varchar(100) NOT NULL UNIQUE,
  balance float(53) NOT NULL 
);

CREATE TABLE admin (
  username varchar(100) NOT NULL REFERENCES user(username),
  password varchar(100) NOT NULL
);

CREATE TABLE catalog (
  prodID varchar(50) NOT NULL UNIQUE,
  prodName varchar(100) NOT NULL UNIQUE,
  prodQty int NOT NULL,
  prodPrice float(53) NOT NULL,
  prodTag varchar(50) NOT NULL UNIQUE
);

CREATE TABLE porders (
  porderid int NOT NULL,
  porderdate date NOT NULL
);
