/*
 * Author: Rushil Patel, rushil2011@my.fit.edu
 * Fall 2012 Project: snake
 */
import java.awt.event.KeyEvent;

public class Snake {

    public static void main (final String[] args) {
        // Tracks game status
        boolean playing = false;
        String key = ""; // Tracks the last key pressed
        // Creates a game with the screen size of 650 x 490
        final SnakeMover snake = new SnakeMover (650, 490);

        // while game is on move the snake
        while (!snake.draw (playing)) {
            // Tell which direction the snake needs to move
            // based on the user input
            snake.setDirection (key);

            // move snake up if the user presses "up arrow" or "W" key
            if (StdDraw.isKeyPressed (KeyEvent.VK_UP)
                    || StdDraw.isKeyPressed (KeyEvent.VK_W)) {
                // only move the snake if it is not going downwards
                if (!key.equals ("down")) {
                    key = "up";
                    playing = true;
                }
                // move snake down if the user presses "down arrow" or "S" key
            } else if (StdDraw.isKeyPressed (KeyEvent.VK_DOWN)
                    || StdDraw.isKeyPressed (KeyEvent.VK_S)) {
                // only move the snake if it is not going upwards
                if (!key.equals ("up")) {
                    key = "down";
                    playing = true;
                }
                // move snake left if the user presses "left arrow" or "A" key
            } else if (StdDraw.isKeyPressed (KeyEvent.VK_LEFT)
                    || StdDraw.isKeyPressed (KeyEvent.VK_A)) {
                // only move the snake if it is not going right
                if (!key.equals ("right")) {
                    key = "left";
                    playing = true;
                }
                // move snake right if the user presses "right arrow" or "D" key
            } else if (StdDraw.isKeyPressed (KeyEvent.VK_RIGHT)
                    || StdDraw.isKeyPressed (KeyEvent.VK_D)) {
                // only move the snake if it is not going left
                if (!key.equals ("left") && playing) {
                    key = "right";
                    playing = true;
                }
            }
        }
    }
}
