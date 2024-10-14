import java.util.*;
class main{
	public static void add(int a,int b){
		System.out.println(a+b);
	}
	public static void subtract(int a,int b){
		System.out.println(a-b);
	}
	public static void multiply(int a,int b){
		System.out.println(a*b);
	}
	public static void divide(int a,int b){
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter first no");
		int a=sc.nextInt();
		System.out.print("enter second no");
		int b=sc.nextInt();
		System.out.print("enter operator");
        int c=sc.nextInt();		
		if(c==1){
		add(a,b);
	}
	else if(c==2){
		subtract(a,b);
	}
	else if(c==3){
		multiply(a,b);
	}
	else{
		divide(a,b);
	}
	
}
}