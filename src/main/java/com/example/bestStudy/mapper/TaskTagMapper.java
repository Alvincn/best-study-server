package com.example.bestStudy.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.bestStudy.domain.TaskTag;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.transaction.annotation.Transactional;
@Mapper
@Transactional(rollbackFor = Exception.class)
public interface TaskTagMapper extends BaseMapper<TaskTag>{
}
