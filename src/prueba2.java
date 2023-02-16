import java.util.Scanner; 

public class prueba2 { 

    public static void main(String[] args) throws Exception { 

        Scanner lectura=new Scanner (System.in ); 

        int numberOne; 
        int numberTwo; 

        System.out.println("ingrese el primer numero"); 
        numberOne=lectura.nextInt(); 

        System.out.println("ingrese el segundo numero"); 
        numberTwo=lectura.nextInt(); 

        if (numberOne>numberTwo) 
        { 
            int result =(numberOne+numberTwo); 
            System.out.println("El numero mayor es "+numberOne+" y resultado de la operacion (suma) es "+result); 
        } 

        else if(numberOne==numberTwo)
        { 
            int result =(numberTwo*numberOne); 
            System.out.println("Los numeros son iguales y resultado de la operacion (multiplicacaion) es "+result); 
        } 
        
        else 
        { 

            int result =(numberTwo-numberOne); 
            System.out.println("El numero mayor es "+numberTwo+" y resultado de la operacion (resta) es "+result); 

        } 

        lectura.close(); 

    } 

} 