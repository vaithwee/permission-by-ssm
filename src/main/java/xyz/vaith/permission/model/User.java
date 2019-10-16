package xyz.vaith.permission.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author author
*/
public class User implements Serializable {

    private static final long serialVersionUID = 1571190897310L;


    /**
    * 主键
    * 用户id
    * isNullAble:0
    */
    private Integer id;

    /**
    * 用户名
    * isNullAble:0
    */
    private byte[] username;

    /**
    * 电话
    * isNullAble:0,defaultVal:
    */
    private String telephone;

    /**
    * 邮箱
    * isNullAble:0,defaultVal:
    */
    private String mail;

    /**
    * 密码
    * isNullAble:0
    */
    private String password;

    /**
    * 部门id
    * isNullAble:0
    */
    private Integer deptId;

    /**
    * 0: 代表冻结 1:代表正常 2:代表删除
    * isNullAble:0,defaultVal:1
    */
    private Integer status;

    /**
    * 备注
    * isNullAble:1,defaultVal:
    */
    private String remark;

    /**
    * 操作者
    * isNullAble:0,defaultVal:
    */
    private String operator;

    /**
    * 操作者ip
    * isNullAble:0,defaultVal:
    */
    private String operateIp;

    /**
    * 创建时间
    * isNullAble:0,defaultVal:CURRENT_TIMESTAMP
    */
    private java.time.LocalDateTime createTime;

    /**
    * 更新时间
    * isNullAble:0,defaultVal:CURRENT_TIMESTAMP
    */
    private java.time.LocalDateTime updateTime;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setUsername(byte[] username){this.username = username;}

    public byte[] getUsername(){return this.username;}

    public void setTelephone(String telephone){this.telephone = telephone;}

    public String getTelephone(){return this.telephone;}

    public void setMail(String mail){this.mail = mail;}

    public String getMail(){return this.mail;}

    public void setPassword(String password){this.password = password;}

    public String getPassword(){return this.password;}

    public void setDeptId(Integer deptId){this.deptId = deptId;}

    public Integer getDeptId(){return this.deptId;}

    public void setStatus(Integer status){this.status = status;}

    public Integer getStatus(){return this.status;}

    public void setRemark(String remark){this.remark = remark;}

    public String getRemark(){return this.remark;}

    public void setOperator(String operator){this.operator = operator;}

    public String getOperator(){return this.operator;}

    public void setOperateIp(String operateIp){this.operateIp = operateIp;}

    public String getOperateIp(){return this.operateIp;}

    public void setCreateTime(java.time.LocalDateTime createTime){this.createTime = createTime;}

    public java.time.LocalDateTime getCreateTime(){return this.createTime;}

    public void setUpdateTime(java.time.LocalDateTime updateTime){this.updateTime = updateTime;}

    public java.time.LocalDateTime getUpdateTime(){return this.updateTime;}
    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                "username='" + username + '\'' +
                "telephone='" + telephone + '\'' +
                "mail='" + mail + '\'' +
                "password='" + password + '\'' +
                "deptId='" + deptId + '\'' +
                "status='" + status + '\'' +
                "remark='" + remark + '\'' +
                "operator='" + operator + '\'' +
                "operateIp='" + operateIp + '\'' +
                "createTime='" + createTime + '\'' +
                "updateTime='" + updateTime + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private User set;

        private ConditionBuilder where;

        public UpdateBuilder set(User set){
            this.set = set;
            return this;
        }

