package com.gyl.bg.gizmos.dao;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface TestDao {
    List<Map> getList();
}
