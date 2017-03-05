package com.sent13.psychicbattleapplication.Utils;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sent13 on 2017/02/24.
 */

public class Util {

    public static String InputStr(String str){
        System.out.print(str+">");
        String inputStr="";
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        try{
            inputStr=in.readLine();
        }catch (IOException e){
            e.printStackTrace();
        }
        return inputStr;
    }

    public static int InputInt(String str){
        String inputStr=InputStr(str);
        return Integer.parseInt(inputStr);
    }
}
