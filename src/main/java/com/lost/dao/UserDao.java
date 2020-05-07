package com.lost.dao;

import com.lost.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

/**
 * @author gj
 */
@Mapper
public interface UserDao {
    User getUser(long id);
}
