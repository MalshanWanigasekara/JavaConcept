package com.example.TryCatch;

public class TestTryCatch {

    public static int testTryCatchBlock(){
        try {
            return 20;
        }catch (Exception e){
            return 30;
        }finally {
            System.out.println("finally");
        }
    }
}
