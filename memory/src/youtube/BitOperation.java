package youtube;

public class BitOperation {
	
	public static boolean getBit(int num ,int i) {
		// 해당 자리에 비트값을 가지고오고 나머지 값을 0 으로 세팅 그렇기에 0을 대입하여 and 연산자를 취해준다.
		//  1 0 0 0
		//& 1 0 0 0
		//=>1 0 0 0
		return (num & (1<<i)) != 0; // 해당비트는 자기 자신 0 이아이면 true 
	}
	public static int setBit(int num , int i) {
		
		//해당 자리수만 바꾸기에 or 연산자를함
		// 기존 들어온 비트는 0101 인데 => 1101로 바뀌어 13이 나온다
		
		return (num | (1 << i)) ;
	}
	
	public static int clearBit(int num , int i) {
		// 0 1 1 1 을 만들어 엔드 연산자를 취함 해당 자리만 0으로 초기화 할수 있도록
		
		return num & ~(1 << i); //결과 값으로 0이 나옴
	}
	
	public static int clearLeftBits(int num , int i) {
		
		//해당 자리부터 뒤에 비트 모두다 0으로 초기화
		//3번째 인덱스로 부터 0으로 초기화 한다고 가정
		
		
		return num & ((1 << i) - 1);
	}
	
	public static int clearRightBits(int num , int i ) {
		
		return num & (-1 << (i + 1));
	}
	
	public static int updateBit(int num , int i , boolean val) {
		return  (num & ~(1 << i)) | ((val? 1 : 0) << i);
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println(getBit(8,3));
		System.out.println(setBit(5,3));
		System.out.println(clearBit(8,3));
	}

}
