package dev.spring.step02factory;

public class MyRoom {

	public static void main(String[] args) {
		/*
		 * MyRoom ���� TapeReader�� ���� �������� ���ߴ� ���
		 * -> MyRoom ���� new �� ������� �ʰ�, TapeReader�� �����Ͽ� ����ϴ� ���
		 */
		
		// ���� ������ ���� �������� �׽�Ʈ�ϱ� ���� ������ ������ ����
		TapeReader reader = TapeReaderFactory.createTapeReader();
		
		//�׽�Ʈ ����
		reader.test();
		
	}

}
