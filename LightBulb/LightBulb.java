
public class LightBulb {

    boolean Condition = false;
    int CurrentU = 0;
    int MaxU = 230;

    void zapal() {
        this.Condition = true;
        this.CurrentU = MaxU;
    }

    void zgas() {
        this.Condition = false;
        this.CurrentU = 0;
    }

    void drukujStan() {
        if(Condition == true)	System.out.print("Zapalona, ");
        else	System.out.print("Zgaszona, ");
        System.out.println("Aktualne napięcie: " + this.CurrentU + " V");
        System.out.println("Maksymalne napięcie: " + this.MaxU + " V");}

    LightBulb(int napAkt, int napMaks){
        this.MaxU = napMaks;
        this.CurrentU = napAkt;
        if(napAkt != 0) this.Condition=true;
    }

    LightBulb(){}


}
