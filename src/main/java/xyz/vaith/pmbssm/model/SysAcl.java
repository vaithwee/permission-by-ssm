package xyz.vaith.pmbssm.model;

import java.io.Serializable;
import java.util.Date;

/**
 * sys_acl
 *
 * @author
 */
public class SysAcl implements Serializable {
    /**
     * 权限id
     */
    private Integer id;

    /**
     * 权限代码
     */
    private String code;

    /**
     * 权限名称
     */
    private String name;

    /**
     * 权限模块id
     */
    private Integer aclModuleId;

    /**
     * 权限链接
     */
    private String url;

    /**
     * 权限类型 | 0: 其他 1: 菜单 2: 链接
     */
    private Integer type;

    /**
     * 权限状态 | 0: 冻结 1: 正常
     */
    private Integer status;

    /**
     * 权限排序
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