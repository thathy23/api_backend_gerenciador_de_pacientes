package br.com.gerenciadordepacientes.api.model;

import br.com.gerenciadordepacientes.api.enums.TipoPacienteEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "paciente")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Paciente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    @Column(name = "telefone", nullable = false, length = 30)
    private String telefone;

    @Column(name = "sexo", nullable = false, length = 30)//lenght maior para variedade de novos generos
    private String sexo;

    @Column(name = "cpf", nullable = false, unique = true, length = 20)
    private String cpf;

    @Column(name = "rg", nullable = false, length = 20)
    private String rg;

    @Column(name = "plano_de_saude", nullable = false, length = 100)
    private String planoDeSaude;

    @Column(name = "tipo_paciente", nullable = false)
    //por padrao particular sera 0 e planodesaude sera 1 no banco de dados, entao
    @Enumerated(EnumType.STRING) //sera enumerado por string com os nome definidos no enum
    private TipoPacienteEnum tipoPacienteEnum;

    @Column(name = "criado_em", nullable = false)
    private LocalDateTime criadoEm;

    @Column(name = "atualizado_em")
    private LocalDateTime atualizadoEm;





}
