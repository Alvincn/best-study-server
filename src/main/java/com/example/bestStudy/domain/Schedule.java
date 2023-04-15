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
@TableName(value = "t_schedule")
public class Schedule{
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "日程内容", position = 4)
    private String content;
    @ApiModelProperty(value = " 创建时间", position = 8)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdTime;
    @ApiModelProperty(value = "日程结束时间", position = 6)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime endTime;
    @TableId(type = IdType.AUTO)
    private Integer id;
    @ApiModelProperty(value = "日程提醒时间", position = 7)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime remindTime;
    @ApiModelProperty(value = "日程开始时间", position = 5)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime startTime;
    @ApiModelProperty(value = "日程标题", position = 3)
    private String title;
    @ApiModelProperty(value = " 修改时间", position = 9)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updatedTime;

    @ApiModelProperty(value = "关联用户表的id字段", position = 2)
    private Integer userId;
    
    public Schedule(Schedule schedule) {
        if (Objects.nonNull(schedule)) {
            this.content=schedule.content;
            this.createdTime=schedule.createdTime;
            this.endTime=schedule.endTime;
            this.id=schedule.id;
            this.remindTime=schedule.remindTime;
            this.startTime=schedule.startTime;
            this.title=schedule.title;
            this.updatedTime=schedule.updatedTime;
            this.userId=schedule.userId;
        }
    }
}
