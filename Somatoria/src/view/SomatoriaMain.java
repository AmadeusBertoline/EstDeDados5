package view;
import controller.ControllerSomatoria;
import java.util.Scanner;

public class SomatoriaMain {

	public static void main(String[] args) {
		
		ControllerSomatoria somatoria = new ControllerSomatoria();
		Scanner scanner = new Scanner(System.in);
		
		double res = 0;
		int valor;
		
		System.out.println("Digite um valor para a somatória: ");
		valor = scanner.nextInt();
		
		res = somatoria.Somatoria(valor, res);
		
		System.out.println("Somatoria: " +res);
	}
	
	
}
