package com.xz.platform.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 
 *
 * @author xiaozhao sunlightcs@gmail.com
 * @since 1.0.0 2023-03-16
 */
@Data
@ApiModel(value = "专辑图片联系")
public class AlbumImgRelationDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "专辑id")
	private Long aid;

	@ApiModelProperty(value = "用户id")
	private Long uid;

	@ApiModelProperty(value = "图片信息id")
	private Long mid;
}