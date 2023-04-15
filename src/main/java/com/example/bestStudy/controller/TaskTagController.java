package com.example.bestStudy.controller;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Arrays;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.bestStudy.domain.TaskTag;
import xin.altitude.cms.common.entity.AjaxResult;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import xin.altitude.cms.common.entity.PageEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.bestStudy.service.ITaskTagService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
@RequestMapping("/bestStudy/task/tag")

public class TaskTagController{
    @Autowired
    private ITaskTagService taskTagService;
    @GetMapping("/page")
    public AjaxResult page(PageEntity pageEntity,TaskTag taskTag){
        return AjaxResult.success(taskTagService.page(pageEntity.toPage(), Wrappers.lambdaQuery(taskTag)));
    }
    @GetMapping("/list")
    public AjaxResult list(TaskTag taskTag){
        return AjaxResult.success(taskTagService.list(Wrappers.lambdaQuery(taskTag)));
    }
    @PostMapping("/push")
    public AjaxResult add(@RequestBody TaskTag taskTag) {
        return AjaxResult.success(taskTagService.save(taskTag));
    }
    @PutMapping("/edit")
    public AjaxResult edit(@RequestBody TaskTag taskTag) {
        return AjaxResult.success(taskTagService.updateById(taskTag));
    }
    @DeleteMapping("/delete/{ids}")
    public AjaxResult delete(@PathVariable Integer[] ids) {
        return AjaxResult.success(taskTagService.removeByIds(Arrays.asList(ids)));
    }
    @GetMapping(value = "/detail/{id}")
    public AjaxResult detail(@PathVariable("id") Integer id) {
        return AjaxResult.success(taskTagService.getById(id));
    }
}
