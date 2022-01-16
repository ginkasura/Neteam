package org.irvine.neteam.controller;

import org.irvine.neteam.entity.ProductSpuInfo;
import org.irvine.neteam.service.ProductSpuInfoService;
import org.springframework.web.bind.annotation.*;
import org.irvine.neteam.common.utils.ResultType;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import javax.annotation.Resource;

/**
 * spu信息(ProductSpuInfo)表控制层
 *
 * @author g_ban
 * @since 2022-01-16 15:23:34
 */
@RestController
@RequestMapping("/product/productSpuInfo")
public class ProductSpuInfoController {
    /**
     * 服务对象
     */
    @Resource
    private ProductSpuInfoService productSpuInfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultType queryById(@PathVariable("id") Long id) {
        return ResultType.ok(this.productSpuInfoService.getById(id));
    }

    /**
     * 查询多条数据
     *
     * @param productSpuInfo 实体
     * @return 单条数据
     */
    @GetMapping("/query")
    public ResultType queryById(ProductSpuInfo productSpuInfo) {
        return ResultType.ok(this.productSpuInfoService.list(new QueryWrapper<>(productSpuInfo)));
    }
    
    /**
     * 新增数据
     *
     * @param productSpuInfo 实体
     * @return 新增结果
     */
    @PostMapping
    public ResultType add(ProductSpuInfo productSpuInfo) {
        return ResultType.ok(this.productSpuInfoService.save(productSpuInfo));
    }

    /**
     * 编辑数据
     *
     * @param productSpuInfo 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResultType update(ProductSpuInfo productSpuInfo) {
        return ResultType.ok(this.productSpuInfoService.updateById(productSpuInfo));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResultType deleteById(Long id) {
        return ResultType.ok(this.productSpuInfoService.removeById(id));
    }

}

