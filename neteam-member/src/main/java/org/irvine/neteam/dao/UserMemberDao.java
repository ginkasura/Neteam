package org.irvine.neteam.dao;

import org.apache.ibatis.annotations.Mapper;
import org.irvine.neteam.entity.UserMember;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 会员(UserMember)表数据库访问层
 *
 * @author makejava
 * @since 2022-01-15 00:38:20
 */
@Mapper
public interface UserMemberDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserMember queryById(Long id);

    /**
     * 统计总行数
     *
     * @param userMember 查询条件
     * @return 总行数
     */
    long count(UserMember userMember);

    /**
     * 新增数据
     *
     * @param userMember 实例对象
     * @return 影响行数
     */
    int insert(UserMember userMember);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<UserMember> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<UserMember> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<UserMember> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<UserMember> entities);

    /**
     * 修改数据
     *
     * @param userMember 实例对象
     * @return 影响行数
     */
    int update(UserMember userMember);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

