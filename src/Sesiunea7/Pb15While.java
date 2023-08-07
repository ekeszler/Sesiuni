package Sesiunea7;

import java.util.Scanner;

public class Pb15While {
    public static void main(String[] args) {
     //15. Creeaza un automat de Coca Cola.
        //Presupunem ca o masina vinde sticle de cola care costa 50 de centi si accepta doar urmatoarele monede: 25 de centi, 10 centi si 5 centi.
        //Implementeaza un program care ii cere utilizatorului sa introduca cate o moneda pe rand, si de fiecare data il informeaza cat mai are de platit pana la cei 50 de centi.
        //O data ce utilizatorul a introdus minim 50 de centi, afiseaza cati centi trebuie sa primeasca rest.
        //Ca si simulam introducerea monedelor, vom citi de la tastatura numere reprezetand valoarea monedelor.\

        Scanner scanner = new Scanner(System.in);
        //input
        int userCoin = 0;
        //1. citim monede de la tastatura pana cand ajungem la pretul de 50 de centi
        //2. de fiecare data cand citim afisam cat mai este de plata
        //3. afisam cat este restul

        int price = 50;
        int partialAmount = 0;
        int change = 0;
        while(partialAmount <= price){
            System.out.println("introdu o moneda");
            do{
            userCoin = scanner.nextInt();
            }while(userCoin!=5 && userCoin!=10 && userCoin!=25);
            partialAmount = partialAmount + userCoin;
            if(price - partialAmount >0) {
                System.out.println("mai ai de plata: "+(price - partialAmount));
            }
        }

            System.out.println("vei primi rest " + (partialAmount - price));


        //output
        //cat mai are de platit pentru fiecare moneda introdusa
        //restul pe care trebuie sa il dam la final
    }
}
