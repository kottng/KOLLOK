import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Casino.CasinoTable a =  new Casino.CasinoTable();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 7; ++i) {
            arr.add(i);
        }
        Casino.Richman Dima = new Casino.Richman("Dima", arr, a);
        Casino.Richman Yulia = new Casino.Richman("Yulia", arr, a);
        Dima.openUp();
        Yulia.openUp();
    }
}