package org.irvine.neteam.service.impl;

import org.irvine.neteam.entity.UserMember;
import org.irvine.neteam.dao.UserMemberDao;
import org.irvine.neteam.service.UserMemberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 会员(UserMember)表服务实现类
 *
 * @author makejava
 * @since 2022-01-15 00:38:20
 */
@Service("userMemberService")
public class UserMemberServiceImpl implements UserMemberService {
    @Resource
    private UserMemberDao userMemberDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserMember queryById(Long id) {
        return this.userMemberDao.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param userMember 实例对象
     * @return 实例对象
     */
    @Override
    public UserMember insert(UserMember userMember) {
        this.userMemberDao.insert(userMember);
        return userMember;
    }

    /**
     * 修改数据
     *
     * @param userMember 实例对象
     * @return 实例对象
     */
    @Override
    public UserMember update(UserMember userMember) {
        this.userMemberDao.update(userMember);
        return this.queryById(userMember.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.userMemberDao.deleteById(id) > 0;
    }
}
