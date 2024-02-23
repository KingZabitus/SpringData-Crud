package mp.teste.controller;

import mp.teste.model.Empregado;

import mp.teste.service.EmpregadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api")
public class EmpregadoController {

    @Autowired
    private EmpregadoService empregadoService;

    @GetMapping(value = "/empregado")
    public List<Empregado> get(){
        return empregadoService.acharEmpregados();
    }

    @PostMapping(value = "/empregado")
    public Empregado save(@RequestBody Empregado empregado){
        return empregadoService.adicionarEmpregado(empregado);
    }

    @GetMapping(value = "/empregado/{id}")
    public Optional<Empregado> get(@PathVariable Integer id){
        return empregadoService.acharEmpregado(id);
    }

    @PutMapping(value = "/empregado")
    public Empregado update(@RequestBody Empregado empregado){
        return empregadoService.atualizarEmpregado(empregado);
    }

    @DeleteMapping(value = "/empregado/{id}")
    public String delete(@PathVariable Integer id){
        empregadoService.deletarEmpregado(id);
        return "Empregado removido";
    }
}
