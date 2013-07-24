package com.msg.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="m_msg")
public class Message {
	private int id;
	private String title;
	private String content;
	private String fileUrl;
	private User sender;
	private Set<User> recievers;
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getFileUrl() {
		return fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	
	@ManyToOne
	@JoinColumn(name="senderId")
	public User getSender() {
		return sender;
	}
	public void setSender(User sender) {
		this.sender = sender;
	}
	
	@ManyToMany
	@JoinTable(
	        name="user_msg",
	        joinColumns=@JoinColumn(name="msg_id"),
	        inverseJoinColumns=@JoinColumn(name="user_id")
	)
	public Set<User> getRecievers() {
		return recievers;
	}
	public void setRecievers(Set<User> recievers) {
		this.recievers = recievers;
	}
}
