package Sesiunea7;

import java.util.Scanner;
//10. Scrie un program care sa inverseze elementele unui array. Adica vrei ca utilizatorul sa poata vedea o lista de preturi de la coada la cap:
//De exemplu, pentru {1, 7, 3, 10, 9}, sa va afisa in consola "9, 10, 3, 7, 1"
public class Pb10Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] prices = {1, 7, 3, 10, 9};
        int[] pricesReversed = new int[5];

//        int j = 0;
//        for (int i = prices.length - 1; i >= 0; i--) {
//            pricesReversed[j] = prices[i];
//            j++;
//        }


        for (int i = 0; i<pricesReversed.length; i++){
            pricesReversed[i] = prices[prices.length-1-i];
        }


//        int i = 0;
//        int j = prices.length - 1;
//        //cat timp i<j
//        //la fiecare pas, internschimbam elementul de la pozitia i cu cel de la pozitia j
//             //crestem pe i si scadem pe j
//        while (i<j){
//            int temp = prices[i];
//            prices[i]=prices[j];
//            prices[j] = temp;
//            i++;
//            j--;
//        }


//        for (int i=0; i<prices.length/2; i++){
//            int j = prices.length- i- 1;
//            int temp = prices[i];
//            prices[i]= prices[j];
//            prices[j] = temp;
//        }
        //







    }
}
