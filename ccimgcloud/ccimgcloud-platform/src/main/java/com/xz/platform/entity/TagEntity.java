package com.xz.platform.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.xz.common.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
 * 
 *
 * @author xiaozhao sunlightcs@gmail.com
 * @since 1.0.0 2023-03-16
 */
@Data
@TableName("t_tag")
public class TagEntity extends BaseEntity {

    /**
     * 数量
     */
    private Long count;
    /**
     * 名称
     */
    private String name;
    /**
     * 排序
     */
    private Integer sort;
}