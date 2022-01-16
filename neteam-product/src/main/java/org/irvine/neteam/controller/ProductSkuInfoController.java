package org.irvine.neteam.controller;

import org.irvine.neteam.entity.ProductSkuInfo;
import org.irvine.neteam.service.ProductSkuInfoService;
import org.springframework.web.bind.annotation.*;
import org.irvine.neteam.common.utils.ResultType;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import javax.annotation.Resource;

/**
 * sku信息(ProductSkuInfo)表控制层
 *
 * @author g_ban
 * @since 2022-01-16 15:23:34
 */
@RestController
@RequestMapping("/product/productSkuInfo")
public class ProductSkuInfoController {
    /**
     * 服务对象
     */
    @Resource
    private ProductSkuInfoService productSkuInfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultType queryById(@PathVariable("id") Long id) {
        return ResultType.ok(this.productSkuInfoService.getById(id));
    }

    /**
     * 查询多条数据
     *
     * @param productSkuInfo 实体
     * @return 单条数据
     */
    @GetMapping("/query")
    public ResultType queryById(ProductSkuInfo productSkuInfo) {
        return ResultType.ok(this.productSkuInfoService.list(new QueryWrapper<>(productSkuInfo)));
    }
    
    /**
     * 新增数据
     *
     * @param productSkuInfo 实体
     * @return 新增结果
     */
    @PostMapping
    public ResultType add(ProductSkuInfo productSkuInfo) {
        return ResultType.ok(this.productSkuInfoService.save(productSkuInfo));
    }

    /**
     * 编辑数据
     *
     * @param productSkuInfo 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResultType update(ProductSkuInfo productSkuInfo) {
        return ResultType.ok(this.productSkuInfoService.updateById(productSkuInfo));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResultType deleteById(Long id) {
        return ResultType.ok(this.productSkuInfoService.removeById(id));
    }

}

