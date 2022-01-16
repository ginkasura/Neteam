package org.irvine.neteam.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.irvine.neteam.dao.ProductTagGroupDao;
import org.irvine.neteam.entity.ProductTagGroup;
import org.irvine.neteam.service.ProductTagGroupService;
import org.springframework.stereotype.Service;

/**
 * 属性分组(ProductTagGroup)表服务实现类
 *
 * @author g_ban
 * @since 2022-01-16 15:23:34
 */
@Service("productTagGroupService")
public class ProductTagGroupServiceImpl extends ServiceImpl<ProductTagGroupDao, ProductTagGroup> implements ProductTagGroupService {

}

