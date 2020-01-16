package xyz.vaith.pmbssm.model;

import java.io.Serializable;
import java.util.Date;

/**
 * sys_role_acl
 *
 * @author
 */
public class SysRoleAcl implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 角色id
     */
    private Integer roleId;

    /**
     * 权限id
     */
    private Integer aclId;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getAclId() {
        return aclId;
    }

    public void setAclId(Integer aclId) {
        this.aclId = aclId;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Date getOperateTimer() {
        return operateTimer;
    }

    public void setOperateTimer(Date operateTimer) {
        this.operateTimer = operateTimer;
    }

    public String getOperateIp() {
        return operateIp;
    }

    public void setOperateIp(String operateIp) {
        this.operateIp = operateIp;
    }
}