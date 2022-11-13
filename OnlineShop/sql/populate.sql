INSERT INTO admin(username, password)
VALUES ('admin','admin');

INSERT INTO catalog(prodid, prodname, prodqty, prodprice, prodtag)
VALUES('1','Caneta',1,24.00,'Escritorio');

INSERT INTO customer(username,password,email,balance)
VALUES ('nuno','123456','nuno@mail.com',500);

INSERT INTO porders(porderid, porderdate)
VALUES(1,'2022-01-01');

INSERT INTO visitor(role, loginstatus)
VALUES (0,0);   /*first element is to choose from either admin or customer
                  and the second to verify if the login is done*/

