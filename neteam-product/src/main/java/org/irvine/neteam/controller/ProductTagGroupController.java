package org.irvine.neteam.controller;

import org.irvine.neteam.entity.ProductTagGroup;
import org.irvine.neteam.service.ProductTagGroupService;
import org.springframework.web.bind.annotation.*;
import org.irvine.neteam.common.utils.ResultType;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import javax.annotation.Resource;

/**
 * 属性分组(ProductTagGroup)表控制层
 *
 * @author g_ban
 * @since 2022-01-16 15:23:34
 */
@RestController
@RequestMapping("/product/productTagGroup")
public class ProductTagGroupController {
    /**
     * 服务对象
     */
    @Resource
    private ProductTagGroupService productTagGroupService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultType queryById(@PathVariable("id") Long id) {
        return ResultType.ok(this.productTagGroupService.getById(id));
    }

    /**
     * 查询多条数据
     *
     * @param productTagGroup 实体
     * @return 单条数据
     */
    @GetMapping("/query")
    public ResultType queryById(ProductTagGroup productTagGroup) {
        return ResultType.ok(this.productTagGroupService.list(new QueryWrapper<>(productTagGroup)));
    }
    
    /**
     * 新增数据
     *
     * @param productTagGroup 实体
     * @return 新增结果
     */
    @PostMapping
    public ResultType add(ProductTagGroup productTagGroup) {
        return ResultType.ok(this.productTagGroupService.save(productTagGroup));
    }

    /**
     * 编辑数据
     *
     * @param productTagGroup 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResultType update(ProductTagGroup productTagGroup) {
        return ResultType.ok(this.productTagGroupService.updateById(productTagGroup));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResultType deleteById(Long id) {
        return ResultType.ok(this.productTagGroupService.removeById(id));
    }

}

