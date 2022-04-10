CREATE TABLE users
(
    id       INT(11) AUTO_INCREMENT,
    username VARCHAR(255) NOT NULL,
    email    VARCHAR(255) NOT NULL,
    password VARCHAR(60)  NOT NULL,
    PRIMARY KEY (id)
);

CREATE DATABASE workshop2 CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

SELECT * FROM users;

