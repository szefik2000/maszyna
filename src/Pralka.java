public class Pralka {
    private int tryb = 0;

    public int program(int numer){

        if (numer >= 1 && numer <= 12){
            tryb = numer;
        }
        else {
            tryb = 0;
        }
        return tryb;
    }
}
