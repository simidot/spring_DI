package dev.spring.step03constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyRoom {

	public static void main(String[] args) {
		
		// 1. XML 파일을 사용하지만 Annotation이 적용되어 보다 간소화된 방식
		// field 기반 주입!!
		
		ApplicationContext context = new ClassPathXmlApplicationContext("annotation-config-constructor.xml");
		// context? 프로그램이 돌아가는 맥락... 기저에서 돌고있는 설정값들이나 정보들
		// 스프링 컨테이너를 생성하면서 설정 정보가 담긴 xml 파일을 전달.
		
		TapeReader reader = context.getBean(TapeReader.class);
		System.out.println(reader);
		

		reader.test();
	}

}
