-- DROP TABLE MACD;
CREATE TABLE IF NOT EXISTS MACD_DIARIO (
	ID_MACD BIGINT NOT NULL,
	CODNEG VARCHAR(255) NULL,
	DTPREG DATE NULL,
	PREMACD DECIMAL(14,2) NULL
);

ALTER TABLE MACD_DIARIO ADD PRIMARY KEY (CODNEG, DTPREG);

CREATE SEQUENCE MACD_DIARIO_SEQ START 1;