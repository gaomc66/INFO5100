/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.analytics;

import com.assignment5.utils.CommandLineTable;
import com.assignment5.analytics.utils.MapSorter;
import com.assignment5.entities.Customer;
import com.assignment5.entities.Item;
import com.assignment5.entities.Product;
import com.assignment5.entities.SalesPerson;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import static java.util.stream.Collectors.toMap;

/**
 *
 * @author xinlu
 */
public class Analysis {
    
    static DataStore ds = DataStore.getInstance();

    public static void getThreebestProducts(){
        Map<Integer,Product> proList = DataStore.getInstance().getProducts();
        Map<Integer,Item> items = DataStore.getInstance().getItems();
        Map<Integer,Integer> proRank = new HashMap<>();
        int quantity = 0;   

        for(Item item : items.values()){
            int proId = item.getProductId();

            Product tempProduct = proList.get(proId);
            if(item.getSalesPrice()-tempProduct.getTargetPrice()>0){
               quantity = item.getQuantity();

                if(proRank.containsKey(proId)){
                    quantity += proRank.get(proId);
                    proRank.put(proId, quantity);                
                }else{    
                    proRank.put(proId, quantity);
                }
            }
        }
        
        List<Map.Entry<Integer,Integer>> sortedMapList = MapSorter.sortMapByValueDescend(proRank);
        ArrayList<ArrayList<Map.Entry<Integer,Integer>>> top_list = MapSorter.getTopList(sortedMapList, 3);
//        System.out.println("Top three best products");
        
        int top_print = 1;
        for(List<Map.Entry<Integer,Integer>> entry_list : top_list){
            //System.out.printf("Top %d product :\n",top_print);
            for(Map.Entry<Integer,Integer> entry : entry_list){
                System.out.printf("No.%d :ProductID : %s ; Quantity: %d \n",top_print,entry.getKey(),entry.getValue());
            }
            top_print++;
        }
    }
    
    public static void getTotalRevenue(){
        Map<Integer,Item> items = DataStore.getInstance().getItems();
        Map<Integer,Product> proList = DataStore.getInstance().getProducts();
        int totalRevenue = 0;
        for(Item item:items.values()){
            int proId = item.getProductId();
            int spread = item.getSalesPrice()-proList.get(proId).getTargetPrice();
            if(spread>0){
                totalRevenue+= spread*item.getQuantity();
            }
        }
        System.out.println("Total revenue for the year that is above expected target is "+totalRevenue);
    }
    
    public static void getTop3SalesPersonByProfit(){
        Map<Integer, SalesPerson> salesPeople = DataStore.getInstance().getSalesPeople();
        Map<Integer, Product> products = DataStore.getInstance().getProducts();
        Map<Integer, Integer> salesProfit = new HashMap();
        
        for(SalesPerson salesPerson : salesPeople.values()){
            int profit = 0;
            List<Item> items = salesPerson.getItemList();
            for(Item item : items){
                profit += (item.getSalesPrice() - products.get(item.getProductId()).getTargetPrice())*item.getQuantity();
            }
            salesPerson.setProfit(profit);
            salesProfit.put(salesPerson.getSalesID(), profit);
        }

        Map<Integer, Integer> sortedSalesProfit = salesProfit.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed())
                .collect(toMap(Map.Entry::getKey,
                        Map.Entry::getValue, (e1,e2) -> e1, LinkedHashMap::new));
        
//        System.out.println(sortedSalesProfit);
        List<Map.Entry<Integer,Integer>> sortedSalesProfitList = new ArrayList<>(sortedSalesProfit.entrySet());
        ArrayList<ArrayList<Map.Entry<Integer,Integer>>> top_list = MapSorter.getTopList(sortedSalesProfitList, 3);
        
