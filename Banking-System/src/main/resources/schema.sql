-- drop database if exists `banking`;
create database `banking`; 
use `banking`; 
drop table if exists `contact`; 
drop table if exists `address`; 
drop table if exists `transaction`; 
drop table if exists `account`; 
drop table if exists `interest`; 
drop table if exists `customer`; 
drop table if exists `employee`;
CREATE TABLE `contact` (
    `id` VARCHAR(255) NOT NULL UNIQUE,
    `email` VARCHAR(255) NOT NULL,
    `phone_1` VARCHAR(13) NOT NULL,
    `phone_2` VARCHAR(13) DEFAULT NULL,
    PRIMARY KEY (`id`)
);
CREATE TABLE `address` (
    `id` VARCHAR(255),
    `street` VARCHAR(255) NOT NULL,
    `address line2` VARCHAR(150),
    `city` VARCHAR(255) NOT NULL,
    `state` VARCHAR(255) NOT NULL,
    `zip_code` INTEGER(15) NOT NULL,
    PRIMARY KEY (`id`)
);
CREATE TABLE `interest` (
    `id` VARCHAR(255),
    `savings` decimal(5,2),
    `loan` decimal(5,2),
    `rd` decimal(5,2),
    `fd` decimal(5,2),
    `current` decimal(5,2),
    PRIMARY KEY (`id`)
);
CREATE TABLE `account` (
    `account_no` VARCHAR(255),
    `account_type` VARCHAR(10) NOT NULL,
    `customer_id` VARCHAR(255) NOT NULL,
    `balance` DECIMAL(13 , 4 ) DEFAULT 0,
    `interese_rate` DECIMAL(5 , 2 ),
    `interest_id` VARCHAR(255),
    `open_date` DATETIME DEFAULT CURRENT_TIMESTAMP,
    `interest_amount` DECIMAL(13 , 4 ),
    PRIMARY KEY (`account_no`),
    FOREIGN KEY (`interest_id`)
        REFERENCES `interest` (`id`)
);

CREATE TABLE `loan_account` (
    `account_no` VARCHAR(255) NOT NULL,
    `loan_id` VARCHAR(255),
    `loan_type` VARCHAR(255),
    `date_of_loan` DATETIME DEFAULT CURRENT_TIMESTAMP,
    `duration_in_months` INT,
    `total_amount` DECIMAL(13 , 4 ) DEFAULT 0,
    `remaining_amount` DECIMAL(13 , 4 ) DEFAULT 0,
    `status` VARCHAR(255),
    `description` VARCHAR(255),
    `interest_id` VARCHAR(255),
    PRIMARY KEY (`loan_id`),
    FOREIGN KEY (`account_no`)
        REFERENCES `account` (`account_no`),
    FOREIGN KEY (`interest_id`)
        REFERENCES `interest` (`id`)
);

CREATE TABLE `deposite_account` (
    `account_no` VARCHAR(255) NOT NULL,
    `closure_type` VARCHAR(10),
    `interest_id` VARCHAR(255),
    `initial_amount` DECIMAL(13 , 4 ),
    `customer_id` VARCHAR(255),
    `deposite_account_type` VARCHAR(255),
    `interest_amount` DECIMAL(13 , 4 ),
    `deposite_account_no` VARCHAR(255),
    `current_balance` DECIMAL(13 , 4 ),
    `duration_in_months` INT,
    `interest_rate` DECIMAL(5 , 2 ),
    `open_date` DATETIME DEFAULT CURRENT_TIMESTAMP,
    `close_date` DATE,
    PRIMARY KEY (`deposite_account_no`),
    FOREIGN KEY (`account_no`)
        REFERENCES `account` (`account_no`),
    FOREIGN KEY (`interest_id`)
        REFERENCES `interest` (`id`)
);

CREATE TABLE `transaction` (
    `id` VARCHAR(255) NOT NULL,
    `account_no` VARCHAR(255) NOT NULL,
    `type` VARCHAR(10) NOT NULL,
    `amount` DECIMAL(13 , 4 ) NOT NULL DEFAULT 0,
    `date_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `status` VARCHAR(10) NOT NULL,
    PRIMARY KEY (`id`),
    FOREIGN KEY (`account_no`)
        REFERENCES `account` (`account_no`)
);

CREATE TABLE `customer` (
    `id` VARCHAR(255) NOT NULL UNIQUE,
    `first_name` VARCHAR(50) NOT NULL,
    `last_name` VARCHAR(50) NOT NULL,
    `middle_name` VARCHAR(50),
    `date_of_birth` DATE NOT NULL,
    `gender` VARCHAR(10),
    `contact_id` VARCHAR(255) NOT NULL,
    `pan` VARCHAR(12) NOT NULL,
    `nationality` VARCHAR(10) NOT NULL,
    `address` VARCHAR(255),
    PRIMARY KEY (`id`),
    FOREIGN KEY (`contact_id`)
        REFERENCES contact (`id`),
    FOREIGN KEY (`address`)
        REFERENCES `address` (`id`)
);
CREATE TABLE `employee` (
    `id` VARCHAR(255) NOT NULL UNIQUE,
    `first_name` VARCHAR(50) NOT NULL,
    `last_name` VARCHAR(50),
    `middle_name` VARCHAR(50),
    `date_of_birth` DATE NOT NULL,
    `gender` VARCHAR(10),
    `contact_id` VARCHAR(255) NOT NULL,
    `pan` VARCHAR(12) NOT NULL,
    `nationality` VARCHAR(10) NOT NULL,
    `designation` VARCHAR(50) NOT NULL,
    `user_name` VARCHAR(255),
    `password` VARCHAR(255),
    `address` VARCHAR(255),
    PRIMARY KEY (`id`),
    FOREIGN KEY (`contact_id`)
        REFERENCES contact (`id`),
    FOREIGN KEY (`address`)
        REFERENCES `address` (`id`)
);