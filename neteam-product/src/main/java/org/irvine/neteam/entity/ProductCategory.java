package org.irvine.neteam.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 商品分类(ProductCategory)表实体类
 *
 * @author g_ban
 * @since 2022-01-16 15:23:34
 */
@Data
@TableName("product_category")
public class ProductCategory implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 分类id
     */    
    @TableId("catId")
    private Long catId;
    /**
     * 分类名称
     */    
    private String name;
    /**
     * 分类类别
     */    
    private Integer categoryType;
    /**
     * 层级
     */    
    private Integer catLevel;
    /**
     * 是否显示[0-不显示，1显示]
     */    
    private Integer showStatus;
    /**
     * 排序
     */    
    private Integer sort;
    /**
     * 商品数量
     */    
    private Integer productCount;
}

