package desafio;

import java.util.Scanner;

public class desafioxadrez {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int hor, vert;
		
		System.out.println("Digite a linha em que a torre se encontra");
		hor = leitor.nextInt();
		System.out.println("Digite a coluna em que a torre se encontra");
		vert = leitor.nextInt();
		
		for(int y = 1; y <= 8; y++)
        {
		if (y == hor)	
		{
			System.out.println (" x  x  x  x  x  x  x  x" );
		}
			
		else 
		{
		
        for(int x = 1; x <= 8; x++)     		
        {
                if(x == vert)
                { 
                System.out.print(" x ");
                continue;
                
                }
                
                System.out.print(" - ");
                
            }
        System.out.println("");
		}
        
        }

			
			
	}

}
