# pos-docker-challenge

Projeto de desafio do modulo 2 de Docker

Para startar o projeto siga os passos abaixos:

1 - criar um network no docker chamado docker-network
    
    - docker network create docker-network
2 - Rodar o postgres com o comando abaixo:

    - docker run -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=docker-challenge  --name postgres --network docker-network  -p 5432:5432 -d  postgres:latest

3 - Inicialiar a aplicação com o comando abaixo:

    -  docker run --name docker-challenge --network docker-network -p 8080:8080 emersondiegoduarte/pos-docker-challenge:latest 

4 - Abra o navegador e entre em:

    - http://localhost:8080/

 

