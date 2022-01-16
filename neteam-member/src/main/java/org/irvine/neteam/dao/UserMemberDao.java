package org.irvine.neteam.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.irvine.neteam.entity.UserMember;

/**
 * 会员(UserMember)表数据库访问层
 *
 * @author g_ban
 * @since 2022-01-16 04:11:52
 */
@Mapper
public interface UserMemberDao extends BaseMapper<UserMember> {

}

