package com.handler;

import com.baidu.unbiz.fluentvalidator.ResultCollector;
import com.baidu.unbiz.fluentvalidator.ValidationError;
import com.baidu.unbiz.fluentvalidator.ValidationResult;
import com.guava.domain.HttpRt;

import java.util.List;

/**
 * 返回体处理类
 * @author: wangyong
 * @date: 2019/5/26 18:02
 */
public class RtHandler implements ResultCollector<HttpRt> {

	@Override
	public HttpRt toResult(ValidationResult result) {

		List<ValidationError> errorList = result.getErrors();
		HttpRt rt = null;
		for (ValidationError validationError : errorList) {
			rt = new HttpRt();
			rt.setCode(String.valueOf(validationError.getErrorCode())).setMsg(validationError.getErrorMsg());
		}
		return rt;
	}
}
