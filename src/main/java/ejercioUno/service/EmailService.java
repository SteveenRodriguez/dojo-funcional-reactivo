package ejercioUno.service;

import ejercioUno.model.Email;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Locale;

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

    //Map: para saber si todos los correos cumple con todas las condiciones
    // Que cuente con el @ y el dominio)
    public void verificarEmail () {

        List<Email> emails =  createdEmail.emails();
        Flux.fromIterable(emails)
                .map(correo -> correo.getEmail()
                        .contains("@"))
                .subscribe(e -> System.out.println(e));
    }

    //Saber la cantidad de correos que hay, sin usar un ciclo
    public void cantidadDeEmail(){
        Flux.fromIterable(createdEmail.emails()).count().subscribe(System.out::println);
    }

    //Saber la cantidad de correos gmail, hotmail y outlook sin usar un ciclo

    public void cantidadDeCorreosPorDominio( String dominio){
        String dominioListo = dominio.toLowerCase(Locale.ROOT);
        Flux.fromIterable(createdEmail.emails()).filter(x -> x.getEmail().contains(dominioListo)).count()
                .subscribe(System.out::println);
    }
}
