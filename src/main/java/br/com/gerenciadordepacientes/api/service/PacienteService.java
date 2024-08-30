package br.com.gerenciadordepacientes.api.service;

import br.com.gerenciadordepacientes.api.dtos.CriarPacienteRequest;
import br.com.gerenciadordepacientes.api.dtos.PacienteCriadoResponse;

public interface PacienteService {
    //primeira assinatura: criacao do paciente. Aqui temos o contrato a regra de negocio
    //criacao de um objeto para transferir os dados do front para api back - esse objeto e o DTO data transfer object
  PacienteCriadoResponse criarPaciente(CriarPacienteRequest criarPacienteRequest);


}