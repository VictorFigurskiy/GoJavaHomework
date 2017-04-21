package com.victor.practice.modul11.task111;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by Sonikb on 19.04.2017.
 */
public class Task1 {
    public static void main(String[] args) throws IOException {
        Map<String, String> map = new HashMap<>();
        map.put("!", "<*$!$*>");
        map.put(" is ", " is not ");
        try {
            System.out.println(replacer(map));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String replacer(Map<String, String> map) throws IOException {
        String str;
        String result = "";

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("src/main/java/com/victor/practice/modul11/task111/task1.txt"), "UTF-8"));
            while ((str = br.readLine()) != null) {
                System.out.println(str);

                for (String s : map.keySet()) {
                    str = str.replace(s, map.get(s));
                }
                result += str + "\n";

            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
