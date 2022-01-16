package org.irvine.neteam.entity;

import java.util.Date;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * spu信息(ProductSpuInfo)表实体类
 *
 * @author g_ban
 * @since 2022-01-16 15:23:34
 */
@Data
@TableName("product_spu_info")
public class ProductSpuInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 商品id
     */    
    @TableId("id")
    private Long id;
    /**
     * 商品名称
     */    
    private String spuName;
    /**
     * 商品描述
     */    
    private String spuDescription;
    /**
     * 所属分类id
     */    
    private Long catalogId;
    /**
     * 上架状态[0 - 下架，1 - 上架]
     */    
    private Integer publishStatus;
    /**
     * 出版日期
     */    
    private Date publishTime;
    /**
     * 出版公司
     */    
    private Long publishCompany;
        
    private Date createTime;
        
    private Date updateTime;
    /**
     * 点赞数
     */    
    private Integer likes;
    /**
     * 收藏数
     */    
    private Integer collects;
    /**
     * 评分
     */    
    private Double rating;
}

