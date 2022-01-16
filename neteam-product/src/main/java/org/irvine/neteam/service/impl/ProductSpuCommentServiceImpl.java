package org.irvine.neteam.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.irvine.neteam.dao.ProductSpuCommentDao;
import org.irvine.neteam.entity.ProductSpuComment;
import org.irvine.neteam.service.ProductSpuCommentService;
import org.springframework.stereotype.Service;

/**
 * 商品评价(ProductSpuComment)表服务实现类
 *
 * @author g_ban
 * @since 2022-01-16 15:23:34
 */
@Service("productSpuCommentService")
public class ProductSpuCommentServiceImpl extends ServiceImpl<ProductSpuCommentDao, ProductSpuComment> implements ProductSpuCommentService {

}

