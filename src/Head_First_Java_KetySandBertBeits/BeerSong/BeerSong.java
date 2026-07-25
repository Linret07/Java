package Head_First_Java_KetySandBertBeits.BeerSong;
// 99 Bottles of Beer
public class BeerSong {
    public static void main (String[] args) {
        // 1. Створюємо лічильник пляшок і ставимо початкове значення 99
        int beerNum = 99;
        // 2. Створюємо текстову змінну для правильного відмінювання (множина за замовчуванням)
        String word = "bottles";
        // 3. Запускаємо цикл: виконувати код всередині {}, поки кількість пляшок більша за 0
        while (beerNum > 0) {
            // Виводимо перші два рядки поточного куплету
            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            // 4. Зменшуємо кількість пляшок на одну після того, як одну "впустили"
            beerNum = beerNum - 1;
            // 5. Перевіряємо, скільки пляшок залишилося НА СТІНІ для наступного рядка
            if (beerNum == 1) {
                // Якщо залишилася 1, міняємо слово на однину (bottle)
                word = "bottle";
            } else if (beerNum == 0) {
                // Виправлення багу: якщо залишилося 0, пишемо "no more bottles"
                word = "no more bottles";
            } else {
                // В усіх інших випадках залишається множина (bottles)
                word = "bottles";
            }
            // 6. Виводимо фінальний рядок куплету з ОНОВЛЕНОЮ кількістю та словом
            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " of beer on the wall.");
            } else {
                System.out.println(word + " of beer on the wall.");
            }
            // Друкуємо порожній рядок для візуального розділення куплетів
            System.out.println();
        } // Кінець циклу 'while'. Програма повертається вгору до перевірки (beerNum > 0)
        // 7. Цей рядок спрацює лише тоді, коли beerNum стане рівним 0 і цикл завершиться
        System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
    }
}
