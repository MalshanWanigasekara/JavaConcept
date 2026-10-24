package com.example.classTypes;

public abstract class TestAbstractClass {

    void method1(){};

    public final void method2(){}

    public abstract void  method4();
}

class ConcreteClass extends TestAbstractClass {


    void method3(){};

    @Override
    public void method4(){};
}


final class TestFinalCLass{
    final void method3(Integer x){


        int y = x;

        System.out.println(y);

        try{
            //do something
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            System.out.println("all finished");
        }
    };
}
