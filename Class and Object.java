//Class and Objects

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
}

class Demo1{
	public static void main(String args[]){
		Std s1 = new Std();
		s1.read();
		s1.disp();
	}
}

OUTPUT:

4 XYZ
RN: 4
Name:  XYZ
