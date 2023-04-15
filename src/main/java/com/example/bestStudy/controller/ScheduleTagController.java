package com.example.bestStudy.controller;
import com.example.bestStudy.domain.ScheduleTag;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Arrays;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import xin.altitude.cms.common.entity.AjaxResult;
import org.springframework.web.bind.annotation.RestController;
import com.example.bestStudy.service.IScheduleTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import xin.altitude.cms.common.entity.PageEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
@RequestMapping("/bestStudy/schedule/tag")

public class ScheduleTagController{
    @Autowired
    private IScheduleTagService scheduleTagService;
    @GetMapping("/page")
    public AjaxResult page(PageEntity pageEntity, ScheduleTag scheduleTag){
        return AjaxResult.success(scheduleTagService.page(pageEntity.toPage(), Wrappers.lambdaQuery(scheduleTag)));
    }
    @GetMapping("/list")
    public AjaxResult list(ScheduleTag scheduleTag){
        return AjaxResult.success(scheduleTagService.list(Wrappers.lambdaQuery(scheduleTag)));
    }
    @PostMapping("/push")
    public AjaxResult add(@RequestBody ScheduleTag scheduleTag) {
        return AjaxResult.success(scheduleTagService.save(scheduleTag));
    }
    @PutMapping("/edit")
    public AjaxResult edit(@RequestBody ScheduleTag scheduleTag) {
        return AjaxResult.success(scheduleTagService.updateById(scheduleTag));
    }
    @DeleteMapping("/delete/{ids}")
    public AjaxResult delete(@PathVariable Integer[] ids) {
        return AjaxResult.success(scheduleTagService.removeByIds(Arrays.asList(ids)));
    }
    @GetMapping(value = "/detail/{id}")
    public AjaxResult detail(@PathVariable("id") Integer id) {
        return AjaxResult.success(scheduleTagService.getById(id));
    }
}
