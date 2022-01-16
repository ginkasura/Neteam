package org.irvine.neteam.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 属性分组(ProductTagGroup)表实体类
 *
 * @author g_ban
 * @since 2022-01-16 15:23:34
 */
@Data
@TableName("product_tag_group")
public class ProductTagGroup implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 分组id
     */    
    @TableId("tagGroupId")
    private Long tagGroupId;
    /**
     * 组名
     */    
    private String tagGroupName;
    /**
     * 排序
     */    
    private Integer sort;
}

