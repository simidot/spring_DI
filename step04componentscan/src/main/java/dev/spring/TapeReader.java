package dev.spring;

import org.springframework.stereotype.Component;

@Component
public class TapeReader {
	// ���⵵ setter�޼ҵ� �����. setter��� injection ���Ұž�.
	private Tape tape;
	
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

	@Override
	public String toString() {
		return "TapeReader �Դϴ�.";
	}

}