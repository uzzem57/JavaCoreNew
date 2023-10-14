package org.example;

import java.util.Scanner;

public class Reader {
    /**
     * Функция считывания заметки от пользователя
     * @return Строку введеную пользователем
     */
    static String reader(){
        Scanner console = new Scanner(System.in);
        String text = console.nextLine();
        return  text;
    }
}
