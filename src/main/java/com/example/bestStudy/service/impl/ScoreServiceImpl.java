package com.example.bestStudy.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.bestStudy.domain.Score;
import com.example.bestStudy.mapper.ScoreMapper;
import com.example.bestStudy.service.IScoreService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Service
@Primary
public class ScoreServiceImpl extends ServiceImpl<ScoreMapper,Score> implements IScoreService{
}
