CREATE TABLE USERS (
        ID INTEGER PRIMARY KEY AUTO_INCREMENT,  -- Coluna ID é a chave primária, do tipo INTEGER, e será auto-incrementada automaticamente pelo banco de dados.
        NAME VARCHAR(255),                      -- Coluna NAME armazena o nome do usuário, com um máximo de 255 caracteres.
        EMAIL VARCHAR(255),
        CPF_CNPJ VARCHAR(255))
;
CREATE TABLE PRODUTOS (
    ID INTEGER PRIMARY KEY AUTO_INCREMENT,
    NOME VARCHAR(255),
    QUANTIDADE VARCHAR(255),
    PREÇO VARCHAR(255))
;
)