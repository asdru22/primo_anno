import java.util.Scanner;
class run{
	public static void main(String[] args){
		//es1();
		//es2();
	}

	static void es1(){
		int x,c=0;
		double t = 0;

		Scanner in = new Scanner(System.in);
		do{
			x=in.nextInt();
			t+=Math.pow(x,2);
			System.out.println(t);
			c+=1;
		}
		while(x!=0);
		System.out.println(t/=(c-1));
	}
	
	static void es2(){
		int x = 3;
		int n = 4;
		int o = 0;
		for(int i = 0 ; i<n;i++){
			if(i==0) o = x;
			else o = o+2*i*x;
			System.out.println(o);
			if(i%2==1) System.out.println("****");

		}
	}
				
}