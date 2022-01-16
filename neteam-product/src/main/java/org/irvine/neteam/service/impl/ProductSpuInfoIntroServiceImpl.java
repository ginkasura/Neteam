package org.irvine.neteam.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.irvine.neteam.dao.ProductSpuInfoIntroDao;
import org.irvine.neteam.entity.ProductSpuInfoIntro;
import org.irvine.neteam.service.ProductSpuInfoIntroService;
import org.springframework.stereotype.Service;

/**
 * spu信息介绍(ProductSpuInfoIntro)表服务实现类
 *
 * @author g_ban
 * @since 2022-01-16 15:23:34
 */
@Service("productSpuInfoIntroService")
public class ProductSpuInfoIntroServiceImpl extends ServiceImpl<ProductSpuInfoIntroDao, ProductSpuInfoIntro> implements ProductSpuInfoIntroService {

}

