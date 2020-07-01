DROP TABLE IF EXISTS client;

CREATE TABLE client (
         id_client BIGINT AUTO_INCREMENT NOT NULL,
         login VARCHAR(255) NULL,
         pass  VARCHAR(255) NULL,
         email VARCHAR(255) NULL,
         address VARCHAR(255) NULL,
         phone VARCHAR(20) NULL,
         PRIMARY KEY (id_client));


DROP TABLE IF EXISTS pet;

CREATE TABLE pet (
         id_pet BIGINT AUTO_INCREMENT NOT NULL,
         name VARCHAR(255) NULL,
         type_pet VARCHAR(255) NULL,
         age INT NULL,
         weight DOUBLE NULL,
         PRIMARY KEY (id_pet));


