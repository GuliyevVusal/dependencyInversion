public class Gmail implements MailServer {

    @Override
    public void send(String to, String body) {
        System.out.println("Mail sended with Gmail.... ");
    }
}
