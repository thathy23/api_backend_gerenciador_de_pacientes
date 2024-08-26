package br.com.gerenciadordepacientes.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

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
    private String plano_de_saude;

}
