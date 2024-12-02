package exercicio01Java;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		        // Variaveis
				float salario;
				float abono;
				float novoSalario;
						
				// Construindo o leia
				Scanner leia = new Scanner(System.in);
					
				// Entrada de Dados			
				System.out.println("Informe o seu salario");
				salario = leia.nextFloat();
						
				System.out.println("Informe o abono");
				abono = leia.nextFloat();
					
				// Processamento				
				novoSalario = salario + abono;
						
				// Saida dos Dados
				System.out.println("O seu novo salario é:" + novoSalario);

	}

}
