## Instruções

1. Certifique-se de possuir o Docker instalado em sua máquina.

2. Entre no diretório do projeto (este que voce está, se consegue ler este arquivo) e execute o comando abaixo:

``
    sudo docker build -t simple_crud .
``

3. Em sequida execute o comando abaixo para executar o código, ele será liberado na porta 8080 do seu computador.

``
sudo docker run -d -p 8080:8080 simple_crud
``
