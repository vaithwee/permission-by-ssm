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
public class Log implements Serializable {

    private static final long serialVersionUID = 1571190948275L;


    /**
    * 主键
    * 权限id
    * isNullAble:0
    */
    private Integer id;

    /**
    * 类型
    * isNullAble:0
    */
    private Integer type;

    /**
    * 目标id
    * isNullAble:0,defaultVal:0
    */
    private Integer targetId;

    /**
    * 旧值
    * isNullAble:1,defaultVal:
    */
    private String oldValue;

    /**
    * 新值
    * isNullAble:1,defaultVal:
    */
    private String newValue;

    /**
    * 操作作者
    * isNullAble:0,defaultVal:
    */
    private String operator;

    /**
    * 最后一次操作者的ip
    * isNullAble:0,defaultVal:
    */
    private String operateIp;

    /**
    * 创建时间
    * isNullAble:0
    */
    private java.time.LocalDateTime createTime;

    /**
    * 修改时间
    * isNullAble:0
    */
    private java.time.LocalDateTime updateTime;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setType(Integer type){this.type = type;}

    public Integer getType(){return this.type;}

    public void setTargetId(Integer targetId){this.targetId = targetId;}

    public Integer getTargetId(){return this.targetId;}

    public void setOldValue(String oldValue){this.oldValue = oldValue;}

    public String getOldValue(){return this.oldValue;}

    public void setNewValue(String newValue){this.newValue = newValue;}

    public String getNewValue(){return this.newValue;}

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
        return "Log{" +
                "id='" + id + '\'' +
                "type='" + type + '\'' +
                "targetId='" + targetId + '\'' +
                "oldValue='" + oldValue + '\'' +
                "newValue='" + newValue + '\'' +
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

        private Log set;

        private ConditionBuilder where;

        public UpdateBuilder set(Log set){
            this.set = set;
            return this;
        }

