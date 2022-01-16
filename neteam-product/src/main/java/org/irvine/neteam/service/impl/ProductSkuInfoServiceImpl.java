package org.irvine.neteam.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.irvine.neteam.dao.ProductSkuInfoDao;
import org.irvine.neteam.entity.ProductSkuInfo;
import org.irvine.neteam.service.ProductSkuInfoService;
import org.springframework.stereotype.Service;

/**
 * sku信息(ProductSkuInfo)表服务实现类
 *
 * @author g_ban
 * @since 2022-01-16 15:23:34
 */
@Service("productSkuInfoService")
public class ProductSkuInfoServiceImpl extends ServiceImpl<ProductSkuInfoDao, ProductSkuInfo> implements ProductSkuInfoService {

}

