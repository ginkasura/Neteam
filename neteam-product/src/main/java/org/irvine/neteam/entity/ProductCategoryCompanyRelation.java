package org.irvine.neteam.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 公司分类关联(ProductCategoryCompanyRelation)表实体类
 *
 * @author g_ban
 * @since 2022-01-16 15:23:34
 */
@Data
@TableName("product_category_company_relation")
public class ProductCategoryCompanyRelation implements Serializable {
    private static final long serialVersionUID = 1L;
        
    @TableId("id")
    private Long id;
    /**
     * 公司id
     */    
    private Long companyId;
    /**
     * 分类id
     */    
    private Long categoryId;
        
    private String companyName;
        
    private String categoryName;
}

