# Pesquisa de CEP

## Como executar:

* Crie uma pasta com o nome desejado
* Abra o GitBash na pasta criada
* Digite os comandos: 

  ```bash
  git init
  ```
  ```bash
  git clone https://github.com/KauanCalheiro/CEP_Search.git
  ```
* Abra a pasta como projeto na sua IDE para Java
* Configure o JDK para o projeto
* Execute o arquivo Main

## Como funciona:

* Digite um CEP no console para receber as informações sobre

  * Os CEP devem ser digitados de forma unitária
  * Quanto aos formatos de cep aceitos:
  
      ```bash
      00.000-000
      ```
      ```bash
      00000-000
      ```
      ```bash
      00000000
      ```
* Quando desejar encerrar a aplicação digite

  ```bash
  sair
  ```
  
  ou
  
  ```bash
  SAIR
  ```
  
 * Ao final sera gerado um arquivo .json que registra as consultas da ultima execução do programa
