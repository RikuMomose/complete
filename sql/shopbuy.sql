DROP database if EXISTS shopbuydb;

CREATE database shopbuydb;

use shopbuydb;


CREATE TABLE m_category(
id int not null primary key auto_increment,
category_id int unique not null,
category_name varchar(20) unique not null,
category_description varchar(100) not null,
insert_date datetime default NOW() not null,
update_date datetime
)
comment='カテゴリマスタテーブル';


CREATE TABLE more_info(
id int not null primary key auto_increment,
more_id int unique not null,
more_name varchar(100) unique not null,
more_name_kana varchar(100) unique not null,
more_description varchar(255) not null,
category_id int not null,
price int,
image_file_path varchar(100),
image_file_name varchar(50),
release_date datetime not null,
release_company varchar(50),
status tinyint(1) default 1 not null,
insert_date datetime default NOW() not null,
update_date datetime,
foreign key(category_id) references m_category(category_id)
ON UPDATE CASCADE ON DELETE CASCADE
)
comment='商品情報テーブル';
