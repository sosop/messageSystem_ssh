package com.msg.dao;

import java.util.List;

public interface BaseDao <T>{
	public void save(T o);
	public int delete(T o);
	public int update(T o);
	public T getObjectById(int id);
	public List<T> getObjectByExample(T t);
	public List<T> getList();
}
