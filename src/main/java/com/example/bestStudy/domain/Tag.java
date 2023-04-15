package com.example.bestStudy.domain;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "t_tag")
public class Tag{
    private static final long serialVersionUID = 1L;
    @TableId(type = IdType.AUTO)
    private Integer id;
    @ApiModelProperty(value = "标签名称", position = 3)
    private String name;
    @ApiModelProperty(value = "关联用户表的id字段", position = 2)
    private Integer userId;
    
    public Tag(Tag tag) {
        if (Objects.nonNull(tag)) {
            this.id=tag.id;
            this.name=tag.name;
            this.userId=tag.userId;
        }
    }
}
