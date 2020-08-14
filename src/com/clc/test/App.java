package com.clc.test;

import org.springframework.aop.framework.ProxyFactoryBean;

import com.clc.business.Bank;
import com.clc.services.LogAfterAdvice;
import com.clc.services.LogAroundService;
import com.clc.services.LogBeforeAdvice;

public class App {

	public static void main(String[] args) {
		//Create target
		Bank bank = new Bank();
		//create factory Bean
		ProxyFactoryBean proxy = new ProxyFactoryBean();
		//Add Target + advice to proxy
		proxy.setTarget(bank);
		
//		Implement ile Log Before Advice uone hapa
		/*
		 * LogBeforeAdvice logBeforeAdvice = new LogBeforeAdvice();
		 * proxy.addAdvice(logBeforeAdvice);
		 */
		
//		Implement ile log after service
		/*
		 * LogAfterAdvice logAfterAdvice = new LogAfterAdvice();
		 * proxy.addAdvice(logAfterAdvice);
		 */
		
//		Implement kale LogAround Advice. Comment hizo zingine mbili kwanza.
		LogAroundService logAroundService = new LogAroundService();
		proxy.addAdvice(logAroundService);
		//Generate proxy object
		Bank bProxy = (Bank) proxy.getObject();
		//Execute the proxy code
		bProxy.depositCash("AC123", 3200);
		

		
		

	}

}
