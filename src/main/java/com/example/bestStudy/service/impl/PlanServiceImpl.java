package com.example.bestStudy.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.bestStudy.domain.Plan;
import com.example.bestStudy.mapper.PlanMapper;
import com.example.bestStudy.service.IPlanService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Service
@Primary
public class PlanServiceImpl extends ServiceImpl<PlanMapper, Plan> implements IPlanService{
}
