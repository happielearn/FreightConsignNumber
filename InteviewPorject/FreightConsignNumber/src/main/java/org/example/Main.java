package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class Main {


    public static void main(String[] args) {
        try {
            //System.out.println(String.format("%07d" , 1223));
        }catch(Exception e){
            e.printStackTrace();
        }
        SpringApplication.run(Main.class, args);

       /* int[] digits = "0000019605".chars().map(c -> c-'0').toArray();
        int size =digits.length;
        int firstValue = 0;
        int secondValue = 0;
        for(int i=size-1;i>=0;i--){
            firstValue+=digits[i];
            i--;
        }
        firstValue=firstValue*3;
        for(int i=size-2;i>=0;i--){
            secondValue+=digits[i];
            i--;
        }
        secondValue= secondValue*7;
        int sumValue = firstValue+secondValue;
        int result =10-(sumValue%10);
        int checksum = result;
System.out.println(checksum);*/


       //carrier number ENUM pojo validation
        //invalid input validation
        //use BigDecimal
        //invalid null and empty data should be validated by Assert or Annotation
        //when given number exceeds the digits
        //carrier name derived it from function
        //checksum calculation recursive pattern
        //last used index atomicInteger increment or table pssimistic lock
        //write seperate function and compose them as single line




    }
}