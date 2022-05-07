package HashTableFacil;

import java.util.Hashtable;
import java.util.Map;

// Classe Contato
class Contato {
    int codigo;
    String nome;
    String numero;

    public Contato(int codigo, String nome, String numero) {
        this.codigo = codigo;
        this.nome = nome;
        this.numero = numero;
    }

    
}

// Classe principal
public class HashTable {
    public static void main(String[] args) {
        
        // Lista de contatos
        Map<Integer,Contato> contatos = new Hashtable<Integer,Contato>(4);    
        
        Contato c1 = new Contato(2, "Deyvid", "40028922");
        Contato c2 = new Contato(6, "Clécio", "40038922");
        Contato c3 = new Contato(13, "Carlos", "40048922");
        Contato c4 = new Contato(12, "Moisés", "40058922");
        Contato c5 = new Contato(7, "Yuri", "40068922");
        // Puts
        contatos.put(1,c1);
        contatos.put(2,c2);
        contatos.put(3, c3);
        contatos.put(4, c4);
        contatos.put(5, c5);
        
        //Mostrando os elementos
        for(Map.Entry<Integer, Contato> entry:contatos.entrySet()){    
            int key=entry.getKey();  
            Contato c = entry.getValue();
            System.out.println(); 
            System.out.println(key+"º entrada \n=================");  
            System.out.println("Código:"+c.codigo+" \nNome:"+c.nome+" \nNúmero:"+c.numero+" ");
        }    

    }
}
