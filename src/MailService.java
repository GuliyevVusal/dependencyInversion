

public class MailService {

    public void sendMail(MailServer mailServer, String to, String body) {
        mailServer.send(to, body);
    }

}

