-- DROP TABLE MEDIA_MOVEL_SIMPLES;
CREATE TABLE MEDIA_MOVEL_SIMPLES_SEMANAL (
	ID_MEDIA_MOVEL_SIMPLES BIGINT NOT NULL,
	CODNEG VARCHAR(255) NULL,
	DTPREGINI DATE NULL,
	DTPREGFIM DATE NULL,
	PREMEDULT NUMERIC(14,2) NULL,
	PERIODO INTEGER NULL
);

ALTER TABLE MEDIA_MOVEL_SIMPLES_SEMANAL ADD PRIMARY KEY (CODNEG, DTPREGINI, DTPREGFIM, PERIODO);

CREATE SEQUENCE MEDIA_MOVEL_SIMPLES_SEMANAL_SEQ START 1;
