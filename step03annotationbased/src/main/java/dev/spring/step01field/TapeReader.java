package dev.spring.step01field;

import org.springframework.beans.factory.annotation.Autowired;

public class TapeReader {

	// autowired�±׸� ���� bean���� �˾Ƽ� ���������...��� ��û
	// ���� xml ���Ͽ��� bean ���� wiring�ϴ� �ڵ带 ���ʿ䰡 ������.
	// �������� �ڵ����� �������ִ� �ɼ�.
	@Autowired
	private Tape tape;

	public void test() {

		if (tape.isWorked()) {
			System.out.println(tape.getName() + " ���� �����մϴ�");
		} else {
			System.out.println(tape.getName() + " ��� ���߽��ϴ�");
		}

	}

	public void setTape(Tape tape) {
		System.out.println("setType(Tape tape) called");
		this.tape = tape;
	}

	@Override
	public String toString() {
		return "TapeReader �Դϴ�.";
	}

}