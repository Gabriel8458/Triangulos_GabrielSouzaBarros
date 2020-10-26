package triangulo;
import java.util.Scanner;

public class Triangulo {
    
public static void main(String[] args) {
    Scanner entrada;
    int a, b, c;
    
    entrada = new Scanner(System.in);
    
    System.out.print("Digite o valor do primeiro lado: ");
        a = entrada.nextInt();
    System.out.print("Digite o valor do segundo lado: ");
        b = entrada.nextInt();
    System.out.print("Digite o valor do terceiro lado: ");
        c = entrada.nextInt();
        
        if (a+b>c && a+c>b && b+c>a){
         System.out.print("Sua figura é um triângulo ");
        }
        
        
        if(a==b && a==c && b==c ){
            System.out.println("equilátero.");
        }
        
            else if(a!=b && a!=c && b!=c){
             System.out.println("escaleno.");
        }
            
            else if(a==b && a!=c || a==c && a!=b || b==c && b!=a){
             System.out.println("isóceles.");
        }
            
        else{
         System.out.println("Sua figura não é um triângulo.");
        }
      }
    }
    
