// Expression (10+2)(10-2)

package Package1;

public class Calculation {
	
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("Sum is : " +c);
		return c;
	}
	
	public int sub(int x,int y)
	{
		int z;
		z=x-y;
		System.out.println("Subtration is : " + z);
		return z;
	}
	
	public void mul(int sum_result,int sub_result)
	{
		int a3;
		a3 = sum_result * sub_result;
		System.out.println("Final result is : " + a3);
	}
	
	public static void main(String[] args) {
		
		Calculation cal1 = new Calculation();
		
		int sum_result = cal1.sum(10,2);
		int sub_result = cal1.sub(10,2);
		cal1.mul(sum_result,sub_result);
	}

}
