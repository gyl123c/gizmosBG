package com.gyl.bg.gizmos.service;

import com.gyl.bg.gizmos.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    private TestDao testDao;

    public List getList() {
        try {
            return testDao.getList();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

}
