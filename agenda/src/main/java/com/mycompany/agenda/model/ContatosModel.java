package com.mycompany.agenda.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Table(name = "Contatos")
@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor

public class ContatosModel {

    @Id
    private Long id;
    @Column(length = 80, nullable = false)
    private String nome;
    @Column(length = 20, nullable = false)
    private String telefone;

}
