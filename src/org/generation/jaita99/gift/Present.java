package org.generation.jaita99.gift;

import java.util.ArrayList;
import java.util.Scanner;

public class Present {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        boolean flag=false;
        Scanner scan = new Scanner(System.in);
        while(flag==false) {
            System.out.println("Inserisci un regalo");
        String gift=scan.nextLine();
        if(list.contains(gift)) {
            System.out.println("regalo già inserito");
        }
        else {
            list.add(gift);
            System.out.println("Vuoi inserire un altro regalo? y/n");
            String choice=scan.nextLine();
            if(choice.equals("n")) {
                flag=true;
            }
        }
        }

        System.out.println(list);


    }
}
