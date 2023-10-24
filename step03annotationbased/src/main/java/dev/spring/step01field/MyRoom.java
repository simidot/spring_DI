package dev.spring.step01field;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyRoom {

	public static void main(String[] args) {
		
		// 1. XML ������ ��������� Annotation�� ����Ǿ� ���� ����ȭ�� ���
		// field ��� ����!!
		
		ApplicationContext context = new ClassPathXmlApplicationContext("annotation-config-field.xml");
		
		TapeReader reader = context.getBean(TapeReader.class);
		System.out.println(reader);
		

		reader.test();
	}

}
