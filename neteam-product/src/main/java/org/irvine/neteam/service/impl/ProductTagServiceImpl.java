package org.irvine.neteam.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.irvine.neteam.dao.ProductTagDao;
import org.irvine.neteam.entity.ProductTag;
import org.irvine.neteam.service.ProductTagService;
import org.springframework.stereotype.Service;

/**
 * 商品属性(ProductTag)表服务实现类
 *
 * @author g_ban
 * @since 2022-01-16 15:23:34
 */
@Service("productTagService")
public class ProductTagServiceImpl extends ServiceImpl<ProductTagDao, ProductTag> implements ProductTagService {

}

