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
@TableName(value = "t_schedule_tag")
public class ScheduleTag{
    private static final long serialVersionUID = 1L;
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Integer scheduleId;
    private Integer tagId;
    
    public ScheduleTag(ScheduleTag scheduleTag) {
        if (Objects.nonNull(scheduleTag)) {
            this.id=scheduleTag.id;
            this.scheduleId=scheduleTag.scheduleId;
            this.tagId=scheduleTag.tagId;
        }
    }
}
