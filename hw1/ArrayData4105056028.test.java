public class ArrayData01 extends ArrayData{
	public ArrayData01(int[] A){
		this.A=A;
	}

	public static void main(String[] args){
		int[] A = {1,2,3};
		ArrayData01 test = new ArrayData01(A);
		test.max();
		int[] B = {4,5,6};
		test.dot(B);
	}

	public int max(){
		int max = A[0];
		for(int i=1; i<A.length; i++)
			if(A[i]>max) max=A[i];
		System.out.println(max);
		return 0;
	}

	public int dot(int[] B){
		int sum = 0;
		for(int i=0; i<A.length; i++) sum += A[i]*B[i];
		System.out.println(sum);
		return 0;
	}
}