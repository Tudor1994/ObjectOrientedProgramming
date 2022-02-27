package ro.itschool.Magazin;

import java.util.Scanner;

public class Magazin {

    private String name;
    private boolean deschis;

    public Magazin(String name){
        this.name = name;
        this.deschis = true;

    }

    public void setName(String name){
        this.name = name;
    }

    public void inchideMagazin(){
        this.deschis = false;
    }

    public void deschideMagazin(){
        this.deschis = true;
    }

    public void vinde(){
        if(this.deschis == false){
            System.out.println("Magazinul este inchis!");
        }else {
            System.out.println("Ce doresti sa cumperi?");
            Scanner cititor = new Scanner(System.in);
            String produs = cititor.nextLine();
            System.out.println("Felicitari ai cumparat: " + produs);
        }
    }
}
