package com.example.bestStudy.controller;
import com.example.bestStudy.domain.Plan;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Arrays;

import com.example.bestStudy.service.IPlanService;
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
@RequestMapping("/bestStudy/plan")
@Api("目标管理")
public class PlanController{
    @Autowired
    private IPlanService planService;
    @GetMapping("/page")
    public AjaxResult page(PageEntity pageEntity, Plan plan){
        return AjaxResult.success(planService.page(pageEntity.toPage(), Wrappers.lambdaQuery(plan)));
    }
    @GetMapping("/list")
    public AjaxResult list(Plan plan){
        return AjaxResult.success(planService.list(Wrappers.lambdaQuery(plan)));
    }
    @PostMapping("/push")
    public AjaxResult add(@RequestBody Plan plan) {
        return AjaxResult.success(planService.save(plan));
    }
    @PutMapping("/edit")
    public AjaxResult edit(@RequestBody Plan plan) {
        return AjaxResult.success(planService.updateById(plan));
    }
    @DeleteMapping("/delete/{ids}")
    public AjaxResult delete(@PathVariable Integer[] ids) {
        return AjaxResult.success(planService.removeByIds(Arrays.asList(ids)));
    }
    @GetMapping(value = "/detail/{id}")
    public AjaxResult detail(@PathVariable("id") Integer id) {
        return AjaxResult.success(planService.getById(id));
    }
}
