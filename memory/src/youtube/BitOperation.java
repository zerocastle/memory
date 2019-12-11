package youtube;

public class BitOperation {
	
	public static boolean getBit(int num ,int i) {
		
		//  1 0 0 0
		//& 1 0 0 0
		//=>1 0 0 0
		return (num & (1<<i)) != 0; // �ش��Ʈ�� �ڱ� �ڽ� 0 �̾��̸� true 
	}
	public static int setBit(int num , int i) {
		
		// ���� ���� ��Ʈ�� 0101 �ε� => 1101�� �ٲ�� 13�� ���´�
		
		return (num | (1 << i)) ;
	}
	
	public static int clearBit(int num , int i) {
		
		return num & ~(1 << i); //��� ������ 0�� ����
	}
	
	
	public static void main(String[] args) {
		System.out.println(getBit(8,3));
		System.out.println(setBit(5,3));
		System.out.println(clearBit(8,3));
	}

}
