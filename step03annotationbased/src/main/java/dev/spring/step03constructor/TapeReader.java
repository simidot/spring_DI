package dev.spring.step03constructor;

import org.springframework.beans.factory.annotation.Autowired;

public class TapeReader {

	// autowired태그를 통해 bean에서 알아서 연결해줘라...라고 요청
	// 먼저 xml 파일에서 bean 안의 wiring하던 코드를 쓸필요가 없어짐.
	// 의존성을 자동으로 연결해주는 옵션.

	private Tape tape;

	@Autowired
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

	public void setTape(Tape tape) {
		System.out.println("setType(Tape tape) called");
		this.tape = tape;
	}

	@Override
	public String toString() {
		return "TapeReader 입니다.";
	}

}