package xyz.vaith.pmbssm.enums;

public enum ResultCode {

    SUCCESS(0) {
        public String msg() {
            return "success";
        }
    },
    SYSTEM_ERROR(1) {
        @Override
        public String msg() {
            return "system error";
        }
    },
    NO_AUTH(2) {
        @Override
        public String msg() {
            return "you don't have permission";
        }
    },
    PARAM_ERROR(3);

    private Integer code;
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String msg() {
        return message;
    }

    public Integer getCode() {
        return code;
    }

    ResultCode(Integer code) {
        this.code = code;
    }

}
