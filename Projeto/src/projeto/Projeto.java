
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
        magic1.setNome ("A2 - Ragnaros");
        magic1.setAtaque(8);
        magic1.setDef(8);
        magic1.setInteligencia(8);
        
        Cartas magic2 = new Cartas();
        magic2.setNome ("A3 - Demonarca");
        magic2.setAtaque(5);
        magic2.setDef(7);
        magic2.setInteligencia(3);
        
        Cartas magic3 = new Cartas();
        magic3.setNome ("A4 - Leeroy Jenkins");
        magic3.setAtaque(7);
        magic3.setDef(2);
        magic3.setInteligencia(7);
        
        Cartas magic4 = new Cartas();
        magic4.setNome ("A5 - Reno Jakson");
        magic4.setAtaque(4);
        magic4.setDef(5);
        magic4.setInteligencia(9);
        
        Cartas magic5 = new Cartas();
        magic5.setNome ("A6 - Kazakus");
        magic5.setAtaque(3);
        magic5.setDef(6);
        magic5.setInteligencia(10);
        
        Cartas magic6 = new Cartas();
        magic6.setNome ("A7 - Antonidas");
        magic6.setAtaque(7);
        magic6.setDef(5);
        magic6.setInteligencia(10);
        
        Cartas magic7 = new Cartas();
        magic7.setNome ("A8 - Growmash");
        magic7.setAtaque(10);
        magic7.setDef(8);
        magic7.setInteligencia(4);
        
        Cartas magic8 = new Cartas();
        magic8.setNome ("A09 - Shaku");
        magic8.setAtaque(5);
        magic8.setDef(8);
        magic8.setInteligencia(5);
        
        Cartas magic9 = new Cartas();
        magic9.setNome ("A10 - Raza");
        magic9.setAtaque(5);
        magic9.setDef(8);
        magic9.setInteligencia(6);
        
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
