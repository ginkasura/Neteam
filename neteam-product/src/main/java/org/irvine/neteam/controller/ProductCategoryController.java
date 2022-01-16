package org.irvine.neteam.controller;

import org.irvine.neteam.entity.ProductCategory;
import org.irvine.neteam.service.ProductCategoryService;
import org.springframework.web.bind.annotation.*;
import org.irvine.neteam.common.utils.ResultType;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import javax.annotation.Resource;

/**
 * 商品分类(ProductCategory)表控制层
 *
 * @author g_ban
 * @since 2022-01-16 15:23:34
 */
@RestController
@RequestMapping("/product/productCategory")
public class ProductCategoryController {
    /**
     * 服务对象
     */
    @Resource
    private ProductCategoryService productCategoryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultType queryById(@PathVariable("id") Long id) {
        return ResultType.ok(this.productCategoryService.getById(id));
    }

    /**
     * 查询多条数据
     *
     * @param productCategory 实体
     * @return 单条数据
     */
    @GetMapping("/query")
    public ResultType queryById(ProductCategory productCategory) {
        return ResultType.ok(this.productCategoryService.list(new QueryWrapper<>(productCategory)));
    }

    /**
     * 新增数据
     *
     * @param productCategory 实体
     * @return 新增结果
     */
    @PostMapping
    public ResultType add(ProductCategory productCategory) {
        return ResultType.ok(this.productCategoryService.save(productCategory));
    }

    /**
     * 编辑数据
     *
     * @param productCategory 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResultType update(ProductCategory productCategory) {
        return ResultType.ok(this.productCategoryService.updateById(productCategory));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResultType deleteById(Long id) {
        return ResultType.ok(this.productCategoryService.removeById(id));
    }

}

