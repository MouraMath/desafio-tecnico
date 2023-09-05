import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class SalarioBean implements Serializable {
	private List<Salario> salarios;

	@PostConstruct
	public void init() {
		// Simule dados de salários (substitua com sua lógica de busca de dados)
		salarios = new ArrayList<>();
		salarios.add(new Salario("João", "Analista", 5000.0));
		salarios.add(new Salario("Maria", "Gerente", 8000.0));
		salarios.add(new Salario("Carlos", "Desenvolvedor", 6000.0));
	}

	public List<Salario> getSalarios() {
		return salarios;
	}
}