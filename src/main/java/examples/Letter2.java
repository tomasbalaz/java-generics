package examples;

public class Letter2 {

    private final String sender;

    public Letter2(String sender) {
        this.sender = sender;
    }

    public String getSender() {
        return sender;
    }

    @Override
    public String toString() {
        return "Letter2{" +
                "sender='" + sender + '\'' +
                '}';
    }
}
