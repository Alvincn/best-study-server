package com.example.bestStudy.controller;
import com.example.bestStudy.service.IScoreService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.bestStudy.domain.Score;
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
@RequestMapping("/bestStudy/score")
@Api("分数管理")
public class ScoreController{
    @Autowired
    private IScoreService scoreService;
    @GetMapping("/page")
    public AjaxResult page(PageEntity pageEntity,Score score){
        return AjaxResult.success(scoreService.page(pageEntity.toPage(), Wrappers.lambdaQuery(score)));
    }
    @GetMapping("/list")
    public AjaxResult list(Score score){
        return AjaxResult.success(scoreService.list(Wrappers.lambdaQuery(score)));
    }
    @PostMapping("/push")
    public AjaxResult add(@RequestBody Score score) {
        return AjaxResult.success(scoreService.save(score));
    }
    @PutMapping("/edit")
    public AjaxResult edit(@RequestBody Score score) {
        return AjaxResult.success(scoreService.updateById(score));
    }
    @DeleteMapping("/delete/{ids}")
    public AjaxResult delete(@PathVariable Integer[] ids) {
        return AjaxResult.success(scoreService.removeByIds(Arrays.asList(ids)));
    }
    @GetMapping(value = "/detail/{id}")
    public AjaxResult detail(@PathVariable("id") Integer id) {
        return AjaxResult.success(scoreService.getById(id));
    }
}
