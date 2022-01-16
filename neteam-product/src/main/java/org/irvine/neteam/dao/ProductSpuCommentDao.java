package org.irvine.neteam.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.irvine.neteam.entity.ProductSpuComment;

/**
 * 商品评价(ProductSpuComment)表数据库访问层
 *
 * @author g_ban
 * @since 2022-01-16 15:23:34
 */
@Mapper
public interface ProductSpuCommentDao extends BaseMapper<ProductSpuComment> {

}

