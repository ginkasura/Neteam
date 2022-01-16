package org.irvine.neteam.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.irvine.neteam.dao.ProductCategoryDao;
import org.irvine.neteam.entity.ProductCategory;
import org.irvine.neteam.service.ProductCategoryService;
import org.springframework.stereotype.Service;

/**
 * 商品分类(ProductCategory)表服务实现类
 *
 * @author g_ban
 * @since 2022-01-16 15:23:34
 */
@Service("productCategoryService")
public class ProductCategoryServiceImpl extends ServiceImpl<ProductCategoryDao, ProductCategory> implements ProductCategoryService {

}

