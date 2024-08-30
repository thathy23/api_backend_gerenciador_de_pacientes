package br.com.gerenciadordepacientes.api.dtos;

//so pode dar get com record, e imutavel

import br.com.gerenciadordepacientes.api.enums.TipoPacienteEnum;

public record CriarPacienteRequest(
        String nome,
        String telefone,
        String sexo,
        String cpf,
        String rg,
        String plano_de_saude,
        TipoPacienteEnum tipoPaciente
) {
}
