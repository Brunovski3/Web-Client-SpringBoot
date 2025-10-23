# Web Client Spring Boot 🔗

![Java](https://img.shields.io/badge/Java-21%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![Spring WebFlux](https://img.shields.io/badge/Spring_WebFlux-reactive-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-Project-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![Lombok](https://img.shields.io/badge/Lombok-1.18.x-red?style=for-the-badge)

Um projeto Spring Boot que demonstra o consumo de APIs externas usando o cliente HTTP reativo `WebClient` (Spring WebFlux). Ideal para estudar integração entre serviços, programação reativa e boas práticas de resiliência (timeouts, retries e tratamento de erros).

- Repositório: [Brunovski3/Web-Client-SpringBoot](https://github.com/Brunovski3/Web-Client-SpringBoot)

## 🎯 Objetivo do Projeto

Registrar o desenvolvimento de um cliente HTTP simples em **Java** e **Spring Boot**, aplicando conceitos de **programação reativa** com **WebFlux/WebClient** e explorando padrões para consumo de APIs externas.

### 💡 Conceitos Aplicados

- Consumo de APIs externas com `WebClient` (GET, POST, PUT, DELETE).
- Programação reativa com Project Reactor (`Mono` e `Flux`).
- Tratamento de erros e mapeamento de respostas (`onStatus`, `exchangeToMono`).
- Resiliência: timeouts, retries com backoff, headers e logging.
- Boas práticas de arquitetura: separação entre camadas (`client`, `service`, `controller`, `dto`).
- Testes com `spring-boot-starter-test` e `reactor-test`.

## ✨ O que este projeto oferece

- ✅ Cliente HTTP reativo configurado (bean `WebClient` com `baseUrl`).
- ✅ Exemplos de chamadas com headers, path params e query params.
- ✅ Estrutura preparada para expor endpoints (opcional) que orquestram chamadas externas.
- ✅ Testes básicos com Reactor.

> Observação: Este projeto é focado no consumo de APIs. Endpoints REST próprios do serviço podem ser adicionados conforme necessidade (por exemplo, para atuar como BFF/proxy).

## 🚀 Tecnologias Utilizadas

- Java 21
- Spring Boot 3.x
- Spring WebFlux (WebClient)
- Spring Web (opcional, para controllers MVC)
- Maven
- Lombok
- JUnit + Reactor Test


## 📂 Estrutura

```
src/main/java
└── com/example/web
    ├── WebApplication.java
    ├── config/       # Beans do WebClient, timeouts, interceptors
    ├── client/       # Chamadas externas (WebClient)
    ├── service/      # Regras/orquestrações
    ├── controller/   # Endpoints REST próprios
    └── dto/          # Modelos para request/response
src/test/java
```

---

Autor: @Brunovski3
