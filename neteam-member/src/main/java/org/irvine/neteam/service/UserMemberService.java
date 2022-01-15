package org.irvine.neteam.service;

import org.irvine.neteam.entity.UserMember;

/**
 * 会员(UserMember)表服务接口
 *
 * @author makejava
 * @since 2022-01-15 00:38:20
 */
public interface UserMemberService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserMember queryById(Long id);

    /**
     * 新增数据
     *
     * @param userMember 实例对象
     * @return 实例对象
     */
    UserMember insert(UserMember userMember);

    /**
     * 修改数据
     *
     * @param userMember 实例对象
     * @return 实例对象
     */
    UserMember update(UserMember userMember);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
