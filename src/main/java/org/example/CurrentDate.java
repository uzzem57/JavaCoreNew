package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;


public class CurrentDate {
    /**
     * Функция получения значения текущей даты и времени в заданном шаблоне
     * @return Текущую дату и время
     */
    static Date currentDate(){
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        return date;
    }
}
