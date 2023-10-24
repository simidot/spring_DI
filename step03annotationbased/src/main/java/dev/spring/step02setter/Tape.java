package dev.spring.step02setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Tape {
	
	@Value("���Ϸ���") private String name; // �ʵ� ��� �⺻ �� ����
	@Value("true")private boolean isWorked; // true, false�� �ٲ㺸��

	public Tape() {
		super();
		System.out.println("step02setter Tape() called");
	}

	public Tape(String name, boolean isWorked) {
		super();
		this.name = name;
		this.isWorked = isWorked;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName() called");
		this.name = name;
	}

	public boolean isWorked() {
		return isWorked;
	}

	public void setWorked(boolean isWorked) {
		System.out.println("setWorked() called");
		this.isWorked = isWorked;
	}

}
