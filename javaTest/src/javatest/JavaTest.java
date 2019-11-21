/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author gaomc
 */
public class JavaTest {

    int[] a = new int[4];

    void a(){
        int b = 0, index;
        System.out.println(a[0]);

        a[a[b]] = a[b] = b = 2;
//        a[a[0]] = a[0] = 2;
        System.out.println("0  " + a[0]);
        System.out.println("1  " + a[1]);
        System.out.println("2  " + a[2]);
        System.out.println("3  " + a[3]);
        System.out.println("b  " + b);

        
        index = 2;
        System.out.println(a[index]);
    }
    
    void b(){
        int i = 0101;
        int j = 01017;
        System.out.println(i);
        System.out.println(j);
    }
    
    
    void c(){
        int a = Integer.MAX_VALUE;
        String str = Integer.toString(a);
        StringBuilder sb = new StringBuilder(str);
        
        System.out.println(sb.toString());
        
    }
    
    void lc26(){
        int[] nums = {1,1,2,2,2,2,3,3,4,4,5};
        Set<Integer> result = new HashSet<>();
        
        for(int i : nums){
            result.add(nums[i]);
        }
        
        System.out.println(result);
    }
    public static void main(String[] args)  {
        // TODO code application logic here
//                        throw obj;  
      JavaTest e = new JavaTest();
      
      e.lc26();

//        System.out.printf("4");
    }
    
}
