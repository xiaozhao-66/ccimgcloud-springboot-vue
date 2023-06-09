package com.xz.platform.dao;

import com.xz.common.dao.BaseDao;
import com.xz.platform.entity.MessageEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 *
 * @author xiaozhao sunlightcs@gmail.com
 * @since 1.0.0 2023-03-16
 */
@Mapper
public interface MessageDao extends BaseDao<MessageEntity> {
	
}