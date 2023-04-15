package com.example.bestStudy.domain;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "t_task_tag")
public class TaskTag{
    private static final long serialVersionUID = 1L;
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Integer tagId;
    private Integer taskId;
    
    public TaskTag(TaskTag taskTag) {
        if (Objects.nonNull(taskTag)) {
            this.id=taskTag.id;
            this.tagId=taskTag.tagId;
            this.taskId=taskTag.taskId;
        }
    }
}
