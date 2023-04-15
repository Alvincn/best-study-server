package com.example.bestStudy.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.bestStudy.domain.Tag;
import com.example.bestStudy.mapper.TagMapper;
import com.example.bestStudy.service.ITagService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Service
@Primary
public class TagServiceImpl extends ServiceImpl<TagMapper,Tag> implements ITagService{
}
