import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Empresa implements Iterable<Funcionario> {

    private List<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public Empresa(Funcionario... funcionarios) {
        this.funcionarios = Arrays.asList(funcionarios);
    }

    @Override
    public Iterator<Funcionario> iterator() {
        return funcionarios.iterator();
    }

}