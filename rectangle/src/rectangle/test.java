package rectangle;
import java.util.Scanner;
public class test {	
public static void main(String[] args) {
		rectangle r1=new rectangle();
		Scanner sc=new Scanner(System.in) ;
		System.out.println("saisir le langeur");
		int a=sc.nextInt();
		System.out.println("saisir le largeur");
		int b=sc.nextInt();
		System.out.println("le sureface est\n"  +r1.surface(a,b));

	}

}
