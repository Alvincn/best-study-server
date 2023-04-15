package com.example.bestStudy.controller;
import com.example.bestStudy.domain.PlanTag;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Arrays;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import xin.altitude.cms.common.entity.AjaxResult;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import xin.altitude.cms.common.entity.PageEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import com.example.bestStudy.service.IPlanTagService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
@RequestMapping("/bestStudy/plan/tag")
public class PlanTagController{
    @Autowired
    private IPlanTagService planTagService;
    @GetMapping("/page")
    public AjaxResult page(PageEntity pageEntity, PlanTag planTag){
        return AjaxResult.success(planTagService.page(pageEntity.toPage(), Wrappers.lambdaQuery(planTag)));
    }
    @GetMapping("/list")
    public AjaxResult list(PlanTag planTag){
        return AjaxResult.success(planTagService.list(Wrappers.lambdaQuery(planTag)));
    }
    @PostMapping("/push")
    public AjaxResult add(@RequestBody PlanTag planTag) {
        return AjaxResult.success(planTagService.save(planTag));
    }
    @PutMapping("/edit")
    public AjaxResult edit(@RequestBody PlanTag planTag) {
        return AjaxResult.success(planTagService.updateById(planTag));
    }
    @DeleteMapping("/delete/{ids}")
    public AjaxResult delete(@PathVariable Integer[] ids) {
        return AjaxResult.success(planTagService.removeByIds(Arrays.asList(ids)));
    }
    @GetMapping(value = "/detail/{id}")
    public AjaxResult detail(@PathVariable("id") Integer id) {
        return AjaxResult.success(planTagService.getById(id));
    }
}
