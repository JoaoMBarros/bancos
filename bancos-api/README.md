# Spring Boot API Bancos

Esta é uma API desenvolvida em Spring Boot para gerenciamento de bancos.

## Como executar o projeto

1. Certifique-se de ter o JDK (Java Development Kit) instalado na sua máquina.

2. Clone este repositório:

```bash
git clone https://github.com/seu-usuario/spring-boot-api-bancos.git
```

1. Navegue até o diretório do projeto:
```bash
cd spring-boot-api-bancos
```

2. Inicie a aplicação
```bash
./mvnw spring-boot:run
```

### Configuração do banco de dados
Esta aplicação se conecta a um banco de dados MySQL. Certifique-se de ter um servidor MySQL em execução na porta padrão (5432) e crie um banco de dados chamado 'bancos'.

### Endpoints disponíveis
GET /api/bancos: Retorna uma lista de todos os bancos cadastrados.

GET /api/bancos/{id}: Retorna informações sobre um banco específico com o ID fornecido.