-- DROP TABLE CONTROLE_EXECUCAO;
CREATE TABLE IF NOT EXISTS CONTROLE_EXECUCAO (
  ID_CONTROLE_EXECUCAO BIGINT NOT NULL,
  CONTROLE_EXECUCAO_ATIVO BOOLEAN NOT NULL,
  CALC_MEDIA_MOVEL_DIARIO_EXECUTADO BOOLEAN NULL,
  CALC_MEDIA_MOVEL_SEMANAL_EXECUTADO BOOLEAN NULL,
  CALC_MEDIA_EXPONECIAL_DIARIO_EXECUTADO BOOLEAN NULL,
  CALC_MEDIA_EXPONECIAL_SEMANAL_EXECUTADO BOOLEAN NULL,
  CALC_MACD_DIARIO_EXECUTADO BOOLEAN NULL,
  CALC_MACD_SEMANAL_EXECUTADO BOOLEAN NULL,
  CALC_SINAL_MACD_DIARIO_EXECUTADO BOOLEAN NULL,
  CALC_SINAL_MACD_SEMANAL_EXECUTADO BOOLEAN NULL,
  CALC_HISTOGRAMA_DIARIO_EXECUTADO BOOLEAN NULL,
  CALC_HISTOGRAMA_SEMANAL_EXECUTADO BOOLEAN NULL
);

ALTER TABLE CONTROLE_EXECUCAO ADD PRIMARY KEY (ID_CONTROLE_EXECUCAO, CONTROLE_EXECUCAO_ATIVO);
