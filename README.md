# Workshop Kafka

Esta documentação fornece instruções passo a passo para configurar o projeto do workshop Kafka.

## Pré-requisitos

Antes de começar, certifique-se de ter os seguintes pré-requisitos instalados em sua máquina:

- Git
- SDKMAN
- Docker-Compose
- Kit de Desenvolvimento Java (JDK) 17

## Instruções de Instalação

### Passo 1: Instalando o SDKMAN

1. Abra um terminal ou prompt de comando.
2. Execute o seguinte comando para instalar o SDKMAN:

```console
$ curl -s "https://get.sdkman.io" | bash
```

### Passo 2: Instalando o Docker Compose e Iniciando os Containers

1. Abra um terminal ou prompt de comando.
2. Execute o seguinte comando para instalar o SDKMAN:
```console
$ sudo curl -L "https://github.com/docker/compose/releases/latest/download/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose
$ sudo chmod +x /usr/local/bin/docker-compose
$ docker-compose up -d (docker compose para novas versões)
```

### Passo 3: Instalando a versão 17.0.4 do Java do Corretto Amazon usando o SDKMAN

1. Abra um terminal ou prompt de comando.
2. Execute os seguintes comandos:
```console
$ sdk install java 17.0.4-amzn
$ sdk use java 17.0.4-amzn
```

3. Verifique se o Java 17 está instalado executando o seguinte comando:
```console
$ java -version
```

### Passo 4: Construindo a Aplicação usando o Gradle Wrapper
1. Abra um terminal ou prompt de comando.
2. Navegue até o diretório do projeto.
3. Execute o seguinte comando para construir a aplicação:

```console
$ ./gradlew build
```
