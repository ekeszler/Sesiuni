package Sesiunea7;

public class Pb17Array {
    //17. Scrie un program care sa gaseasca intersectia a doua array-uri.
    //Intersectia a doua array-uri este un array format din elementele care apar atat in primul, cat si in al doilea array.
    public static void main(String[] args) {
        int[] firstArray = {1, 7, 3, 10, 9};
        int[] secondArray = {2, 7, 8, 3, 4};


        for (int i=0; i<firstArray.length; i++){
            for (int j=0; j< secondArray.length; j++){
                if (firstArray[i] == secondArray[j]){
                    System.out.println(firstArray[i]);
                }
            }
        }

    }
}
