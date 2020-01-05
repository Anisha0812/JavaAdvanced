/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access;

/**
 *
 * @author Aashi
 */
class A{
    //private A(){}//private constructor
    private int data=40;
    private void msg(){System.out.println("Hello java");}
}
public class private1{
    public static void main(String args[]){
        A obj=new A();
       // System.out.println(obj.data);//Compile Time Error
        //obj.msg();//Compile Time Error
    }
}

