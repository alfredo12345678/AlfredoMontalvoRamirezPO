import java.util.Scanner;
public class Operaciones {
        //atributos
        public double a;
        public double b;


        //metodos

        public double sumarNumeros(){
            return a + b;
        }
            public double restarNumero(){
                return a - b;

            }
            public double dividirNumero(){s
                return a / b;

            }
            public double multiplicarNumero(){
                return a * b;
            }
        public static void main(String []args){

            Operaciones operaciones1 = new Operaciones();
            s
            Scanner scanner  = new Scanner(System.in); 

            System.out.println("Numero 1:");
            operaciones1.a = scanner.nextDouble();

            

            System.out.println("Numero 2:");
            operaciones2.b = scanner.nextDouble();


            
            

            double suma = operaciones1.sumarNumeros();
            double resta = operaciones1.restarNumero();
            double dividir = operaciones1.dividirNumero();
            double multiplicar = operaciones1.multiplicarNumero();

            System.out.println("El resultado es"+ suma);
            System.out.println("El resultado es"+ restar);
            System.out.println("El resultado es"+ dividir);
            System.out.println("El resultado es"+ multiplicar);

        }

        
}