package xyz.vaith.pmbssm.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * sys_acl_module
 *
 * @author
 */
@Data
public class SysAclModule implements Serializable {
    /**
     * 权限模块id
     */
    private Integer id;

    /**
     * 权限模块名称
     */
    private String name;

    /**
     * 上层权限模块id
     */
    private Integer parentId;

    /**
     * 权限模块层级
     */
    private String level;

    /**
     * 权限模块状态 | 0: 冻结 1: 正常
     */
    private Integer status;

    /**
     * 权限模块排序
     */
    private Integer seq;

    /**
     * 备注
     */
    private String remark;

    /**
     * 操作者
     */
    private String operator;

    /**
     * 最后一次操作时间
     */
    private Date operateTimer;

    /**
     * 最后一次更新操作者的ip
     */
    private String operateIp;

    private static final long serialVersionUID = 1L;


}