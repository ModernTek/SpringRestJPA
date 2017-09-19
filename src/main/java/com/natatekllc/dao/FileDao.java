package com.natatekllc.dao;

import org.springframework.stereotype.Repository;

import com.natatekllc.model.FileMetaData;

@Repository
	public class FileDao extends AbstractJpaDao implements IFileDao {

	    @SuppressWarnings("unchecked")
		public FileDao() {
	        super();

	        setClazz(FileDao.class);
	    }

		

		@Override
		public void create(FileMetaData entity) {
			// TODO Auto-generated method stub
			
		}


	    // API

	}


