/**
 * @Date:Fri Oct 05 23:46:06 CST 2018
 * @Description:由generator自动生成
 */
package com.blog.pojo;

import com.blog.BaseModel;
import java.util.Date;
import lombok.Data;

/**
 @Table:标签
 @Date:Fri Oct 05 23:46:06 CST 2018
 */
@Data
public class Tag extends BaseModel {
    /**
     @Description:标签名
    */
    private String tagname;

    private Integer uid;

    private Integer pid;

    private String articleguid;

    private Date createtime;

    private Integer isdeleted;

    /**
     @Description:热度
    */
    private Integer hot;

    /**
     @Description:查看总数
    */
    private Integer checktotal;
}