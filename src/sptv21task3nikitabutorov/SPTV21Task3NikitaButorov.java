/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv21task3nikitabutorov;

import java.util.Scanner;

/**
 *
 * @author Nikita Butorov
 */
public class SPTV21Task3NikitaButorov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scanner.next();
        System.out.println("Surname: ");
        String surname = scanner.next();
        System.out.println("Isikukood: ");
        String isikukood = scanner.next();
        String year1 = isikukood.substring(0,1);
        String year2 = isikukood.substring(1,3);
        String mounth = isikukood.substring(3,5);
        String day = isikukood.substring(5,7);
        int yearint = new Integer(year1);
        int intmounth = new Integer(mounth);
        String year3="0";
                
        if(yearint%2!=0){
            year1="Мужчина"; 
        }else{
            year1="Женщина";
        }
        if(yearint==1){
            year3="18";
        } else if (yearint==3){
            year3="19";
        } else if(yearint==5){
            year3="20"; 
        }
        if(year1=="Женщина"){
            year1="родилась";
        }else{
            year1="родился";
        }
            
        if(intmounth==1){
            mounth="января";
        }else if(intmounth==2){
            mounth="февраля";
        }else if(intmounth==3){
            mounth="марта";
        }else if(intmounth==4){
            mounth="апреля";
        }else if(intmounth==5){
            mounth="мая";
        }else if(intmounth==6){
            mounth="июня";
        }else if(intmounth==7){
            mounth="июля";
        }else if(intmounth==8){
            mounth="августа";
        }else if(intmounth==9){
            mounth="сентября";
        }else if(intmounth==10){
            mounth="октября";
        }else if(intmounth==11){
            mounth="ноября";
        }else {
            mounth="декабря";
        }
        
        System.out.printf("%1$1s %2$1s %3$1s %4$1s %5$1s %6$1s%7$1s года", name,surname,year1,day,mounth,year3,year2);
    
    
    
        // TODO code application logic here
    }
    
}
