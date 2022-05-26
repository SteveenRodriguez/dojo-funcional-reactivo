package ejercioUno.model;


/**
 * Crear una lista de mínimo 30 correos, de los cuales se le deben aplicar los siguientes
 * operadores:
 *
 * Distinct: para ver si hay correo repetidos, si hay correos repetidos eliminarlos
 * Filtro: para saber si hay correos con dominio gmail, hotmail y outlook.
 * Map: para saber si todos los correos cumple con todas las condiciones
 * (Que cuente con el @ y el dominio)
 * Saber la cantidad de correos que hay, sin usar un ciclo
 * Saber la cantidad de correos gmail, hotmail y outlook sin usar un ciclo
 * En la misma lista determinar si se envió un correo o no a cada uno de los correos,
 * si se le envió cambiar el
 * estado en la lista, todo esto respetando la inmutabilidad.
 */

public class Email {

    private String email;
    private Boolean state;

    @Override
    public String toString() {
        return "Email{" +
                "email='" + email + '\'' +
                ", state=" + state +
                '}';
    }

    public Email(String email) {
        this.email = email;
        this.state = false;
    }

    public Email(String email, Boolean state) {
        this.email = email;
        this.state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }



    public Boolean getEstado() {
        return state;
    }

}
