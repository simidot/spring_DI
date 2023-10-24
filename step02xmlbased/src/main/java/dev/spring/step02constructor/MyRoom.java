package dev.spring.step02constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyRoom {

	public static void main(String[] args) {
		
		// 1. XML 기반 컨테이너 구성
		ApplicationContext context = new ClassPathXmlApplicationContext("constructor-config.xml");
		// context? 프로그램이 돌아가는 맥락... 기저에서 돌고있는 설정값들이나 정보들
		// 스프링 컨테이너를 생성하면서 설정 정보가 담긴 xml 파일을 전달.
		
		TapeReader reader = context.getBean(TapeReader.class);
		System.out.println(reader);
		
		reader.test();
	}

}
