# Estacionamento Pedro
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/cristovaom/estacionamento-pedro-api/blob/main/LICENSE)

# Sobre o projeto
Estacionamento Pedro é o trabalho do semestre do 3 Período de Engenharia de Software da Uniamerica, Onde temos que elaborar um sistema para um estacionamento e ao fim do Semestre ele tem que estar 100% funcional, tanto a API quanto o front-end.
## Historia de Usuario:
Pedro é sócio proprietário de um estacionamento localizado na cidade de Foz do Iguaçu. Ele tema necessidade de controlar a entrada e saída dos veículos em seu estacionamento. A cada 50horas pagas o veículo recebe 5 horas grátis. Por questões fiscais, Pedro tem a necessidade decontrolar quais veículos estão estacionados, qual é o proprietário do veículo e também controlar adata e hora da entrada e saída de cada um deles. Hoje o estacionamento contém 50 vagas paracarros, 5 vagas para vans e 20 vagas para motos. O horário de atendimento é das 06:00 às 20:00Horas. Após o horário núcleo é cobrado multa por minuto.

## Modelo conceitual
![Modelo Conceitual](docs/DiagramaDeClasses.PNG)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
## Implantação em produção
- Banco de dados: Postgresql
## Back end
Pré-requisitos: Java 17

```bash
# clonar repositório
git clone git@github.com:cristovaom/estacionamento-pedro-api.git

# entrar na pasta do projeto back end
cd backend

# executar o projeto
./mvnw spring-boot:run


# Autor

Cristovão Martins de Souza

https://www.linkedin.com/in/cristovão-martins-desenvolvedor/
