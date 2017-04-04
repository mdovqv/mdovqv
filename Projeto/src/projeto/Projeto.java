
package projeto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Projeto {
 
    
    public static void main(String[] args) {
        Cartas magic = new Cartas("A1 - Seyjin", 5, 3, 1);
        
        Cartas magic1 = new Cartas("A2 - Ragnaros", 8, 8, 8);
        
        Cartas magic2 = new Cartas("A3 - Demonarca", 5, 7, 3);
        
        Cartas magic3 = new Cartas("A4 - Leeroy Jenkins", 7, 2, 7);
        
        Cartas magic4 = new Cartas("A5 - Reno Jakson", 4, 5, 9);
      
        Cartas magic5 = new Cartas("A6 - Kazakus", 3, 6, 10);
                
        Cartas magic6 = new Cartas("A7 - Antonidas", 7, 5, 10);
       
        Cartas magic7 = new Cartas("A8 - Growmash", 10, 8, 4);
        
        Cartas magic8 = new Cartas("A09 - Shaku", 5, 8, 5);
        
        Cartas magic9 = new Cartas("A10 - Raza", 5, 8, 6);
        
        List<Cartas> listaCartas = new ArrayList();
        
        listaCartas.add(magic);
        listaCartas.add(magic2);
        listaCartas.add(magic3);
        listaCartas.add(magic4);
        listaCartas.add(magic5);
        listaCartas.add(magic6);
        listaCartas.add(magic7);
        listaCartas.add(magic8);
        listaCartas.add(magic9);
        
        
        System.out.println(" "+listaCartas);
        boolean loop = true;
        Scanner leitura = new Scanner(System.in);
        String receber;
         
       do{
       for ( int i = 0; i < listaCartas.size(); i++) {
         Collections.shuffle(listaCartas);
 System.out.println("Nome" + listaCartas.get(i).getNome());
 System.out.println("Ataque" + listaCartas.get(i).getAtaque());
 System.out.println("Defesa" + listaCartas.get(i).getDef());
 System.out.println("Inteligencia" + listaCartas.get(i).getInteligencia());
 receber = leitura.nextLine();
            }    
           
       }while(loop = true);
            
        
                
        
      
    }
    
}
