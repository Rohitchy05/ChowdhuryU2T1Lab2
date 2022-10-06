public class ChatBotRunner {
    public static void main(String[] args) {
        ChatBot debbie = new ChatBot("Debbie", 10, "S");

        debbie.greeting("Rohit");
        debbie.favoriteNumber(3);
        debbie.favoriteLetter("R");
        debbie.weather();

        double meters = debbie.convertFeetToMeters(17);
        System.out.println("There are: " + meters + " in 17 feet.");

        int sum = debbie.addNumbers(7, 12, 21);
        System.out.println("The sum is " + sum);

        double average = debbie.average(7, 12, 21);
        System.out.println("The average is " + average);

        String message = debbie.goodbye();
        System.out.println(message);
    }
}
