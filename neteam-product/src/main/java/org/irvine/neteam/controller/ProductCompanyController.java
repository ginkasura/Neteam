package org.irvine.neteam.controller;

import org.irvine.neteam.entity.ProductCompany;
import org.irvine.neteam.service.ProductCompanyService;
import org.springframework.web.bind.annotation.*;
import org.irvine.neteam.common.utils.ResultType;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import javax.annotation.Resource;

/**
 * 公司(ProductCompany)表控制层
 *
 * @author g_ban
 * @since 2022-01-16 15:23:34
 */
@RestController
@RequestMapping("/product/productCompany")
public class ProductCompanyController {
    /**
     * 服务对象
     */
    @Resource
    private ProductCompanyService productCompanyService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultType queryById(@PathVariable("id") Long id) {
        return ResultType.ok(this.productCompanyService.getById(id));
    }

    /**
     * 查询多条数据
     *
     * @param productCompany 实体
     * @return 单条数据
     */
    @GetMapping("/query")
    public ResultType queryById(ProductCompany productCompany) {
        return ResultType.ok(this.productCompanyService.list(new QueryWrapper<>(productCompany)));
    }
    
    /**
     * 新增数据
     *
     * @param productCompany 实体
     * @return 新增结果
     */
    @PostMapping
    public ResultType add(ProductCompany productCompany) {
        return ResultType.ok(this.productCompanyService.save(productCompany));
    }

    /**
     * 编辑数据
     *
     * @param productCompany 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResultType update(ProductCompany productCompany) {
        return ResultType.ok(this.productCompanyService.updateById(productCompany));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResultType deleteById(Long id) {
        return ResultType.ok(this.productCompanyService.removeById(id));
    }

}

