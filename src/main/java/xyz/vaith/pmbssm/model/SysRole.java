package xyz.vaith.pmbssm.model;

import java.io.Serializable;
import java.util.Date;

/**
 * sys_role
 * @author 
 */
public class SysRole implements Serializable {
    /**
     * 角色id
     */
    private Integer id;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 角色类型 | 0: 其他 1: 管理员
     */
    private Integer type;

    /**
     * 角色状态 | 0: 冻结 1: 正常
     */
    private Integer status;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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