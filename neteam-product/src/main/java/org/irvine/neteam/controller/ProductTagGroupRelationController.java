package org.irvine.neteam.controller;

import org.irvine.neteam.entity.ProductTagGroupRelation;
import org.irvine.neteam.service.ProductTagGroupRelationService;
import org.springframework.web.bind.annotation.*;
import org.irvine.neteam.common.utils.ResultType;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import javax.annotation.Resource;

/**
 * 属性&属性分组关联(ProductTagGroupRelation)表控制层
 *
 * @author g_ban
 * @since 2022-01-16 15:23:34
 */
@RestController
@RequestMapping("/product/productTagGroupRelation")
public class ProductTagGroupRelationController {
    /**
     * 服务对象
     */
    @Resource
    private ProductTagGroupRelationService productTagGroupRelationService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultType queryById(@PathVariable("id") Long id) {
        return ResultType.ok(this.productTagGroupRelationService.getById(id));
    }

    /**
     * 查询多条数据
     *
     * @param productTagGroupRelation 实体
     * @return 单条数据
     */
    @GetMapping("/query")
    public ResultType queryById(ProductTagGroupRelation productTagGroupRelation) {
        return ResultType.ok(this.productTagGroupRelationService.list(new QueryWrapper<>(productTagGroupRelation)));
    }
    
    /**
     * 新增数据
     *
     * @param productTagGroupRelation 实体
     * @return 新增结果
     */
    @PostMapping
    public ResultType add(ProductTagGroupRelation productTagGroupRelation) {
        return ResultType.ok(this.productTagGroupRelationService.save(productTagGroupRelation));
    }

    /**
     * 编辑数据
     *
     * @param productTagGroupRelation 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResultType update(ProductTagGroupRelation productTagGroupRelation) {
        return ResultType.ok(this.productTagGroupRelationService.updateById(productTagGroupRelation));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResultType deleteById(Long id) {
        return ResultType.ok(this.productTagGroupRelationService.removeById(id));
    }

}

