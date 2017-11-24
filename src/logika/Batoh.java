package logika;
import java.util.*;
<<<<<<< HEAD
import utils.Observer;
import utils.Subject;

=======
<<<<<<< HEAD
import utils.Observer;
import utils.Subject;

=======
<<<<<<< HEAD
import utils.Observer;
import utils.Subject;

=======
>>>>>>> 84e2cb3ac0da5b770ecfef7482933ca6c094e328
>>>>>>> b30397b76354f2d5c8ef534e953fbbe54af07007
>>>>>>> 7e732e0853e371a08a52ba452a3547805184f15c


/**
 * Třída batoh popisuje herní batoh a jeho metody. Intance této třídy je vytvořena ve třídě herní plán,
 * která také obsahuje metodu getBatoh(), jež slouží pro sdílení jednoho stejného batohu ve všech třídách
 * hry a umožňuje jim tak s batohem manipulovat pomocí metod definovaných v této třídě.
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> b30397b76354f2d5c8ef534e953fbbe54af07007
>>>>>>> 7e732e0853e371a08a52ba452a3547805184f15c
 * Nově třída Batoh implementuje rozhraní Subject a je předmětem pozorování pro observery ListVeciProstor a
 * ListBatoh. Notifikovat všechny pozorovatele je potřeba v případě odebrání věci z batohu a při přidání věci
 * do batohu (zavolat metodu update() u všech observerů).
 * 
 * @Monika Dokoupilová 
 * @version 2.0.0
 */
public class Batoh implements Subject
{
     private Set<Vec> veciVBatohu ;
     private int limit = 3; // limit batohu jsou 3 věci
    
