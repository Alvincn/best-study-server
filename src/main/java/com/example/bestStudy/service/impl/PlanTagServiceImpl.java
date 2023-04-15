package com.example.bestStudy.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.bestStudy.domain.PlanTag;
import com.example.bestStudy.mapper.PlanTagMapper;
import com.example.bestStudy.service.IPlanTagService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Service
@Primary
public class PlanTagServiceImpl extends ServiceImpl<PlanTagMapper, PlanTag> implements IPlanTagService{
}
