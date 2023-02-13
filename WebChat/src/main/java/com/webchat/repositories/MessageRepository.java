package com.webchat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webchat.models.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {
//	List<Message> findByMessageContent(String mess_content);
}
