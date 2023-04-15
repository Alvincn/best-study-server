package com.example.bestStudy.controller;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Arrays;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import xin.altitude.cms.common.entity.AjaxResult;
import com.example.bestStudy.service.ITaskService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import xin.altitude.cms.common.entity.PageEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import com.example.bestStudy.domain.Task;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@Api("任务管理")
@RequestMapping("/bestStudy/task")
public class TaskController{
    @Autowired
    private ITaskService taskService;
    @GetMapping("/page")
    public AjaxResult page(PageEntity pageEntity,Task task){
        return AjaxResult.success(taskService.page(pageEntity.toPage(), Wrappers.lambdaQuery(task)));
    }
    @GetMapping("/list")
    public AjaxResult list(Task task){
        return AjaxResult.success(taskService.list(Wrappers.lambdaQuery(task)));
    }
    @PostMapping("/push")
    public AjaxResult add(@RequestBody Task task) {
        return AjaxResult.success(taskService.save(task));
    }
    @PutMapping("/edit")
    public AjaxResult edit(@RequestBody Task task) {
        return AjaxResult.success(taskService.updateById(task));
    }
    @DeleteMapping("/delete/{ids}")
    public AjaxResult delete(@PathVariable Integer[] ids) {
        return AjaxResult.success(taskService.removeByIds(Arrays.asList(ids)));
    }
    @GetMapping(value = "/detail/{id}")
    public AjaxResult detail(@PathVariable("id") Integer id) {
        return AjaxResult.success(taskService.getById(id));
    }
}
