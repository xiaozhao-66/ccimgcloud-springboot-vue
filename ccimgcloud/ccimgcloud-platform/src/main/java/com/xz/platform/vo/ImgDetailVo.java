package com.xz.platform.vo;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

@Data
@Accessors(chain = true)
public class ImgDetailVo implements Serializable {

    /**
     *
     */
    private Long id;
    /**
     *
     */
    private String content;
    /**
     *
     */
    private String cover;
    /**
     *
     */
    private Long userId;


    private String albumName;

    //专辑的图片数量
    private Long imgCount;

    /**
     *
     */
    private String avatar;

    private String username;

    private List<String> imgsUrl;

    //当前imgsUrl的数量
    private Integer count;

    private Long agreeCount;

    private String time;

    private Integer status;
}
