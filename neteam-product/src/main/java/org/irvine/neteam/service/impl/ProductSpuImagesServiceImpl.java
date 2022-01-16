package org.irvine.neteam.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.irvine.neteam.dao.ProductSpuImagesDao;
import org.irvine.neteam.entity.ProductSpuImages;
import org.irvine.neteam.service.ProductSpuImagesService;
import org.springframework.stereotype.Service;

/**
 * spu图片(ProductSpuImages)表服务实现类
 *
 * @author g_ban
 * @since 2022-01-16 15:23:34
 */
@Service("productSpuImagesService")
public class ProductSpuImagesServiceImpl extends ServiceImpl<ProductSpuImagesDao, ProductSpuImages> implements ProductSpuImagesService {

}

