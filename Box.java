/*1) Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.The dimensions of the Box are width, height, depth. The class should have a method that can return the volume of the box. Create an object of the Box class and test the functionalities.*/

import java.util.Scanner;
public class Box {
	int width;
	int height;
	int depth;
	Box(int w,int h,int d) {
		
		System.out.println("Enter the dimensions: ");
		 Scanner sc=new Scanner(System.in);
		w = sc.nextInt();
		h = sc.nextInt();
		d = sc.nextInt();	
		width = w;
		height = h;
		depth = d;
		
	}
	double Volume() {
		int V;
		V = width*height*depth;
		return V;
	}
	

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		 int a=0,b=0,c=0;
		 double Vol;
		 Box ob = new Box(a,b,c);
		 Vol = ob.Volume();
		 System.out.println("Volume is : "+ Vol);

	}

}
