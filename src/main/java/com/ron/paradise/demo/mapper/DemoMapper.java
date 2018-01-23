package com.ron.paradise.demo.mapper;

import com.ron.paradise.core.mybatis.MyMapper;
import com.ron.paradise.demo.entity.TUser;

public interface DemoMapper extends MyMapper<TUser> {
	
	TUser getUserByConditions(String name);
}
