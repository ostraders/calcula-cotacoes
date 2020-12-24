-- DROP TABLE EMPRESA_ATIVO;
CREATE TABLE IF NOT EXISTS EMPRESA_ATIVO (
  ID_ATIVO BIGINT NOT NULL,
  ID_EMPRESA BIGINT NOT NULL
);

ALTER TABLE EMPRESA_ATIVO ADD PRIMARY KEY (ID_EMPRESA, ID_ATIVO);

ALTER TABLE EMPRESA_ATIVO ADD CONSTRAINT FK_EMPRESA_ATIVO_EMPRESA
    FOREIGN KEY (ID_EMPRESA)
    REFERENCES EMPRESA (ID_EMPRESA);
    
ALTER TABLE EMPRESA_ATIVO ADD CONSTRAINT FK_EMPRESA_ATIVO_ATIVO
    FOREIGN KEY (ID_ATIVO)
    REFERENCES ATIVO (ID_ATIVO);

INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(1, 1);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(2, 1);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(3, 2);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(4, 3);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(5, 4);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(6, 5);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(7, 6);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(8, 7);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(9, 8);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(10, 9);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(11, 10);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(12, 10);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(13, 11);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(14, 12);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(15, 12);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(16, 13);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(17, 13);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(18, 14);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(19, 15);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(20, 15);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(21, 16);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(22, 16);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(23, 17);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(24, 17);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(25, 18);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(26, 19);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(27, 20);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(28, 21);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(29, 22);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(30, 22);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(31, 23);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(32, 24);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(33, 24);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(34, 25);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(35, 26);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(36, 27);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(37, 28);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(38, 29);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(39, 31);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(40, 31);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(41, 32);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(42, 34);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(43, 35);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(44, 36);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(45, 36);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(46, 37);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(47, 38);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(48, 39);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(49, 40);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(50, 41);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(51, 42);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(52, 43);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(53, 44);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(54, 45);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(55, 45);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(56, 46);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(57, 47);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(58, 48);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(59, 49);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(60, 49);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(61, 50);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(62, 51);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(63, 52);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(64, 53);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(65, 54);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(66, 55);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(67, 55);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(68, 56);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(69, 56);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(70, 57);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(71, 58);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(72, 58);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(73, 59);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(74, 60);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(75, 61);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(76, 62);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(77, 63);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(78, 64);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(79, 65);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(80, 66);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(81, 67);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(82, 68);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(83, 69);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(84, 69);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(85, 70);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(86, 71);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(87, 72);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(88, 73);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(89, 74);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(90, 75);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(91, 76);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(92, 77);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(93, 78);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(94, 79);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(95, 80);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(96, 81);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(97, 83);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(98, 83);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(99, 84);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(100, 85);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(101, 86);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(102, 87);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(103, 88);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(104, 89);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(105, 91);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(106, 92);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(107, 93);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(108, 94);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(109, 95);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(110, 96);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(111, 97);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(112, 98);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(113, 99);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(114, 100);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(115, 101);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(116, 101);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(117, 102);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(118, 103);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(119, 104);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(120, 104);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(121, 105);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(122, 106);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(123, 107);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(124, 109);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(125, 110);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(126, 110);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(127, 111);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(128, 112);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(129, 113);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(130, 114);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(131, 115);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(132, 116);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(133, 117);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(134, 118);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(135, 119);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(136, 120);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(137, 121);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(138, 122);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(139, 123);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(140, 124);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(141, 125);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(142, 126);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(143, 127);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(144, 128);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(145, 129);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(146, 130);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(147, 131);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(148, 132);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(149, 133);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(150, 133);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(151, 133);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(152, 134);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(153, 134);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(154, 134);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(155, 135);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(156, 135);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(157, 135);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(158, 136);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(159, 137);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(160, 137);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(161, 138);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(162, 139);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(163, 140);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(164, 140);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(165, 141);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(166, 142);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(167, 143);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(168, 143);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(169, 144);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(170, 145);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(171, 146);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(172, 147);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(173, 148);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(174, 148);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(175, 148);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(176, 149);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(177, 150);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(178, 150);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(179, 151);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(180, 152);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(181, 153);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(182, 153);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(183, 154);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(184, 154);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(185, 155);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(186, 156);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(187, 156);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(188, 156);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(189, 28);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(190, 158);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(191, 158);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(192, 158);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(193, 159);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(194, 159);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(195, 159);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(196, 160);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(197, 160);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(198, 161);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(199, 162);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(200, 164);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(201, 164);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(202, 165);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(203, 165);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(204, 166);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(205, 167);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(206, 167);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(207, 168);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(208, 169);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(209, 170);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(210, 171);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(211, 172);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(212, 173);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(213, 174);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(214, 175);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(215, 176);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(216, 177);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(217, 178);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(218, 179);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(219, 179);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(220, 180);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(221, 181);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(222, 182);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(223, 182);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(224, 183);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(225, 184);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(226, 185);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(227, 186);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(228, 187);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(229, 187);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(230, 188);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(231, 189);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(232, 190);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(233, 191);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(234, 191);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(235, 192);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(236, 193);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(237, 194);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(238, 195);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(239, 196);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(240, 198);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(241, 199);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(242, 201);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(243, 202);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(244, 203);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(245, 204);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(246, 205);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(247, 206);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(248, 207);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(249, 208);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(250, 209);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(251, 210);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(252, 211);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(253, 212);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(254, 213);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(255, 214);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(256, 215);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(257, 217);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(258, 218);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(259, 218);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(260, 219);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(261, 220);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(262, 220);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(263, 221);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(264, 221);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(265, 223);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(266, 223);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(267, 223);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(268, 224);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(269, 224);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(270, 225);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(271, 225);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(272, 226);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(273, 226);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(274, 227);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(275, 228);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(276, 228);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(277, 228);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(278, 229);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(279, 229);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(280, 229);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(281, 230);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(282, 230);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(283, 230);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(284, 231);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(285, 231);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(286, 232);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(287, 232);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(288, 232);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(289, 233);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(290, 233);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(291, 233);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(292, 234);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(293, 235);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(294, 235);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(295, 235);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(296, 236);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(297, 237);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(298, 237);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(299, 238);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(300, 238);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(301, 238);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(302, 239);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(303, 240);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(304, 240);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(305, 241);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(306, 242);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(307, 242);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(308, 242);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(309, 243);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(310, 246);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(311, 246);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(312, 246);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(313, 247);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(314, 247);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(315, 248);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(316, 249);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(317, 250);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(318, 250);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(319, 250);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(321, 250);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(322, 250);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(323, 251);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(324, 252);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(325, 253);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(326, 254);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(327, 255);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(328, 256);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(329, 257);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(330, 258);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(331, 259);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(332, 260);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(333, 261);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(334, 262);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(335, 263);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(336, 264);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(337, 265);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(338, 266);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(339, 267);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(340, 268);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(341, 269);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(342, 270);
INSERT INTO EMPRESA_ATIVO(ID_ATIVO, ID_EMPRESA) VALUES(343, 271);


