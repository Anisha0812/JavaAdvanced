/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

/**
 *
 * @author Aashi
 */
public class counter {
 

        static int count=0;//will get memory only once and retain its value

        counter(){
            count++;//incrementing the value of static variable
            System.out.println(count);
        }

        public static void main(String args[]){
//creating objects
            counter c1=new counter();
            counter c2=new counter();
            counter c3=new counter();
        }
    }

    

