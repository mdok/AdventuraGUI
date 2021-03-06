package logika;

/**
 *  Třída Hra - třída představující logiku adventury.
 * 
 *  Toto je hlavní třída  logiky aplikace.  Tato třída vytváří instanci třídy HerniPlan, která inicializuje mistnosti hry
 *  a vytváří seznam platných příkazů a instance tříd provádějící jednotlivé příkazy.
 *  Vypisuje uvítací a ukončovací text hry.
 *  Také vyhodnocuje jednotlivé příkazy zadané uživatelem.
 *
 *@author     Michael Kolling, Lubos Pavlicek, Jarmila Pavlickova, Monika Dokoupilová
 *@version    1.0.0
 */

public class Hra implements IHra {
    private SeznamPrikazu platnePrikazy;    // obsahuje seznam přípustných příkazů
    private HerniPlan herniPlan;
    private boolean konecHry = false;

    

    /**
     *  Vytváří hru a inicializuje místnosti (prostřednictvím třídy HerniPlan) a seznam platných příkazů.
     */
    public Hra() {
        herniPlan = new HerniPlan();
        platnePrikazy = new SeznamPrikazu();
        
        platnePrikazy.vlozPrikaz(new PrikazNapoveda(platnePrikazy));
        platnePrikazy.vlozPrikaz(new PrikazJdi(herniPlan));
        platnePrikazy.vlozPrikaz(new PrikazKonec(this));
        platnePrikazy.vlozPrikaz(new PrikazSeber(herniPlan));
        platnePrikazy.vlozPrikaz(new PrikazOdeber(herniPlan));
        platnePrikazy.vlozPrikaz(new PrikazBatoh(herniPlan));
        platnePrikazy.vlozPrikaz(new PrikazPromluv(herniPlan));
        platnePrikazy.vlozPrikaz(new PrikazDej(herniPlan));
        platnePrikazy.vlozPrikaz(new PrikazProzkoumat(herniPlan));
        platnePrikazy.vlozPrikaz(new PrikazVymenit(herniPlan));
        platnePrikazy.vlozPrikaz(new PrikazOdevzdat(herniPlan,this));
    }

    /**
     *  Vrátí úvodní zprávu pro hráče.
     *  
     *  @return úvodní text pro hráče
     */
    public String vratUvitani() {
        return "Vítejte v mé malé adventůře!\n" +
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> b30397b76354f2d5c8ef534e953fbbe54af07007
>>>>>>> 7e732e0853e371a08a52ba452a3547805184f15c
               "Malý kocourek Quido je studentem pražské VŠE fakulty \n" +
               "Informatiky a statistiky. Je to pilný a šikovný student,a tak odevzdává všechny \n" +
               "úkoly včas do odevzdávárny.\n" +
               "Teď musí včas odevzdat úkol z programování.Jelikož je Quido pilný student,\n" +
               " má úkol dávno hotový.Chybí jen ho vložit do odevzdávárny.....\n\n" +
               "Ale nééé! Nefunguje mi internet! Jak jen teď úkol odevzdám!\n" +
               "Musím si ho zprovoznit! U mě doma se zdá být vše v pořádku.. \n" +
               "Problém musí být jinde..\n\n" +
               "Tuhle záhadu já vyřešit dokážu! Hurá do boje za konektivnější zítřky!\n\n\n" +
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
               "Malý kocourek Quido je studentem pražské VŠE fakulty Informatiky a statistiky.\n" +
               "Je to pilný a šikovný student a tak odevzdává všechny úkoly včas do odevzdávárny.\n" +
               "Teď musí včas odevzdat úkol z programování. Jelikož je Quido pilný student, má úkol dávno hotový.\n" +
               "Chybí jen ho vložit do odevzdávárny.....\n" +
               "Ale nééé! Nefunguje mi internet! Jak jen teď úkol odevzdám!\n" +
               "Musím si ho zprovoznit! U mě doma se zdá být vše v pořádku.. Problém musí být jinde.\n" +
               "Tuhle záhadu já vyřešit dokážu! Hurá do boje za konektivnější zítřky!\n\n" +
>>>>>>> 84e2cb3ac0da5b770ecfef7482933ca6c094e328
>>>>>>> b30397b76354f2d5c8ef534e953fbbe54af07007
>>>>>>> 7e732e0853e371a08a52ba452a3547805184f15c
               "Napište 'nápověda', pokud si nevíte rady, jak hrát dál.\n" +
               "\n" +
               herniPlan.getAktualniProstor().dlouhyPopis() + "\n";
    }
    
