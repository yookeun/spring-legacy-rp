Spring hikaricp + jndi + replication 


use mysql;
GRANT ALL PRIVILEGES ON *.* TO root@'%' IDENTIFIED BY '1234' WITH GRANT OPTION;



CREATE DATABASE `test_db` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */;


use test_db;
CREATE TABLE test_tb
(
	id INT NOT NULL AUTO_INCREMENT,
	val1 VARCHAR(50) NOT NULL,
	val2 VARCHAR(50) NOT NULL,
	regdate DATETIME NOT NULL,
	moddate DATETIME NOT NULL,
	PRIMARY KEY(id)
);


INSERT INTO test_tb(val1, val2, regdate, moddate) VALUES('val11','val22',now(),now());
INSERT INTO test_tb(val1, val2, regdate, moddate) VALUES('val33','val44',now(),now());


###Galera Cluster 세팅 

MariaDB를 가동하여 3대서버에 모두 다음과 같은 계정을 추가한다 
GRANT ALL PRIVILEGES ON *.* TO root@'192.168.0.40' IDENTIFIED BY '1234' WITH GRANT OPTION;
GRANT ALL PRIVILEGES ON *.* TO root@'192.168.0.41' IDENTIFIED BY '1234' WITH GRANT OPTION;
GRANT ALL PRIVILEGES ON *.* TO root@'192.168.0.42' IDENTIFIED BY '1234' WITH GRANT OPTION;


GRANT ALL PRIVILEGES ON *.* TO maxscale@'%' IDENTIFIED BY '1234' WITH GRANT OPTION;