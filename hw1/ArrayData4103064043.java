public class ArrayData4103064043 extends ArrayData{
  
   public ArrayData4103064043(int[] A){
      this.A = A;
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
      // System.out.println(test.max());
      // System.out.println(test.dot(B));
    }

    time2 = System.currentTimeMillis();
    System.out.println("Time: "+(time2-time1));
  }
  
  @Override
  public int max(){
        int max_val = A[0];
        for(int i = 0; i < A.length; i++){
          if(A[i] > max_val) max_val = A[i];
        }
        return max_val;
  }
  
  @Override
  public int dot(int[] B){
    int res = 0;
    for(int i = 0; i < B.length; i++){
      res += (A[i] * B[i]);
    }
    
    return res;
  }
}
