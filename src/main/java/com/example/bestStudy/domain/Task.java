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
@TableName(value = "t_task")
public class Task{
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "任务内容", position = 4)
    private String content;
    @ApiModelProperty(value = "创建时间", position = 10)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdTime;
    @ApiModelProperty(value = "任务结束时间", position = 8)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime endTime;
    @TableId(type = IdType.AUTO)
    private Integer id;
    @ApiModelProperty(value = "任务优先级，0表示低，1表示中，2表示高", position = 6)
    private Integer priority;
    @ApiModelProperty(value = "任务提醒时间", position = 9)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime remindTime;
    @ApiModelProperty(value = "任务开始时间", position = 7)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime startTime;
    @ApiModelProperty(value = "任务状态，0表示未完成，1表示已完成", position = 5)
    private Integer status;
    @ApiModelProperty(value = "任务标题", position = 3)
    private String title;
    @ApiModelProperty(value = "修改时间", position = 11)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updatedTime;

    @ApiModelProperty(value = "关联用户", position = 2)
    private Integer userId;
    
    public Task(Task task) {
        if (Objects.nonNull(task)) {
            this.content=task.content;
            this.createdTime=task.createdTime;
            this.endTime=task.endTime;
            this.id=task.id;
            this.priority=task.priority;
            this.remindTime=task.remindTime;
            this.startTime=task.startTime;
            this.status=task.status;
            this.title=task.title;
            this.updatedTime=task.updatedTime;
            this.userId=task.userId;
        }
    }
}
