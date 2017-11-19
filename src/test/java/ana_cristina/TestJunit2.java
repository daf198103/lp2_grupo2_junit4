package ana_cristina;

    /* O teste é o processo de verificação da funcionalidade de um aplicativo para
     garantir que ele seja executado de acordo com os requisitos. O teste da unidade
     entra na imagem ao nível dos desenvolvedores; É o teste de uma única entidade
    (classe ou método). O teste de unidade desempenha um papel fundamental ao ajudar
     as empresas de software a entregar produtos de qualidade aos seus clientes.

    O teste de unidade pode ser feito de duas maneiras: testes manuais e
     automatizados.
     */

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJunit2 {

    String name = "Ana Lima";

    MessageUtil messageUtil = new MessageUtil(name);

    @Test
    public void testMessagePlusGreeting(){

        System.out.println("Mensagem exibida dentro do médoto testMessagePlusGreeting()");
        name = "Hi!" + name;
        assertEquals(name, messageUtil.messagePlusGreeting());
    }
}
