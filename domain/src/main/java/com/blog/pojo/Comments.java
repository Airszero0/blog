/**
 * @Date:Fri Oct 05 23:46:06 CST 2018
 * @Description:由generator自动生成
 */
package com.blog.pojo;

import com.blog.BaseModel;
import java.util.Date;
import lombok.Data;

/**
 @Table:评论
 @Date:Fri Oct 05 23:46:06 CST 2018
 */
@Data
public class Comments extends BaseModel {
    /**
     @Description:被回复评论的guid
    */
    private String replyuserguid;

    /**
     @Description:文章guid
    */
    private String articleguid;

    private Integer uid;

    private Integer pid;

    /**
     @Description:赞
    */
    private Integer agreecount;

    private Date publishdate;

    private Date createtime;
}