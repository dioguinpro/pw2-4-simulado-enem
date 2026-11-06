-- =============================================
-- Projeto: MetaSimuladoEnem
-- Banco: MetaSimuladoEnemDB
-- Tabela: meta_simulado_enem
-- =============================================

CREATE TABLE dbo.meta_simulado_enem (
    id BIGINT IDENTITY(1,1) NOT NULL,
    nome_aluno VARCHAR(100) NOT NULL,
    curso_desejado VARCHAR(100) NOT NULL,

    nota_corte_alvo DECIMAL(6,2) NOT NULL,
    nota_humanas DECIMAL(6,2) NOT NULL,
    nota_natureza DECIMAL(6,2) NOT NULL,
    nota_matematica DECIMAL(6,2) NOT NULL,
    nota_linguagens DECIMAL(6,2) NOT NULL,
    nota_redacao DECIMAL(6,2) NOT NULL,

    media_final DECIMAL(6,2) NOT NULL,
    atingiu_meta BIT NOT NULL,

    data_cadastro DATETIME2 NOT NULL
       DEFAULT SYSDATETIME(),

    CONSTRAINT PK_meta_simulado_enem
    PRIMARY KEY (id)
);