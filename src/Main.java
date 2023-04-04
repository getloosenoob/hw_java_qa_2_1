public class Main {

    public static void main(String[] args) {
        int ticketPrice = 15_500;
        int milePrice = 20;

        int bonusMiles = ticketPrice / milePrice;

        System.out.println((bonusMiles) + " начисленных миль за купленный билет.");

    }
}