        int top_print = 1;
        for(List<Map.Entry<Integer,Integer>> entry_list : top_list){
            System.out.printf("Top %d SalePerson :\n",top_print);
            for(Map.Entry<Integer,Integer> entry : entry_list){
                System.out.printf("SalePerson : %s ; total sale Profit: %d \n",entry.getKey(),entry.getValue());
            }
            top_print++;
        }
    }
    
    public static void top3Customers(){
        Map<Integer,Customer> customers = ds.getCustomers();
        Map<Integer,Integer> customers_totalOverAmount = new HashMap<>();
        for(Customer cus : customers.values()){
            int totalOverAmount = 0;
            for(Item item:cus.getItems()){
                Product prod = findProductByProductID(item.getProductId());
                int salesPrice = item.getSalesPrice();
                int targetPrice = prod.getTargetPrice();
                int overAmount = (salesPrice - targetPrice)*item.getQuantity();
//                System.out.printf("customer ID: %s ;  item ID: %s ; over amount: %d \n",cus.getId(),item.getItemID(),overAmount);
                totalOverAmount += overAmount;
            }
            customers_totalOverAmount.put(cus.getId(), totalOverAmount);
//            System.out.println("com.assignment5.analytics.Analysis.top3Customers()");ß
        }
        
        List<Map.Entry<Integer,Integer>> sorted_list = MapSorter.sortMapByValueDescend(customers_totalOverAmount);
        ArrayList<ArrayList<Map.Entry<Integer,Integer>>> top_list = MapSorter.getTopList(sorted_list, 3);
        
        int top_print = 1;
        for(List<Map.Entry<Integer,Integer>> entry_list : top_list){
            System.out.printf("Top %d customer :\n",top_print);
            for(Map.Entry<Integer,Integer> entry : entry_list){
                System.out.printf("customer : %s ; total purchase amount above the target: %d \n",entry.getKey(),entry.getValue());
            }
            top_print++;
        }
    }
    
    private static Product findProductByProductID(int prodID){
        return ds.getProducts().get(prodID);
    }
        
    public static void printOriginalData(){
        System.out.println("Original Data: ");

        List<Map.Entry<Integer,Product>> productsList 
                = new ArrayList<>(DataStore.getInstance().getProducts().entrySet());
        
        sortListByDifference(productsList);   
        
        List<Map.Entry<Integer,Product>> lowerProducts = new ArrayList<>();
        List<Map.Entry<Integer,Product>> higherProducts = new ArrayList<>();
        
        dividedIntoTwoPartsAndPrint(productsList,lowerProducts, higherProducts);
        
        System.out.println("Products salePrice <= targetPrice");
        printTableBeforeDefine(lowerProducts);
        System.out.println("");
        System.out.println("Products salePrice > targetPrice");
        printTableBeforeDefine(higherProducts);

    }
    
    public static void printRedefinedData(){
        System.out.println("Redefined Data: ");

        List<Map.Entry<Integer,Product>> productsList 
                = new ArrayList<>(DataStore.getInstance().getProducts().entrySet());
        sortListByDifference(productsList);
        
        List<Map.Entry<Integer,Product>> lowerProducts = new ArrayList<>();
        List<Map.Entry<Integer,Product>> higherProducts = new ArrayList<>();
        
        dividedIntoTwoPartsAndPrint(productsList,lowerProducts, higherProducts);
        
        System.out.println("Products salePrice <= targetPrice");
        printTableAfterDefine(lowerProducts);
        System.out.println("");
        System.out.println("Products salePrice > targetPrice");
        printTableAfterDefine(higherProducts);

    }
    
    public static void reDefineData(){
         
        Map<Integer,Product> product = ds.getProducts();
        List<Map.Entry<Integer,Product>> productsList =
                new ArrayList<>(product.entrySet());
        System.out.println("***");
        System.out.println("***");
        product.entrySet()
                .forEach(pro -> {
                    int targetPrice = pro.getValue().getTargetPrice();
                    double salesPrice = pro.getValue().getAverageSalePrice();
                    if( targetPrice < 0.95*salesPrice){
                        pro.getValue().setNewTargetPrice(0.95*salesPrice);
                        System.out.printf( "Redefined Product %d's target price frome %d to %.2f.%n"
                        , pro.getKey(), targetPrice, pro.getValue().getNewTargetPrice());
                    }else if( targetPrice > 1.05*salesPrice){
                        pro.getValue().setNewTargetPrice(1.05*salesPrice);
                        System.out.printf( "Redefined Product %d's target price frome %d to %.2f.%n"
                        , pro.getKey(), targetPrice, pro.getValue().getNewTargetPrice());
                    }else{
                        pro.getValue().setNewTargetPrice(targetPrice);
//                        System.out.println("Keep orginal target Price");
                    }
                });
        System.out.println("***");
        System.out.println("***");
    }
    
    // ------------------- call by classes above -------------------------
    
    public static void sortListByDifference(List<Map.Entry<Integer,Product>> productsList){
        
        productsList.sort(new Comparator<Map.Entry<Integer,Product>>(){
            @Override
            public int compare(Map.Entry<Integer,Product> o1, Map.Entry<Integer,Product> o2) {
                if((o1.getValue().getAverageSalePrice() - o1.getValue().getTargetPrice())
                        < (o2.getValue().getAverageSalePrice() - o2.getValue().getTargetPrice()))
                    return -1;
                else if((o1.getValue().getAverageSalePrice() - o1.getValue().getTargetPrice())
                        > (o2.getValue().getAverageSalePrice() - o2.getValue().getTargetPrice()))
                    return 1;
                else{
                    return 0;
                }
            }
            
        });
    }
    
    public static void dividedIntoTwoPartsAndPrint(List<Map.Entry<Integer,Product>> productsList,
                                                    List<Map.Entry<Integer,Product>> lowerProducts,
                                                    List<Map.Entry<Integer,Product>> higherProducts){     
        productsList.forEach(productE -> {
            if((productE.getValue().getAverageSalePrice() - productE.getValue().getTargetPrice())<=0){
                lowerProducts.add(productE);
            }else{
                higherProducts.add(productE);
            }
        });     
    }
    
    public static void printTableBeforeDefine(List<Map.Entry<Integer,Product>> productsList){
        CommandLineTable st = new CommandLineTable();
                //st.setRightAlign(true);//if true then cell text is right aligned
        st.setShowVerticalLines(true);//if false (default) then no vertical lines are shown
        st.setHeaders("ProductID","SalePrice", "TargetPrice", "Difference");//optional - if not used then there will be no header and horizontal lines
        productsList.forEach((productE) -> {
            Product product = productE.getValue();
            st.addRow(Integer.toString(productE.getKey()),
                    String.format("%.2f",product.getAverageSalePrice()), 
                    Integer.toString(product.getTargetPrice()),
                    String.format("%.2f",product.getAverageSalePrice() - product.getTargetPrice()));
        });
        st.print();
    }
    
    public static void printTableAfterDefine(List<Map.Entry<Integer,Product>> productsList){
        CommandLineTable st = new CommandLineTable();
                //st.setRightAlign(true);//if true then cell text is right aligned
        st.setShowVerticalLines(true);//if false (default) then no vertical lines are shown
        st.setHeaders("ProductID","SalePrice", "NewTargetPrice", "Difference",  "Error");//optional - if not used then there will be no header and horizontal lines
        productsList.forEach((productE) -> {
            Product product = productE.getValue();
            st.addRow(Integer.toString(productE.getKey()),
                    String.format("%.2f",product.getAverageSalePrice()),
                    String.format("%.2f",product.getNewTargetPrice()),
                    String.format("%.2f",product.getAverageSalePrice() - product.getNewTargetPrice()),
                    String.format("%.2f",(product.getNewTargetPrice()- product.getAverageSalePrice())/product.getAverageSalePrice()));
        });
        st.print();
    }

}
