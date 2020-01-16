package xyz.vaith.pmbssm.exception;

import lombok.Getter;
import xyz.vaith.pmbssm.enums.ResultCode;


@Getter
public class PermissionException extends RuntimeException {

    private ResultCode code;

    public PermissionException(ResultCode code) {
        super(code.msg());
        this.code = code;
    }

    public PermissionException(String message) {
        super(message);
    }

    public PermissionException(String message, Throwable cause) {
        super(message, cause);
    }

    public PermissionException(Throwable cause) {
        super(cause);
    }

    protected PermissionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
