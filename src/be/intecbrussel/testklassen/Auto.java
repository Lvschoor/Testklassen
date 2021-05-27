package be.intecbrussel.testklassen;

public class Auto {

    private String merknaam;
    private String nummerplaat;
    private Motor motor;

    public Auto() {
        motor=new Motor();
    }

    public Auto(String merknaam, String nummerplaat) {
        this();
        this.merknaam = merknaam;
        this.nummerplaat = nummerplaat;
    }

    public Auto(String merknaam) {
        this();
        this.merknaam = merknaam;
    }

    public Auto(Auto a) {
        this();
        this.merknaam=a.merknaam;
        this.nummerplaat=a.nummerplaat;
        this.motor=a.motor;
    }

    public void geefGas(){
        this.motor.verhoogToerental(200);

    }
    public void geefGas(int boost){
        this.motor.verhoogToerental(boost);

    }

    public void rem(){
        this.motor.setToerental(0);
    }
    public void toonToerental(){
        System.out.println(motor.getToerental());;
    }
    public String toString(){
        return merknaam+ " met kenteken " + nummerplaat;
    }
}
