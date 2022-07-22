package Ejercicio6;

/*
Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException
que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción,
mostraremos el mensaje "Esto no puede hacerse".
Finalmente, mostraremos en cualquier caso: "Demo de código".
 */
public class Ej6g {
    public static void main(String[] args) {
        try{
            dividePorCero(4, 0);
        }catch(ArithmeticException e){
            System.out.println("Esto no puede hacerse: " + e.getMessage());
        }finally{
            System.out.println("Demo de código");
        }
    }

    public static int dividePorCero(int a, int b) throws ArithmeticException{
        return a / b;
    }
}
