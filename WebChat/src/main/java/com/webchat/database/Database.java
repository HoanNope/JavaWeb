package com.webchat.database;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.webchat.models.Message;
import com.webchat.repositories.MessageRepository;
// Now connect with mysql using JPA
/*
docker run -d --rm --name mysql-spring-boot-learn \
-e MYSQL_ROOT_PASSWORD=123456 \
-e MYSQL_USER=hyt18no \
-e MYSQL_PASSWORD=123456789 \
-e MYSQL_DATABASE=test_db \
-p 3309:3306 \
--volume ysql-spring-boot-learn:/var/lib/mysql \
mysql:latest


mysql -h localhost -p 3309 --protocol=tcp -u hyt18no -p

* */

@Configuration
// Chứa các bin methods sẽ được gọi khi ứng dụng được chạy
// Dùng để khởi tao database ...
public class Database {
	
	// logger - Thay thế system.out.println()
	// Để đọc lỗi
	private static final Logger logger = LoggerFactory.getLogger(Database.class);
	
	// Code first
	// 
	@Bean
	CommandLineRunner initDatabase(MessageRepository messageReponsitory) {
		return new CommandLineRunner() {

			@Override
			public void run(String... args) throws Exception {
				Message m1 = new Message("Hello", "red", (short)12);
				Message m2 = new Message("Hi", "yellow", (short)16);
				
				logger.info("insert data: " + messageReponsitory.save(m1));
				logger.info("insert data: " + messageReponsitory.save(m2));
			}
			
		};
	}
}
