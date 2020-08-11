package com.hong.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

//Spring��������ɨ��controller;������
@ComponentScan(value="com.hong",excludeFilters={
		@Filter(type= FilterType.ANNOTATION,classes={Controller.class})
})
public class RootConfig {

}
