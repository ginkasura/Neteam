package org.irvine.neteam.controller;

import org.irvine.neteam.entity.ProductSpuImages;
import org.irvine.neteam.service.ProductSpuImagesService;
import org.springframework.web.bind.annotation.*;
import org.irvine.neteam.common.utils.ResultType;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import javax.annotation.Resource;

/**
 * spu图片(ProductSpuImages)表控制层
 *
 * @author g_ban
 * @since 2022-01-16 15:23:34
 */
@RestController
@RequestMapping("/product/productSpuImages")
public class ProductSpuImagesController {
    /**
     * 服务对象
     */
    @Resource
    private ProductSpuImagesService productSpuImagesService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultType queryById(@PathVariable("id") Long id) {
        return ResultType.ok(this.productSpuImagesService.getById(id));
    }

    /**
     * 查询多条数据
     *
     * @param productSpuImages 实体
     * @return 单条数据
     */
    @GetMapping("/query")
    public ResultType queryById(ProductSpuImages productSpuImages) {
        return ResultType.ok(this.productSpuImagesService.list(new QueryWrapper<>(productSpuImages)));
    }
    
    /**
     * 新增数据
     *
     * @param productSpuImages 实体
     * @return 新增结果
     */
    @PostMapping
    public ResultType add(ProductSpuImages productSpuImages) {
        return ResultType.ok(this.productSpuImagesService.save(productSpuImages));
    }

    /**
     * 编辑数据
     *
     * @param productSpuImages 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResultType update(ProductSpuImages productSpuImages) {
        return ResultType.ok(this.productSpuImagesService.updateById(productSpuImages));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResultType deleteById(Long id) {
        return ResultType.ok(this.productSpuImagesService.removeById(id));
    }

}

