/**
 * @Date:Fri Oct 05 23:46:06 CST 2018
 * @Description:由generator自动生成
 */
package com.blog.pojo;

import com.blog.BaseModel;
import java.util.Date;
import lombok.Data;

/**
 @Table:文章
 @Date:Fri Oct 05 23:46:06 CST 2018
 */
@Data
public class Aritcles extends BaseModel {
    /**
     @Description:标题
    */
    private String title;

    /**
     @Description:描述
    */
    private String desc;

    /**
     @Description:查看总数
    */
    private Integer viewcount;

    private Date publishdate;

    /**
     @Description:分类
    */
    private String category;

    private String categoryguid;

    /**
     @Description:是否草稿
    */
    private Integer isdraft;

    private Integer isdeleted;

    private Date createtime;

    /**
     @Description:头图标
    */
    private String headimage;

    private String content;
}