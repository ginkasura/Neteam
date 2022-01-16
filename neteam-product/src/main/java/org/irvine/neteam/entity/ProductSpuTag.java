package org.irvine.neteam.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * spu属性值(ProductSpuTag)表实体类
 *
 * @author g_ban
 * @since 2022-01-16 15:23:34
 */
@Data
@TableName("product_spu_tag")
public class ProductSpuTag implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * id
     */    
    @TableId("id")
    private Long id;
    /**
     * 商品id
     */    
    private Long spuId;
    /**
     * 属性id
     */    
    private Long tagId;
    /**
     * 属性名
     */    
    private String tagName;
    /**
     * 顺序
     */    
    private Integer tagSort;
    /**
     * 快速展示【是否展示在介绍上；0-否 1-是】
     */    
    private Integer quickShow;
}

