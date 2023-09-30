import java.util.Scanner;

public class Massa 
{
	public static void main (String[] args)
    {
	Peso;
    	double Altura;
    	double CalculoIMC;
		double Expoente;

		Scanner x = new Scanner(System.in);
		System.out.print("Informe o Peso: ");
		Peso = x.nextDouble();
		System.out.print("Informe a altura: ");
		Altura = x.nextDouble();
		
		Expoente=Math.pow(Altura, 2);
		CalculoIMC = Peso/Expoente;
		if (CalculoIMC<=17.0)
		{
			System.out.println("Magro demais");
		}
		else if (CalculoIMC<=25.0)
		{
			System.out.println("Ideal");
		}
		else if (CalculoIMC<=30.0)
		{
			System.out.println("Sobrepeso");
		}	
		else
		{
			System.out.println("Obeso");
		}
    }    	
}