package com.example.bestStudy.domain;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** 用户管理 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "t_user")
public class User{
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "创建时间", position = 2)
    private String createdTime;
    @ApiModelProperty(value = "用户邮箱", position = 3)
    private String email;
    @TableId(type = IdType.AUTO)
    @ApiModelProperty(value = "主键", position = 1)
    private Long id;
    @ApiModelProperty(value = "最后一次登录", position = 4)
    private String lastLoginTime;
    @ApiModelProperty(value = "用户密码", position = 5)
    private String password;
    @ApiModelProperty(value = "主键", position = 7)
    private String userId;
    @ApiModelProperty(value = "用户名字", position = 6)
    private String username;
    
    public User(User user) {
        if (Objects.nonNull(user)) {
            this.createdTime=user.createdTime;
            this.email=user.email;
            this.id=user.id;
            this.lastLoginTime=user.lastLoginTime;
            this.password=user.password;
            this.userId=user.userId;
            this.username=user.username;
        }
    }
}
