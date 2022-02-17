package javasessions;

public class UsersMethods {
	
	//1. void has no return type
	public void test() {
		System.out.println("void method : ");
	}
	//2. with boolean return type
	public boolean isForgetPwdLinkExist() {
		return true;
	}
	
	//3. with integer return type
	public int sum(int a, int b)//a and b are parameters
	{
		int c=a+b;
		return c;
	}

	public static void main(String[] args) {
		UsersMethods obj=new UsersMethods();
		obj.test();
		int total= obj.sum(10, 20);//10 and 20 are arguments
		//double x=(total+5)/100;
		System.out.println("The final amount is :" + (total+0.55));
		
		boolean flag=obj.isForgetPwdLinkExist();
		if (flag) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}

	}

}
