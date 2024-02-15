public class Main {
    public static void main(String[] args) {

        /*
        * Abstract sınıflar asla 'NEW' edilemezler.
        *
        * */
        WomenGameCalculator womenGameCalculator=new WomenGameCalculator();
        womenGameCalculator.hesapla();
        womenGameCalculator.gameOver();

        GameCalculator gameCalculator=new KidsGameCalculator();
        gameCalculator.hesapla();











//        Kullanışsız
//        GameCalculator gameCalculator=new GameCalculator() {
//            @Override
//            public void hesapla() {
//
//            }
//        };
    }
}