    /**
     *  Vrátí závěrečnou zprávu pro hráče.
     *  
     *  @return epilog
     */
    public String vratEpilog() {
        return "Tak zas někdy jindy!";
    }
    
    /** 
     * Vrací true, pokud hra skončila.
     * 
     * @return vrací jestli je konec hry
     */
     public boolean konecHry() {
        return konecHry;
    }

    /**
     *  Metoda zpracuje řetězec uvedený jako parametr, rozdělí ho na slovo příkazu a další parametry.
     *  Pak otestuje zda příkaz je klíčovým slovem  např. jdi.
     *  Pokud ano spustí samotné provádění příkazu.
     *  
     *  Pokud je konec hry zjišťuje se zda se  jedná o výhru (getVyhra vratí true v případě, že proběhla
     *  úspěšná výměna modulu SFP v příkazu výměna) a vypíše se příslušný výpis. Pokud se o výhru nejedná
     *  vypíše se výpis klasického konce hry (ukončení příkazem konec)
     *
     *@param  radek  text, který zadal uživatel jako příkaz do hry.
     *@return          vrací se řetězec, který se má vypsat na obrazovku
     */
     public String zpracujPrikaz(String radek) {
        String [] slova = radek.split("[ \t]+");
        String slovoPrikazu = slova[0];
        String []parametry = new String[slova.length-1];
        for(int i=0 ;i<parametry.length;i++){
            parametry[i]= slova[i+1];   
        }
        String textKVypsani=" .... ";
        if (platnePrikazy.jePlatnyPrikaz(slovoPrikazu)) {
            IPrikaz prikaz = platnePrikazy.vratPrikaz(slovoPrikazu);
            textKVypsani = prikaz.provedPrikaz(parametry);
        }
        else {
            textKVypsani="Nevím co tím myslíš? Tento příkaz neznám. " + "\n";
        }
        
        if (konecHry == true && herniPlan.getVyhra() == true){ //pokud je hra ukončena a je výhra metoda getVyhra se nachází v herním plánu a je volána v příkazu výměna (setVyhra)
<<<<<<< HEAD
           textKVypsani= "Uff... Hotovo a odevzdáno! Internet funguje jako na drátkách,\n" +"ale byla to dřina!" + "\n"+ 
=======
<<<<<<< HEAD
           textKVypsani= "Uff... Hotovo a odevzdáno! Internet funguje jako na drátkách,\n" +"ale byla to dřina!" + "\n"+ 
=======
<<<<<<< HEAD
           textKVypsani= "Uff... Hotovo a odevzdáno! Internet funguje jako na drátkách,\n" +"ale byla to dřina!" + "\n"+ 
=======
           textKVypsani= "Uff... Hotovo a odevzdáno! Internet funguje jako na drátkách, ale byla to dřina!" + "\n"+ 
>>>>>>> 84e2cb3ac0da5b770ecfef7482933ca6c094e328
>>>>>>> b30397b76354f2d5c8ef534e953fbbe54af07007
>>>>>>> 7e732e0853e371a08a52ba452a3547805184f15c
                        "Děkuji za pomoc bez tebe by to nešlo!" + "\n"+"Gratulujeme vyhral jsi!"+ "\n";
            
        }
        if(konecHry == true && herniPlan.getVyhra() != true){ //pokud je hra ukončena ale nejedná se o výhru
            textKVypsani= "Děkuji že jsi si zahrál mou adventuru! Třeba zkusíš štěstí někdy příště.." + "\n";
            
        }

        return textKVypsani;
    }
    
    
     /**
     *  Nastaví, že je konec hry, metodu využívá třída PrikazKonec,
     *  mohou ji použít i další implementace rozhraní Prikaz.
     *  
     *  @param  konecHry  hodnota false= konec hry, true = hra pokračuje
     */
    void setKonecHry(boolean konecHry) {
        this.konecHry = konecHry;
    }
    
     /**
     *  Metoda vrátí odkaz na herní plán, je využita hlavně v testech,
     *  kde se jejím prostřednictvím získává aktualní místnost hry.
     *  
     *  @return     odkaz na herní plán
     */
     public HerniPlan getHerniPlan(){
        return herniPlan;
     }
    
}

