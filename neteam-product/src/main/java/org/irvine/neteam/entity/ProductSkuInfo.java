package org.irvine.neteam.entity;

import java.util.Date;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * sku信息(ProductSkuInfo)表实体类
 *
 * @author g_ban
 * @since 2022-01-16 15:23:34
 */
@Data
@TableName("product_sku_info")
public class ProductSkuInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * skuId
     */    
    @TableId("skuId")
    private Long skuId;
    /**
     * spuId
     */    
    private Long spuId;
    /**
     * sku名称
     */    
    private String skuName;
    /**
     * sku介绍描述
     */    
    private String skuDesc;
    /**
     * 所属分类id
     */    
    private Long catalogId;
    /**
     * 默认图片
     */    
    private String skuDefaultImg;
    /**
     * 标题
     */    
    private String skuTitle;
    /**
     * 副标题
     */    
    private String skuSubtitle;
    /**
     * 价格
     */    
    private Double price;
    /**
     * 销量
     */    
    private Long saleCount;
    /**
     * 出版日期
     */    
    private Date publishTime;
    /**
     * 出版公司
     */    
    private Long publishCompany;
    /**
     * 类型，电子/实体
     */    
    private Integer productType;
}

