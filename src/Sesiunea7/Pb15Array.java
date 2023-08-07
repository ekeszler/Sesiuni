package Sesiunea7;

public class Pb15Array {
    //15. Scrie un program care sa evalueze automat raspunsurile date de un student la un quiz.
    //Ca si input (pe care il poti hardcoda initial) vei avea raspunsurile corecte si raspunsurile date de student. /De exemplu, pentru:
//    studentAnswers : {"C", "D", "D", "B", "A", "C", "B"}
//    teachersAnswers : {"A", "D", "D", "B", "B", "C", "B"}
//    functia va returna 5, deoarece sunt 5 raspunsuri care corespund, la indecsii 1,2,3,5,6
    public static void main(String[] args) {
        String[] studentAnswers = {"C", "D", "D", "B", "A", "C", "B"};
        String[] teacherAnswers = {"A", "D", "D", "B", "B", "C", "B"};

        int numberOfCorrectAnswers = 0;

        //mergem prin fiecare pozitie
        //la fiecare pas comparam elementul de la pozitia i din studentAswers cu elementul de la pozitia i din teacherAnswers
        //daca sunt egale, atunci numaram inca un raspuns corect

        for(int i = 0; i < studentAnswers.length; i++){
            if(studentAnswers[i].equals(teacherAnswers[i])){
                numberOfCorrectAnswers++;
            }
        }
        System.out.println(numberOfCorrectAnswers);
    }
}
