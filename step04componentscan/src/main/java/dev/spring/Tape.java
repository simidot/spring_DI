package dev.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // �ش� Ŭ������ bean���� ���, ��ĳ�� ��� ���Խ�Ŵ.
public class Tape {
	
	// setter�޼ҵ� �����. value�±� �����ڷ� �̵�
	private String name; // �ʵ� ��� �⺻ �� ����
	private boolean isWorked; // true, false�� �ٲ㺸��

	
	//	@Autowired // �����ڰ� 1���� ������ ���, ������ 4.3 ���ĺ��� ������� �ʾƵ� ����� 
	// As of Spring Framework 4.3, an @Autowired annotation on such a constructor is
	// no longer necessary if the target bean defines only one constructor to begin
	// with.
	// ref link:
	// https://docs.spring.io/spring-framework/reference/core/beans/annotation-config/autowired.html#beans-autowired-annotation-constructor-resolution
	// �⺻ ������ ���ֱ� or @Autowired�� ���� ���ϴ� �����ڿ� ����ϱ�.
	public Tape(@Value("���Ϸ���") String name, @Value("true") boolean isWorked) {
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
