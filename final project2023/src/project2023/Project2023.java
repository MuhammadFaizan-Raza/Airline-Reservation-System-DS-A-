/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project2023;

import java.util.Scanner;

/**
 *
 * @author MUHAMMAD FAIZAN
 */
public class Project2023 {
   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\t\t\t=========================================");
        System.out.println("\t\t\t  Airline Reservation System");
        System.out.println("\t\t\t=========================================");
        //implementation i_Obj=new implementation();
        linkedlist_all l_obj=new linkedlist_all();
        Scanner sc=new Scanner(System.in);
        available_airlines_data a_d=new available_airlines_data();
        System.out.print("\t==>Departure:(city) ");
       String depart=sc.next();
       System.out.print("\n\t==>Arrival:(city) ");
       String arrival=sc.next();
       if((!"islamabad".equals(arrival))&&(!"newyork".equals(arrival))&&(!"london".equals(arrival))&&(!"moscow".equals(arrival))&&(!"istanbul".equals(arrival))&&(!"paris".equals(arrival))&&(!"dubai".equals(arrival))&&(!"beijing".equals(arrival))&&(!"tokyo".equals(arrival))&&(!"islamabad".equals(depart))&&(!"newyork".equals(depart))&&(!"london".equals(depart))&&(!"moscow".equals(depart))&&(!"istanbul".equals(depart))&&(!"paris".equals(depart))&&(!"dubai".equals(depart))&&(!"beijing".equals(depart))&&(!"tokyo".equals(depart))){
                      System.out.println("Sorry No flights available for "+arrival+" Mismatch city");
       }
       else{
       System.out.print("\n\t==>Date:e.g(24/01/2023) ");
       String date=sc.next();
       if(((Integer.parseInt(date.substring(6,10))>2023))||((Integer.parseInt(date.substring(6,10))<2023))){
           System.out.println("No flights available on date "+date);
       }
       else if(((Integer.parseInt(date.substring(3,5))>01))||((Integer.parseInt(date.substring(3,5))<01))){
           System.out.println("No flights available on date "+date);
       }
       else if((!"24".equals(date.substring(0,2)))||((!"25".equals(date.substring(0,2))))||((!"26".equals(date.substring(0,2))))||((!"27".equals(date.substring(0,2))))){
           System.out.println("No flights available on date "+date);
       }
       else{
       String user_req=(String.format("%-15s%-15s%-13s",depart,arrival,date )).toLowerCase();
     a_d.addToNode(user_req);
       }
       }
        
        
       

       
    }
    
}
    
