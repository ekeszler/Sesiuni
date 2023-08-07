package Sesiunea7;

import java.util.Scanner;

public class Pb16While {
    public static void main(String[] args) {
        //16. Creeaza un sistem automat de dat rest.
        //Atunci cand dai rest pentru un produs, vrei sa minimizezi numarul de monede pe care le dai ca rest.
        //Daca ai de ales ca pentru suma de 50 de centi sa dai rest 2 monede de 25 de centi, sau 5 monede de 10 centi, vei alege prima varianta.
        //Avem la dispozitie monede de 25 centi, 10 centi, 5 centi, 1 cent.
        //Sa luam inca un exemplu:
        //
        //Daca restul este de 41 de centi, vrei sa ii dai o moneda de 25 de centi.
        //Mai raman 16 centi, asa ca ii mai dai o moneda de 10 centi (cea mai mare ca valoare pe care poti sa i-o dai)
        //Mai raman 6 centi, asa ca ii mai dai o moneda de 5 centi
        //Mai ramane 1 cent, asa ca ii mai dai o moneda de 1 cent In total 4 monede.
        //Programul trebuie sa citeasca de la tastatura valoarea restului si sa afiseze de cate monede este nevoie pentru a da rest, respectand algoritmul din exemplu.
        //Programul nu trebuie sa afiseze de cate monede de fiecare tip este nevoie, ci de cate monede in total (chiar daca vor fi monede de tipuri diferite).\


        //plan
        //citesc valoarea restului de la tastatura ca si inpur
        //input
        //valoarea restului
        Scanner scanner = new Scanner(System.in);
        int change = scanner.nextInt();
        int numberOfCoins = 0;
        //1. sa vad cate monede de 25 pot sa ii dau si scad toate acele monede de 25 din rest
        //2. sa vad cate monede de 10 pot sa ii dau si sa scad toate acele monede din rest
        //3. idem cu monede de 5
        //4. idem cu monede de 1

//        while(change >= 25){
//            change-=25;
//            numberOfCoins++;
//        }
//        while(change >= 10){
//            change-=10;
//            numberOfCoins++;
//        }
//        while(change >= 5){
//            change-=5;
//            numberOfCoins++;
//        }
//        while(change >= 1){
//            change-=1;
//            numberOfCoins++;
//        }

        numberOfCoins += getCoins(change, 25);
        change = change % 25;
        numberOfCoins += getCoins(change, 10);
        change %= 10;
        numberOfCoins += getCoins(change, 5);
        change %= 5;
        numberOfCoins += getCoins(change, 1);

        System.out.println("numarul de monede este: " + numberOfCoins);


        //output
        //de cate monede e nevoie ca sa dam restul la valoarea citita de la tastatura
    }

    public static int getCoins(int change, int coinValue) {
        int numberOfCoins = 0;
        while (change >= coinValue) {
            change -= coinValue;
            numberOfCoins++;
        }
        return numberOfCoins;
    }
}
