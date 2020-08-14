package com.clc.services;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.clc.business.Bank;

public class LogAroundService implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		Log l = LogFactory.getLog(Bank.class); 
		l.info("Before Deposit ...");
		Object ret = mi.proceed();
		l.info("Deposit completed .. ");
		return ret;
	}

}
