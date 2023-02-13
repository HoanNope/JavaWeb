package com.webchat.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// POJO = Plan Object Java Project
@Entity
public class Message {
	// Message's properties
	
	// This is primary key
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // Tự sinh ID
	private long mess_id;
	private String mess_content;
	private String mess_color;
	private short mess_size;
	
	// Contractor methods
	
	public Message() {
		
	}
	
	public Message(String mess_content, String mess_color, short mess_size) {
		this.mess_content = mess_content;
		this.mess_color = mess_color;
		this.mess_size = mess_size;
	}
	
	// Getter and setter methods

	public long getMess_id() {
		return mess_id;
	}

	public String getMess_content() {
		return mess_content;
	}

	public String getMess_color() {
		return mess_color;
	}

	public short getMess_size() {
		return mess_size;
	}

	public Message setMess_id(long mess_id) {
		this.mess_id = mess_id;
		return this;
	}

	public Message setMess_content(String mess_content) {
		this.mess_content = mess_content;
		return this;
	}

	public Message setMess_color(String mess_color) {
		this.mess_color = mess_color;
		return this;
	}

	public Message setMess_size(short mess_size) {
		this.mess_size = mess_size;
		return this;
	}
	
	// Other methods
	@Override
	public String toString() {
		return "Message [mess_id=" + mess_id + ", mess_content=" + mess_content + ", mess_color=" + mess_color
				+ ", mess_size=" + mess_size + "]";
	}
	
}
