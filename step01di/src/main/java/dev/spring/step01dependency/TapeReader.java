package dev.spring.step01dependency;

public class TapeReader {
	Tape tape;// TapeReader -> (����, dependent) Tape
	
	// ������ �������� ���� �����ϴ��� �׽�Ʈ
	public void test() {
		tape = new Tape("���Ϸ���", true);
		
		if (tape.isWorked) {
			System.out.println(tape.getName() + " ���� �����մϴ�.");
		} else {
			System.out.println(tape.getName() + "���ϼ̽��ϴ�...");
		}
		
	}
}
