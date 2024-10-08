# Projeto: myMusics

Este projeto é uma aplicação simples para gerenciar músicas e podcasts, permitindo reproduzir, curtir e avaliar mídias.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- `main`: Contém a classe `Main`, que será responsável pela execução da aplicação.
- `models`: Contém as classes que representam os diferentes tipos de mídia.

### Classes no Pacote `models`

#### `Audio`
Classe base para músicas e podcasts.

- Atributos: `title`, `playCount`, `likeCount`, `rating`.
- Métodos principais:
    - `like()`: Incrementa o número de curtidas.
    - `play()`: Incrementa o número de reproduções.
    - Getters e setters para os atributos da classe.

#### `FavoriteSongs`
Classe responsável por incluir áudios em uma lista de favoritos com base na avaliação.

- Método:
    - `include(Audio audio)`: Verifica a avaliação (`rating`) do áudio e exibe uma mensagem sobre sua popularidade.

#### `Music`
Classe que herda de `Audio` e adiciona detalhes específicos de músicas.

- Atributos: `album`, `singer`, `genre`.
- O `rating` é sobrescrito, onde músicas com mais de 2000 reproduções têm avaliação 10, e as com menos, avaliação 7.

#### `Podcast`
Classe que herda de `Audio` e define propriedades específicas para podcasts.

- Atributos: `presenter`, `description`.
- O `rating` é sobrescrito, onde podcasts com mais de 500 reproduções têm avaliação 10, e os com menos, avaliação 8.

## Como Executar

1. No pacote `main`, a classe `Main` será o ponto de partida da execução do programa. Ela deve ser usada para instanciar objetos das classes `Music`, `Podcast` e `FavoriteSongs`, permitindo testar suas funcionalidades como tocar uma música, curtir ou adicionar aos favoritos.

2. Exemplo básico de uso:
    - Criar instâncias de `Music` e `Podcast`.
    - Usar os métodos `play()`, `like()`, e verificar o `rating` da mídia.
    - Adicionar músicas à lista de favoritos usando a classe `FavoriteSongs`.

3. Para rodar o projeto:
    - Certifique-se de que as dependências e o ambiente Java estão configurados.
    - Execute a classe `Main` dentro da sua IDE ou use o terminal com o comando:
      ```bash
      javac Main.java
      java Main
      ```

