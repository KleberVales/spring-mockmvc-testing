package com.example.springmockmvctesting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMockmvcTestingApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringMockmvcTestingApplication.class, args);
    }
}

/*

    - Criar testes simulando requisições HTTP sem subir servidor real. 
    - Usar @AutoConfigureMockMvc + injeção de MockMvc. 
    - Validar status, corpo e headers da resposta. 
    - criar o terceiro projeto com estrutura de pastas e codigo dos arquivos
    
*/
