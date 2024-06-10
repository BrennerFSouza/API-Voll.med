package med.voll.apivollmed.paciente;

import jakarta.validation.constraints.NotNull;
import med.voll.apivollmed.endereco.Endereco;

public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        String nome,
        String telefone,
        Endereco endereco
) {
}
