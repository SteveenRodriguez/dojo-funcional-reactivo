package ejercioUno;

import ejercioUno.service.EmailService;

public class Main {

    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        //emailService.distinc();
        //emailService.filterDomain("@outlook");
        //emailService.verificarEmail();
        //emailService.cantidadDeEmail();
        emailService.cantidadDeCorreosPorDominio("@gmail");

    }
}
