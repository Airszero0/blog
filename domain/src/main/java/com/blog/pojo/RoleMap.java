/**
 * @Date:Fri Oct 05 23:46:06 CST 2018
 * @Description:由generator自动生成
 */
package com.blog.pojo;

import com.blog.BaseModel;
import java.util.Date;
import lombok.Data;

/**
 @Table:角色
 @Date:Fri Oct 05 23:46:06 CST 2018
 */
@Data
public class RoleMap extends BaseModel {
    /**
     @Description:角色名
    */
    private String rolename;

    /**
     @Description:权限
    */
    private String auths;

    private Integer isenabled;

    private Integer isdeleted;

    private Date createtime;
}