package org.irvine.neteam.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.irvine.neteam.dao.ProductSpuInfoDao;
import org.irvine.neteam.entity.ProductSpuInfo;
import org.irvine.neteam.service.ProductSpuInfoService;
import org.springframework.stereotype.Service;

/**
 * spu信息(ProductSpuInfo)表服务实现类
 *
 * @author g_ban
 * @since 2022-01-16 15:23:34
 */
@Service("productSpuInfoService")
public class ProductSpuInfoServiceImpl extends ServiceImpl<ProductSpuInfoDao, ProductSpuInfo> implements ProductSpuInfoService {

}

