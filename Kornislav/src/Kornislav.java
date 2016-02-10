import java.util.Scanner;
public class Kornislav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Number1,Number2,Number3,Number4,temp;
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Number 1 : ");
		Number1=scan.nextInt();
		System.out.print("Input Number 2 : ");
		Number2=scan.nextInt();
		System.out.print("Input Number 3 : ");
		Number3=scan.nextInt();
		System.out.print("Input Number4 : ");
		Number4=scan.nextInt();
		if(Number1>Number2){
		temp=Number1;
		Number1=Number2;
		Number2=temp;
		}
		if(Number1>Number3){
		temp=Number1;
		Number1=Number3;
		Number3=temp;
		}
		if(Number1>Number4){ 
		temp=Number1;
		Number1=Number4;
		Number4=temp;
		}
		if(Number2>Number3){
		temp=Number2;
		Number2=Number3;
		Number3=temp;
		}
		if(Number2>Number4){
		temp=Number2;
		Number2=Number4;
		Number4=temp;
		}
		if(Number3>Number4){
		temp=Number3;
		Number3=Number4;
		Number4=temp;
		}
		System.out.print("\nRectangle Area = : "+""+Number3+""+" * "+Number1+" = "+Number3*Number1);

	}

}
