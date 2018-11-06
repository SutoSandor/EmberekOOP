/*7
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emberekoop;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Emberek {
    private List<Ember> embereklista;
    public Emberek(){
        String[] nevek ={"Kis Géza","Hódító Sándor","Lakatos Evelin","Józsi brácsa","Ödönné Ödönika"};
        String[] szuldatum = {"1990-02-31","1990-12-11","1960-03-31","1912-10-01","1977-06-05"};
        String[] szulhely = {"Békéscsaba","Szolnok","Gomba","Bugyi","Heréd"};
        
        this.embereklista = new ArrayList<>();
        for (int i = 0; i < nevek.length; i++) {
            this.embereklista.add(new Ember(nevek[i],szuldatum[i],szulhely[i]));
        }
    }
     @Override
        public String toString(){
            String s = "";
            for (Ember e: this.embereklista) {
             s += e+"\n";
         }
            return s;
        }
    public Emberek(String fajl){
        try{
        FileReader fr = new FileReader(fajl);
        BufferedReader br = new BufferedReader(fr);
        fr.close();
        String sor = br.readLine();
            while(sor!=null){
                this.embereklista.add(new Ember(sor));
                 sor = br.readLine();
            }
        }
        catch(Exception ex){
            System.out.println("Hiba" + ex);
        } 
    }
    public int adotthonapbanszuletettekszama(int honap){
        int db = 0;
        for (int i = 0; i < this.embereklista.size(); i++) {
            if (this.embereklista.get(i).szuletesiHonap() == honap) {
                db++;
            }
        }
        return db;
    }
    public int atlagEletkor(){
        int evek = 0;
        for (int i = 0; i < this.embereklista.size(); i++) {
            evek += this.embereklista.get(i).eletrok();
        }
        return evek / this.embereklista.size();
    }
    public Ember legfiatalabb(){
        int min = 0;
        for (int i = 1; i < this.embereklista.size(); i++) {
            if (this.embereklista.get(i).eletrok() < this.embereklista.get(min).eletrok()) {
                min = i;
            }
        }
        return this.embereklista.get(min);
    }
    
}
