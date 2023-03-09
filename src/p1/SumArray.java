package p1;

public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		//sum of all elements
		int sum=0;
		for(int i=0;i<5;i++) {
		sum=sum+a[i];
		}
		System.out.println("sum of all number: " +sum);
			
		//factorial of 5
		int num=1;
		int n=5;
		for(int i=1;i<=n;i++){
			num= num*i;
			
		}
		System.out.println("factorial of 10 is "+num);
		

}
}
