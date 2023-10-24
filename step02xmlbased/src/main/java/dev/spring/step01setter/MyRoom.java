package dev.spring.step01setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyRoom {

	public static void main(String[] args) {
		
		// 1. XML ��� �����̳� ����
		ApplicationContext context = new ClassPathXmlApplicationContext("setter-config.xml");
		// context? ���α׷��� ���ư��� �ƶ�... �������� �����ִ� ���������̳� ������
		// ������ �����̳ʸ� �����ϸ鼭 ���� ������ ��� xml ������ ����.
		
		TapeReader reader = context.getBean(TapeReader.class);
//		Tape tape = context.getBean(Tape.class);
		System.out.println(reader);
		
//		tape.setName("���Ϸ���");
//		tape.setWorked(true);		
		reader.test();
	}

}
