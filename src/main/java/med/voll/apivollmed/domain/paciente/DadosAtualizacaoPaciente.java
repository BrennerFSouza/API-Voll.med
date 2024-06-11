package med.voll.apivollmed.domain.paciente;

import jakarta.validation.constraints.NotNull;
import med.voll.apivollmed.domain.endereco.Endereco;

public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        String nome,
        String telefone,
        Endereco endereco
) {
}
