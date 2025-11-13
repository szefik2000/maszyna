public class Odkurzacz extends Bazowa{
    boolean stan = false;

    public boolean on(){
        if(stan == false){
            stan = true;
            wyswietlanie("Włączono odkurzacz");
        }
        return stan;
    }

    public boolean off(){
        if(stan == true){
            stan = false;
            wyswietlanie("Wyłączono odkurzacz");
        }
        return stan;
    }
}
