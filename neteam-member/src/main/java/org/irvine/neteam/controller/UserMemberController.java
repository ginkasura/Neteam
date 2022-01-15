package org.irvine.neteam.controller;

import org.irvine.neteam.entity.UserMember;
import org.irvine.neteam.service.UserMemberService;
import org.springframework.web.bind.annotation.*;
import org.irvine.neteam.common.utils.ResultType;

import javax.annotation.Resource;

/**
 * 会员(UserMember)表控制层
 *
 * @author makejava
 * @since 2022-01-15 00:38:20
 */
@RestController
@RequestMapping("userMember")
public class UserMemberController {
    /**
     * 服务对象
     */
    @Resource
    private UserMemberService userMemberService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultType queryById(@PathVariable("id") Long id) {
        return ResultType.ok(this.userMemberService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param userMember 实体
     * @return 新增结果
     */
    @PostMapping
    public ResultType add(UserMember userMember) {
        return ResultType.ok(this.userMemberService.insert(userMember));
    }

    /**
     * 编辑数据
     *
     * @param userMember 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResultType update(UserMember userMember) {
        return ResultType.ok(this.userMemberService.update(userMember));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResultType deleteById(Long id) {
        return ResultType.ok(this.userMemberService.deleteById(id));
    }

}

