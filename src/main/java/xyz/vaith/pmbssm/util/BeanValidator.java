package xyz.vaith.pmbssm.util;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.commons.collections4.MapUtils;
import xyz.vaith.pmbssm.enums.ResultCode;
import xyz.vaith.pmbssm.exception.PermissionException;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.*;

public class BeanValidator {
    private static ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();

    public static <T> Map<String, String> validate(T t, Class... groups) {
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<T>> result = validator.validate(t, groups);
        if (result.isEmpty()) {
            return Collections.emptyMap();
        } else {
            LinkedHashMap errors = Maps.newLinkedHashMap();
            Iterator<ConstraintViolation<T>> iterator = result.iterator();
            while (iterator.hasNext()) {
                ConstraintViolation<T> next = iterator.next();
                errors.put(next.getPropertyPath().toString(), next.getMessage());
            }
            return errors;
        }

    }

    public static Map<String, String> validateList(Collection<?> collection) {
        Preconditions.checkNotNull(collection);
        Iterator<?> iterator = collection.iterator();
        Map errors = Collections.emptyMap();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            errors = validate(object, new Class[0]);
        }
        return errors;
    }

    public static Map<String, String> validateObject(Object first, Object... objects) {
        if (objects != null && objects.length > 0) {
            return validateList(Lists.asList(first, objects));
        } else {
            return validate(first, new Class[0]);
        }
    }


    public static void check(Object param) throws PermissionException {
        Map<String, String> map = BeanValidator.validateObject(param);
        if (!MapUtils.isEmpty(map)) {
            ResultCode code = ResultCode.PARAM_ERROR;
            code.setMessage(map.toString());
            throw new PermissionException(code);
        }
    }


}
