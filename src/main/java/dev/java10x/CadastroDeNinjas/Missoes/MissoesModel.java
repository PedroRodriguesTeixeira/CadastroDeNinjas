package dev.java10x.CadastroDeNinjas.Missoes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;
    String nome;
    String dificuldade; //Poderia ser uma classe ENUM
}
