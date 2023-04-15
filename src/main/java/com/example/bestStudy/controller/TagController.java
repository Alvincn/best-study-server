package com.example.bestStudy.controller;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Arrays;
import com.example.bestStudy.service.ITagService;
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
import com.example.bestStudy.domain.Tag;
@RestController
@RequestMapping("/bestStudy/tag")
@Api("标签管理")
public class TagController{
    @Autowired
    private ITagService tagService;
    @GetMapping("/page")
    public AjaxResult page(PageEntity pageEntity,Tag tag){
        return AjaxResult.success(tagService.page(pageEntity.toPage(), Wrappers.lambdaQuery(tag)));
    }
    @GetMapping("/list")
    public AjaxResult list(Tag tag){
        return AjaxResult.success(tagService.list(Wrappers.lambdaQuery(tag)));
    }
    @PostMapping("/push")
    public AjaxResult add(@RequestBody Tag tag) {
        return AjaxResult.success(tagService.save(tag));
    }
    @PutMapping("/edit")
    public AjaxResult edit(@RequestBody Tag tag) {
        return AjaxResult.success(tagService.updateById(tag));
    }
    @DeleteMapping("/delete/{ids}")
    public AjaxResult delete(@PathVariable Integer[] ids) {
        return AjaxResult.success(tagService.removeByIds(Arrays.asList(ids)));
    }
    @GetMapping(value = "/detail/{id}")
    public AjaxResult detail(@PathVariable("id") Integer id) {
        return AjaxResult.success(tagService.getById(id));
    }
}
