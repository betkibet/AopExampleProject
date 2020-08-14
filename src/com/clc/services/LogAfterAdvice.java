package com.clc.services;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;

import com.clc.business.Bank;

public class LogAfterAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object ret, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		Log l = LogFactory.getLog(Bank.class); 
		l.info("Balance after deposit is ..." + ret);
	}

}
