package com.clc.services;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.MethodBeforeAdvice;

import com.clc.business.Bank;

public class LogBeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		Log l = LogFactory.getLog(Bank.class); 
		l.info("Code before Processing deposit ..." );

	}

}
