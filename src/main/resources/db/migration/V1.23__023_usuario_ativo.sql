-- DROP TABLE USUARIO_ATIVO;
CREATE TABLE IF NOT EXISTS USUARIO_ATIVO (
  ID_ATIVO BIGINT NOT NULL,
  ID_USUARIO BIGINT NOT NULL
);

ALTER TABLE USUARIO_ATIVO ADD PRIMARY KEY (ID_USUARIO, ID_ATIVO);

ALTER TABLE USUARIO_ATIVO ADD CONSTRAINT FK_USUARIO_ATIVO_USUARIO
    FOREIGN KEY (ID_USUARIO)
    REFERENCES USUARIO (ID_USUARIO);

ALTER TABLE USUARIO_ATIVO ADD CONSTRAINT FK_USUARIO_ATIVO_ATIVO
    FOREIGN KEY (ID_ATIVO)
    REFERENCES ATIVO (ID_ATIVO);

INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 235);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 75);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 73);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 209);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 167);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 168);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 152);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 153);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 227);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 328);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 326);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 224);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 124);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 169);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 148);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 339);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 112);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 42);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 64);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 325);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 314);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 330);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 90);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 342);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 199);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 70);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 329);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 324);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 336);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 184);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 74);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 182);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 241);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 18);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 100);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 319);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 62);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 144);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 337);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 163);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 164);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 160);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 123);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 77);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 334);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 335);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 58);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 255);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 333);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 141);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 89);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 341);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 88);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 321);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 76);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 122);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 87);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 61);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 302);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 121);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 236);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 318);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 222);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 256);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 216);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 28);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 36);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 11);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 86);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 327);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 140);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 96);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 323);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 20);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 332);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 322);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 10);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 185);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 331);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 301);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 260);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 27);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 338);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 340);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 38);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 117);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 26);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 317);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 93);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 35);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(1, 343);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(2, 317);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(2, 318);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(2, 319);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(2, 321);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(2, 322);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(2, 323);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(2, 324);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(2, 325);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(2, 326);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(2, 327);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(2, 328);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(2, 329);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(2, 330);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(2, 331);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(2, 332);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(2, 333);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(2, 334);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(2, 335);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(2, 336);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(2, 337);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(2, 338);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(2, 339);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(2, 340);
INSERT INTO usuario_ativo(id_usuario, id_ativo) VALUES(2, 341);

