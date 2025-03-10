FROM gradle:jdk23-graal

WORKDIR /app
COPY ./ /app/

EXPOSE 8080

# Configurando proxy no gradle e executando build native
RUN ./gradlew test && ./gradlew nativeBuild

RUN mv build/native/nativeCompile/demo .

RUN chmod +x demo

# Ativando ponto de entrada
ENTRYPOINT ["./demo"]
