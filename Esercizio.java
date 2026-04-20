public class Nodo<T>{
    T dato;
    Nodo<T> next;

    public Nodo(T dato){
        this.dato = dato;
        this.next = null;
    }
}

java.util.NoSuchElementException;

public class Pila<T>{
    private Nodo<T> top;

    public Pila(){
        this.top = null;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void push(T dato){
        Nodo<T> nuovoNodo = new Nodo<>(dato);

        nuovoNodo.next = top;
        top = nuovoNodo;
    }

    public T pop(){
        if(top == null){
            throw new NoSuchElementException("Pila vuota!");
        }

        T dato = top.dato;
        top = top.next;

        return dato;
    }

    public T peek(){
        if(top == null){
            throw new NoSuchElementException("Pila vuota!");
        }

        return top.dato;
    }

    public int size(){
        Nodo<T> attuale = top;

        int count = 0;
        while(attuale != null){
            attuale = attuale.next;
            ++count;
        }

        return count;
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();

        Nodo<T> attuale = top;

        str.append("top");
        while (attuale != null) {
            str.append("--->");
            str.append(attuale.dato);
            
            attuale = attuale.next;
        }

        str.append("--->NULL");

        return str.toString();
    }
}

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        Pila<Character> pila = new Pila<>();
        String parola;
        do{
            
            System.out.print("Inserire una parola: ");
            parola = in.nextLine();

            if(!parola.equalsIgnoreCase("X")){
                for(int i = 0; i < parola.length(); ++i){
                    pila.push(parola.charAt(i));
                }

                String palindrom = "";
                while(!pila.isEmpty()){
                    palindrom += pila.pop();
                }

                if(parola.equalsIgnoreCase(palindrom)){
                    System.out.println("La parola: " + parola + " è palindorma!!");
                }
            }
        }while(!parola.equalsIgnoreCase("x"));
    }
}