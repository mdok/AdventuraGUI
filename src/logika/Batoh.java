package logika;
import java.util.*;


/**
 * Třída batoh popisuje herní batoh a jeho metody. Intance této třídy je vytvořena ve třídě herní plán,
 * která také obsahuje metodu getBatoh(), jež slouží pro sdílení jednoho stejného batohu ve všech třídách
 * hry a umožňuje jim tak s batohem manipulovat pomocí metod definovaných v této třídě.
 * 
 * 
 * @Monika Dokoupilová 
 * @version 1.0.0
 */
public class Batoh
{
     private Set<Vec> veciVBatohu ;
     private int limit = 3; // limit batohu jsou 3 věci

    /**
     * Batohu je definován limit věcí, které může obsahovat a je realizován jako HashSet.
     */
    public Batoh()
    {
        veciVBatohu = new HashSet<>();// zalozeni seznamu veci
        this.limit = 3; //limit batohu

    }

    /**
     * Metoda vkládá věc do batohu a ověřuje pomocí metody jePlno() zda batoh již není plný.
     * Návratová hodnota je typu boolean. V případě úspěšného vložení vrací true. V opačném případě false.
     * 
     * @param vec - věc vkládaná do batohu
     * @return vrací výsledek vložení true/false
     */
    public boolean vlozDoBatohu(Vec vec)
    {
        // zavola se pri prikazu seber na prenositelnou vec prida vec pokud neni plno
        if(this.jePlno() == false){
        veciVBatohu.add(vec);
        return true;
       }
       else{
           return false;
        }
    }
    
     /**
     * Metoda odebírá věc daného názvu z batohu. Postupně prochází věci v batohu pomocí cyklu foreach,
     * zjišťuje jejich název a porovnává jej s názvem věci, kterou se hráč snaží odebrat z batohu.
     * V případě shody se věc odebere z batohu a metoda vrátí hodnotu true. V opačném případě vrací false.
     * 
     * @param nazev - název odebírané věci
     * @return vrací výsledek odebrání
     */
    public boolean odeberZBatohu(String nazev){ //* odebrani veci z batohu porovnani nazvu pres equals na shodnost veci
      Vec odebirana = null;
     for(Vec vec: veciVBatohu){
       if(nazev.equals(vec.getNazev())){
          odebirana = vec;               
       }  
     }
     return veciVBatohu.remove(odebirana);
    }
  
    /**
     * Metoda vypisuje názvy věcí v batohu opět pomocí cyklu foreach.
     * 
     * @return vrací výpis věcí v batohu
     */
    public String vypisVeci(){
       //vypis veci v batohu
       String vypis = "Věci v batohu:";
        for (Vec vec : veciVBatohu) {
            vypis += " " + vec.getNazev();
        }
        return vypis;
       
    }
   
    /**
     * Metoda testuje zda je batoh plný. 
     * 
     * @return vrací true pokud je batoh plný a false pokud ne
     */
    public boolean jePlno(){ //testovani kapacity batohu
       if (veciVBatohu.size() < limit){
           return false;
        }
       return true;
    }
    
    /**
     * Metoda vrací proměnou limit, která reprezentuje limit batohu = kolik věcí lze maximálně do batohu vložit
     * 
     * @return vrací hodnotu proměnné limit 
     */
    public int getLimit(){ //testovani kapacity batohu
       return this.limit;
    }
    
    /**
     * Metoda vrací věc z batohu na základě zadaného názvu věci a jeho porovnávání s názvy věcí v batohu 
     * realizovaného pomocí cyklu foreach.
     * 
     * @param nazev - název hledané věci v batohu
     * @return vrací instanci třídy Vec, konkrétně hledanou věc
     */ 
    public Vec getVec(String nazev){  //vraceni veci  z batohu podle nazvu
       Vec hledana = null;
      for(Vec vec: veciVBatohu){
       if(nazev.equals(vec.getNazev())){
          hledana = vec;               
       }  
      }
      return hledana;
    }
   
}
