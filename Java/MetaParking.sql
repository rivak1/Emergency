create database MetaParking;
use MetaParking;
CREATE TABLE User (
    id int PRIMARY KEY auto_increment,
    full_name varchar(100),
    Email_Id varchar(200) unique,
    Password varchar(200),
    Contact_number varchar(200),
    Organisation varchar(300),
    user_type char(10),
    Gender char(10)
);
SELECT * FROM User;

CREATE TABLE Vehicle (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(100),
    Type VARCHAR(200),
    Vehicle_Number VARCHAR(100),
    Employee_Id int,
    identification varchar(200),
    FOREIGN KEY (Employee_Id) REFERENCES User (id)
);

SELECT * FROM Vehicle;

CREATE TABLE Price (
    Id int PRIMARY KEY AUTO_INCREMENT,
    Type VARCHAR(20),
    DAILY INT,
    Monthly int,
    Yearly int
);

SELECT * FROM Price;

CREATE TABLE user_vehicle (
    id int PRIMARY KEY auto_increment,
    user_id int,
    vehicle_id int,
    FOREIGN KEY (user_id)
        REFERENCES User (id),
    FOREIGN KEY (vehicle_id)
        REFERENCES User (Id)
);

SELECT * FROM user_vehicle;

ALTER TABLE user_vehicle ADD COLUMN price varchar(100);

CREATE TABLE user_friendList (
    Id int PRIMARY KEY AUTO_INCREMENT,
    user_id INT,
    frnd_id INT,
    FOREIGN KEY (frnd_id)
        REFERENCES User (Id)
);

DESCRIBE user_friendList;

show tables;

CREATE TABLE Image(id int PRIMARY KEY AUTO_INCREMENT , user_id int , name varchar(200) , FOREIGN KEY (user_id)
        REFERENCES User (Id));

DESCRIBE Image;
SELECT * FROM Image;