/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurante;

/**
 *
 * @author SAC2-8
 */
import java.util.Scanner;
public class Restaurante {
    Scanner entrada = new Scanner(System.in);
   int opc;
   double tipo;
   char mas,reg;

    public void menu(){
     System.out.println("BIENVENIDO AL RESTAURANTE ");
     System.out.println("----Menu de comidas---- ");
     System.out.println("1.-Platillos para el desayuno...");
     System.out.println("2.-Platillos para la comida...");
     System.out.println("3.-Platillos para la cena...");
     System.out.println("4.-Bebidas...");
     System.out.println("5.-Postres...");
     opc = entrada.nextInt();
     
     switch (opc=1){
         case 1:
             System.out.println("---Menu de desayunos---");
             System.out.println("1. Molletes con huevo y longaniza....$30.");
             System.out.println("2. Tortas (Milanesa...$30,Jamón...$25, Longaniza con huevo...$35, Pollo deshebrado...$35,Cubana...$60 )");
             System.out.println("3. Ensalada Dulce momento");
             System.out.println("4. Huevos revueltos c/longaniza");
             System.out.println("5. Burritos (Longaniza....$40, Frijoles con carne deshebrada de res...$45)");
             System.out.println("6. Sanwitch de jamon o pollo c/ pan Integral...$26");
             System.out.println("7. Sopa de codito...$35");
             System.out.println("8. Hot cakes con miel de maple ");
             System.out.println("9. Baguettes (Pregunte a su mesero sobre la disponibilidad )...");
             System.out.println("10. 2 Huevos fritos c/frijoles refritos y ensalada fresca...$70");
             System.out.println("¿Deseas ordenar algo de comer? (s/n)");
             mas=entrada.nextLine().charAt(0);
            while (mas=='s'){
                System.out.println("Elige la opcion del platillo a desear: (1-10)");
                opc=entrada.nextInt();
                System.out.println("¿Deseas ordenar algo mas? (s/n)");
                mas=entrada.nextLine().charAt(0);
            }
             
         case 2:
             System.out.println("---Menu de comidas---");
             System.out.println("1. Enmoladas (4 piezas rellenas de Pollo c/queso)... $75");
             System.out.println("2. Enchiladas Suizas(4 piezas bañadas con nuestra rica salsa especial)...$85");
             System.out.println("3. Hamburguesa de arrachera(acompañada de frijoles refritos, papas chips y chiles de arbol tatemados)...$102");
             System.out.println("4. Pasta a la bolañesa...$95");
             System.out.println("5. Tacos de carnitas ...$26");
             System.out.println("6. Tacos de arrcahera(4 piezas acompañadas de tortillas de harina y racion de guacamole )...$85");
             System.out.println("7. Club sandwitch (pollo o jamón)...$60");
             System.out.println("8. Sope c/carne(Pollo, Longaniza, Cecina nat o adobada)...$45");
             System.out.println("9. Chilaquiles c/ 1 aguja de costilla de res...$103");
             System.out.println("10. Sincronizadas (Acompañadas de papas a la francesa)...$45");
         case 3:
             System.out.println("---Menu de cenas---");
             System.out.println("1. Pasta a la bolañesa....$95");
             System.out.println("2. Ensaladas Dulce momento..$110");
             System.out.println("3. Ensalada de pollo y arandanos...$96");
             System.out.println("4. Ensalada tropical ...$95");
             System.out.println("5. Enchiladas suizas...$85");
             System.out.println("6. Club sandwitch...$90");
             System.out.println("7. Consome de pollo...$50");
             System.out.println("8. Enchipotladas...$95");
             System.out.println("9. Chimichangas...$80");
             System.out.println("10. Tostadas...$39");
         case 4:
             System.out.println("---Menu de bebidas---");
             System.out.println("1)Agua\n 2)Refresco \n 3)Soda italiana\n 4)Malteada fresa \n5)Kombucha \n6)Capuchinno \n7)Cafe de olla \n8)Tizana\n9)Agua mineral\n10)Te de sobre");
             switch (precio){
                 case '1':
                     tipo=20;
                     
                     
             }
     }       System.out.println("¿Qué desea ordenar?");
     
    }
    public static void main(String[] args) {
        Restaurante gud=new Restaurante();
        gud.menu();
    }
    
}
