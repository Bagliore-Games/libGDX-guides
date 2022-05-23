# First Game in libGDC

## DesktopLauncher
- We set the title of our game
- We set the starting size of the screen

## MyGame
- We create the abstraction of a playable character
````java
// player
	Texture img;
	int x, y = 0;
	int size = 200;
````
- On every update of the game lifecycle, we check on keys pressed to move the character and to resize it

## Useful links
- [Setting up dev-env](https://libgdx.com/wiki/start/setup)
- [app lifecycle](https://libgdx.com/wiki/app/the-life-cycle)
- [libGDX modules](https://libgdx.com/wiki/app/modules-overview)