package com.example.bestStudy.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.bestStudy.domain.ScheduleTag;
import com.example.bestStudy.mapper.ScheduleTagMapper;
import com.example.bestStudy.service.IScheduleTagService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Service
@Primary
public class ScheduleTagServiceImpl extends ServiceImpl<ScheduleTagMapper, ScheduleTag> implements IScheduleTagService{
}
