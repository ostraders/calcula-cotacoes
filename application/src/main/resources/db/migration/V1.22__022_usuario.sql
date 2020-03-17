-- DROP TABLE AGENDA_EXECUCAO;
CREATE TABLE IF NOT EXISTS USUARIO (
	ID_USUARIO BIGINT NOT NULL,
	NOME_USUARIO VARCHAR(255) NULL,
	EMAIL_USUARIO VARCHAR(255) NULL,
    ULTIMA_DATA_EXECUCAO DATE NOT NULL
);

ALTER TABLE USUARIO ADD PRIMARY KEY (ID_USUARIO);

CREATE SEQUENCE USUARIO_SEQ	START 3;

INSERT INTO USUARIO(ID_USUARIO, NOME_USUARIO, EMAIL_USUARIO, ULTIMA_DATA_EXECUCAO)
    VALUES(1, 'Alexandre Cocati', 'alexandre.cocati@gmail.com', '2000-01-01');
INSERT INTO USUARIO(ID_USUARIO, NOME_USUARIO, EMAIL_USUARIO, ULTIMA_DATA_EXECUCAO)
    VALUES(2, 'Diego Bravos', NULL, '2000-01-01');
