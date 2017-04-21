package com.victor.practice.modul11.task112;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sonikb on 19.04.2017.
 */
public class Task2 {
    public static void main(String[] args) throws IOException {
        Map<String, String> map = new HashMap<>();
        map.put(" do not", "");
        map.put(" is ", " is not ");
        map.put("...", ":)");
        try {
            System.out.println(fileContentReplacer(map));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String fileContentReplacer(Map<String, String> map) throws IOException {
        String str;
        String result = "";
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("src/main/java/com/victor/practice/modul11/task112/task2.txt"), "UTF-8"));
            while ((str = br.readLine()) != null) {
                System.out.println(str);
                for (String s : map.keySet()) {
                    str = str.replace(s, map.get(s));
                }
                result += str + "\n";
            }
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src/main/java/com/victor/practice/modul11/task112/task2.txt", false), "UTF-8"));
            bw.write(result);
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
