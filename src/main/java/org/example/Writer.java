package org.example;

import java.io.*;
import java.util.Date;

public class Writer {
    /**
     * Функция записи заметки в файл
     * @param text введеная пользователем строка
     * @param date текущая дата и время
     * @throws IOException
     */
    static void writer(String text, Date date) throws IOException {
        File myFile = new File("myfile.txt");
        BufferedWriter wtr = new BufferedWriter(new FileWriter(myFile,true));
        wtr.write(date + "-> " + text + "\n" );
        wtr.flush();
        wtr.close();
    }
}
