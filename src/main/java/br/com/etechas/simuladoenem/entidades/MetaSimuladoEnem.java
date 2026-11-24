package br.com.etechas.simuladoenem.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity
@Table(name = "meta_simulado_enem")
@Getter
@Setter
@NoArgsConstructor
public class MetaSimuladoEnem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome_aluno", nullable = false, length = 100)
    private String nomeAluno;

    @Column(name = "curso_desejado", nullable = false, length = 100)
    private String cursoDesejado;

    @Column(name = "nota_corte_alvo", nullable = false)
    private Double notaCorteAlvo;

    @Column(name = "nota_humanas", nullable = false)
    private Double notaHumanas;

    @Column(name = "nota_natureza", nullable = false)
    private Double notaNatureza;

    @Column(name = "nota_matematica", nullable = false)
    private Double notaMatematica;

    @Column(name = "nota_linguagens", nullable = false)
    private Double notaLinguagens;

    @Column(name = "nota_redacao", nullable = false)
    private Double notaRedacao;

    @Column(name = "media_final", nullable = false)
    private Double mediaFinal;

    @Column(name = "atingiu_meta", nullable = false)
    private Boolean atingiuMeta;

    @Column(name = "data_cadastro", nullable = false, insertable = false, updatable = false)
    private LocalDateTime dataCadastro;
}
