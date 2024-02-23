package mp.teste.service;

import mp.teste.model.Empregado;
import mp.teste.repositories.EmpregadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpregadoService {

    @Autowired
    private EmpregadoRepository empregadoRepository;

    public List<Empregado> acharEmpregados() {
        return empregadoRepository.findAll();
    }

    public Empregado adicionarEmpregado(Empregado empregado) {
        return empregadoRepository.save(empregado);
    }

    public Optional<Empregado> acharEmpregado(Integer id) {
        return empregadoRepository.findById(id);
    }

    public Empregado atualizarEmpregado(Empregado empregado){
        return empregadoRepository.save(empregado);
    }

    public void deletarEmpregado(Integer id){
        empregadoRepository.deleteById(id);
    }
}
