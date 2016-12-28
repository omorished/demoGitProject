package demoGitProject;

public class firstclass {

	public static void main(String[] args) {
		int x=5;
		int y=7;
		int z=8;
		System.out.println("please add two numbers");
		System.out.println("Result is: "+ add(x,y));
		//add(x,y);

	}
	
	public static int add(int x, int y){
		int result=x+y;
		return result ;
	}

}
