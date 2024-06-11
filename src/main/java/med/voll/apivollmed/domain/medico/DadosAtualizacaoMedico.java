package med.voll.apivollmed.domain.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.apivollmed.domain.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco
) {
}
