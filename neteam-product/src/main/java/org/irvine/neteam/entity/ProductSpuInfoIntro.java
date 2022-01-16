package org.irvine.neteam.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * spu信息介绍(ProductSpuInfoIntro)表实体类
 *
 * @author g_ban
 * @since 2022-01-16 15:23:34
 */
@Data
@TableName("product_spu_info_intro")
public class ProductSpuInfoIntro implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 商品id
     */    
    @TableId("spuId")
    private Long spuId;
    /**
     * 商品介绍
     */    
    private String intro;
}

