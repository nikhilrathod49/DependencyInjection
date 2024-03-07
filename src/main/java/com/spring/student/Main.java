package com.spring.student;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
    	// BeanFactory --> Container
    	//BeanFactory factory = new ClassPathXmlApplicationContext("spring-bean.xml");
    //	StudentDetails studentDetails = (StudentDetails) factory.getBean("studentDetailsBean");
    //	studentDetails.display();
    //	StudentService studentService =(StudentService) factory.getBean("studentServiceBean");
    //	studentService.displayStudentInfo();
    	BeanFactory factory = new ClassPathXmlApplicationContext("spring-bean.xml");
    	
    	Student student = (Student) factory.getBean("student");
    	student.admission();
    }
}