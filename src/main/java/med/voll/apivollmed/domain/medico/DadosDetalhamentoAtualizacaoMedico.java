package med.voll.apivollmed.domain.medico;

import med.voll.apivollmed.domain.endereco.Endereco;

public record DadosDetalhamentoAtualizacaoMedico (Long id, String nome, String email, String crm, String telefone, Especialidade especialidade, Endereco endereco){
    public DadosDetalhamentoAtualizacaoMedico(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(),medico.getTelefone(), medico.getEspecialidade(), medico.getEndereco());
    }
}
