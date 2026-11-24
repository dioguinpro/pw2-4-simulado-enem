CREATE TABLE dbo.meta_simulado_enem (
    id BIGINT IDENTITY(1,1) NOT NULL,
    nome_aluno VARCHAR(100) NOT NULL,
    curso_desejado VARCHAR(100) NOT NULL,
    nota_corte_alvo FLOAT(53) NOT NULL,
    nota_humanas FLOAT(53) NOT NULL,
    nota_natureza FLOAT(53) NOT NULL,
    nota_matematica FLOAT(53) NOT NULL,
    nota_linguagens FLOAT(53) NOT NULL,
    nota_redacao FLOAT(53) NOT NULL,

    media_final FLOAT(53) NOT NULL,
    atingiu_meta BIT NOT NULL,

    data_cadastro DATETIME2 NOT NULL
    DEFAULT SYSDATETIME(),

    CONSTRAINT PK_meta_simulado_enem
    PRIMARY KEY (id)
);
