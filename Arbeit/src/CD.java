public class CD extends Medien{
    // Unterklasse CD der Oberklasse Medien
    boolean isLP;

    public CD(String titel, int FSK, int laenge, boolean verliehen, boolean isLP){
        super(titel, FSK, laenge, verliehen);
        setLP(isLP);
    }
    public void setLP(boolean isLP) {
        this.isLP = isLP;
    }
    public boolean getIsLP(){
        return isLP;
    }

    // Methode zeigeDaten gibt, wenn aufgerufen, alle gegebenen Daten aus, inlusive der jeweiligen unterschiedlichen Eigenschaften
    public void zeigeDaten(){
        System.out.println(getTitel() + " " + getFSK() + " " + getLaenge() + " " + " " + getIsLP());
    }

}
