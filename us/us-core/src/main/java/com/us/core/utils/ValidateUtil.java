package com.us.core.utils;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import com.us.core.common.constant.UsConstants;
import com.us.core.common.exception.ValidateException;

@Component
public class ValidateUtil {

    static Validator validator;

    @Resource
    public void setValidator(LocalValidatorFactoryBean validatorFactory) {//使用spring中定义的factory
        validator = validatorFactory.getValidator();
    }

    public static <T> void validate(T t) throws ValidateException {
        Set<ConstraintViolation<T>> constraintViolations = validator.validate(t);
        if (constraintViolations.size() > 0) {
            StringBuffer validateError = new StringBuffer();
            for (ConstraintViolation<T> constraintViolation : constraintViolations) {
            	validateError.append(constraintViolation.getMessage()).append(UsConstants.END_FLAG);
            }
            throw new ValidateException(validateError.toString());
        }
    }
    
    public static void validateError(BindingResult bindingResult) throws ValidateException {
    	if(bindingResult!=null&&bindingResult.hasErrors()) {
    		List<ObjectError> arrError = bindingResult.getAllErrors();
    		StringBuffer validateError = new StringBuffer();
    		for(ObjectError error : arrError) {
    			validateError.append(error.getDefaultMessage()).append(UsConstants.END_FLAG);;
    		}
    		 throw new ValidateException(validateError.toString());
    	}
    }
}