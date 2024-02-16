<h1 align="center">Bad Witches Will Try to Kill You</h1>
<p align="center">It's an adventure game where you have to collect certain items and beat the monster in order to defeat the witch. The game is a version of the Adventure Game created by RyiSnow in one of his tutorials.</p>
<h4 align="center">
    <a href="https://youtu.be/_NRVn2JJ1JM?si=nE3GW1-d6IcA3xXd">🔗 RyiSnow Tutorial</a>
</h4>
<div align="center">
  <img src="Bad Witches Will Try To Kill You/JAVA/Resourcers/BWWTKY.png">
</div>
<p>Java version:</p>
<p><a href="https://github.com/42kkkkkaren/Games/tree/main/Bad%20Witches%20Will%20Try%20To%20Kill%20You/JAVA">- Java</a></p>

<p align="center">Errors while doing the game:</p>
<p>While I was making the game, I encountered an error when I first used the images and found the solution below:</p>

```AAPT: error: '@tools:sample/avatars' is incompatible with attribute src (attr) reference|color```
<p>I had to erase the line below:</p>

```android:src="@tools:sample/avatars"```
<p>It seems that when selecting new images to ImageView, it only adds another tag, so it doesn't remove the old one. </p>
<div align="center">
  <img src="Bad Witches Will Try To Kill You/JAVA/Resourcers/22ee4db2-63f5-46e9-a937-b1ceca6cfff4.jpg">
</div>

<h1 align="center">Pac Man</h1>
<p align="center">Protótipo de um jogo modelo foge-foge, como o Pac-Man, onde o herói passeia por um mapa enquanto tenta não ser pego pelos fantasmas e, durante o jogo, é possível encontrar pílulas que permitem o personagem ter poderes especiais, como o de explosão. Foram incrementadas diversas novas funcionalisades, como o rankeamento de pontuação, novos mapas, dificuldade de jogo e acréscimo de mais fantasmas. Projeto preparado para Algoritmo e Estrutura de Dados I, sob docência de Roberto Ferrari Junior.</p>
<p> Jogabilidade Inicial, apresentação de mapas e arte baseada na tabela ASCII. </p>
<div align="center">
  <img  width="500" alt="primeira demonstração de jogabilidade do projeto pac man" src="Pac Man/img/jogabilidade0.png">
  <img  width="500" alt="segunda demonstração de jogabilidade do projeto pac man" src="Pac Man/img/jogabilidade1.png">
  <img  width="500" alt="terceira demonstração de jogabilidade do projeto pac man" src="Pac Man/img/jogabilidade2.png">
</div>
<p> Rankeamento de pontuação </p>
<p> Rankeamento mostra a maior pontuação dos 10 primeiros jogadores. Função construída com o auxílio da estrutura de dados "lista cadastral". </p>
<p align="center"><img  width="500" alt="demonstração do rankeamento de pontuação" src="Pac Man/img/ranking.png" /></p>

<p>Dificuldade dos mapas</p>
<p>Foi acrescentado ao projeto a possibilidade de dificultar o mapa em que o jogador se divertirá, onde incrementa-se o número de fantasmas conforme a dificuldade.</p>

Fácil
<p align="center"><img  width="500" alt="dificuldade de mapa fácil" src="Pac Man/img/easy.png" /></p>

Médio
<p align="center"><img  width="500" alt="dificuldade de mapa médio" src="Pac Man/img/medium.png" /></p>

Difícil
<p align="center"><img  width="500" alt="dificuldade de mapa difícil" src="Pac Man/img/hard.png" /></p>
