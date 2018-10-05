package com.blog;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BaseMapper <T extends BaseModel,K extends String>{

    List<T> selectByStringCondition(String condition);

    List<T> selectByCondition(T record);

    int deleteByGuid(K guid);

    int insert(T record);

    T selectByGuid(K guid);

    int updateByGuidSelective(T record);

}
