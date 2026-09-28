package dev.java10x.CadastroDeNinjas;


import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Entity ele transforma uma classe em uma entidade do BD.
// JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String email;
    private int idade;

    //@ManyToOne um ninja tem apenas uma missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreign key ou chave estrangeira
    private MissoesModel missoes;

}
