package org.irvine.neteam.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.irvine.neteam.dao.UserMemberDao;
import org.irvine.neteam.entity.UserMember;
import org.irvine.neteam.service.UserMemberService;
import org.springframework.stereotype.Service;

/**
 * 会员(UserMember)表服务实现类
 *
 * @author g_ban
 * @since 2022-01-16 04:11:52
 */
@Service("userMemberService")
public class UserMemberServiceImpl extends ServiceImpl<UserMemberDao, UserMember> implements UserMemberService {

}

