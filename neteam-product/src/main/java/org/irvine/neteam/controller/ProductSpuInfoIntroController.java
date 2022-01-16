package org.irvine.neteam.controller;

import org.irvine.neteam.entity.ProductSpuInfoIntro;
import org.irvine.neteam.service.ProductSpuInfoIntroService;
import org.springframework.web.bind.annotation.*;
import org.irvine.neteam.common.utils.ResultType;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import javax.annotation.Resource;

/**
 * spu信息介绍(ProductSpuInfoIntro)表控制层
 *
 * @author g_ban
 * @since 2022-01-16 15:23:34
 */
@RestController
@RequestMapping("/product/productSpuInfoIntro")
public class ProductSpuInfoIntroController {
    /**
     * 服务对象
     */
    @Resource
    private ProductSpuInfoIntroService productSpuInfoIntroService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultType queryById(@PathVariable("id") Long id) {
        return ResultType.ok(this.productSpuInfoIntroService.getById(id));
    }

    /**
     * 查询多条数据
     *
     * @param productSpuInfoIntro 实体
     * @return 单条数据
     */
    @GetMapping("/query")
    public ResultType queryById(ProductSpuInfoIntro productSpuInfoIntro) {
        return ResultType.ok(this.productSpuInfoIntroService.list(new QueryWrapper<>(productSpuInfoIntro)));
    }
    
    /**
     * 新增数据
     *
     * @param productSpuInfoIntro 实体
     * @return 新增结果
     */
    @PostMapping
    public ResultType add(ProductSpuInfoIntro productSpuInfoIntro) {
        return ResultType.ok(this.productSpuInfoIntroService.save(productSpuInfoIntro));
    }

    /**
     * 编辑数据
     *
     * @param productSpuInfoIntro 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResultType update(ProductSpuInfoIntro productSpuInfoIntro) {
        return ResultType.ok(this.productSpuInfoIntroService.updateById(productSpuInfoIntro));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResultType deleteById(Long id) {
        return ResultType.ok(this.productSpuInfoIntroService.removeById(id));
    }

}

