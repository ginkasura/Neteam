package org.irvine.neteam.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.irvine.neteam.dao.ProductCategoryCompanyRelationDao;
import org.irvine.neteam.entity.ProductCategoryCompanyRelation;
import org.irvine.neteam.service.ProductCategoryCompanyRelationService;
import org.springframework.stereotype.Service;

/**
 * 公司分类关联(ProductCategoryCompanyRelation)表服务实现类
 *
 * @author g_ban
 * @since 2022-01-16 15:23:34
 */
@Service("productCategoryCompanyRelationService")
public class ProductCategoryCompanyRelationServiceImpl extends ServiceImpl<ProductCategoryCompanyRelationDao, ProductCategoryCompanyRelation> implements ProductCategoryCompanyRelationService {

}

