create database companydata;
show databases;
drop database companydata;
create database if not exists compandata;
show databases;
use databases compandata;
use companydata;
drop database compandata;
create database if not exists companydata;
use compandata;
use companydata;
create table conntry(
	countryCd char(3) not null comment "国籍コード",
    countryName char(255) comment "国籍",
    primary key (countryCd)
);
select * from country;
rename table companydata.conntry to country;
select * from companydata.country;

create table sex(
	sexCd char(2) not null comment "性別コード",
    sexName varchar(255) not null comment "性別",
    primary key (sexCd)
);

show create table sex;

create table if not exists empinfo(
	empCd char(6) not null comment"社員番号",
    name varchar(255) not null comment"姓名",
    birthday date not null comment"生年月日",
    countryCd char(3) not null comment"国籍コード",
    sexCd char(2) not null comment"入社年数",
    primary key(empCd)
);

show tables;

alter table empinfo add(school char(20) default "XXX大学");

select * from companydata.empinfo;

alter table companydata.empinfo drop school;


SELECT 
    *
FROM
    companydata.empinfo;

alter table companydata.empinfo add(
	year int not null comment"年"
);

alter table companydata.empinfo change year old int;
show create table companydata.empinfo;

USE companydata;


INSERT INTO companydata.country 
	(countryCd, countryName) 
	VALUES
    ("001","中国"),
    ("002","日本"),
    ("003","アメリカ"),
    ("004","カナダ");
    
SELECT * FROM companydata.country; 
   
INSERT INTO companydata.country 
	(countryCd, countryName) 
	VALUES
    ("006","イギリス");
    
INSERT INTO companydata.country
	(countryCd)
	VALUES
    ("007");
    
INSERT INTO sex ( sexCd, sexName )
	VALUE
    ("01", "男性"),
    ("02", "女性"),
    ("03", "不明");

SELECT * FROM companydata.sex;

ALTER TABLE companydata.empinfo CHANGE old year int COMMENT"年齢";
SELECT * FROM companydata.empinfo;

INSERT INTO companydata.empinfo 
	( empCd, name, birthday, countryCd, sexCd, year)
    VALUE
    ( '100014', '高橋アリア', '1992-09-09', '002', '01', 1 ),
    ( '100015', '山田ユリ', '1990-04-09', '001', '02', 1 ),
	( '100016', '五反田二', '1992-09-11', '004', '02', 2 ),
	( '100017', '臼杵一', '1991-09-09', '001', '02', 3 ),
	( '100018', '坂本剣', '1991-09-04', '003', '01', 2 ),
	( '100019', '坂本健一', '1990-09-09', '002', '01', 3 ),
	( '100020', '山本孝之', '1990-03-09', '003', '01', 5 ),
	( '100021', '上野もも', '1990-09-07', '001', '02', 4 ),
	( '100022', '山田奈々', '1990-09-08', '003', '02', 1 ),
	( '100023', '山田健一', '1990-07-04', '002', '01', 2 ),
	( '100024', '鈴木勝田', '1992-09-09', '001', '02', 2 ),
	( '100025', '山田奈々', '1990-09-08', '006', '02', 1 ),
	( '100026', '山田健一', '1990-07-04', '002', '01', 2 );
    

