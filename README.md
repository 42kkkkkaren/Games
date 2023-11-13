<h1 align="center">Bad Witches Will Try to Kill You</h1>
<p align="center">It's an adventure game where you have to collect certain items and beat the monster in order to defeat the witch. The game is a version of the Adventure Game created by RyiSnow in one of his tutorials.</p>
<h4 align="center">
    <a href="https://youtu.be/_NRVn2JJ1JM?si=nE3GW1-d6IcA3xXd">🔗 RyiSnow Tutorial</a>
</h4>
<p>It has two versions:</p>
<p>- Java</p>
<p>- Kotlin</p>
<p align="center">Errors while doing the game:</p>
<p>While I was making the game, I encountered an error when I first used the images and found the solution below:</p>
```
AAPT: error: '@tools:sample/avatars' is incompatible with attribute src (attr) reference|color
```
<p>I had to erase the line below:</p>
```
android:src="@tools:sample/avatars"
```
<p>It seems that when selecting new images to ImageView, it only adds another tag, so it doesn't remove the old one. </p>
