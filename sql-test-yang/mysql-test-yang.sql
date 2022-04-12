-- create database --
DROP DATABASE IF EXISTS mysql_test_yang; 
CREATE DATABASE mysql_test_yang;
USE mysql_test_yang;


-- 問題１
-- create tables --
DROP TABLE IF EXISTS mise; 
CREATE TABLE mise (
	miseCd CHAR(2) NOT NULL UNIQUE, 
    miseName CHAR(10),
    PRIMARY KEY(miseCd)
);

DROP TABLE IF EXISTS uriage; 
CREATE TABLE uriage (
	miseCd CHAR(2),
	eigyodate CHAR(8), 
    shohinCd CHAR(3),
    uriage INT UNSIGNED
);

DROP TABLE IF EXISTS shohin; 
CREATE TABLE shohin (
	shohinCd CHAR(3) NOT NULL UNIQUE,
	shohinName CHAR(10),
    PRIMARY KEY(shohinCd)
);

-- insert data --
INSERT INTO mise (miseCd, miseName)
	VALUES
    ("01", "横浜店"),
    ("02", "新宿店"),
    ("03", "京都店");
    
INSERT INTO uriage (miseCd, eigyodate, shohinCd, uriage)
	VALUES
    ("01", "20190501", "001", 20000),
	("01", "20190501", "002", 30000),
	("01", "20190501", "003", 40000),
	("02", "20190501", "001", 50000),
	("02", "20190501", "002", 20000),
    ("03", "20190501", "001", 40000),
	("01", "20190502", "002", 100000);
    
INSERT INTO shohin (shohinCd, shohinName)
	VALUES 
    ("001", "洗濯機"),
	("002", "冷蔵庫"),	
	("003", "テレビ");
    

-- 問題2
-- query shohin --
SELECT 
	shohinCd,
    shohinName
FROM
	shohin
ORDER BY
	shohinCd DESC;



-- 問題3
-- query uriage --
SELECT
	miseCd,
    miseName,
    uriage
FROM
	uriage
INNER JOIN 
	mise
USING 
	(miseCd)
ORDER BY
	uriage;

	