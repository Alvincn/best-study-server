package com.example.bestStudy.controller;
import com.example.bestStudy.domain.Schedule;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.bestStudy.service.IScheduleService;
import java.util.Arrays;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import xin.altitude.cms.common.entity.AjaxResult;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import xin.altitude.cms.common.entity.PageEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/bestStudy/schedule")
@Api("日程 管理日程的安排，包括时间，会议，约会")//管理日程的安排，包括时间，会议，约会
public class ScheduleController{
    @Autowired
    private IScheduleService scheduleService;
    @GetMapping("/page")
    public AjaxResult page(PageEntity pageEntity, Schedule schedule){
        return AjaxResult.success(scheduleService.page(pageEntity.toPage(), Wrappers.lambdaQuery(schedule)));
    }
    @GetMapping("/list")
    public AjaxResult list(Schedule schedule){
        return AjaxResult.success(scheduleService.list(Wrappers.lambdaQuery(schedule)));
    }
    @PostMapping("/push")
    public AjaxResult add(@RequestBody Schedule schedule) {
        return AjaxResult.success(scheduleService.save(schedule));
    }
    @PutMapping("/edit")
    public AjaxResult edit(@RequestBody Schedule schedule) {
        return AjaxResult.success(scheduleService.updateById(schedule));
    }
    @DeleteMapping("/delete/{ids}")
    public AjaxResult delete(@PathVariable Integer[] ids) {
        return AjaxResult.success(scheduleService.removeByIds(Arrays.asList(ids)));
    }
    @GetMapping(value = "/detail/{id}")
    public AjaxResult detail(@PathVariable("id") Integer id) {
        return AjaxResult.success(scheduleService.getById(id));
    }
}
