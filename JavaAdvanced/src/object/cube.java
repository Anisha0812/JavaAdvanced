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
public class cube {
    int length ;
    int breadth ;
    int height ;
    public int getvolume()
    {
        return (length*breadth*height);
    }

    cube()
    {

        //System.out.println("we are in cubes");
        length=10;
        breadth=20;
        height=10;


    }
    cube(int l,int b, int h)
    {

        //System.out.println("we are in cubes");
        length=l;
        breadth=b;
        height=h;


    }

}


