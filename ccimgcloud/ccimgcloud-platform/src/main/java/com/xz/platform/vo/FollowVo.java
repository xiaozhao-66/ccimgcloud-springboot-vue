package com.xz.platform.vo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;


@Data
@Accessors(chain = true)
public class FollowVo implements Serializable {

    /**
     *
     */
    private Long uid;


    private String username;

    /**
     *
     */
    private String avatar;

    private boolean isfollow;

    private Long userId;

    private Long fanCount;

    private String time;
}
