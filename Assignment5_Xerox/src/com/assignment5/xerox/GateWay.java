/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.xerox;


import com.assignment5.utils.CommandLineTable;
import com.assignment5.analytics.Analysis;
import com.assignment5.analytics.DataStore;
import com.assignment5.entities.Customer;
import com.assignment5.entities.Item;
import com.assignment5.entities.Order;
import com.assignment5.entities.Product;
import com.assignment5.entities.SalesPerson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author kasai
 */
public class GateWay {
    
    private static DataStore datastore = DataStore.getInstance();
    Analysis analysis;
    
    public static void main(String args[]) throws IOException{
        
        DataGenerator generator = DataGenerator.getInstance();
        
        //Below is the sample for how you can use reader. you might wanna 
        //delete it once you understood.
        
        DataReader orderReader = new DataReader(generator.getOrderFilePath());
        String[] orderRow;
        
        while((orderRow = orderReader.getNextRow()) != null){
            Item item =generateItem(orderRow);
            generateOrder(orderRow,item);
            generateCustomer(orderRow,item);
            generateSalesPerson(orderRow, item);
        }
//        System.out.println(datastore.getCustomers());
        System.out.println("_____________________________________________________________");
        
        DataReader productReader = new DataReader(generator.getProductCataloguePath());
        String[] prodRow;
        while((prodRow = productReader.getNextRow()) != null){
            generateProduct(prodRow);
        }
        addItemToProductsAndCauculateAverageSalePrice();
        
        runAnalysis();
    }
    
    
    private static Item generateItem(String[] row){
        // TODO
        int itemId = Integer.parseInt(row[1]);
        int productId = Integer.parseInt(row[2]);
        int salesPrice = Integer.parseInt(row[6]);
        int quantity = Integer.parseInt(row[3]);
        Item item = new Item(itemId,productId,salesPrice,quantity);
        DataStore.getInstance().getItems().put(itemId, item);
        
        return item;
    }
    
    private static void generateOrder(String[]row,Item item){
        int orderId = Integer.parseInt(row[0]);
        int salesPersonId = Integer.parseInt(row[4]);
        int customerId = Integer.parseInt(row[5]);
        String market_Seg = row[7];
        Order order = new Order(orderId,salesPersonId,customerId,item,market_Seg);
        DataStore.getInstance().getOrders().put(orderId, order);
    }
    
    private static void generateProduct(String[] row){
        int id = Integer.parseInt(row[0]);
        int minPrice = Integer.parseInt(row[1]);
        int maxPrice = Integer.parseInt(row[2]);
        int targetPrice = Integer.parseInt(row[3]);
        Product pro = new Product(id,maxPrice,minPrice,targetPrice);
        DataStore.getInstance().getProducts().put(id, pro);
//        System.out.println(datastore.getProducts());
    }
    
    private static void generateSalesPerson(String[] row, Item item){ 
        int salesId = Integer.parseInt(row[4]);
        Map<Integer, SalesPerson> salesPersonMap = DataStore.getInstance().getSalesPeople();
        
        if(salesPersonMap.containsKey(salesId)){
            salesPersonMap.get(salesId).getItemList().add(item);
        }else{
            SalesPerson salesPerson = new SalesPerson(salesId);
            salesPerson.getItemList().add(item);
            salesPersonMap.put(salesId, salesPerson);
        }
        
    }

    public static void generateCustomer(String[] row, Item item){
        int customerId = Integer.parseInt(row[5]);
        Customer customer = datastore.getCustomerByID(customerId);
        customer.addItem(item);
//        System.out.println(customer + "  ------  " + customer.getItems());
    }
    
    public static void addItemToProductsAndCauculateAverageSalePrice(){
        Map<Integer,Item> items = DataStore.getInstance().getItems();
        Map<Integer,Product> products = DataStore.getInstance().getProducts();
        Map<Product, List<Item>> productWithItemListMap = new HashMap<>();
        
        items.entrySet()
                .forEach(item -> {
                    int tempProductId = item.getValue().getProductId();
                    Item tempItem = item.getValue();
                    Product tempProduct = datastore.getProducts().get(tempProductId);
                                        
                    if(productWithItemListMap.containsKey(tempProduct)){
                        productWithItemListMap.get(tempProduct).add(tempItem);
                    }else{
                        List<Item> tempItemList = new ArrayList<>();
                        tempItemList.add(tempItem);
                        productWithItemListMap.put(tempProduct, tempItemList);
                    }
                });
        
        productWithItemListMap.entrySet()
                .forEach(proItemMap -> {
                    proItemMap.getKey().caculateAverageSalePrice(proItemMap.getValue());
                });
    }
    
    
    
    public static void runAnalysis(){
        // #1
        System.out.println("#1 Our Top3 bet negotiated products: ");
        Analysis.getThreebestProducts();
        System.out.println("_____________________________________________________________"+ "\n");
        System.out.println("_____________________________________________________________"+ "\n");

        // #2
        System.out.println("#2 Our 3 best Customers: ");
        Analysis.top3Customers();
        System.out.println("_____________________________________________________________"+ "\n");
        System.out.println("_____________________________________________________________"+ "\n");
        
        // #3
        System.out.println("#3 Our top 3 Best Sales People: ");
        Analysis.getTop3SalesPersonByProfit();
        System.out.println("_____________________________________________________________"+ "\n");
        System.out.println("_____________________________________________________________"+ "\n");
        
        // #4
        System.out.println("#4 Our total revenue for the year:  ");
        Analysis.getTotalRevenue();
        System.out.println("_____________________________________________________________"+ "\n");
        System.out.println("_____________________________________________________________"+ "\n");

        // #5
        System.out.println("#5 Redifine target Price:  ");
        // #5 - part1 - original data: table includes followings
        Analysis.printOriginalData();
        // #5 - part2 - modify
        Analysis.reDefineData();
        Analysis.printRedefinedData();
    }
    
//    private void getProductSalesData(){
//        DataStore ds = DataStore.getInstance();
//        Map<Integer,Order> orders = ds.getOrders();
//        Map<Integer,Product> products = ds.getProducts();
//        Map<Integer,List<ProductSalesPrice_Quantity>> product_analysis_map = new HashMap<Integer, List<Item>>();
//        for(Product pro: products.values()){
//            List<ProductSalesPrice_Quantity> product_saleQuantity = new ArrayList<>();
//            product_analysis_map.put(pro.getId(), product_items);
//            
//            //find all all the item that sales the product, and put them into the List of product_items
//            for(Order o : orders.values()){
//                if(o.getItem().getProductId() == pro.getId()){
//                    product_items.add(o.getItem());
//                    System.out.printf("product: %d , target price: %f , sales");
//                }
//                   
//            }
//        }
//        
//    }
    
//    class ProductSalesPrice_Quantity{
//        private int id;
//        private int price;
//        private int total_quantity;
//        
//        public ProductSalesPrice_Quantity(int id,int price){
//            this.id = id;
//            this.price = price;
//            this.total_quantity = 0;
//        }
//        
//        public boolean checkID(int id){
//            return id == id;
//        }
//        
//        public void addQuantity(int quantity){
//            this.total_quantity += quantity;
//        }
        
    
//    }
            
    
    
}
