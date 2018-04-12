public class ArrayData4105056028_00 extends ArrayData{
	public ArrayData4105056028_00(int[] A){
		this.A=A;
	}

	public static void main(String[] args){
		long time1, time2;

		int[] A = new int[2];
		for(int i=0; i<A.length; i++) A[i]=i;
		int[] B = new int[2];
		for(int i=0; i<A.length; i++) B[i]=i;
		ArrayData4105056028_00 test = new ArrayData4105056028_00(A);

		time1 = System.currentTimeMillis();
		for(int i=0; i<100; i++){
			test.max();
			System.out.println(test.max());
			// System.out.println(test.dot(B));
		}

		time2 = System.currentTimeMillis();
		System.out.println("Time: "+(time2-time1));
	}

	public int max(){
		int max=A[0];
		for(int i=1; i<A.length-1; i+=2){
			if(A[i]>A[i+1]){
				if(A[i]>max) max=A[i];
			}else{
				if(A[i+1]>max) max=A[i+1];
			}
		}
		if(A.length%2==0){
			if(A[A.length-1]>max) max=A[A.length-1];
		}
		return max;
		// if(A.length==1) return A[0];
		// int max;
		// if(A[0]>A[1]) max=A[0];
		// else max=A[1];
		// for(int i=2; i<A.length-1; i+=2){
		// 	if(A[i]>A[i+1]){
		// 		if(A[i]>max) max=A[i];
		// 	}else{
		// 		if(A[i+1]>max) max=A[i+1];
		// 	}
		// }
		// if(A.length%2==1){
		// 	if(A[A.length-1]>max) max=A[A.length-1];
		// }
		// return max;
		// int max = A[0];
		// for(int i=1; i<A.length; i++)
		// 	if(A[i]>max) max=A[i];
		// return max;
		
	}
	public int dot(int[] B){
		int sum = 0;
		for(int i=0; i<A.length; i++) sum += A[i]*B[i];
		return sum;
	}
}