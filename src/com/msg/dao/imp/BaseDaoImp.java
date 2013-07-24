package com.msg.dao.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.msg.dao.BaseDao;

public class BaseDaoImp<T> implements BaseDao<T> {

	protected HibernateTemplate hibernateTemplate;
	
	
	@Resource(name="hibernateTemplate")
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate){
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public HibernateTemplate getHibernateTemplate(){
		return this.hibernateTemplate;
	}
	
	@Override
	public int delete(T o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<T> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getObjectById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(T o) {
		this.hibernateTemplate.save(o);
	}

	@Override
	public int update(T o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<T> getObjectByExample(T t) {
		return this.hibernateTemplate.findByExample(t);
	}

}
