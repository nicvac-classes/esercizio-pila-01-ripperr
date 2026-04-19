# Esercizio: Pila e Palindromi

## Parte 1 — Classe `Pila`

Creare un nuovo file **Pila.java** e implementare la classe generica `Pila<T>` con i seguenti metodi:

| Metodo | Descrizione |
|---|---|
| `public boolean isEmpty()` | Restituisce `true` se la pila è vuota, `false` altrimenti |
| `public void push(T dato)` | Inserisce un elemento in cima alla pila |
| `public T pop()` | Rimuove e restituisce l'elemento in cima alla pila |
| `public T peek()` | Restituisce l'elemento in cima alla pila senza rimuoverlo |
| `public int size()` | Restituisce il numero di elementi presenti nella pila |
| `public String toString()` | Restituisce una rappresentazione testuale della pila |

## Parte 2 — Programma principale

In **Esercizio.java** scrivere un programma che:

1. Chiede all'utente di inserire parole da tastiera
2. L'utente continua a inserire parole finché non digita **"x"**
3. Per ogni parola inserita, controllare se è **palindroma** utilizzando la classe `Pila`
4. Stampare a video se la parola è palindroma oppure no

### Esempio di esecuzione

```
Inserisci una parola (x per uscire): anna
"anna" è palindroma!

Inserisci una parola (x per uscire): ciao
"ciao" NON è palindroma.

Inserisci una parola (x per uscire): radar
"radar" è palindroma!

Inserisci una parola (x per uscire): x
Programma terminato.
```

### Suggerimento

Una parola è **palindroma** se si legge allo stesso modo da sinistra a destra e da destra a sinistra (es. *anna*, *radar*, *livil*).  
Per verificarlo con la Pila: inserire (`push`) ogni carattere della parola nella pila, poi estrarre (`pop`) i caratteri uno a uno per ricostruire la parola al contrario e confrontarla con l'originale.
