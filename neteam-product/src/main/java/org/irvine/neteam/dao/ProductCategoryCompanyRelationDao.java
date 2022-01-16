package org.irvine.neteam.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.irvine.neteam.entity.ProductCategoryCompanyRelation;

/**
 * 公司分类关联(ProductCategoryCompanyRelation)表数据库访问层
 *
 * @author g_ban
 * @since 2022-01-16 15:23:34
 */
@Mapper
public interface ProductCategoryCompanyRelationDao extends BaseMapper<ProductCategoryCompanyRelation> {

}

