package org.irvine.neteam.controller;

import org.irvine.neteam.entity.ProductSpuComment;
import org.irvine.neteam.service.ProductSpuCommentService;
import org.springframework.web.bind.annotation.*;
import org.irvine.neteam.common.utils.ResultType;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import javax.annotation.Resource;

/**
 * 商品评价(ProductSpuComment)表控制层
 *
 * @author g_ban
 * @since 2022-01-16 15:23:34
 */
@RestController
@RequestMapping("/product/productSpuComment")
public class ProductSpuCommentController {
    /**
     * 服务对象
     */
    @Resource
    private ProductSpuCommentService productSpuCommentService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultType queryById(@PathVariable("id") Long id) {
        return ResultType.ok(this.productSpuCommentService.getById(id));
    }

    /**
     * 查询多条数据
     *
     * @param productSpuComment 实体
     * @return 单条数据
     */
    @GetMapping("/query")
    public ResultType queryById(ProductSpuComment productSpuComment) {
        return ResultType.ok(this.productSpuCommentService.list(new QueryWrapper<>(productSpuComment)));
    }
    
    /**
     * 新增数据
     *
     * @param productSpuComment 实体
     * @return 新增结果
     */
    @PostMapping
    public ResultType add(ProductSpuComment productSpuComment) {
        return ResultType.ok(this.productSpuCommentService.save(productSpuComment));
    }

    /**
     * 编辑数据
     *
     * @param productSpuComment 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResultType update(ProductSpuComment productSpuComment) {
        return ResultType.ok(this.productSpuCommentService.updateById(productSpuComment));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResultType deleteById(Long id) {
        return ResultType.ok(this.productSpuCommentService.removeById(id));
    }

}

