import java.util.Scanner;

enum MessageType {A, B, C, D}

enum Priority {HIGH, MEDIUM, LOW}

public class DemoEnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please, enter message type to check it priority: ");
            String userInput = sc.next();

            if (isValidMessageType(userInput)) {
                System.out.println(userInput);
                break;
            } else {
                System.out.println("Please, enter valid "
                        + "message type. Only 'A', 'B', 'C' or 'D' are allowed");
                continue;
            }
        }

    }

    private static boolean isValidMessageType(String userInput) {
        String messageType = userInput.split(" ")[0];
        for (MessageType type : MessageType.values()) if (type.toString().equals(messageType)) return true;
        return false;
    }

}

