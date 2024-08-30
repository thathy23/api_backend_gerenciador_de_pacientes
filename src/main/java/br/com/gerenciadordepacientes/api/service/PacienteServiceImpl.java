package br.com.gerenciadordepacientes.api.service;

import br.com.gerenciadordepacientes.api.dtos.CriarPacienteRequest;
import br.com.gerenciadordepacientes.api.dtos.PacienteCriadoResponse;
import br.com.gerenciadordepacientes.api.model.Paciente;
import br.com.gerenciadordepacientes.api.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PacienteServiceImpl implements PacienteService {


    @Autowired
    PacienteRepository pacienteRepository;

    @Override
    public PacienteCriadoResponse criarPaciente(CriarPacienteRequest criarPacienteRequest) {
        Paciente paciente = new Paciente();
        paciente.setNome(criarPacienteRequest.nome());
        paciente.setRg(criarPacienteRequest.rg());
        paciente.setCpf(criarPacienteRequest.cpf());
        paciente.setSexo(criarPacienteRequest.sexo());
        paciente.setTelefone(criarPacienteRequest.telefone());
        paciente.setTipoPacienteEnum(criarPacienteRequest.tipoPaciente());
        paciente.setPlano_de_saude(criarPacienteRequest.plano_de_saude());
        paciente.setCriadoEm(LocalDateTime.now());

        Paciente pacienteCriado = pacienteRepository.save(paciente);

        return new PacienteCriadoResponse(
                "Paciente criado com sucesso",
                paciente.getId()
        );
    }
}
