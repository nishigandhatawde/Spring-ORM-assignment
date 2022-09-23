package com.yash.springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.springorm.dao.StudentDao;
import com.yash.springorm.entities.Student;

public class Main {
public static void main(String[] args) {
	


System.out.println( "Hello World!" );
ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
StudentDao studao=context.getBean("studentDao",StudentDao.class);
Student stu=new Student(107,"kunal");
int msg=studao.insert(stu);
System.out.println(msg +"insertion done");



}}