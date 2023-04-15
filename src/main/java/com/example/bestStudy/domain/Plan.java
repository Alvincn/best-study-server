package com.example.bestStudy.domain;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "t_plan")
public class Plan{
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "内容", position = 11)
    private String content;
    @ApiModelProperty(value = "创建时间", position = 5)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdTime;
    @ApiModelProperty(value = "结束时间", position = 7)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime endTime;
    @TableId(type = IdType.AUTO)
    @ApiModelProperty(value = "主键", position = 1)
    private Integer id;
    @ApiModelProperty(value = "优先级别", position = 9)
    private String priority;
    @ApiModelProperty(value = "计划提醒时间", position = 6)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime remindTime;
    @ApiModelProperty(value = "开始时间", position = 8)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime startTime;
    @ApiModelProperty(value = "计划状态", position = 10)
    private String status;
    @ApiModelProperty(value = "标题", position = 3)
    private String title;
    @ApiModelProperty(value = "修改时间", position = 4)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updatedTime;
    @ApiModelProperty(value = "用户编号", position = 2)
    private Integer userId;
    
    public Plan(Plan plan) {
        if (Objects.nonNull(plan)) {
            this.content=plan.content;
            this.createdTime=plan.createdTime;
            this.endTime=plan.endTime;
            this.id=plan.id;
            this.priority=plan.priority;
            this.remindTime=plan.remindTime;
            this.startTime=plan.startTime;
            this.status=plan.status;
            this.title=plan.title;
            this.updatedTime=plan.updatedTime;
            this.userId=plan.userId;
        }
    }
}
