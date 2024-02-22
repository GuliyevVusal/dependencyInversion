public class Yandex implements MailServer{
    @Override
    public void send(String to, String body) {
        System.out.println("Mail sended with Yandex.... ");
    }
}
