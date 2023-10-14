package org.example;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите заметку: ");
       Writer.writer(Reader.reader(),CurrentDate.currentDate());
        }
    }
