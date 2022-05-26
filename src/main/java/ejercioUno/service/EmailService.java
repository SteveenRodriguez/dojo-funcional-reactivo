package ejercioUno.service;

import ejercioUno.model.Email;
import reactor.core.publisher.Flux;

import java.util.List;

public class EmailService {

    CreatedEmail createdEmail =  new CreatedEmail();

   public  void distinc() {
       CreatedEmail createdEmail =  new CreatedEmail();
       List<Email> emails =  createdEmail.emails();
       Flux.fromIterable(emails)
               .distinct(Email::getEmail)
               .subscribe(e -> System.out.println(e));
   }

    //Filtro: para saber si hay correos con dominio gmail, hotmail y outlook.
    public void filterDomain(String dominio){

        List<Email> emails =  createdEmail.emails();
        Flux.fromIterable(emails)
                .filter(correo -> correo.getEmail().contains(dominio))
                .subscribe(e -> System.out.println(e));
    }
}
