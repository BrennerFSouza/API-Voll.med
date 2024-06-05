package med.voll.apivollmed.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.apivollmed.medico.DadosCadastroMedico;
import med.voll.apivollmed.medico.DadosListagemMedico;
import med.voll.apivollmed.medico.Medico;
import med.voll.apivollmed.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("medicos")
public class MedicoController {
    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados) {
        repository.save(new Medico(dados));
    }

    @GetMapping
    public Page<DadosListagemMedico> listar(Pageable paginacao) {
        return repository.findAll(paginacao)
                .map(DadosListagemMedico::new);
    }


}