        public User getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends User{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<byte[]> usernameList;

        public List<byte[]> getUsernameList(){return this.usernameList;}


        private List<String> telephoneList;

        public List<String> getTelephoneList(){return this.telephoneList;}


        private List<String> fuzzyTelephone;

        public List<String> getFuzzyTelephone(){return this.fuzzyTelephone;}

        private List<String> rightFuzzyTelephone;

        public List<String> getRightFuzzyTelephone(){return this.rightFuzzyTelephone;}
        private List<String> mailList;

        public List<String> getMailList(){return this.mailList;}


        private List<String> fuzzyMail;

        public List<String> getFuzzyMail(){return this.fuzzyMail;}

        private List<String> rightFuzzyMail;

        public List<String> getRightFuzzyMail(){return this.rightFuzzyMail;}
        private List<String> passwordList;

        public List<String> getPasswordList(){return this.passwordList;}


        private List<String> fuzzyPassword;

        public List<String> getFuzzyPassword(){return this.fuzzyPassword;}

        private List<String> rightFuzzyPassword;

        public List<String> getRightFuzzyPassword(){return this.rightFuzzyPassword;}
        private List<Integer> deptIdList;

        public List<Integer> getDeptIdList(){return this.deptIdList;}

        private Integer deptIdSt;

        private Integer deptIdEd;

        public Integer getDeptIdSt(){return this.deptIdSt;}

        public Integer getDeptIdEd(){return this.deptIdEd;}

        private List<Integer> statusList;

        public List<Integer> getStatusList(){return this.statusList;}

        private Integer statusSt;

        private Integer statusEd;

        public Integer getStatusSt(){return this.statusSt;}

        public Integer getStatusEd(){return this.statusEd;}

        private List<String> remarkList;

        public List<String> getRemarkList(){return this.remarkList;}


        private List<String> fuzzyRemark;

        public List<String> getFuzzyRemark(){return this.fuzzyRemark;}

        private List<String> rightFuzzyRemark;

        public List<String> getRightFuzzyRemark(){return this.rightFuzzyRemark;}
        private List<String> operatorList;

        public List<String> getOperatorList(){return this.operatorList;}


        private List<String> fuzzyOperator;

        public List<String> getFuzzyOperator(){return this.fuzzyOperator;}

        private List<String> rightFuzzyOperator;

        public List<String> getRightFuzzyOperator(){return this.rightFuzzyOperator;}
        private List<String> operateIpList;

        public List<String> getOperateIpList(){return this.operateIpList;}


        private List<String> fuzzyOperateIp;

        public List<String> getFuzzyOperateIp(){return this.fuzzyOperateIp;}

        private List<String> rightFuzzyOperateIp;

        public List<String> getRightFuzzyOperateIp(){return this.rightFuzzyOperateIp;}
        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<java.time.LocalDateTime> updateTimeList;

        public List<java.time.LocalDateTime> getUpdateTimeList(){return this.updateTimeList;}

        private java.time.LocalDateTime updateTimeSt;

        private java.time.LocalDateTime updateTimeEd;

        public java.time.LocalDateTime getUpdateTimeSt(){return this.updateTimeSt;}

        public java.time.LocalDateTime getUpdateTimeEd(){return this.updateTimeEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public QueryBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Integer id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
        }


        public QueryBuilder username(byte[] username){
            setUsername(username);
            return this;
        }

        public QueryBuilder usernameList(byte[] ... username){
            this.usernameList = solveNullList(username);
            return this;
        }

        public QueryBuilder usernameList(List<byte[]> username){
            this.usernameList = username;
            return this;
        }

        public QueryBuilder fetchUsername(){
            setFetchFields("fetchFields","username");
            return this;
        }

        public QueryBuilder excludeUsername(){
            setFetchFields("excludeFields","username");
            return this;
        }

        public QueryBuilder fuzzyTelephone (List<String> fuzzyTelephone){
            this.fuzzyTelephone = fuzzyTelephone;
            return this;
        }

        public QueryBuilder fuzzyTelephone (String ... fuzzyTelephone){
            this.fuzzyTelephone = solveNullList(fuzzyTelephone);
            return this;
        }

        public QueryBuilder rightFuzzyTelephone (List<String> rightFuzzyTelephone){
            this.rightFuzzyTelephone = rightFuzzyTelephone;
            return this;
        }

        public QueryBuilder rightFuzzyTelephone (String ... rightFuzzyTelephone){
            this.rightFuzzyTelephone = solveNullList(rightFuzzyTelephone);
            return this;
        }

        public QueryBuilder telephone(String telephone){
            setTelephone(telephone);
            return this;
        }

        public QueryBuilder telephoneList(String ... telephone){
            this.telephoneList = solveNullList(telephone);
            return this;
        }

        public QueryBuilder telephoneList(List<String> telephone){
            this.telephoneList = telephone;
            return this;
        }

        public QueryBuilder fetchTelephone(){
            setFetchFields("fetchFields","telephone");
            return this;
        }

        public QueryBuilder excludeTelephone(){
            setFetchFields("excludeFields","telephone");
            return this;
        }

        public QueryBuilder fuzzyMail (List<String> fuzzyMail){
            this.fuzzyMail = fuzzyMail;
            return this;
        }

        public QueryBuilder fuzzyMail (String ... fuzzyMail){
            this.fuzzyMail = solveNullList(fuzzyMail);
            return this;
        }

        public QueryBuilder rightFuzzyMail (List<String> rightFuzzyMail){
            this.rightFuzzyMail = rightFuzzyMail;
            return this;
        }

        public QueryBuilder rightFuzzyMail (String ... rightFuzzyMail){
            this.rightFuzzyMail = solveNullList(rightFuzzyMail);
            return this;
        }

        public QueryBuilder mail(String mail){
            setMail(mail);
            return this;
        }

        public QueryBuilder mailList(String ... mail){
            this.mailList = solveNullList(mail);
            return this;
        }

        public QueryBuilder mailList(List<String> mail){
            this.mailList = mail;
            return this;
        }

        public QueryBuilder fetchMail(){
            setFetchFields("fetchFields","mail");
            return this;
        }

        public QueryBuilder excludeMail(){
            setFetchFields("excludeFields","mail");
            return this;
        }

        public QueryBuilder fuzzyPassword (List<String> fuzzyPassword){
            this.fuzzyPassword = fuzzyPassword;
            return this;
        }

        public QueryBuilder fuzzyPassword (String ... fuzzyPassword){
            this.fuzzyPassword = solveNullList(fuzzyPassword);
            return this;
        }

        public QueryBuilder rightFuzzyPassword (List<String> rightFuzzyPassword){
            this.rightFuzzyPassword = rightFuzzyPassword;
            return this;
        }

        public QueryBuilder rightFuzzyPassword (String ... rightFuzzyPassword){
            this.rightFuzzyPassword = solveNullList(rightFuzzyPassword);
            return this;
        }

        public QueryBuilder password(String password){
            setPassword(password);
            return this;
        }

        public QueryBuilder passwordList(String ... password){
            this.passwordList = solveNullList(password);
            return this;
        }

        public QueryBuilder passwordList(List<String> password){
            this.passwordList = password;
            return this;
        }

        public QueryBuilder fetchPassword(){
            setFetchFields("fetchFields","password");
            return this;
        }

        public QueryBuilder excludePassword(){
            setFetchFields("excludeFields","password");
            return this;
        }

        public QueryBuilder deptIdBetWeen(Integer deptIdSt,Integer deptIdEd){
            this.deptIdSt = deptIdSt;
            this.deptIdEd = deptIdEd;
            return this;
        }

        public QueryBuilder deptIdGreaterEqThan(Integer deptIdSt){
            this.deptIdSt = deptIdSt;
            return this;
        }
        public QueryBuilder deptIdLessEqThan(Integer deptIdEd){
            this.deptIdEd = deptIdEd;
            return this;
        }


        public QueryBuilder deptId(Integer deptId){
            setDeptId(deptId);
            return this;
        }

        public QueryBuilder deptIdList(Integer ... deptId){
            this.deptIdList = solveNullList(deptId);
            return this;
        }

        public QueryBuilder deptIdList(List<Integer> deptId){
            this.deptIdList = deptId;
            return this;
        }

        public QueryBuilder fetchDeptId(){
            setFetchFields("fetchFields","deptId");
            return this;
        }

        public QueryBuilder excludeDeptId(){
            setFetchFields("excludeFields","deptId");
            return this;
        }

        public QueryBuilder statusBetWeen(Integer statusSt,Integer statusEd){
            this.statusSt = statusSt;
            this.statusEd = statusEd;
            return this;
        }

        public QueryBuilder statusGreaterEqThan(Integer statusSt){
            this.statusSt = statusSt;
            return this;
        }
        public QueryBuilder statusLessEqThan(Integer statusEd){
            this.statusEd = statusEd;
            return this;
        }


        public QueryBuilder status(Integer status){
            setStatus(status);
            return this;
        }

        public QueryBuilder statusList(Integer ... status){
            this.statusList = solveNullList(status);
            return this;
        }

        public QueryBuilder statusList(List<Integer> status){
            this.statusList = status;
            return this;
        }

        public QueryBuilder fetchStatus(){
            setFetchFields("fetchFields","status");
            return this;
        }

        public QueryBuilder excludeStatus(){
            setFetchFields("excludeFields","status");
            return this;
        }

        public QueryBuilder fuzzyRemark (List<String> fuzzyRemark){
            this.fuzzyRemark = fuzzyRemark;
            return this;
        }

        public QueryBuilder fuzzyRemark (String ... fuzzyRemark){
            this.fuzzyRemark = solveNullList(fuzzyRemark);
            return this;
        }

        public QueryBuilder rightFuzzyRemark (List<String> rightFuzzyRemark){
            this.rightFuzzyRemark = rightFuzzyRemark;
            return this;
        }

        public QueryBuilder rightFuzzyRemark (String ... rightFuzzyRemark){
            this.rightFuzzyRemark = solveNullList(rightFuzzyRemark);
            return this;
        }

        public QueryBuilder remark(String remark){
            setRemark(remark);
            return this;
        }

        public QueryBuilder remarkList(String ... remark){
            this.remarkList = solveNullList(remark);
            return this;
        }

        public QueryBuilder remarkList(List<String> remark){
            this.remarkList = remark;
            return this;
        }

        public QueryBuilder fetchRemark(){
            setFetchFields("fetchFields","remark");
            return this;
        }

        public QueryBuilder excludeRemark(){
            setFetchFields("excludeFields","remark");
            return this;
        }

        public QueryBuilder fuzzyOperator (List<String> fuzzyOperator){
            this.fuzzyOperator = fuzzyOperator;
            return this;
        }

        public QueryBuilder fuzzyOperator (String ... fuzzyOperator){
            this.fuzzyOperator = solveNullList(fuzzyOperator);
            return this;
        }

        public QueryBuilder rightFuzzyOperator (List<String> rightFuzzyOperator){
            this.rightFuzzyOperator = rightFuzzyOperator;
            return this;
        }

        public QueryBuilder rightFuzzyOperator (String ... rightFuzzyOperator){
            this.rightFuzzyOperator = solveNullList(rightFuzzyOperator);
            return this;
        }

        public QueryBuilder operator(String operator){
            setOperator(operator);
            return this;
        }

        public QueryBuilder operatorList(String ... operator){
            this.operatorList = solveNullList(operator);
            return this;
        }

        public QueryBuilder operatorList(List<String> operator){
            this.operatorList = operator;
            return this;
        }

        public QueryBuilder fetchOperator(){
            setFetchFields("fetchFields","operator");
            return this;
        }

        public QueryBuilder excludeOperator(){
            setFetchFields("excludeFields","operator");
            return this;
        }

        public QueryBuilder fuzzyOperateIp (List<String> fuzzyOperateIp){
            this.fuzzyOperateIp = fuzzyOperateIp;
            return this;
        }

        public QueryBuilder fuzzyOperateIp (String ... fuzzyOperateIp){
            this.fuzzyOperateIp = solveNullList(fuzzyOperateIp);
            return this;
        }

        public QueryBuilder rightFuzzyOperateIp (List<String> rightFuzzyOperateIp){
            this.rightFuzzyOperateIp = rightFuzzyOperateIp;
            return this;
        }

        public QueryBuilder rightFuzzyOperateIp (String ... rightFuzzyOperateIp){
            this.rightFuzzyOperateIp = solveNullList(rightFuzzyOperateIp);
            return this;
        }

        public QueryBuilder operateIp(String operateIp){
            setOperateIp(operateIp);
            return this;
        }

        public QueryBuilder operateIpList(String ... operateIp){
            this.operateIpList = solveNullList(operateIp);
            return this;
        }

        public QueryBuilder operateIpList(List<String> operateIp){
            this.operateIpList = operateIp;
            return this;
        }

        public QueryBuilder fetchOperateIp(){
            setFetchFields("fetchFields","operateIp");
            return this;
        }

        public QueryBuilder excludeOperateIp(){
            setFetchFields("excludeFields","operateIp");
            return this;
        }

        public QueryBuilder createTimeBetWeen(java.time.LocalDateTime createTimeSt,java.time.LocalDateTime createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public QueryBuilder createTimeGreaterEqThan(java.time.LocalDateTime createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public QueryBuilder createTimeLessEqThan(java.time.LocalDateTime createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public QueryBuilder createTime(java.time.LocalDateTime createTime){
            setCreateTime(createTime);
            return this;
        }

        public QueryBuilder createTimeList(java.time.LocalDateTime ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public QueryBuilder createTimeList(List<java.time.LocalDateTime> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public QueryBuilder fetchCreateTime(){
            setFetchFields("fetchFields","createTime");
            return this;
        }

        public QueryBuilder excludeCreateTime(){
            setFetchFields("excludeFields","createTime");
            return this;
        }

        public QueryBuilder updateTimeBetWeen(java.time.LocalDateTime updateTimeSt,java.time.LocalDateTime updateTimeEd){
            this.updateTimeSt = updateTimeSt;
            this.updateTimeEd = updateTimeEd;
            return this;
        }

        public QueryBuilder updateTimeGreaterEqThan(java.time.LocalDateTime updateTimeSt){
            this.updateTimeSt = updateTimeSt;
            return this;
        }
        public QueryBuilder updateTimeLessEqThan(java.time.LocalDateTime updateTimeEd){
            this.updateTimeEd = updateTimeEd;
            return this;
        }


        public QueryBuilder updateTime(java.time.LocalDateTime updateTime){
            setUpdateTime(updateTime);
            return this;
        }

        public QueryBuilder updateTimeList(java.time.LocalDateTime ... updateTime){
            this.updateTimeList = solveNullList(updateTime);
            return this;
        }

        public QueryBuilder updateTimeList(List<java.time.LocalDateTime> updateTime){
            this.updateTimeList = updateTime;
            return this;
        }

        public QueryBuilder fetchUpdateTime(){
            setFetchFields("fetchFields","updateTime");
            return this;
        }

        public QueryBuilder excludeUpdateTime(){
            setFetchFields("excludeFields","updateTime");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public User build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<byte[]> usernameList;

        public List<byte[]> getUsernameList(){return this.usernameList;}


        private List<String> telephoneList;

        public List<String> getTelephoneList(){return this.telephoneList;}


        private List<String> fuzzyTelephone;

        public List<String> getFuzzyTelephone(){return this.fuzzyTelephone;}

        private List<String> rightFuzzyTelephone;

        public List<String> getRightFuzzyTelephone(){return this.rightFuzzyTelephone;}
        private List<String> mailList;

        public List<String> getMailList(){return this.mailList;}


        private List<String> fuzzyMail;

        public List<String> getFuzzyMail(){return this.fuzzyMail;}

        private List<String> rightFuzzyMail;

        public List<String> getRightFuzzyMail(){return this.rightFuzzyMail;}
        private List<String> passwordList;

        public List<String> getPasswordList(){return this.passwordList;}


        private List<String> fuzzyPassword;

        public List<String> getFuzzyPassword(){return this.fuzzyPassword;}

        private List<String> rightFuzzyPassword;

        public List<String> getRightFuzzyPassword(){return this.rightFuzzyPassword;}
        private List<Integer> deptIdList;

        public List<Integer> getDeptIdList(){return this.deptIdList;}

        private Integer deptIdSt;

        private Integer deptIdEd;

        public Integer getDeptIdSt(){return this.deptIdSt;}

        public Integer getDeptIdEd(){return this.deptIdEd;}

        private List<Integer> statusList;

        public List<Integer> getStatusList(){return this.statusList;}

        private Integer statusSt;

        private Integer statusEd;

        public Integer getStatusSt(){return this.statusSt;}

        public Integer getStatusEd(){return this.statusEd;}

        private List<String> remarkList;

        public List<String> getRemarkList(){return this.remarkList;}


        private List<String> fuzzyRemark;

        public List<String> getFuzzyRemark(){return this.fuzzyRemark;}

        private List<String> rightFuzzyRemark;

        public List<String> getRightFuzzyRemark(){return this.rightFuzzyRemark;}
        private List<String> operatorList;

        public List<String> getOperatorList(){return this.operatorList;}


        private List<String> fuzzyOperator;

        public List<String> getFuzzyOperator(){return this.fuzzyOperator;}

        private List<String> rightFuzzyOperator;

        public List<String> getRightFuzzyOperator(){return this.rightFuzzyOperator;}
        private List<String> operateIpList;

        public List<String> getOperateIpList(){return this.operateIpList;}


        private List<String> fuzzyOperateIp;

        public List<String> getFuzzyOperateIp(){return this.fuzzyOperateIp;}

        private List<String> rightFuzzyOperateIp;

        public List<String> getRightFuzzyOperateIp(){return this.rightFuzzyOperateIp;}
        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<java.time.LocalDateTime> updateTimeList;

        public List<java.time.LocalDateTime> getUpdateTimeList(){return this.updateTimeList;}

        private java.time.LocalDateTime updateTimeSt;

        private java.time.LocalDateTime updateTimeEd;

        public java.time.LocalDateTime getUpdateTimeSt(){return this.updateTimeSt;}

        public java.time.LocalDateTime getUpdateTimeEd(){return this.updateTimeEd;}


        public ConditionBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public ConditionBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public ConditionBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public ConditionBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }


        public ConditionBuilder usernameList(byte[] ... username){
            this.usernameList = solveNullList(username);
            return this;
        }

        public ConditionBuilder usernameList(List<byte[]> username){
            this.usernameList = username;
            return this;
        }

        public ConditionBuilder fuzzyTelephone (List<String> fuzzyTelephone){
            this.fuzzyTelephone = fuzzyTelephone;
            return this;
        }

        public ConditionBuilder fuzzyTelephone (String ... fuzzyTelephone){
            this.fuzzyTelephone = solveNullList(fuzzyTelephone);
            return this;
        }

        public ConditionBuilder rightFuzzyTelephone (List<String> rightFuzzyTelephone){
            this.rightFuzzyTelephone = rightFuzzyTelephone;
            return this;
        }

        public ConditionBuilder rightFuzzyTelephone (String ... rightFuzzyTelephone){
            this.rightFuzzyTelephone = solveNullList(rightFuzzyTelephone);
            return this;
        }

        public ConditionBuilder telephoneList(String ... telephone){
            this.telephoneList = solveNullList(telephone);
            return this;
        }

        public ConditionBuilder telephoneList(List<String> telephone){
            this.telephoneList = telephone;
            return this;
        }

        public ConditionBuilder fuzzyMail (List<String> fuzzyMail){
            this.fuzzyMail = fuzzyMail;
            return this;
        }

        public ConditionBuilder fuzzyMail (String ... fuzzyMail){
            this.fuzzyMail = solveNullList(fuzzyMail);
            return this;
        }

        public ConditionBuilder rightFuzzyMail (List<String> rightFuzzyMail){
            this.rightFuzzyMail = rightFuzzyMail;
            return this;
        }

        public ConditionBuilder rightFuzzyMail (String ... rightFuzzyMail){
            this.rightFuzzyMail = solveNullList(rightFuzzyMail);
            return this;
        }

        public ConditionBuilder mailList(String ... mail){
            this.mailList = solveNullList(mail);
            return this;
        }

        public ConditionBuilder mailList(List<String> mail){
            this.mailList = mail;
            return this;
        }

        public ConditionBuilder fuzzyPassword (List<String> fuzzyPassword){
            this.fuzzyPassword = fuzzyPassword;
            return this;
        }

        public ConditionBuilder fuzzyPassword (String ... fuzzyPassword){
            this.fuzzyPassword = solveNullList(fuzzyPassword);
            return this;
        }

        public ConditionBuilder rightFuzzyPassword (List<String> rightFuzzyPassword){
            this.rightFuzzyPassword = rightFuzzyPassword;
            return this;
        }

        public ConditionBuilder rightFuzzyPassword (String ... rightFuzzyPassword){
            this.rightFuzzyPassword = solveNullList(rightFuzzyPassword);
            return this;
        }

        public ConditionBuilder passwordList(String ... password){
            this.passwordList = solveNullList(password);
            return this;
        }

        public ConditionBuilder passwordList(List<String> password){
            this.passwordList = password;
            return this;
        }

        public ConditionBuilder deptIdBetWeen(Integer deptIdSt,Integer deptIdEd){
            this.deptIdSt = deptIdSt;
            this.deptIdEd = deptIdEd;
            return this;
        }

        public ConditionBuilder deptIdGreaterEqThan(Integer deptIdSt){
            this.deptIdSt = deptIdSt;
            return this;
        }
        public ConditionBuilder deptIdLessEqThan(Integer deptIdEd){
            this.deptIdEd = deptIdEd;
            return this;
        }


        public ConditionBuilder deptIdList(Integer ... deptId){
            this.deptIdList = solveNullList(deptId);
            return this;
        }

        public ConditionBuilder deptIdList(List<Integer> deptId){
            this.deptIdList = deptId;
            return this;
        }

        public ConditionBuilder statusBetWeen(Integer statusSt,Integer statusEd){
            this.statusSt = statusSt;
            this.statusEd = statusEd;
            return this;
        }

        public ConditionBuilder statusGreaterEqThan(Integer statusSt){
            this.statusSt = statusSt;
            return this;
        }
        public ConditionBuilder statusLessEqThan(Integer statusEd){
            this.statusEd = statusEd;
            return this;
        }


        public ConditionBuilder statusList(Integer ... status){
            this.statusList = solveNullList(status);
            return this;
        }

        public ConditionBuilder statusList(List<Integer> status){
            this.statusList = status;
            return this;
        }

        public ConditionBuilder fuzzyRemark (List<String> fuzzyRemark){
            this.fuzzyRemark = fuzzyRemark;
            return this;
        }

        public ConditionBuilder fuzzyRemark (String ... fuzzyRemark){
            this.fuzzyRemark = solveNullList(fuzzyRemark);
            return this;
        }

        public ConditionBuilder rightFuzzyRemark (List<String> rightFuzzyRemark){
            this.rightFuzzyRemark = rightFuzzyRemark;
            return this;
        }

        public ConditionBuilder rightFuzzyRemark (String ... rightFuzzyRemark){
            this.rightFuzzyRemark = solveNullList(rightFuzzyRemark);
            return this;
        }

        public ConditionBuilder remarkList(String ... remark){
            this.remarkList = solveNullList(remark);
            return this;
        }

        public ConditionBuilder remarkList(List<String> remark){
            this.remarkList = remark;
            return this;
        }

        public ConditionBuilder fuzzyOperator (List<String> fuzzyOperator){
            this.fuzzyOperator = fuzzyOperator;
            return this;
        }

        public ConditionBuilder fuzzyOperator (String ... fuzzyOperator){
            this.fuzzyOperator = solveNullList(fuzzyOperator);
            return this;
        }

        public ConditionBuilder rightFuzzyOperator (List<String> rightFuzzyOperator){
            this.rightFuzzyOperator = rightFuzzyOperator;
            return this;
        }

        public ConditionBuilder rightFuzzyOperator (String ... rightFuzzyOperator){
            this.rightFuzzyOperator = solveNullList(rightFuzzyOperator);
            return this;
        }

        public ConditionBuilder operatorList(String ... operator){
            this.operatorList = solveNullList(operator);
            return this;
        }

        public ConditionBuilder operatorList(List<String> operator){
            this.operatorList = operator;
            return this;
        }

        public ConditionBuilder fuzzyOperateIp (List<String> fuzzyOperateIp){
            this.fuzzyOperateIp = fuzzyOperateIp;
            return this;
        }

        public ConditionBuilder fuzzyOperateIp (String ... fuzzyOperateIp){
            this.fuzzyOperateIp = solveNullList(fuzzyOperateIp);
            return this;
        }

        public ConditionBuilder rightFuzzyOperateIp (List<String> rightFuzzyOperateIp){
            this.rightFuzzyOperateIp = rightFuzzyOperateIp;
            return this;
        }

        public ConditionBuilder rightFuzzyOperateIp (String ... rightFuzzyOperateIp){
            this.rightFuzzyOperateIp = solveNullList(rightFuzzyOperateIp);
            return this;
        }

        public ConditionBuilder operateIpList(String ... operateIp){
            this.operateIpList = solveNullList(operateIp);
            return this;
        }

        public ConditionBuilder operateIpList(List<String> operateIp){
            this.operateIpList = operateIp;
            return this;
        }

        public ConditionBuilder createTimeBetWeen(java.time.LocalDateTime createTimeSt,java.time.LocalDateTime createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public ConditionBuilder createTimeGreaterEqThan(java.time.LocalDateTime createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public ConditionBuilder createTimeLessEqThan(java.time.LocalDateTime createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public ConditionBuilder createTimeList(java.time.LocalDateTime ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public ConditionBuilder createTimeList(List<java.time.LocalDateTime> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public ConditionBuilder updateTimeBetWeen(java.time.LocalDateTime updateTimeSt,java.time.LocalDateTime updateTimeEd){
            this.updateTimeSt = updateTimeSt;
            this.updateTimeEd = updateTimeEd;
            return this;
        }

        public ConditionBuilder updateTimeGreaterEqThan(java.time.LocalDateTime updateTimeSt){
            this.updateTimeSt = updateTimeSt;
            return this;
        }
        public ConditionBuilder updateTimeLessEqThan(java.time.LocalDateTime updateTimeEd){
            this.updateTimeEd = updateTimeEd;
            return this;
        }


        public ConditionBuilder updateTimeList(java.time.LocalDateTime ... updateTime){
            this.updateTimeList = solveNullList(updateTime);
            return this;
        }

        public ConditionBuilder updateTimeList(List<java.time.LocalDateTime> updateTime){
            this.updateTimeList = updateTime;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private User obj;

        public Builder(){
            this.obj = new User();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder username(byte[] username){
            this.obj.setUsername(username);
            return this;
        }
        public Builder telephone(String telephone){
            this.obj.setTelephone(telephone);
            return this;
        }
        public Builder mail(String mail){
            this.obj.setMail(mail);
            return this;
        }
        public Builder password(String password){
            this.obj.setPassword(password);
            return this;
        }
        public Builder deptId(Integer deptId){
            this.obj.setDeptId(deptId);
            return this;
        }
        public Builder status(Integer status){
            this.obj.setStatus(status);
            return this;
        }
        public Builder remark(String remark){
            this.obj.setRemark(remark);
            return this;
        }
        public Builder operator(String operator){
            this.obj.setOperator(operator);
            return this;
        }
        public Builder operateIp(String operateIp){
            this.obj.setOperateIp(operateIp);
            return this;
        }
        public Builder createTime(java.time.LocalDateTime createTime){
            this.obj.setCreateTime(createTime);
            return this;
        }
        public Builder updateTime(java.time.LocalDateTime updateTime){
            this.obj.setUpdateTime(updateTime);
            return this;
        }
        public User build(){return obj;}
    }

}
