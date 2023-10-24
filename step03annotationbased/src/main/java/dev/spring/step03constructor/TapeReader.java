package dev.spring.step03constructor;

import org.springframework.beans.factory.annotation.Autowired;

public class TapeReader {

	// autowired�±׸� ���� bean���� �˾Ƽ� ���������...��� ��û
	// ���� xml ���Ͽ��� bean ���� wiring�ϴ� �ڵ带 ���ʿ䰡 ������.
	// �������� �ڵ����� �������ִ� �ɼ�.

	private Tape tape;

	@Autowired
	public TapeReader(Tape tape) {
		this.tape = tape;
	}

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