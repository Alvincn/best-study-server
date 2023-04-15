package com.example.bestStudy.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.bestStudy.domain.TaskTag;
import com.example.bestStudy.mapper.TaskTagMapper;
import com.example.bestStudy.service.ITaskTagService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Service
@Primary
public class TaskTagServiceImpl extends ServiceImpl<TaskTagMapper,TaskTag> implements ITaskTagService{
}