        public Log getSet(){
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

    public static class QueryBuilder extends Log{
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

        private List<Integer> typeList;

        public List<Integer> getTypeList(){return this.typeList;}

        private Integer typeSt;

        private Integer typeEd;

        public Integer getTypeSt(){return this.typeSt;}

        public Integer getTypeEd(){return this.typeEd;}

        private List<Integer> targetIdList;

        public List<Integer> getTargetIdList(){return this.targetIdList;}

        private Integer targetIdSt;

        private Integer targetIdEd;

        public Integer getTargetIdSt(){return this.targetIdSt;}

        public Integer getTargetIdEd(){return this.targetIdEd;}

        private List<String> oldValueList;

        public List<String> getOldValueList(){return this.oldValueList;}


        private List<String> fuzzyOldValue;

        public List<String> getFuzzyOldValue(){return this.fuzzyOldValue;}

        private List<String> rightFuzzyOldValue;

        public List<String> getRightFuzzyOldValue(){return this.rightFuzzyOldValue;}
        private List<String> newValueList;

        public List<String> getNewValueList(){return this.newValueList;}


        private List<String> fuzzyNewValue;

        public List<String> getFuzzyNewValue(){return this.fuzzyNewValue;}

        private List<String> rightFuzzyNewValue;

        public List<String> getRightFuzzyNewValue(){return this.rightFuzzyNewValue;}
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

        public QueryBuilder typeBetWeen(Integer typeSt,Integer typeEd){
            this.typeSt = typeSt;
            this.typeEd = typeEd;
            return this;
        }

        public QueryBuilder typeGreaterEqThan(Integer typeSt){
            this.typeSt = typeSt;
            return this;
        }
        public QueryBuilder typeLessEqThan(Integer typeEd){
            this.typeEd = typeEd;
            return this;
        }


        public QueryBuilder type(Integer type){
            setType(type);
            return this;
        }

        public QueryBuilder typeList(Integer ... type){
            this.typeList = solveNullList(type);
            return this;
        }

        public QueryBuilder typeList(List<Integer> type){
            this.typeList = type;
            return this;
        }

        public QueryBuilder fetchType(){
            setFetchFields("fetchFields","type");
            return this;
        }

        public QueryBuilder excludeType(){
            setFetchFields("excludeFields","type");
            return this;
        }

        public QueryBuilder targetIdBetWeen(Integer targetIdSt,Integer targetIdEd){
            this.targetIdSt = targetIdSt;
            this.targetIdEd = targetIdEd;
            return this;
        }

        public QueryBuilder targetIdGreaterEqThan(Integer targetIdSt){
            this.targetIdSt = targetIdSt;
            return this;
        }
        public QueryBuilder targetIdLessEqThan(Integer targetIdEd){
            this.targetIdEd = targetIdEd;
            return this;
        }


        public QueryBuilder targetId(Integer targetId){
            setTargetId(targetId);
            return this;
        }

        public QueryBuilder targetIdList(Integer ... targetId){
            this.targetIdList = solveNullList(targetId);
            return this;
        }

        public QueryBuilder targetIdList(List<Integer> targetId){
            this.targetIdList = targetId;
            return this;
        }

        public QueryBuilder fetchTargetId(){
            setFetchFields("fetchFields","targetId");
            return this;
        }

        public QueryBuilder excludeTargetId(){
            setFetchFields("excludeFields","targetId");
            return this;
        }

        public QueryBuilder fuzzyOldValue (List<String> fuzzyOldValue){
            this.fuzzyOldValue = fuzzyOldValue;
            return this;
        }

        public QueryBuilder fuzzyOldValue (String ... fuzzyOldValue){
            this.fuzzyOldValue = solveNullList(fuzzyOldValue);
            return this;
        }

        public QueryBuilder rightFuzzyOldValue (List<String> rightFuzzyOldValue){
            this.rightFuzzyOldValue = rightFuzzyOldValue;
            return this;
        }

        public QueryBuilder rightFuzzyOldValue (String ... rightFuzzyOldValue){
            this.rightFuzzyOldValue = solveNullList(rightFuzzyOldValue);
            return this;
        }

        public QueryBuilder oldValue(String oldValue){
            setOldValue(oldValue);
            return this;
        }

        public QueryBuilder oldValueList(String ... oldValue){
            this.oldValueList = solveNullList(oldValue);
            return this;
        }

        public QueryBuilder oldValueList(List<String> oldValue){
            this.oldValueList = oldValue;
            return this;
        }

        public QueryBuilder fetchOldValue(){
            setFetchFields("fetchFields","oldValue");
            return this;
        }

        public QueryBuilder excludeOldValue(){
            setFetchFields("excludeFields","oldValue");
            return this;
        }

        public QueryBuilder fuzzyNewValue (List<String> fuzzyNewValue){
            this.fuzzyNewValue = fuzzyNewValue;
            return this;
        }

        public QueryBuilder fuzzyNewValue (String ... fuzzyNewValue){
            this.fuzzyNewValue = solveNullList(fuzzyNewValue);
            return this;
        }

        public QueryBuilder rightFuzzyNewValue (List<String> rightFuzzyNewValue){
            this.rightFuzzyNewValue = rightFuzzyNewValue;
            return this;
        }

        public QueryBuilder rightFuzzyNewValue (String ... rightFuzzyNewValue){
            this.rightFuzzyNewValue = solveNullList(rightFuzzyNewValue);
            return this;
        }

        public QueryBuilder newValue(String newValue){
            setNewValue(newValue);
            return this;
        }

        public QueryBuilder newValueList(String ... newValue){
            this.newValueList = solveNullList(newValue);
            return this;
        }

        public QueryBuilder newValueList(List<String> newValue){
            this.newValueList = newValue;
            return this;
        }

        public QueryBuilder fetchNewValue(){
            setFetchFields("fetchFields","newValue");
            return this;
        }

        public QueryBuilder excludeNewValue(){
            setFetchFields("excludeFields","newValue");
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

        public Log build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<Integer> typeList;

        public List<Integer> getTypeList(){return this.typeList;}

        private Integer typeSt;

        private Integer typeEd;

        public Integer getTypeSt(){return this.typeSt;}

        public Integer getTypeEd(){return this.typeEd;}

        private List<Integer> targetIdList;

        public List<Integer> getTargetIdList(){return this.targetIdList;}

        private Integer targetIdSt;

        private Integer targetIdEd;

        public Integer getTargetIdSt(){return this.targetIdSt;}

        public Integer getTargetIdEd(){return this.targetIdEd;}

        private List<String> oldValueList;

        public List<String> getOldValueList(){return this.oldValueList;}


        private List<String> fuzzyOldValue;

        public List<String> getFuzzyOldValue(){return this.fuzzyOldValue;}

        private List<String> rightFuzzyOldValue;

        public List<String> getRightFuzzyOldValue(){return this.rightFuzzyOldValue;}
        private List<String> newValueList;

        public List<String> getNewValueList(){return this.newValueList;}


        private List<String> fuzzyNewValue;

        public List<String> getFuzzyNewValue(){return this.fuzzyNewValue;}

        private List<String> rightFuzzyNewValue;

        public List<String> getRightFuzzyNewValue(){return this.rightFuzzyNewValue;}
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

        public ConditionBuilder typeBetWeen(Integer typeSt,Integer typeEd){
            this.typeSt = typeSt;
            this.typeEd = typeEd;
            return this;
        }

        public ConditionBuilder typeGreaterEqThan(Integer typeSt){
            this.typeSt = typeSt;
            return this;
        }
        public ConditionBuilder typeLessEqThan(Integer typeEd){
            this.typeEd = typeEd;
            return this;
        }


        public ConditionBuilder typeList(Integer ... type){
            this.typeList = solveNullList(type);
            return this;
        }

        public ConditionBuilder typeList(List<Integer> type){
            this.typeList = type;
            return this;
        }

        public ConditionBuilder targetIdBetWeen(Integer targetIdSt,Integer targetIdEd){
            this.targetIdSt = targetIdSt;
            this.targetIdEd = targetIdEd;
            return this;
        }

        public ConditionBuilder targetIdGreaterEqThan(Integer targetIdSt){
            this.targetIdSt = targetIdSt;
            return this;
        }
        public ConditionBuilder targetIdLessEqThan(Integer targetIdEd){
            this.targetIdEd = targetIdEd;
            return this;
        }


        public ConditionBuilder targetIdList(Integer ... targetId){
            this.targetIdList = solveNullList(targetId);
            return this;
        }

        public ConditionBuilder targetIdList(List<Integer> targetId){
            this.targetIdList = targetId;
            return this;
        }

        public ConditionBuilder fuzzyOldValue (List<String> fuzzyOldValue){
            this.fuzzyOldValue = fuzzyOldValue;
            return this;
        }

        public ConditionBuilder fuzzyOldValue (String ... fuzzyOldValue){
            this.fuzzyOldValue = solveNullList(fuzzyOldValue);
            return this;
        }

        public ConditionBuilder rightFuzzyOldValue (List<String> rightFuzzyOldValue){
            this.rightFuzzyOldValue = rightFuzzyOldValue;
            return this;
        }

        public ConditionBuilder rightFuzzyOldValue (String ... rightFuzzyOldValue){
            this.rightFuzzyOldValue = solveNullList(rightFuzzyOldValue);
            return this;
        }

        public ConditionBuilder oldValueList(String ... oldValue){
            this.oldValueList = solveNullList(oldValue);
            return this;
        }

        public ConditionBuilder oldValueList(List<String> oldValue){
            this.oldValueList = oldValue;
            return this;
        }

        public ConditionBuilder fuzzyNewValue (List<String> fuzzyNewValue){
            this.fuzzyNewValue = fuzzyNewValue;
            return this;
        }

        public ConditionBuilder fuzzyNewValue (String ... fuzzyNewValue){
            this.fuzzyNewValue = solveNullList(fuzzyNewValue);
            return this;
        }

        public ConditionBuilder rightFuzzyNewValue (List<String> rightFuzzyNewValue){
            this.rightFuzzyNewValue = rightFuzzyNewValue;
            return this;
        }

        public ConditionBuilder rightFuzzyNewValue (String ... rightFuzzyNewValue){
            this.rightFuzzyNewValue = solveNullList(rightFuzzyNewValue);
            return this;
        }

        public ConditionBuilder newValueList(String ... newValue){
            this.newValueList = solveNullList(newValue);
            return this;
        }

        public ConditionBuilder newValueList(List<String> newValue){
            this.newValueList = newValue;
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

        private Log obj;

        public Builder(){
            this.obj = new Log();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder type(Integer type){
            this.obj.setType(type);
            return this;
        }
        public Builder targetId(Integer targetId){
            this.obj.setTargetId(targetId);
            return this;
        }
        public Builder oldValue(String oldValue){
            this.obj.setOldValue(oldValue);
            return this;
        }
        public Builder newValue(String newValue){
            this.obj.setNewValue(newValue);
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
        public Log build(){return obj;}
    }

}
