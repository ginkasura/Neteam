package org.irvine.neteam.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.irvine.neteam.entity.ProductTagGroupRelation;

/**
 * 属性&属性分组关联(ProductTagGroupRelation)表数据库访问层
 *
 * @author g_ban
 * @since 2022-01-16 15:23:34
 */
@Mapper
public interface ProductTagGroupRelationDao extends BaseMapper<ProductTagGroupRelation> {

}

