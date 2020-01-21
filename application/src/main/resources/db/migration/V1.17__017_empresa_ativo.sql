-- DROP TABLE EMPRESA_ATIVO;
CREATE TABLE IF NOT EXISTS EMPRESA_ATIVO (
  ID_ATIVO BIGINT NOT NULL,
	ID_EMPRESA BIGINT NOT NULL,
	ATIVO VARCHAR(20) NULL
);

ALTER TABLE EMPRESA_ATIVO ADD PRIMARY KEY (ID_EMPRESA, ATIVO);

CREATE UNIQUE INDEX ON EMPRESA_ATIVO (ATIVO);

ALTER TABLE EMPRESA_ATIVO ADD CONSTRAINT FK_EMPRESA_ATIVO
    FOREIGN KEY (ID_EMPRESA)
    REFERENCES EMPRESA (ID_EMPRESA);

INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(1, 1, 'BDLL4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(2, 1, 'BDLL3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(3, 2, 'UPSS34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(4, 3, 'LMTB34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(5, 4, 'JNJB34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(6, 5, 'FDXB34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(7, 6, 'CATP34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(8, 7, 'BMYB34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(9, 8, 'BOEI34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(10, 9, 'STBP3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(11, 10, 'RAPT4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(12, 10, 'RAPT3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(13, 11, 'LUPA3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(14, 12, 'INEP4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(15, 12, 'INEP3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(16, 13, 'GEPA4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(17, 13, 'GEPA3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(18, 14, 'FRAS3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(19, 15, 'SHUL3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(20, 15, 'SHUL4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(21, 16, 'TASA3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(22, 16, 'TASA4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(23, 17, 'GOLL4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(24, 17, 'GOLL11');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(25, 18, 'ETER3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(26, 19, 'VLID3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(27, 20, 'TPIS3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(28, 21, 'PTBL3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(29, 22, 'POMO3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(30, 22, 'POMO4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(31, 23, 'RLOG3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(32, 24, 'EALT3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(33, 24, 'EALT4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(34, 25, 'ENEV3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(35, 26, 'WEGE3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(36, 27, 'RAIL3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(37, 28, 'VALE3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(38, 29, 'USIM5');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(39, 31, 'IVPR3B');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(40, 31, 'IVPR4B');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(41, 32, 'LIQO3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(42, 34, 'CCRO3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(43, 35, 'AZUL4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(44, 36, 'CEDO3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(45, 36, 'CEDO4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(46, 37, 'NFLX34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(47, 38, 'NIKE34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(48, 39, 'MCDC34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(49, 40, 'HOME34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(50, 41, 'FDMO34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(51, 42, 'CMCS34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(52, 43, 'AMZO34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(53, 44, 'RDNI3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(54, 45, 'SLED3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(55, 45, 'SLED4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(56, 46, 'RSID3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(57, 47, 'MNDL3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(58, 48, 'LEVE3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(59, 49, 'CTKA3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(60, 49, 'CTKA4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(61, 50, 'MYPK3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(62, 51, 'GRND3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(63, 52, 'LCAM3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(64, 53, 'CEAB3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(65, 54, 'LLIS3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(66, 55, 'CGRA3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(67, 55, 'CGRA4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(68, 56, 'ESTR3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(69, 56, 'ESTR4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(70, 57, 'DIRR3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(71, 58, 'CTNM3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(72, 58, 'CTNM4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(73, 59, 'ANIM3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(74, 60, 'EVEN3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(75, 61, 'AMAR3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(76, 62, 'MOVI3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(77, 63, 'JHSF3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(78, 64, 'HBOR3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(79, 65, 'PDGR3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(80, 66, 'ARZZ3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(81, 67, 'EZTC3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(82, 68, 'HGTX3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(83, 69, 'ALPA3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(84, 69, 'ALPA4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(85, 70, 'SMLS3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(86, 71, 'RENT3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(87, 72, 'MRVE3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(88, 73, 'MGLU3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(89, 74, 'LREN3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(90, 75, 'COGN3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(91, 76, 'WHRL4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(92, 77, 'WHRL3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(93, 78, 'VVAR3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(94, 79, 'TCSA3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(95, 80, 'SBUB34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(96, 81, 'SEER3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(97, 83, 'LAME3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(98, 83, 'LAME4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(99, 84, 'HOOT4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(100, 85, 'GFSA3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(101, 86, 'YDUQ3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(102, 87, 'CYRE3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(103, 88, 'CVCB3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(104, 89, 'WALM34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(105, 91, 'PGCO34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(106, 92, 'PEPB34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(107, 93, 'COLG34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(108, 94, 'COCA34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(109, 95, 'AVON34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(110, 96, 'SMTO3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(111, 97, 'MDIA3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(112, 98, 'CAML3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(113, 99, 'AGRO3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(114, 100, 'BSEV3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(115, 101, 'BEEF3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(116, 101, 'BEEF11');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(117, 102, 'VIVA3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(118, 103, 'CRFB3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(119, 104, 'PCAR3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(120, 104, 'PCAR4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(121, 105, 'NTCO3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(122, 106, 'MRFG3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(123, 107, 'JBSS3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(124, 109, 'BRFS3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(125, 110, 'BSLI3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(126, 110, 'BSLI4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(127, 111, 'BTTL3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(128, 112, 'BPAR3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(129, 113, 'WFCO34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(130, 114, 'VISA34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(131, 115, 'MSBR34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(132, 116, 'MSCD34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(133, 117, 'JPMC34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(134, 118, 'HONB34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(135, 119, 'GEOO34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(136, 120, 'GSGI34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(137, 121, 'CTGP34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(138, 122, 'BOAC34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(139, 123, 'MMMC34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(140, 124, 'SCAR3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(141, 125, 'LPSB3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(142, 126, 'BMGB4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(143, 127, 'IGBR3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(144, 128, 'GSHP3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(145, 129, 'PSSA3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(146, 130, 'CARD3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(147, 131, 'BBRK3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(148, 132, 'BRPR3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(149, 133, 'BRSR3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(150, 133, 'BRSR5');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(151, 133, 'BRSR6');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(152, 134, 'BIDI3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(153, 134, 'BIDI4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(154, 134, 'BIDI11');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(155, 135, 'SANB3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(156, 135, 'SANB4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(157, 135, 'SANB11');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(158, 136, 'MULT3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(159, 137, 'ITUB3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(160, 137, 'ITUB4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(161, 138, 'ALSO3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(162, 139, 'LOGG3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(163, 140, 'ITSA3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(164, 140, 'ITSA4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(165, 141, 'IRBR3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(166, 142, 'IGTA3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(167, 143, 'BBDC3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(168, 143, 'BBDC4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(169, 144, 'BRML3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(170, 145, 'APER3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(171, 146, 'BBSE3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(172, 147, 'BPAN4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(173, 148, 'BBAS3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(174, 148, 'BBAS11');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(175, 148, 'BBAS12');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(176, 149, 'AXPB34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(177, 150, 'RANI3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(178, 150, 'RANI4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(179, 151, 'FCXO34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(180, 152, 'PMAM3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(181, 153, 'FESA3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(182, 153, 'FESA4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(183, 154, 'EUCA3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(184, 154, 'EUCA4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(185, 155, 'SUZB3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(186, 156, 'KLBN3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(187, 156, 'KLBN4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(188, 156, 'KLBN11');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(189, 28, 'VALE5');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(190, 158, 'UNIP3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(191, 158, 'UNIP5');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(192, 158, 'UNIP6');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(193, 159, 'NEMO3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(194, 159, 'NEMO5');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(195, 159, 'NEMO6');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(196, 160, 'MMXM3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(197, 160, 'MMXM11');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(198, 161, 'GOAU4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(199, 162, 'CSNA3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(200, 164, 'BRKM3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(201, 164, 'BRKM5');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(202, 165, 'BRAP3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(203, 165, 'BRAP4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(204, 166, 'ARMT34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(205, 167, 'MAPT3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(206, 167, 'MAPT4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(207, 168, 'BETP3B');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(208, 169, 'DISB34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(209, 170, 'ATOM3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(210, 171, 'PHMO34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(211, 172, 'CCXC3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(212, 173, 'SLBG34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(213, 174, 'HALI34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(214, 175, 'COPH34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(215, 176, 'CHVX34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(216, 177, 'PRIO3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(217, 178, 'OSXB3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(218, 179, 'DMMO3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(219, 179, 'DMMO11');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(220, 180, 'RPMG3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(221, 181, 'UGPA3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(222, 182, 'PETR3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(223, 182, 'PETR4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(224, 183, 'BRDT3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(225, 184, 'EXXO34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(226, 185, 'ENAT3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(227, 186, 'BIOM3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(228, 187, 'BALM3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(229, 187, 'BALM4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(230, 188, 'PFIZ34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(231, 189, 'MRCK34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(232, 190, 'GBIO33');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(233, 191, 'PNVL3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(234, 191, 'PNVL4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(235, 192, 'AALR3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(236, 193, 'ODPV3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(237, 194, 'RADL3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(238, 195, 'QUAL3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(239, 196, 'OFSA3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(240, 198, 'HYPE3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(241, 199, 'FLRY3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(242, 201, 'ABTT34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(243, 202, 'TOTS3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(244, 203, 'XRXB34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(245, 204, 'QCOM34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(246, 205, 'ORCL34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(247, 206, 'MSFT34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(248, 207, 'IBMB34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(249, 208, 'ITLC34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(250, 209, 'HPQB34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(251, 210, 'EBAY34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(252, 211, 'CSCO34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(253, 212, 'ATTB34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(254, 213, 'AAPL34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(255, 214, 'LINX3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(256, 215, 'POSI3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(257, 217, 'VERZ34');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(258, 218, 'OIBR');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(259, 218, 'OIBR4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(260, 219, 'TIMP3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(261, 220, 'VIVT3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(262, 220, 'VIVT4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(263, 221, 'TELB3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(264, 221, 'TELB4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(265, 223, 'CEPE3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(266, 223, 'CEPE5');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(267, 223, 'CEPE6');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(268, 224, 'CEED3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(269, 224, 'CEED4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(270, 225, 'EEEL3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(271, 225, 'EEEL4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(272, 226, 'CASN3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(273, 226, 'CASN4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(274, 227, 'CEGR3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(275, 228, 'CEBR3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(276, 228, 'CEBR5');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(277, 228, 'CEBR6');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(278, 229, 'RNEW3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(279, 229, 'RNEW4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(280, 229, 'RNEW11');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(281, 230, 'COCE3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(282, 230, 'COCE5');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(283, 230, 'COCE6');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(284, 231, 'CLSC3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(285, 231, 'CLSC4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(286, 232, 'ALUP3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(287, 232, 'ALUP4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(288, 232, 'ALUP11');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(289, 233, 'SAPR3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(290, 233, 'SAPR4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(291, 233, 'SAPR11');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(292, 234, 'CPRE3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(293, 235, 'CPLE3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(294, 235, 'CPLE5');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(295, 235, 'CPLE6');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(296, 236, 'CPFE3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(297, 237, 'CGAS3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(298, 237, 'CGAS5');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(299, 238, 'TIET3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(300, 238, 'TIET4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(301, 238, 'TIET11');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(302, 239, 'NEOE3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(303, 240, 'TRPL3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(304, 240, 'TRPL4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(305, 241, 'EGIE3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(306, 242, 'TAEE3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(307, 242, 'TAEE4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(308, 242, 'TAEE11');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(309, 243, 'SBSP3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(310, 246, 'CESP3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(311, 246, 'CESP5');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(312, 246, 'CESP6');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(313, 247, 'CMIG3');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(314, 247, 'CMIG4');
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA, ATIVO) VALUES(315, 248, 'AFLT3');
