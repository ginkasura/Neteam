package org.irvine.neteam.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.irvine.neteam.dao.ProductTagGroupRelationDao;
import org.irvine.neteam.entity.ProductTagGroupRelation;
import org.irvine.neteam.service.ProductTagGroupRelationService;
import org.springframework.stereotype.Service;

/**
 * 属性&属性分组关联(ProductTagGroupRelation)表服务实现类
 *
 * @author g_ban
 * @since 2022-01-16 15:23:34
 */
@Service("productTagGroupRelationService")
public class ProductTagGroupRelationServiceImpl extends ServiceImpl<ProductTagGroupRelationDao, ProductTagGroupRelation> implements ProductTagGroupRelationService {

}

