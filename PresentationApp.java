public class PresentationApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("\u001B[1m*************************************\u001B[0m");
        System.out.println("\u001B[1mWelcome to the Presentation Generator!\u001B[0m");
        System.out.println("\u001B[1m*************************************\u001B[0m");

        // User input
        System.out.println("\n\u001B[36mEnter your name: \u001B[0m");
        String username = scanner.nextLine();
        System.out.println("\u001B[36mEnter your email: \u001B[0m");
        String email = scanner.nextLine();
        
        User user = new User(username, email);
        System.out.println("\n\u001B[1mWelcome, " + user.getUsername() + "!\u001B[0m");
    }
}
