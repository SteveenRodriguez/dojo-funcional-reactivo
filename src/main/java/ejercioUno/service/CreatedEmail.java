package ejercioUno.service;

import ejercioUno.model.Email;

import java.util.ArrayList;
import java.util.List;

/**
 * Distinct: para ver si hay correo repetidos, si hay correos repetidos eliminarlos
 */
public class CreatedEmail {
    public <Email> emails () {

        List <Email> emails = new ArrayList<Email>();

        emails.add((new Email("steveen@gmail.com")));
        emails.add(new Email("jose@gmail.com"));
        emails.add(new Email("pabloS@gmail.com"));
        emails.add(new Email("hernan23T@gmail.com"));
        emails.add(new Email("saraP@gmail.com"));
        emails.add(new Email("carlos@gmail.com"));
        emails.add(new Email("saraP@gmail.com"));
        emails.add(new Email("oscar23F@gmail.com"));
        emails.add(new Email("pintos2@gmail.com"));
        emails.add(new Email("frizoGt2@gmail.com"));
        emails.add(new Email("jose@outlook.com"));
        emails.add(new Email("jose@outlook.com"));
        emails.add(new Email("pabloS@outlook.com"));
        emails.add(new Email("hernan23T@outlook.com"));
        emails.add(new Email("saraP@outlook.com"));
        emails.add(new Email("carlos@outlook.com"));
        emails.add(new Email("valen2@outlook.com"));
        emails.add(new Email("oscar23F@outlook.com"));
        emails.add(new Email("pintos2@outlook.com"));
        emails.add(new Email("frizoGt2@outlook.com"));
        emails.add(new Email("saraP@hotmail.com"));
        emails.add(new Email("carlos@hotmail.com"));
        emails.add(new Email("valen2@hotmail.com"));
        emails.add(new Email("oscar23F@hotmail.com"));
        emails.add(new Email("pintos2@hotmail.com"));
        emails.add(new Email("frizoGt2@hotmail.com"));

        return emails;
    }

}
