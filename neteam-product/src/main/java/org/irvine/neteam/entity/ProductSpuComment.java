package org.irvine.neteam.entity;

import java.util.Date;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 商品评价(ProductSpuComment)表实体类
 *
 * @author g_ban
 * @since 2022-01-16 15:23:34
 */
@Data
@TableName("product_spu_comment")
public class ProductSpuComment implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * id
     */    
    @TableId("id")
    private Long id;
    /**
     * sku_id
     */    
    private Long skuId;
    /**
     * spu_id
     */    
    private Long spuId;
    /**
     * 商品名字
     */    
    private String spuName;
    /**
     * 会员昵称
     */    
    private String memberNickName;
    /**
     * 星级
     */    
    private Integer star;
    /**
     * 创建时间
     */    
    private Date createTime;
    /**
     * 显示状态[0-不显示，1-显示]
     */    
    private Integer showStatus;
    /**
     * 点赞数
     */    
    private Integer likesCount;
    /**
     * 评论图片/视频[json数据；[{type:文件类型,url:资源路径}]]
     */    
    private String resources;
    /**
     * 内容
     */    
    private String content;
    /**
     * 用户头像
     */    
    private Long memberIcon;
}

