//Constructor Overloading

CODE:

import java.util.Scanner;

class Std{
	int RN;
	String Name;

	void read(){
		Scanner sc = new Scanner(System.in);
		RN = sc.nextInt();
		Name = sc.nextLine();
	}

	void disp(){
		System.out.println("RN: "+RN+"\nName: "+Name);
	}

	Std(){
		RN = 0;
		Name = "***";
	}
	
	Std(int R, String N){
		RN = R;
		Name = N;
	}
}

class Demo{
	public static void main(String args[]){
		Std s1 = new Std();
		s1.disp();
		Std s2 = new Std(2, "XYZ");
		s2.disp();
		s1.read();
		s1.disp();
	}
}

OUTPUT:

RN: 0
Name: ***
RN: 2
Name: XYZ
3 ABC
RN: 3
Name:  ABC
