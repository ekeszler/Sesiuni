package Sesiunea7;

public class Pb12Array {
    //12. Scrie un program care sa verifica daca un array este sortat crescator
    public static void main(String[] args) {
        int[] prices = {1, 3, 5 ,10};
        System.out.println(isSorted(prices));

    }

    public static boolean isSorted (int[] prices){
        for(int i = 0; i < prices.length-1; i++){
            if(prices[i] > prices[i+1]){
                return false;
            }
        }
        return true;
    }


}
