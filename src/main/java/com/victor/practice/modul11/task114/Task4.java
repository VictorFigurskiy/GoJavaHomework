package com.victor.practice.modul11.task114;

import java.io.*;

/**
 * Created by Sonikb on 19.04.2017.
 */
public class Task4 {
    public static void main(String[] args) throws IOException {
        String word = "F-22";

        System.out.println("Слово " + word + " появляется в тексте файла " + checkWordTryWithResourses(word) + " раз. Использование метода try-with-resources");

        System.out.println("Слово " + word + " появляется в тексте файла " + checkWordTry(word) + " раз. Использование метода try");
    }

    public static int checkWordTryWithResourses(String word) throws IOException {
        int count = 0;
        String str;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:/JAVA/GoIT Study/JavaCoreGoIT/GoJavaHomework/src/main/java/com/victor/practice/modul11/task114/task4.txt"), "UTF-8"))) {
            while ((str = br.readLine()) != null) {
                if (str.contains(word)) {
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    public static int checkWordTry(String word) throws IOException {
        int count = 0;
        String str;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:/JAVA/GoIT Study/JavaCoreGoIT/GoJavaHomework/src/main/java/com/victor/practice/modul11/task114/task4.txt"), "UTF-8"));
            while ((str = br.readLine()) != null) {
                if (str.contains(word)) {
                    count++;
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }
}
