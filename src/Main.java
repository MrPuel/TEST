import java.util.Scanner;
public class Main {

	private static Scanner clavier;
	public static void main(String[] args) {
		clavier = new Scanner(System.in);
		// TODO Auto-generated method stub
		int nb;
		System.out.println("saisir :");
		
		try{	
		nb = clavier.nextInt();
		}
		catch(Exception erreur) {			
			System.out.println(erreur.toString());
		}

	
	}
}
