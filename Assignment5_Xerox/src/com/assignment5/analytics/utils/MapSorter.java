/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.analytics.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author sallywang
 */
public class MapSorter {
    
    public MapSorter(){
        
    }
    
    
    public static List sortMapByValueDescend(Map<Integer,Integer> map){
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>(){
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
            
        });
        
        return list;
    }
    
    public static List sortMapByValueAscending(Map<Integer,Integer> map){
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>(){
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
            
        });
        
        return list;
    }
    
    public static ArrayList<ArrayList<Map.Entry<Integer,Integer>>> getTopList(List<Map.Entry<Integer,Integer>> sortedMapList,int topNumber){
        int top = 0;
        int index = 1;
        ArrayList<ArrayList<Map.Entry<Integer,Integer>>> top_list = new ArrayList<ArrayList<Map.Entry<Integer,Integer>>>(topNumber);
        for(int j = 0; j<topNumber ; j++){
            top_list.add(j, new ArrayList<Map.Entry<Integer,Integer>>());
        }
        top_list.get(0).add(sortedMapList.get(0));
        while(top<topNumber){
            Map.Entry<Integer,Integer> currentEntry = sortedMapList.get(index);
            if(currentEntry.getValue().equals(top_list.get(top).get(0).getValue())){
                top_list.get(top).add(currentEntry);
                System.out.println("com.assignment5.analytics.Analysis.top3Customers()");
            }else{
                if(top==topNumber-1)
                    break;
                top_list.get(++top).add(currentEntry);
            }
            index++;
        }
        
        return top_list;
    }
    
}
