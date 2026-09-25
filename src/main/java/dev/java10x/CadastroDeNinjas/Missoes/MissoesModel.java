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
    private String nome;
    private String dificuldade; //Poderia ser uma classe ENUM
    
    // @OneToMany significa que uma missão terá apenas um ninja
    @OneToMany
    private List<NinjaModel> ninja;
}
