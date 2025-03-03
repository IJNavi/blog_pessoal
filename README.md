# 📚 API para Blog

Uma API para um blog contendo seções de temas, postagens e usuários autenticados.

## 🛠️ Funcionalidades

- **CRUD completo** para temas, postagens e usuários.
- **Autenticação e autorização** configuradas para maior segurança.
- **Integração com Swagger** para documentação interativa.

## 🚀 Stack utilizada

### Back-end
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)

### Database
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)

## 🖥️ Rodando localmente

### Clone o projeto

```bash
git clone https://github.com/IJNavi/blog_pessoal.git
```

### Entre no diretório do projeto

```bash
cd blog
```

### Instale as dependências

```bash
mvn clean install
```

### Configure o banco de dados

1. Certifique-se de que o MySQL está em execução.
2. Atualize as configurações do banco no arquivo `application.properties`:

```properties
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database=mysql
spring.datasource.url=jdbc:mysql://localhost:3306/db_blogpessoal?createDatabaseIfNotExist=true&serverTimezone=America/Sao_Paulo&useSSL=false&allowPublicKeyRetrieval=true
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
spring.jackson.date-format=yyyy-MM-dd HH:mm:ss
spring.jackson.time-zone=Brazil/East
spring.application.name=blogpessoal
```

### Inicie o servidor

```bash
mvn spring-boot:run
```

## 📖 Documentação da API

### Documentação interativa com Swagger

Acesse a documentação interativa no navegador:

🔗 [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)
```
