package ar.com.baglioregames.firstgame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyGame extends ApplicationAdapter {

	SpriteBatch batch;

	// player
	Texture img;
	int x, y = 0;
	int size = 200;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("ball.jpg");
	}

	@Override
	public void render () {
		update();

		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(img, x, y, size, size);
		batch.end();
	}

	private void update() {
		if(Gdx.input.isKeyPressed(Input.Keys.W)) y++;
		if(Gdx.input.isKeyPressed(Input.Keys.S)) y--;
		if(Gdx.input.isKeyPressed(Input.Keys.A)) x--;
		if(Gdx.input.isKeyPressed(Input.Keys.D)) x++;
		if(Gdx.input.isKeyPressed(Input.Keys.Q)) size++;
		if(Gdx.input.isKeyPressed(Input.Keys.E)) size--;
	}


	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
