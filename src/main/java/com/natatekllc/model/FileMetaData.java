package com.natatekllc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class FileMetaData {
	


	    private static final long serialVersionUID = 1L;

	    public FileMetaData() {
	        super();
	    }

	    public FileMetaData(final String fileName) {
	        super();

	        this.fileName = fileName;
	    }

	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "ID")
	    private long id;
	    @Column(name = "FILENAME")
	    private String fileName;


	    public void setId(final long id) {

	        this.id = id;
	    }

	    public String getFileName() {
	        return fileName;
	    }

	    public void setFileName(final String fileName) {
	        this.fileName = fileName;
	    }

	    @Override
		public String toString() {
			return getFileName();
		}
}
