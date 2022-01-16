package org.irvine.neteam.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.irvine.neteam.dao.ProductCompanyDao;
import org.irvine.neteam.entity.ProductCompany;
import org.irvine.neteam.service.ProductCompanyService;
import org.springframework.stereotype.Service;

/**
 * 公司(ProductCompany)表服务实现类
 *
 * @author g_ban
 * @since 2022-01-16 15:23:34
 */
@Service("productCompanyService")
public class ProductCompanyServiceImpl extends ServiceImpl<ProductCompanyDao, ProductCompany> implements ProductCompanyService {

}

