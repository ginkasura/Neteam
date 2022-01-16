package org.irvine.neteam.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.irvine.neteam.dao.ProductSpuTagDao;
import org.irvine.neteam.entity.ProductSpuTag;
import org.irvine.neteam.service.ProductSpuTagService;
import org.springframework.stereotype.Service;

/**
 * spu属性值(ProductSpuTag)表服务实现类
 *
 * @author g_ban
 * @since 2022-01-16 15:23:34
 */
@Service("productSpuTagService")
public class ProductSpuTagServiceImpl extends ServiceImpl<ProductSpuTagDao, ProductSpuTag> implements ProductSpuTagService {

}

