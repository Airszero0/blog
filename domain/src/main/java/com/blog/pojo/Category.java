/**
 * @Date:Fri Oct 05 23:46:06 CST 2018
 * @Description:由generator自动生成
 */
package com.blog.pojo;

import com.blog.BaseModel;
import java.util.Date;
import lombok.Data;

/**
 @Table:分类
 @Date:Fri Oct 05 23:46:06 CST 2018
 */
@Data
public class Category extends BaseModel {
    /**
     @Description:类名
    */
    private String name;

    private Integer uid;

    private Integer pid;

    private Integer isdeleted;

    private Date createtime;

    /**
     @Description:热度
    */
    private Integer hot;
}