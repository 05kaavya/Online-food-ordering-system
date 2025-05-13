CREATE DATABASE appdb;
use appdb;

CREATE TABLE customer(
    customerId INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    phoneNumber VARCHAR(15),
    password VARCHAR(255) NOT NULL
);

CREATE TABLE restaurant(
    restaurantId INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    address VARCHAR(255) NOT NULL,
    cuisineType VARCHAR(55),
    contactNumber VARCHAR(15) 
);

CREATE TABLE menuItem(
    itemId INT PRIMARY KEY AUTO_INCREMENT,
    restaurantId INT,
    name VARCHAR(100) NOT NULL,
    price DOUBLE NOT NULL,
    description VARCHAR(255),
    availableQuantity INT NOT NULL,
    FOREIGN KEY (restaurantId) REFERENCES restaurant(restaurantId)

);

CREATE TABLE