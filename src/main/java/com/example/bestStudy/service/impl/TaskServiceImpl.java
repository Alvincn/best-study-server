package com.example.bestStudy.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.bestStudy.domain.Task;
import com.example.bestStudy.mapper.TaskMapper;
import com.example.bestStudy.service.ITaskService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Service
@Primary
public class TaskServiceImpl extends ServiceImpl<TaskMapper,Task> implements ITaskService{
}
