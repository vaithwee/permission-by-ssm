package xyz.vaith.pmbssm.model;

import java.io.Serializable;
import java.util.Date;

/**
 * sys_user
 * @author 
 */
public class SysUser implements Serializable {
    /**
     * 用户id
     */
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户手机
     */
    private String telephone;

    /**
     * 用户邮箱
     */
    private String mail;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 备注
     */
    private String remark;

    /**
     * 部门id
     */
    private Integer deptId;

    /**
     * 状态| 0: 冻结 1: 正常 2: 删除
     */
    private Integer status;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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