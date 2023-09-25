CREATE TABLE T_FIAP_PRODUTO(
    cd_produto number (36,0) not null,
    tp_produto varchar2(100) not null,
    mc_produto varchar2(100) not null,
    vl_venda number(9,2) default 0,
    vl_compra number(9,2) default 0
);

 
DROP TABLE T_FIAP_PRODUTO;