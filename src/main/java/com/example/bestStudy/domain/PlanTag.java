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
@TableName(value = "t_plan_tag")
public class PlanTag{
    private static final long serialVersionUID = 1L;
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Integer planId;
    private Integer tagId;
    
    public PlanTag(PlanTag planTag) {
        if (Objects.nonNull(planTag)) {
            this.id=planTag.id;
            this.planId=planTag.planId;
            this.tagId=planTag.tagId;
        }
    }
}
