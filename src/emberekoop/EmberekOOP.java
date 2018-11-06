package emberekoop;


public class EmberekOOP {

    
    public static void main(String[] args) {
        Ember fejlec = new  Ember("Név","SzülDátum","SzülHely");
        Ember akos = new Ember("Ákos Ő","1999-09-09","Bukarest");
        Ember laszlo = new Ember("Debeczeni László","1996-01-13","Budapest");
        Ember niki = new Ember("Gáti Nikolett","2005-03-23","Budapest");
        System.out.println(fejlec);
        System.out.println(akos);
        System.out.println(laszlo);
        System.out.println(niki);
        System.out.print(laszlo.szuletesiEv()+"-");
        System.out.print(laszlo.szuletesiHonap()+"-");
        System.out.println(laszlo.szuletesiNap());
        
        Emberek sokember = new Emberek();
        System.out.println(sokember);
        Emberek nagyonsokember = new Emberek("emberek.txt");
        System.out.println(nagyonsokember);
    }
    
}
