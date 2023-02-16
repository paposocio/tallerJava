import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner lectura=new Scanner (System.in );

        int numberOne;

        System.out.println("ingrese el numero a evaluar");
        numberOne=lectura.nextInt();

        if (numberOne>0)
        {
            System.out.println("El numero evaluado es positivo");
        }
        else if (numberOne == 0)
        {
            System.out.println("El numero evaluado es cero");        
        }
        else
        {
            System.out.println("El numero evaluado es negativo");        
        }

        lectura.close();
    }
}
