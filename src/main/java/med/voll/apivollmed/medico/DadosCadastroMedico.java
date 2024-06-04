package med.voll.apivollmed.medico;

import med.voll.apivollmed.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome,
                                  String email,
                                  String crm,
                                  Especialidade especialidade,
                                  DadosEndereco endereco) {
}
