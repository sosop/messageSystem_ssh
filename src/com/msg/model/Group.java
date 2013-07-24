package com.msg.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="m_group")
public class Group {
	private int id;
	private int name;
	private Group parent;
	private Set<Group> children;
	private Set<User> users;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	
	@OneToMany(mappedBy="group")
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	
	@ManyToOne
	@JoinColumn(name="parentId")
	public Group getParent() {
		return parent;
	}
	public void setParent(Group parent) {
		this.parent = parent;
	}
	
	@OneToMany(mappedBy="parent")
	public Set<Group> getChildren() {
		return children;
	}
	public void setChildren(Set<Group> children) {
		this.children = children;
	}
}	
