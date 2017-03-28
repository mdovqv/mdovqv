
package projeto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Projeto {

   
    public static void main(String[] args) {
        Cartas magic = new Cartas();
        magic.setNome ("A1 - Seyjin");
        magic.setAtaque(5);
        magic.setDef(3);
        magic.setInteligencia(1);
        
        Cartas magic1 = new Cartas();
        magic.setNome ("A2 - Ragnaros");
        magic.setAtaque(8);
        magic.setDef(8);
        magic.setInteligencia(8);
        
        Cartas magic2 = new Cartas();
        magic.setNome ("A3 - Demonarca");
        magic.setAtaque(5);
        magic.setDef(7);
        magic.setInteligencia(3);
        
        Cartas magic3 = new Cartas();
        magic.setNome ("A4 - Leeroy Jenkins");
        magic.setAtaque(7);
        magic.setDef(2);
        magic.setInteligencia(7);
        
        Cartas magic4 = new Cartas();
        magic.setNome ("A5 - Reno Jakson");
        magic.setAtaque(4);
        magic.setDef(5);
        magic.setInteligencia(9);
        
        Cartas magic5 = new Cartas();
        magic.setNome ("A6 - Kazakus");
        magic.setAtaque(3);
        magic.setDef(6);
        magic.setInteligencia(10);
        
        Cartas magic6 = new Cartas();
        magic.setNome ("A7 - Antonidas");
        magic.setAtaque(7);
        magic.setDef(5);
        magic.setInteligencia(10);
        
        Cartas magic7 = new Cartas();
        magic.setNome ("A8 - Growmash");
        magic.setAtaque(10);
        magic.setDef(8);
        magic.setInteligencia(4);
        
        Cartas magic8 = new Cartas();
        magic.setNome ("A09 - Shaku");
        magic.setAtaque(5);
        magic.setDef(8);
        magic.setInteligencia(5);
        
        Cartas magic9 = new Cartas();
        magic.setNome ("A10 - Raza");
        magic.setAtaque(5);
        magic.setDef(8);
        magic.setInteligencia(6);
        
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
