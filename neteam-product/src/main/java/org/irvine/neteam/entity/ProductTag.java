package org.irvine.neteam.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 商品属性(ProductTag)表实体类
 *
 * @author g_ban
 * @since 2022-01-16 15:23:34
 */
@Data
@TableName("product_tag")
public class ProductTag implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 属性id
     */    
    @TableId("tagId")
    private Long tagId;
    /**
     * 属性名
     */    
    private String tagName;
    /**
     * 属性类型
     */    
    private Integer tagType;
    /**
     * 启用状态[0 - 禁用，1 - 启用]
     */    
    private Long enable;
}

