DROP DATABASE IF EXISTS traktori;
CREATE DATABASE traktori;
USE traktori;
CREATE TABLE marki (id INT, marka VARCHAR(255));
CREATE TABLE potrebiteli (name VARCHAR(255), pass VARCHAR(255), mail VARCHAR(255));
INSERT INTO marki VALUES (1, "Bulgar"), (2, "UMZ");