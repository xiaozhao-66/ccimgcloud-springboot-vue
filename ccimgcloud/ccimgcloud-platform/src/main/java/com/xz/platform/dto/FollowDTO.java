package com.xz.platform.dto;

import com.xz.common.validator.group.DefaultGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;


/**
 * 
 *
 * @author xiaozhao sunlightcs@gmail.com
 * @since 1.0.0 2023-03-16
 */
@Data
@ApiModel(value = "关注")
public class FollowDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "用户id")
	@NotNull(message = "uid不能为空", groups = DefaultGroup.class)
	private Long uid;

	@ApiModelProperty(value = "关注的用户id")
	@NotNull(message = "fid不能为空", groups = DefaultGroup.class)
	private Long fid;
}