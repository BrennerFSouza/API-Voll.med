package med.voll.apivollmed.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.apivollmed.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco
) {
}
