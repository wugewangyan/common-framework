package com.napoleon.life.framework.base;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.napoleon.life.exception.CommonException;
import com.napoleon.life.framework.code.FrameworkModelCode;
import com.napoleon.life.framework.result.CommonRltUtil;

public class BaseController {

	@ExceptionHandler
    public ResponseEntity<String> exception(HttpServletRequest request, HttpServletResponse response, Exception e) {
        String rlt = null;
        e.printStackTrace();
        if (e instanceof CommonException) {
        	CommonException be = (CommonException) e;
        	rlt = CommonRltUtil.createCommonRltToString(be.getErrCode(), be.getErrChineseMsg());
        } else {
        	rlt = CommonRltUtil.createCommonRltToString(FrameworkModelCode.FRAMEWORK_SYSTEM_ERROR);
        }
        
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json;charset=UTF-8");
        return new ResponseEntity<String>(rlt, headers, HttpStatus.OK);
    }
}
