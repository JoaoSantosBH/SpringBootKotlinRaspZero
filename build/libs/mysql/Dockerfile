# Derivando da imagem oficial do MySQL
FROM mysql:5.6
# Adicionando os scripts SQL para serem executados na criação do banco
COPY ./CreateDatabase.sql/ /docker-entrypoint-initdb.d/
