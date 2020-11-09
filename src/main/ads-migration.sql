DROP TABLE IF EXISTS ads;
DROP TABLE IF EXISTS users;

CREATE TABLE users (
id INT UNSIGNED NOT NULL AUTO_INCREMENT,
username VARCHAR(50) NOT NULL,
email VARCHAR(65) NOT NULL,
password VARCHAR(45) NOT NULL,
PRIMARY KEY(id)
);

CREATE TABLE ads (
id INT UNSIGNED NOT NULL AUTO_INCREMENT,
title VARCHAR(225) NOT NULL,
description VARCHAR(225) NOT NULL,
user_id INT UNSIGNED NOT NULL,
FOREIGN KEY(user_id) REFERENCES users(id)
);