     private List<Observer> listObserveru = new ArrayList<Observer>();

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
 * 
 * 
 * @Monika Dokoupilová 
 * @version 1.0.0
 */
public class Batoh
{
     private Set<Vec> veciVBatohu ;
     private int limit = 3; // limit batohu jsou 3 věci
>>>>>>> 84e2cb3ac0da5b770ecfef7482933ca6c094e328
>>>>>>> b30397b76354f2d5c8ef534e953fbbe54af07007
>>>>>>> 7e732e0853e371a08a52ba452a3547805184f15c

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
<<<<<<< HEAD
     * Při vložení věci do batohu se notifikují observeři.
=======
<<<<<<< HEAD
     * Při vložení věci do batohu se notifikují observeři.
=======
<<<<<<< HEAD
     * Při vložení věci do batohu se notifikují observeři.
=======
     * 
>>>>>>> 84e2cb3ac0da5b770ecfef7482933ca6c094e328
>>>>>>> b30397b76354f2d5c8ef534e953fbbe54af07007
>>>>>>> 7e732e0853e371a08a52ba452a3547805184f15c
     * @param vec - věc vkládaná do batohu
     * @return vrací výsledek vložení true/false
     */
    public boolean vlozDoBatohu(Vec vec)
    {
<<<<<<< HEAD
       if(this.jePlno() == false){
        veciVBatohu.add(vec);
        notifyAlllObservers();
=======
<<<<<<< HEAD
       if(this.jePlno() == false){
        veciVBatohu.add(vec);
        notifyAlllObservers();
=======
<<<<<<< HEAD
       if(this.jePlno() == false){
        veciVBatohu.add(vec);
        notifyAlllObservers();
=======
        // zavola se pri prikazu seber na prenositelnou vec prida vec pokud neni plno
        if(this.jePlno() == false){
        veciVBatohu.add(vec);
>>>>>>> 84e2cb3ac0da5b770ecfef7482933ca6c094e328
>>>>>>> b30397b76354f2d5c8ef534e953fbbe54af07007
>>>>>>> 7e732e0853e371a08a52ba452a3547805184f15c
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
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> b30397b76354f2d5c8ef534e953fbbe54af07007
>>>>>>> 7e732e0853e371a08a52ba452a3547805184f15c
     * Při odebrání věci z batohu se notifikují observeři.
     * @param nazev - název odebírané věci
     * @return vrací výsledek odebrání
     */
    public boolean odeberZBatohu(String nazev){ 
      Vec odebirana = null;

     for(Vec vec: veciVBatohu){
       if(nazev.equals(vec.getNazev())){
          odebirana = vec;  
          veciVBatohu.remove(odebirana);
          notifyAlllObservers(); 
          return true; 
       }
     }
    
     notifyAlllObservers(); 
     return veciVBatohu.remove(odebirana); 
      
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
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
>>>>>>> 84e2cb3ac0da5b770ecfef7482933ca6c094e328
>>>>>>> b30397b76354f2d5c8ef534e953fbbe54af07007
>>>>>>> 7e732e0853e371a08a52ba452a3547805184f15c
    }
  
    /**
     * Metoda vypisuje názvy věcí v batohu opět pomocí cyklu foreach.
     * 
     * @return vrací výpis věcí v batohu
     */
    public String vypisVeci(){
       //vypis veci v batohu
<<<<<<< HEAD
       String vypis = "Věci v batohu:"+"\n";
        for (Vec vec : veciVBatohu) {
            vypis += " " + vec.getNazev()+"\n";
=======
<<<<<<< HEAD
       String vypis = "Věci v batohu:"+"\n";
        for (Vec vec : veciVBatohu) {
            vypis += " " + vec.getNazev()+"\n";
=======
<<<<<<< HEAD
       String vypis = "Věci v batohu:"+"\n";
        for (Vec vec : veciVBatohu) {
            vypis += " " + vec.getNazev()+"\n";
=======
       String vypis = "Věci v batohu:";
        for (Vec vec : veciVBatohu) {
            vypis += " " + vec.getNazev();
>>>>>>> 84e2cb3ac0da5b770ecfef7482933ca6c094e328
>>>>>>> b30397b76354f2d5c8ef534e953fbbe54af07007
>>>>>>> 7e732e0853e371a08a52ba452a3547805184f15c
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
<<<<<<< HEAD
        Vec hledana = null;
=======
<<<<<<< HEAD
        Vec hledana = null;
=======
<<<<<<< HEAD
        Vec hledana = null;
=======
       Vec hledana = null;
>>>>>>> 84e2cb3ac0da5b770ecfef7482933ca6c094e328
>>>>>>> b30397b76354f2d5c8ef534e953fbbe54af07007
>>>>>>> 7e732e0853e371a08a52ba452a3547805184f15c
      for(Vec vec: veciVBatohu){
       if(nazev.equals(vec.getNazev())){
          hledana = vec;               
       }  
      }
      return hledana;
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> b30397b76354f2d5c8ef534e953fbbe54af07007
>>>>>>> 7e732e0853e371a08a52ba452a3547805184f15c
    
    
    /**
     * Metoda vrací set věcí v batohu.
     * 
     * @return vrací set věcí v batohu.
     */ 
    public Set<Vec> getVeciVBatohu(){ //testovani kapacity batohu
       return this.veciVBatohu;
    }
    /**
     * Metoda registruje observera k pozorování událostí týkajícíh se batohu.
     * @param observer - parametrem je observer (instance třídy, která pozoruje).
     */ 
    @Override
    public void registerObserver(Observer observer) {
        listObserveru.add(observer);
    }
    /**
     * Metoda ruší registraci observera k pozorování událostí týkajícíh se batohu.
     * @param observer - parametrem je observer (instance třídy, která pozoruje).
     */ 
    @Override
    public void deleteObserver(Observer observer) {
        listObserveru.remove(observer);

    }
    /**
     * Metoda notifikuje všechny observery = volá na ně metodu update().
     */ 
    @Override
    public void notifyAlllObservers() {
        for (Observer listObserveruItem : listObserveru) {
            listObserveruItem.update();
        }
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
>>>>>>> 84e2cb3ac0da5b770ecfef7482933ca6c094e328
>>>>>>> b30397b76354f2d5c8ef534e953fbbe54af07007
>>>>>>> 7e732e0853e371a08a52ba452a3547805184f15c
   
}
