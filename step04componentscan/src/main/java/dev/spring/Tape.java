package dev.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // 해당 클래스를 bean으로 등록, 스캐닝 대상에 포함시킴.
public class Tape {
	
	// setter메소드 지우기. value태그 생성자로 이동
	private String name; // 필드 기반 기본 값 지정
	private boolean isWorked; // true, false로 바꿔보기

	
	//	@Autowired // 생성자가 1개만 존재할 경우, 스프링 4.3 이후부터 사용하지 않아도 적용됨 
	// As of Spring Framework 4.3, an @Autowired annotation on such a constructor is
	// no longer necessary if the target bean defines only one constructor to begin
	// with.
	// ref link:
	// https://docs.spring.io/spring-framework/reference/core/beans/annotation-config/autowired.html#beans-autowired-annotation-constructor-resolution
	// 기본 생성자 없애기 or @Autowired를 직접 원하는 생성자에 명시하기.
	public Tape(@Value("아일랜드") String name, @Value("true") boolean isWorked) {
		super();
		this.name = name;
		this.isWorked = isWorked;
	}

	public String getName() {
		return name;
	}

	public boolean isWorked() {
		return isWorked;
	}

}
