CREATE TABLE visitor (
  role boolean ,
  loginStatus boolean
);

CREATE TABLE Customer (
  username varchar(100) NOT NULL,
  password varchar(100) NOT NULL,
  email varchar(100) NOT NULL UNIQUE,
  balance float(53) NOT NULL 
);

CREATE TABLE Admin (
  username varchar(100) NOT NULL,
  password varchar(100) NOT NULL
);

CREATE TABLE Catalog (
  prodID varchar(50) NOT NULL UNIQUE,
  prodName varchar(100) NOT NULL UNIQUE,
  prodQty int NOT NULL,
  prodPrice float(53) NOT NULL,
  prodTag varchar(50) NOT NULL UNIQUE
);

CREATE TABLE Orders (
  orderID int NOT NULL,
  orderDate date NOT NULL
);


