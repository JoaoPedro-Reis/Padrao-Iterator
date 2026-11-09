import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursosHumanosTest {

    @Test
    void deveContarFuncionariosAtivosEmpresa() {
        Empresa empresa = new Empresa(
                new Funcionario("Marco", true),
                new Funcionario("Antonio", true),
                new Funcionario("Jose", false),
                new Funcionario("Maria", true)
        );
        assertEquals(3, RecursosHumanos.contarFuncionariosAtivosEmpresa(empresa));
    }

    @Test
    void deveContarTotalFuncionariosEmpresa() {
        Empresa empresa = new Empresa(
                new Funcionario("Marco", true),
                new Funcionario("Antonio", true),
                new Funcionario("Jose", false),
                new Funcionario("Maria", true)
        );
        assertEquals(4, RecursosHumanos.contarTotalFuncionariosEmpresa(empresa));
    }

}