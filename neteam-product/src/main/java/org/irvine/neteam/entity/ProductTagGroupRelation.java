package org.irvine.neteam.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 属性&属性分组关联(ProductTagGroupRelation)表实体类
 *
 * @author g_ban
 * @since 2022-01-16 15:23:34
 */
@Data
@TableName("product_tag_group_relation")
public class ProductTagGroupRelation implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * id
     */    
    @TableId("id")
    private Long id;
    /**
     * 属性id
     */    
    private Long tagId;
    /**
     * 属性分组id
     */    
    private Long tagGroupId;
    /**
     * 属性组内排序
     */    
    private Integer tagSort;
}

