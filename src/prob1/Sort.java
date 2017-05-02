package prob1;

public class Sort {
	
	public static void main(String[] arg) {
	
		int array[] = { 5, 9, 3, 8, 60, 20, 1 };
		int temp = 0;
		int count =  array.length;
		
		System.out.println( "Before sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print( array[ i ] + " " );
		}
		
		
		//
		// 정렬 알고리즘이 적용된 코드를 여기에 작성합니다.
		//
		
		BubleSort(array);

		
		System.out.println( "\nAfter Sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static int[] BubleSort(int[] arg){
		int temp;
		boolean status = true;
		for (int i = 0; i < arg.length-1; i++) {
			if(arg[i] < arg[i+1]){
				temp = arg[i];
				arg[i] = arg[i+1];
				arg[i+1] = temp;
				status = false;
				break;
			}
		}
		
		if(status){
			return arg;
		}else{
			return BubleSort(arg); // 재귀 함수를 이용한 stack
		}
	}

}