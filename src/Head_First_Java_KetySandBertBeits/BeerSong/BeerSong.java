package Head_First_Java_KetySandBertBeits.BeerSong;
// 99 Bottles of Beer
public class BeerSong {
    public static void main (String[] args) {
        int beerNum = 99;
        String word = "bottles";
        while (beerNum > 0) {
            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum = beerNum - 1;
            if (beerNum == 1) {
                word = "bottle";
            } else if (beerNum == 0) {
                word = "no more bottles";
            } else {
                word = "bottles";
            }
            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " of beer on the wall.");
            } else {
                System.out.println(word + " of beer on the wall.");
            }
            System.out.println();
        }
        System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
    }
}
