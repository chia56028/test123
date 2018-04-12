public class ArrayData4105056028 extends ArrayData{
	public ArrayData4105056028(int[] A){
		this.A=A;
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
	}
	public int dot(int[] B){
		int sum = 0;
		for(int i=0; i<A.length; i++) sum += A[i]*B[i];
		return sum;
	}
}