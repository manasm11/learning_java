public class AdminGuestMode {
    public static void main(String[] args) {
        boolean isGuest = false;
        boolean isAdmin = false;
        for (String arg : args) {
            if (arg.contains("guest")) {
                isGuest = true;
            }
            if (arg.contains("admin")) {
                isAdmin = true;
            }
        }
        if (isGuest && !isAdmin) {
            System.out.println("Hello, Guest!");
        } else if (isAdmin && !isGuest) {
            System.out.println("Hello, Admin!");
        } else {
            System.out.println("Please, select either 'ADMIN' or 'GUEST' mode for this program");
        }
    }
}
