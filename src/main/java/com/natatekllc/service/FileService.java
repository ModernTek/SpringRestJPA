package com.natatekllc.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.natatekllc.dao.IFileDao;
import com.natatekllc.model.FileMetaData;


@Service
@Transactional
public class FileService {

    @Autowired
    private IFileDao dao;

    public FileService() {
        super();
    }

    // API

    public void create(final FileMetaData entity) {
        dao.create(entity);
    }

}
