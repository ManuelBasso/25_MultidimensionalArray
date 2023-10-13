//Scrivere un programma che contenga un metodo che permette di inizializzare una matrice riempita con dei valori a vostro piacimento
// e restituisca la somma degli elementi sulla prima riga

public class MyClass {
    public static void main(String args[]) {
    int matrice [][] ={{1,2,3},{4,5,6}};
    Sum(matrice);
    }
    
    public static void Sum(int a[][]){
       
        int tot = 0;
        for (int i=0;i<a[0].length; i++){
           System.out.println(a[0][i]);
           tot += a[0][i];
        }
        System.out.println(tot);
    }
}