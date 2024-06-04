/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project2023;

/**
 *
 * @author MUHAMMAD FAIZAN
 */
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author FAIZAN RAZA
 */
public class linkedlist_all {
    Scanner sc = new Scanner(System.in);
    //implementation i_obj=new implementation();
    Node head10;
    linkedlist_all() {
        head10=null;
    }
   
  void add(String newElement) {
    Node newNode10 = new Node();
    newNode10.data = newElement;
    newNode10.next10 = null; 
    if(head10 == null) {
      head10 = newNode10;
    } else {
      Node temp10 = new Node();
      temp10 = head10;
      while(temp10.next10 != null)
        temp10 = temp10.next10;
      temp10.next10 = newNode10;
    }    
  }
      String arr[]=new String[11];
  void traverse(String user_req,Scanner sc){//priority to qatar airways as a subsidizer.sorting with short list acc to info of user
    Node temp10 = new Node();
    temp10 = this.head10;
       int adults=0,teenager=0,child=0,infant=0;
    String flight_seats="",flight_price="";
       System.out.print("\n\t>Press \"a\" for First class.\n\t>Press \"b\" for Premium Economy.\n\t>Press \"c\" for Bussiness.\n\t>Press \"d\" for Economy.\n\t==>Input class: ");
      String Class=sc.next();
    int p=0;
      while(temp10 != null) {
          if(temp10.data.substring(123, 166).toLowerCase().equals(user_req)){
                for(int i=p;i<arr.length;i++){
                  if(("qatar airways".equals(temp10.data.substring(10, 23).toLowerCase()) && i>0)){
                      int j=i;
                      while((!"qatar airways".equals(arr[j-1]))&&j>=0){
                          j--;
                      }
                      String tempr=arr[i];
                      arr[i]=arr[j+1];
                      arr[j+1]=tempr;
                      p++;
                      break;
                  }
                  else{
                      arr[i]=temp10.data;
                      p++;
                      break;
                  }
              }
          }
          temp10 = temp10.next10;
      }
      while(true){
        System.out.println("\t    Input no of passengers ");
        System.out.print("\n\tAdults( 16+ years) in your booking seats :");
        adults=sc.nextInt();
        System.out.print("\n\tTeenager(12-15 years) in your booking seats :");
        teenager=sc.nextInt();
        if(adults==0 && teenager==0){
            System.out.println("\n\t Note: Childrens and infants should be accompanied by an adult over 16 years of age when travelling.. so please input according to conditions!!");
            continue;
        }
        else if(teenager>0 && adults==0){
            System.out.println("\n\t Note: Childrens and infants should be accompanied by an adult over 16 years of age when travelling..");
            break;
        }
            System.out.print("\n\tChildrens(2-11 years){-20% on flight tickets} in your booking seats :");
            child=sc.nextInt();
            System.out.print("\n\tInfants(Under 2 years){-40% on flight tickets} in your booking seats :");
            infant=sc.nextInt();      
            break;        
      }
      //short listed flight printing according to their class    
      for(int k=0,m=6;k<arr.length && arr[k]!=null;k++,m++){
        switch(Class.toLowerCase()){
            
          case "a":
            //first class
              flight_seats=(arr[k].substring(35,45));
              flight_price=(arr[k].substring(75, 87));
              break;
          case "b":
            //premium economy
              flight_seats=(arr[k].substring(45,55));
              flight_price=(arr[k].substring(87, 99));
              break;          
          case "c":
            //bussiness
              flight_seats=(arr[k].substring(55,65));
              flight_price=(arr[k].substring(99, 111));
              break;
          case "d":
            //economy
              flight_seats=(arr[k].substring(65,75));
              flight_price=(arr[k].substring(111, 123));
              break;
          default:
              System.out.println("\tYou don't input the right class please first read instructions!!");
      }
        if(k==0){
            System.out.println("\n\t"+String.format("%-10s%-25s%-10s%-12s%-15s%-15s%-13s","Flight No","Airline","Seats","Price","Departure","Arrival","Depart Date"));
        }
            System.out.println("\t"+arr[k].substring(0, 35)+flight_seats+flight_price+arr[k].substring(123));     
            arr[m]=(arr[k].substring(0, 35)+flight_seats+flight_price+arr[k].substring(123));     
      }
          LinkedList<String>list2=new LinkedList<String>();
      System.out.print("\n\t==>Enter flight no you want to fly with: ");
      String flight_no=(String.format("%-10s", sc.next())).toUpperCase();
      for(int w=0,m=6;w<arr.length && arr[w]!=null;w++,m++){
          if(arr[w].substring(0, 10).equals(flight_no)){
              flight_seats=arr[m].substring(35,45);
              flight_price=arr[m].substring(45, 55);
              arr[10]=arr[w];
              p=Integer.parseInt(flight_price.substring(1).trim());
              if (child>0){
                  System.out.println("\n\t>Ticket Prices for childrens :$"+(p-((p*20)/100))+"After -20%");
              }
              if (infant>0){
                  System.out.println("\n\t>Ticket Prices for infants :$"+(p-((p*50)/100))+"After -50%");
              }
              System.out.println("");
              System.out.println("\tYou select flight "+arr[m]);
              break;
          }
         
      }
      p=Integer.parseInt(flight_seats.trim());
      if(p<infant+adults+child+teenager){
          System.out.println("\n\t=>!! Sorry "+infant+adults+child+teenager+" seats are not available in selected class of flight no "+flight_no+"<=");
      }
      else{
          p=p-(infant+adults+child+teenager);
          String l=String.format("%-10s", Integer.toString(p));          
      }
      System.out.println("\t==>Press \'1\' to go to user details forms");
      p=sc.nextInt();
      String name,gender,dof,nationality,pxd,tdt,pn,country;
      int adultf = adults+teenager, childf =child , infantf = infant;
        //int amount= 5000*adultf+2500*childf+4000*infantf;
        for (int i = 1; i <= adultf; i++) {
            System.out.println("\tPassenger " + i + " : Adults");

            System.out.print("\t   First Name : ");
            name=sc.next();

            System.out.print("\t   Gender : ");
            gender=sc.next();

            System.out.print("\t   Date Of Birth(DDMMYY) : ");
            dof=sc.next();

            System.out.print("\t   Nationality : ");
            nationality=sc.next();

            System.out.println("\t  Passport Details (Optional) ");
            System.out.print("\t   Passport Number : ");
            pn=sc.next();

            System.out.print("\t   Passport Expirt Date (DDMMYY) : ");
            pxd=sc.next();

            System.out.println("\t  Travel Document (Optional) ");
            System.out.print("\t   Travel Document Type : ");
            tdt=sc.next();
            System.out.print("\t   Country : ");
            country=sc.next();
                        list2.add(String.format("%-20s%-10s%-10s%-15s%-15s%-15s%-15s%-15s",name,gender,dof,nationality,pxd,pn,tdt,country));
        }

        for (int j = 1; j <= childf; j++) {

            System.out.println("\tPassenger " + j + " : Children");

            System.out.print("\t   First Name : ");
            name=sc.next();

            System.out.print("\t   Gender : ");
            gender=sc.next();

            System.out.print("\t   Date Of Birth(DDMMYY) : ");
            dof=sc.next();

            System.out.print("\t   Nationality : ");
            nationality=sc.next();

            System.out.println("\t  Passport Details (Optional) ");
            System.out.print("\t   Passport Number : ");
            pn=sc.next();

            System.out.print("\t   Passport Expiry Date (DDMMYY) : ");
            pxd=sc.next();
               System.out.print("\t   Country : ");
            country=sc.next();
         
            list2.add(String.format("%-20s%-10s%-10s%-15s%-15s%-15s-15s",name,gender,dof,nationality,pxd,pn,country));
        }
            
        for (int k = 1; k <= infantf; k++) {
             System.out.println("\tPassenger " + k + " : Infant");
            System.out.print("\t   First Name : ");
            name=sc.next();

            System.out.print("\t   Gender : ");
            gender=sc.next();

            System.out.print("\t   Date Of Birth(DDMMYY) : ");
            dof=sc.next();

            System.out.print("\t   Nationality : ");
            nationality=sc.next();

            System.out.println("\t  Passport Details (Optional) ");
            System.out.print("\t   Passport Number : ");
            pn=sc.next();

            System.out.print("\t   Passport Expirt Date (DDMMYY) : ");
            pxd=sc.next();
               System.out.print("\t   Country : ");
            country=sc.next();
         
            list2.add(String.format("%-20s%-10s%-10s%-15s%-15s%-15s-15s",name,gender,dof,nationality,pxd,pn,country));
    }  
         System.out.println("\t\tPAYMENT METHODS");
         System.out.println("\t1. CASH ");
         System.out.println("\t2. CARD ");
         System.out.println("\t3. ONLINE");
         int opt = sc.nextInt();
        switch(opt)  
        {
            case 1:  
              System.out.println("\tPlease come at nearest address"); 
              System.out.println("\tCollect your ticket"); 
              System.out.println("\t\t< Sector 14-B Gulshan e iqbal >");  
              System.out.println("\t\t< Sadar near International Market >"); 
              System.out.println("\t\t< North Karachi sector 15A-3 >");
              System.out.println("");  
              break;  
            case 2:  
                System.out.print("\t=>Enter the card number");
                int mm = sc.nextInt();
                System.out.println("\tType Yes if confirm ");
                System.out.println("\t\t1. yes ");
                System.out.println("\t\t2. no ");
                    int dec = sc.nextInt();
                    switch(dec)   
                    {  
                        case 1:  
                            System.out.println("\t=>Transaction Successful");  
                            break;  
                        case 2:  
                            System.out.println("\t=>Transaction Failed");  
                            break;    
                    }     
                    break;
            case 3:  
                System.out.println("\t\t1. Easypaisa");
                 System.out.println("\t\t 2. Paypal");
                int all = sc.nextInt();
                switch(all)
                {
                    case 1:
                        System.out.print("\t=>Enter Customer id: ");
                        int al = sc.nextInt();
                        System.out.println("\tType Yes if confirm ");
                System.out.println("\t\t1. yes ");
                System.out.println("\t\t2. no ");
                    int decs = sc.nextInt();
                    switch(decs)   
                    {  
                        case 1:  
                            System.out.println("\t=>Transaction Successful");  
                            break;  
                        case 2:  
                            System.out.println("\t=>Transaction Failed");  
                            break;    
                    }     
                    break;
                    case 2:
                        System.out.println("\t=>Enter Phone number: ");
                        int call = sc.nextInt();
                        System.out.println("\tType Yes if confirm ");
                System.out.println("\t\t1. yes ");
                System.out.println("\t\t2. no ");
                    int deca= sc.nextInt();
                    switch(deca)   
                    {  
                        case 1:  
                            System.out.println("\t=>Transaction Successful");  
                            break;  
                        case 2:  
                            System.out.println("\t=>Transaction Failed");  
                            break;    
                    }     
                    break;
                }break;

            default:  
            System.out.println("\t=>Invalid");  
            break;  
        }
                System.out.println("YOUR AMOUNT IS $"+((Integer.parseInt(flight_price.substring(1).trim())-((Integer.parseInt(flight_price.substring(1).trim())*20)/100)))+((Integer.parseInt(flight_price.substring(1).trim())*(adults+teenager)))+((Integer.parseInt(flight_price.substring(1).trim())-((Integer.parseInt(flight_price.substring(1).trim())*50)/100))));
  System.out.println("  PRINT TICKETS [Y/N]");
    String z;
    z=sc.next().toLowerCase();
    int u=adults+teenager+child+infant;
    if ("y".equals(z)){
        for(int i=0;i<u;i++){
        System.out.println("\t\t\t==============================================");
        System.out.println("\t\t\t\t\tTICKET  "+i+1);
        System.out.println("\t\t\t==============================================");
        System.out.println("\t\t\t  NAME OF PASSANGER  : "+list2.get(i).substring(0, 20));
        System.out.println("\t\t\t        GENDER       : "+list2.get(i).substring(20, 30));
        System.out.println("\t\t\t    DATE OF BIRTH    : "+list2.get(i).substring(30, 40));
        System.out.println("\t\t\t      NATIONALITY    : "+list2.get(i).substring(40, 55));
        int SN= 25+i;
        System.out.println("\t\t\t      SEAT NUMBER    : "+SN);
        System.out.println("\t\t\t   PASSPORT NUMBER   : "+list2.get(i).substring(70, 85));
        System.out.println("\t\t\tPASSPORT EXPIRE DATE : "+list2.get(i).substring(55, 70));
        System.out.println("\t\t\tTRAVEL DOCUMENT TYPE : "+" Tourist ");
        System.out.println("\t\t\t       COUNTRY       : "+list2.get(i).substring(85, 100));
        System.out.println("\t\t\t  \t\tNOTE ");
        System.out.println("\t\t\t GATE CLOSES 40 MINUTES BEFORE DEPARTURE");
        System.out.println("\t\t\t=============================================");
        }
    }
    else
        System.out.println("");
  }}
