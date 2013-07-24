package com.msg.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="m_user")
public class User {
	private int id;
	private String name;
	private String password;
	private Group group;
	private Set<Message> sendMsg;
	private Set<Message> reMsg;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@ManyToOne
	@JoinColumn(name="groupId")
	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	@OneToMany(mappedBy="sender")
	public Set<Message> getSendMsg() {
		return sendMsg;
	}

	public void setSendMsg(Set<Message> sendMsg) {
		this.sendMsg = sendMsg;
	}

	@ManyToMany(mappedBy="recievers")
	public Set<Message> getReMsg() {
		return reMsg;
	}

	public void setReMsg(Set<Message> reMsg) {
		this.reMsg = reMsg;
	}
	
	@Override
	public String toString() {
		return "id: " + this.id + "  name: " + this.name;
	}
}
