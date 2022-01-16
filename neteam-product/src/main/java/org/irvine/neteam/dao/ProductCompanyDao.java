package org.irvine.neteam.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.irvine.neteam.entity.ProductCompany;

/**
 * 公司(ProductCompany)表数据库访问层
 *
 * @author g_ban
 * @since 2022-01-16 15:23:34
 */
@Mapper
public interface ProductCompanyDao extends BaseMapper<ProductCompany> {

}

