package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] ars) {
        //getSolutionForExercisesOperators();
        //getSolutionForExercisesControlFlowStatements();
        getSolutionForExercisesCharactersAndStrings();
    }

    private static void getSolutionForExercisesOperators()
    {
        System.out.println("Операторы");
        System.out.println("Задача 1");

        int result = 1;
        result += 2;
        System.out.println(result);

        result -= 1; // result is now 2
        System.out.println(result);

        result *= 2; // result is now 4
        System.out.println(result);

        result /= 2; // result is now 2
        System.out.println(result);

        result += 8; // result is now 10
        result %= 7; // result is now 3
        System.out.println(result);
    }

    private static void getSolutionForExercisesControlFlowStatements()
    {
        System.out.println("Операторы потока управления");
        System.out.println("Задача 1");

        int aNumber = 3;
        if (aNumber >= 0)
        {
            if (aNumber == 0)
            {
                System.out.println("first strin");
            }
            else
            {
                System.out.println("second strin");
            }
        }

        System.out.println("third strin");
    }

    private static void getSolutionForExercisesCharactersAndStrings()
    {
        System.out.println("Символы и строки");

        System.out.println("Задача 1");
        //region Задача 1

        String hi = "Hi, ";
        String mom = "mom.";

        System.out.println("Вариант 1: " + hi + mom);
        System.out.println("Вариант 2: " + hi.concat(mom));
        System.out.println();

        //endregion

        System.out.println("Задача 2");
        //region Задача 2

        Scanner in = new Scanner(System.in);
        System.out.print("Введите своё полное имя: ");
        String name = in.nextLine();

        String fio = "";
        String[] letters = name.split(" ");

        for (String letter: letters)
        {
            fio += letter.charAt(0)+".";
        }

        System.out.println("Ваше ФИО:" + fio);
        in.close();

        //endregion

        System.out.println("Задача 3");
        // region Задача 3
        String string1 = "австралопитек";
        String string2 = "ватерполистка";

        Boolean[] isLetterUsed = new Boolean[string2.length()];
        for (int i=0; i<isLetterUsed.length; i++)
        {
            isLetterUsed[i] = false;
        }

        int countLettersString1 = string1.length();
        for (int i=0; i<string1.length(); i++)
        {
            if (!Character.isLetter(string1.charAt(i)))
            {
                countLettersString1--;
            }
        }

        int countLettersString2 = string2.length();
        for (int i=0; i<string2.length(); i++)
        {
            if (!Character.isLetter(string2.charAt(i)))
            {
                countLettersString2--;
            }
        }

        int counterLetters = 0;
        for (int i=0; i < string1.length(); i++)
        {
            char currentLetter = string1.charAt(i);
            if (Character.isLetter(currentLetter))
            {
                for (int j=0; j<string2.length(); j++)
                {
                    if ((currentLetter == string2.charAt(j)) && !isLetterUsed[j])
                    {
                        isLetterUsed[j] = true;
                        counterLetters++;
                        break;
                    }
                }
            }
        }

        if ((countLettersString1 != countLettersString2) || (counterLetters != countLettersString1))
        {
            System.out.println("Данные строки не являются анаграммами друг друга");
        }
        else
        {
            System.out.println("Данные строки являются анаграммами друг друга");
        }
        //endregion
    }
}
