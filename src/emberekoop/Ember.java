package emberekoop;

import java.time.LocalDateTime;

public class Ember {
    //adattagok
    private String nev;
    private String szuldatum;
    private String szulhely;
    
    //osztály metódusok
    
    //Konstruktór
    public Ember(){ //default konstruktór
        
    }
    
    public Ember(String nev, String szuldatum, String szulhely){
        this.nev = nev;
        this.szuldatum = szuldatum;
        this.szulhely = szulhely;
    }
    @Override
    public String toString(){
        return String.format("%-25s %-10s %-20s",this.nev, this.szuldatum, this.szulhely);
    }
    public int szuletesiEv(){
        return Integer.parseInt(this.szuldatum.substring(0,4));
    }
    public int szuletesiHonap(){
        String[] adatok = szuldatum.split("-");
        return Integer.parseInt(adatok[1]);
    }
    public int szuletesiNap(){
        String[] adatok = szuldatum.split("-");
        return Integer.parseInt(adatok[2]);
    }
    public int eletrok(){
        return LocalDateTime.now().getYear() - this.szuletesiEv();
    }
    public Ember(String adatsor){
        String[] adatok = adatsor.split(";");
        this.nev = adatok[0];
        this.szuldatum = adatok[1];
        this.szulhely = adatok[2];
    }
}
