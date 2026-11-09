import java.util.Iterator;

public class RecursosHumanos {

    public static Integer contarFuncionariosAtivosEmpresa(Empresa empresa) {
        int quantidade = 0;
        for (Funcionario funcionario : empresa) {
            if (funcionario.isAtivo()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalFuncionariosEmpresa(Empresa empresa) {
        int quantidade = 0;
        for (Iterator<Funcionario> f = empresa.iterator(); f.hasNext(); ) {
            quantidade++;
            f.next();
        }
        return quantidade;
    }

}