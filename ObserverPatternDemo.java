
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        User1 user1 = new User1(subject, "Ahsan");
        User1 user2 = new User1(subject, "Ali");
        // System.out.println("\n");
        subject.setNotification("public");
        // System.out.println("changing the subscription to private \n");
        subject.setNotification("private");

    }

}
