package org.irvine.neteam.controller;

import org.irvine.neteam.entity.ProductTag;
import org.irvine.neteam.service.ProductTagService;
import org.springframework.web.bind.annotation.*;
import org.irvine.neteam.common.utils.ResultType;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import javax.annotation.Resource;

/**
 * 商品属性(ProductTag)表控制层
 *
 * @author g_ban
 * @since 2022-01-16 15:23:34
 */
@RestController
@RequestMapping("/product/productTag")
public class ProductTagController {
    /**
     * 服务对象
     */
    @Resource
    private ProductTagService productTagService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultType queryById(@PathVariable("id") Long id) {
        return ResultType.ok(this.productTagService.getById(id));
    }

    /**
     * 查询多条数据
     *
     * @param productTag 实体
     * @return 单条数据
     */
    @GetMapping("/query")
    public ResultType queryById(ProductTag productTag) {
        return ResultType.ok(this.productTagService.list(new QueryWrapper<>(productTag)));
    }
    
    /**
     * 新增数据
     *
     * @param productTag 实体
     * @return 新增结果
     */
    @PostMapping
    public ResultType add(ProductTag productTag) {
        return ResultType.ok(this.productTagService.save(productTag));
    }

    /**
     * 编辑数据
     *
     * @param productTag 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResultType update(ProductTag productTag) {
        return ResultType.ok(this.productTagService.updateById(productTag));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResultType deleteById(Long id) {
        return ResultType.ok(this.productTagService.removeById(id));
    }

}

