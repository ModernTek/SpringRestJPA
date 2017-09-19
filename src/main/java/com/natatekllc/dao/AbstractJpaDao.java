package com.natatekllc.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractJpaDao<T extends Serializable> {

	    private Class<T> clazz;

	    @PersistenceContext
	    private EntityManager entityManager;

	    public final void setClazz(final Class<T> clazzToSet) {
	        this.clazz = clazzToSet;
	    }



	    public void create(final T entity) {
	        entityManager.persist(entity);
	    }

	  

	}


