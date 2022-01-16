package org.irvine.neteam.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * spu图片(ProductSpuImages)表实体类
 *
 * @author g_ban
 * @since 2022-01-16 15:23:34
 */
@Data
@TableName("product_spu_images")
public class ProductSpuImages implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * id
     */    
    @TableId("id")
    private Long id;
    /**
     * spu_id
     */    
    private Long spuId;
    /**
     * 图片名
     */    
    private String imgName;
    /**
     * 图片地址
     */    
    private String imgUrl;
    /**
     * 顺序
     */    
    private Integer imgSort;
    /**
     * 是否默认图
     */    
    private Integer defaultImg;
}

