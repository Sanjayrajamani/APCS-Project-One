import processing.core.PApplet;

import java.util.ArrayList;

public class Game extends PApplet {
    // TODO: declare game variables
    Player player;
    //Shop shop;
    //    restaurant;
   // ArrayList<Bullet> bullets;
    ArrayList<Monster> enemies;

    public void settings() {
        size(800, 800);   // set the window size

    }

    public void setup() {
        // TODO: initialize game variables
    }

    /***
     * Draws each frame to the screen.  Runs automatically in a loop at frameRate frames a second.
     * tick each object (have it update itself), and draw each object
     */
    public void draw() {
        background(200);
       // shop.display();
       // restaurant.display();
        player.display(this);
        for(Monster m : enemies){
            m.display(this);
        }
      //  for(Bullet b : bullets){
      //      b.display(this);
       // }
        move();

    }

    public void move() {
        for(Monster m : enemies){
            m.move();
        }
        if (keyPressed) {
            player.move(key);
        }
    }

    public void collision(){
      /*/  if(shop.collides(player)){
            shop.updatePlayer(player);
        }
        if(restaurant.collides(player)){
            restaurant.updatePlayer(player);
        }
        for(Bullet b : bullets){
            for(Monster m : enemies){
                if(b.collides(m)){
                    bullets.remove(b);
                    enemies.remove(m);
                }
            }
        }


/*/
    }

    public static void main(String[] args) {
        PApplet.main("Game");
    }
}
