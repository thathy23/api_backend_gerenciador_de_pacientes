package br.com.gerenciadordepacientes.api.controller;

import br.com.gerenciadordepacientes.api.dtos.CriarPacienteRequest;
import br.com.gerenciadordepacientes.api.dtos.PacienteCriadoResponse;
import br.com.gerenciadordepacientes.api.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    PacienteService pacienteService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PacienteCriadoResponse criarPaciente(@RequestBody CriarPacienteRequest criarPacienteRequest){
     return pacienteService.criarPaciente(criarPacienteRequest);
    }
//      criar uma lista de pacientes:
//      @PostMapping("/lista")
//      @ResponseStatus(HttpStatus.CREATED)
//      public PacienteCriadoResponse criarPaciente(@RequestBody CriarPacienteRequest criarPacienteRequest){
//       return pacienteService.criarPaciente(criarPacienteRequest);
//    }

}