package org.irvine.neteam.controller;

import org.irvine.neteam.entity.ProductSpuTag;
import org.irvine.neteam.service.ProductSpuTagService;
import org.springframework.web.bind.annotation.*;
import org.irvine.neteam.common.utils.ResultType;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import javax.annotation.Resource;

/**
 * spu属性值(ProductSpuTag)表控制层
 *
 * @author g_ban
 * @since 2022-01-16 15:23:34
 */
@RestController
@RequestMapping("/product/productSpuTag")
public class ProductSpuTagController {
    /**
     * 服务对象
     */
    @Resource
    private ProductSpuTagService productSpuTagService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultType queryById(@PathVariable("id") Long id) {
        return ResultType.ok(this.productSpuTagService.getById(id));
    }

    /**
     * 查询多条数据
     *
     * @param productSpuTag 实体
     * @return 单条数据
     */
    @GetMapping("/query")
    public ResultType queryById(ProductSpuTag productSpuTag) {
        return ResultType.ok(this.productSpuTagService.list(new QueryWrapper<>(productSpuTag)));
    }
    
    /**
     * 新增数据
     *
     * @param productSpuTag 实体
     * @return 新增结果
     */
    @PostMapping
    public ResultType add(ProductSpuTag productSpuTag) {
        return ResultType.ok(this.productSpuTagService.save(productSpuTag));
    }

    /**
     * 编辑数据
     *
     * @param productSpuTag 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResultType update(ProductSpuTag productSpuTag) {
        return ResultType.ok(this.productSpuTagService.updateById(productSpuTag));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResultType deleteById(Long id) {
        return ResultType.ok(this.productSpuTagService.removeById(id));
    }

}

