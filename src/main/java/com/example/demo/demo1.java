package com.example.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * TODO 描述:
 *
 * @ClassName demo1
 * @Author WJX
 * @Date 2020/7/13  10:36
 * @Version 1.0
 */
public class demo1 {
     public static void main(String[] args) throws ParseException {
//         if("1513174385" == null || "1513174385".isEmpty() || "1513174385".equals("null")){
//             System.out.println("");
//         }
//         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//         System.out.println(sdf.format(new Date(Long.valueOf("1513174385"+"000"))));

//         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//         System.out.println(String.valueOf(sdf.parse("2017-12-13").getTime()/1000));

         int a = (1513267200-1513094400)/86400;
//         Double a = 66 * 0.6;

         System.out.println(a);


     }
}
