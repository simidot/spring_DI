package dev.spring.step02factory;

/*
 * TapeReader를 생성해주는 공장(factory)
 */

public class TapeReaderFactory {
	
	public static TapeReader createTapeReader() {
		return new TapeReader();
	}

}
