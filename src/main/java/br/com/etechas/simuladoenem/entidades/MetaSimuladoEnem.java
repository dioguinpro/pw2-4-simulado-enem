package br.com.etechas.simuladoenem.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "meta_simulado_enem", schema = "dbo")
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

    @Column(name = "nota_corte_alvo", nullable = false, precision = 6, scale = 2)
    private BigDecimal notaCorteAlvo;

    @Column(name = "nota_humanas", nullable = false, precision = 6, scale = 2)
    private BigDecimal notaHumanas;

    @Column(name = "nota_natureza", nullable = false, precision = 6, scale = 2)
    private BigDecimal notaNatureza;

    @Column(name = "nota_matematica", nullable = false, precision = 6, scale = 2)
    private BigDecimal notaMatematica;

    @Column(name = "nota_linguagens", nullable = false, precision = 6, scale = 2)
    private BigDecimal notaLinguagens;

    @Column(name = "nota_redacao", nullable = false, precision = 6, scale = 2)
    private BigDecimal notaRedacao;

    @Column(name = "media_final", nullable = false, precision = 6, scale = 2)
    private BigDecimal mediaFinal;

    @Column(name = "atingiu_meta", nullable = false)
    private Boolean atingiuMeta;

    @Column(name = "data_cadastro", nullable = false, insertable = false, updatable = false)
    private LocalDateTime dataCadastro;
}
