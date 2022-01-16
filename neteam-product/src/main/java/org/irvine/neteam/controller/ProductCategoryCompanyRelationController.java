package org.irvine.neteam.controller;

import org.irvine.neteam.entity.ProductCategoryCompanyRelation;
import org.irvine.neteam.service.ProductCategoryCompanyRelationService;
import org.springframework.web.bind.annotation.*;
import org.irvine.neteam.common.utils.ResultType;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import javax.annotation.Resource;

/**
 * 公司分类关联(ProductCategoryCompanyRelation)表控制层
 *
 * @author g_ban
 * @since 2022-01-16 15:23:34
 */
@RestController
@RequestMapping("/product/productCategoryCompanyRelation")
public class ProductCategoryCompanyRelationController {
    /**
     * 服务对象
     */
    @Resource
    private ProductCategoryCompanyRelationService productCategoryCompanyRelationService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultType queryById(@PathVariable("id") Long id) {
        return ResultType.ok(this.productCategoryCompanyRelationService.getById(id));
    }

    /**
     * 查询多条数据
     *
     * @param productCategoryCompanyRelation 实体
     * @return 单条数据
     */
    @GetMapping("/query")
    public ResultType queryById(ProductCategoryCompanyRelation productCategoryCompanyRelation) {
        return ResultType.ok(this.productCategoryCompanyRelationService.list(new QueryWrapper<>(productCategoryCompanyRelation)));
    }
    
    /**
     * 新增数据
     *
     * @param productCategoryCompanyRelation 实体
     * @return 新增结果
     */
    @PostMapping
    public ResultType add(ProductCategoryCompanyRelation productCategoryCompanyRelation) {
        return ResultType.ok(this.productCategoryCompanyRelationService.save(productCategoryCompanyRelation));
    }

    /**
     * 编辑数据
     *
     * @param productCategoryCompanyRelation 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResultType update(ProductCategoryCompanyRelation productCategoryCompanyRelation) {
        return ResultType.ok(this.productCategoryCompanyRelationService.updateById(productCategoryCompanyRelation));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResultType deleteById(Long id) {
        return ResultType.ok(this.productCategoryCompanyRelationService.removeById(id));
    }

}

