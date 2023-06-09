package com.xz.platform.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xz.common.service.impl.BaseServiceImpl;
import com.xz.common.utils.ConvertUtils;
import com.xz.platform.dao.UserRecordDao;
import com.xz.platform.entity.UserRecordEntity;
import com.xz.platform.service.UserRecordService;
import com.xz.platform.vo.UserRecordVo;
import org.springframework.stereotype.Service;

/**
 * 
 *
 * @author xiaozhao sunlightcs@gmail.com
 * @since 1.0.0 2023-03-16
 */
@Service
public class UserRecordServiceImpl extends BaseServiceImpl<UserRecordDao, UserRecordEntity> implements UserRecordService {

    @Override
    public UserRecordVo getUserRecord(String uid) {
        UserRecordEntity userRecordEntity = baseDao.selectOne(new QueryWrapper<UserRecordEntity>().eq("uid", uid));
        return ConvertUtils.sourceToTarget(userRecordEntity, UserRecordVo.class);
    }

    @Override
    public void clearUserRecord(String uid, Integer type) {
        UserRecordEntity userRecordEntity = baseDao.selectOne(new QueryWrapper<UserRecordEntity>().eq("uid", uid));

        if (type == 1) {
            userRecordEntity.setAgreeCollectionCount(0L);
        } else if (type == 2) {
            userRecordEntity.setAddFollowCount(0L);
        } else {
            userRecordEntity.setNoreplyCount(0L);
        }
        baseDao.updateById(userRecordEntity);
    }
}