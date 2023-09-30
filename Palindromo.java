import java.util.Scanner;

public class palindromo
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
		
		int cont=0;
		int v[]=new int[7];
		
		for(int i=0; i<=6; i++)
		{
			System.out.print("Digite o valor: ");
			v[i]=x.nextInt();
		}	
		
	
			
		for(int i=0; i<=2; i++)
		{
			if(v[i]==v[6-i])
			{
				cont++;
			}	
		}							
		
		if(cont==3)
		{
			System.out.println("É PALINDROMO.");
		}	
		else
		{
			System.out.println("NÃO É PALINDROMO.");
		}		
			
	}	
}