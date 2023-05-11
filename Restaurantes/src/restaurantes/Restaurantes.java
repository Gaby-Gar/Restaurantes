/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurantes;
import java.util.Scanner;
/**
 *
 * @author SAC2-8
 */
public class Restaurantes {
    Scanner entrada = new Scanner(System.in);
    int opcion;
    char sino;
    public void Menu(){
        System.out.println("BIENVENIDO AL RESTAURANTE ");
        System.out.println("¿Desea ver el menu de comidas? (s/n)");
        sino=entrada.nextLine().charAt(0);
        
        while (sino=='s'){
            System.out.println("Seleccione una opcion del menu:"); 
            System.out.println("----Menu de comidas---- ");
            System.out.println("1.-Platillos para el desayuno");
            System.out.println("2.-Platillos para la comida");
            System.out.println("3.-Platillos para la cena");
            System.out.println("4.-Bebidas");
            System.out.println("5.-Postres");
            opcion = entrada.nextInt();
            
            switch (opcion=1){
                case 1:
                    System.out.println("¿Desea ordenar un desayuno? (s/n)");
                    sino = entrada.nextLine().charAt(0);                    
                    while(sino=='s'){
                        System.out.println("---Menu de desayunos---");
                        System.out.println("Seleccione el platillo que desea ordenar:");
                        System.out.println("1. Molletes....$30.");
                        System.out.println("2. Tortas (Milanesa...$30,Jamón...$25, Longaniza con huevo...$35, Pollo deshebrado...$35,Cubana...$60 )");
                        System.out.println("3. Ensalada Dulce...$25 ");
                        System.out.println("4. Huevos al gusto...$35");
                        System.out.println("5. Burritos (Longaniza....$40, Frijoles con carne deshebrada de res...$45)");
                        System.out.println("6. Sanwitch de jamon o pollo c/ pan Integral...$26");
                        System.out.println("7. Wafles...$35");
                        System.out.println("8. Hot cakes...$35 ");
                        System.out.println("9. Cafe con pan dulce...$35");
                        System.out.println("10. Chilaquiles...$50");
                        opcion += entrada.nextInt();
                        
                        System.out.println("¿Desea ordenar un platillo mas? (s/n)");
                        sino = entrada.nextLine().charAt(0);
                    }
                    break;
                case 2:
            }           
        } 
    }
    public static void main(String[] args) {
        Restaurantes Orden = new Restaurantes();
        Orden.Menu();
    }    
}
