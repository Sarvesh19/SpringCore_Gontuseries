package com.gontuserises.springcore;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by KV on 19/12/2016.
 */
public class DemoBeanPosProcessor implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("After instantiates bean and before init life cycle event of : " + beanName);
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Just after init life cycle event of : " + beanName);
		return bean;
	}
}
