import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Casino {
    interface CasinoTableMed {
        public void showCards(Richman gamer, ArrayList<Integer> arr_of_cards);
    }

    static class CasinoTable implements CasinoTableMed {
        @Override
        public void showCards(Richman gamer, ArrayList<Integer> arr_of_cards) {
            System.out.println(gamer.name());
            for (Integer arrOfCard : arr_of_cards) {
                System.out.print(arrOfCard);
                System.out.print("\t");
            }
            System.out.println();
        }
    }

    static class Richman {
        final protected String name;
        final protected CasinoTable table;

        protected ArrayList<Integer> cards;

        Richman(String name_, ArrayList<Integer> card, CasinoTable table_) {
            name = name_;
            table = table_;
            cards = card;
        }

        public String name() {
            return name;
        }
        public void openUp() {
            table.showCards(this, cards);
        }
    }
}
