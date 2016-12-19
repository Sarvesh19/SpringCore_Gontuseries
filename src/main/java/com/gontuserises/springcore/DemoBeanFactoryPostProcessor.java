package com.gontuserises.springcore;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * Created by KV on 19/12/2016.
 */
public class DemoBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)
			throws BeansException   {
		BeanDefinition beanDefinition = beanFactory.getBeanDefinition("restaruantBean");

		MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();

		propertyValues.addPropertyValue("wellcomeNote"
				,"This is the modifed value using BeanFactoryPostProcessor");
	}
}
