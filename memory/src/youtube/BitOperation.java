package youtube;

public class BitOperation {
	
	public static boolean getBit(int num ,int i) {
		
		//  1 0 0 0
		//& 1 0 0 0
		//=>1 0 0 0
		return (num & (1<<i)) != 0; // 해당비트는 자기 자신 0 이아이면 true 
	}
	public static int setBit(int num , int i) {
		
		// 기존 들어온 비트는 0101 인데 => 1101로 바뀌어 13이 나온다
		
		return (num | (1 << i)) ;
	}
	
	public static int clearBit(int num , int i) {
		
		return num & ~(1 << i); //결과 값으로 0이 나옴
	}
	
	
	public static void main(String[] args) {
		System.out.println(getBit(8,3));
		System.out.println(setBit(5,3));
		System.out.println(clearBit(8,3));
	}

}
