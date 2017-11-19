package lp2.grupo2.ana_cristina;


/*
 *  O conjunto de testes (Test Suite) é usado para agrupar testes de unidade e executá-los
 *  juntos. No JUnit, as anotações @RunWith e @Suite são usadas para executar os testes do
 *  conjunto.
 *
 *  No exemplo a seguir há duas classes (TestJunit1 e TestJunit2 que são executadas usando o
 *  Test Suite.
 *  @param mensagem que será apresentada.
 */

public class MessageUtil {

    private String message;

    public MessageUtil(String message) {
        this.message = message;
    }

    public String printMessage() {
        System.out.println(message);

        return message;
    }

    public String messagePlusGreeting() {

        message = "Hi!" + message;
        System.out.println(message);

        return message;
    }
}
