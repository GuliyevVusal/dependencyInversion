public class Main {
    public static void main(String[] args) {


        MailService mailService = new MailService();
        mailService.sendMail(new Gmail(),"","");
        mailService.sendMail(new Yandex(),"","");
        mailService.sendMail(new Hotmail(),"","");

        // Mail sended with Gmail....
        // Mail sended with Yandex....
        // Mail sended with Hotmail....
    }
}