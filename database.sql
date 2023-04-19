DROP DATABASE IF EXISTS traktori;
CREATE DATABASE traktori;
USE traktori;

CREATE TABLE potrebiteli (
	name VARCHAR(255),
	pass VARCHAR(255),
	mail VARCHAR(255)
);

CREATE TABLE traktori (
	id INT,
	marka VARCHAR(255),
	snimka VARCHAR(255),
	cena INT
);

INSERT INTO potrebiteli VALUES
	("admin", "admin", "admin@traktori.bg"),
	("guest", "1234", "guest@traktori.bg");
	
INSERT INTO traktori VALUES
	(1, "Bulgar", "bulgar.jpg", 5),
	(2, "UMZ", "umz.jpg", 7);