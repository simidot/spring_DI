package dev.spring;

import org.springframework.stereotype.Component;

@Component
public class TapeReader {
	// 여기도 setter메소드 지우기. setter기반 injection 안할거야.
	private Tape tape;
	
	public TapeReader(Tape tape) {
		this.tape = tape;
	}

	public void test() {
		if (tape.isWorked()) {
			System.out.println(tape.getName() + " 정상 동작합니다");
		} else {
			System.out.println(tape.getName() + " 사기 당했습니다");
		}

	}

	@Override
	public String toString() {
		return "TapeReader 입니다.";
	}

}