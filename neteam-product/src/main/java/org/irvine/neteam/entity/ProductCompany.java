package org.irvine.neteam.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 公司(ProductCompany)表实体类
 *
 * @author g_ban
 * @since 2022-01-16 15:23:34
 */
@Data
@TableName("product_company")
public class ProductCompany implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 公司id
     */    
    @TableId("companyId")
    private Long companyId;
    /**
     * 公司名
     */    
    private String name;
    /**
     * 公司logo地址
     */    
    private String logo;
    /**
     * 介绍
     */    
    private String intro;
    /**
     * 显示状态[0-不显示；1-显示]
     */    
    private Integer showStatus;
    /**
     * 检索首字母
     */    
    private String firstLetter;
    /**
     * 排序
     */    
    private Integer sort;
}

