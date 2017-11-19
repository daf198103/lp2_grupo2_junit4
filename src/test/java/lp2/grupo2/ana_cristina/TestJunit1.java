package lp2.grupo2.ana_cristina;

    /* O teste é o processo de verificação da funcionalidade de um aplicativo para
     garantir que ele seja executado de acordo com os requisitos. O teste da unidade
     entra na imagem ao nível dos desenvolvedores; É o teste de uma única entidade
    (classe ou método). O teste de unidade desempenha um papel fundamental ao ajudar
     as empresas de software a entregar produtos de qualidade aos seus clientes.

    O teste de unidade pode ser feito de duas maneiras: testes manuais e
     automatizados.
     */

import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

@Ignore
public class TestJunit1 {

    String nome = "Ana Cristina";
    MessageUtil messageUtil = new MessageUtil(nome);

    @Test
    public void testPrintMessage() {

        System.out.println("Mensagem exibida de dentro do método testPrintMessage()");
        assertEquals(nome, messageUtil.printMessage());
    }
}
