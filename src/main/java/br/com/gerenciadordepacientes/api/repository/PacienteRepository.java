package br.com.gerenciadordepacientes.api.repository;

import br.com.gerenciadordepacientes.api.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}


