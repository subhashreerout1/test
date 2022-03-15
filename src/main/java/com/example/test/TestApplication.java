package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
       /* String str="This is Bubu";
        char[] ch=str.toCharArray();
        String result = "";
        //String str1[]=str.split(" ");
        for (char s:ch) {
            result=s+result;
            System.out.println("hiiiiiiiiiiiiiiiiiiiiiiii"+s);
        }
		System.out.println("hiiiiiiiiiiiiiiiiiiiiiiii"+result);*/

        Map<String,Integer> map=new HashMap<String,Integer>();
        map.put("a",1);
        map.put("b",4);
        map.put("c",2);
        map.put("d",3);
        System.out.println("hiiiiiiiiiiiiiiiiiiiiiiii"+map.get("a"));
    }

}
