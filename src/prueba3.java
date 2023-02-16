import java.util.Scanner;

public class prueba3 {
    public static void main(String[] args) {
        String userName =("arias25");
        String userPassword =("sapo");
        
        String password;
        String name;

        Scanner lectura=new Scanner(System.in);

        System.out.println("Ingrese su nombre de usuario");
        name = lectura.nextLine();

        System.out.println("Ingrese su contrseña");
        password = lectura.nextLine();


        if (password.equals(userPassword) && name.equals(userName))
        {
            System.out.println("Bienvenido al sistema");
        }

        else if (name.equals(userName) && password!= userPassword)
        {
            System.out.println("Parece que haz olvidado tu clave");
        }

        else if (name != userName && password.equals(userPassword))
        {
            System.out.println("Tus credenciales son incorrectas");
        }

        else if (name != userName && password!= userPassword)
        {
            System.out.println("Acceso denegado");
        }

        lectura.close();


    }
    
}
