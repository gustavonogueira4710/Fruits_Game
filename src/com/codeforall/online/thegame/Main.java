package com.codeforall.online.thegame;

import com.codeforall.online.simplegraphics.graphics.Canvas;
import com.codeforall.online.simplegraphics.graphics.Text;
import com.codeforall.online.simplegraphics.pictures.Picture;
import com.codeforall.online.thegame.player.MyKeyboard;
import com.codeforall.online.thegame.player.Player;

public class Main {
    public static void main(String[] args) {

        //background
        Picture background = new Picture(0,0,Game.PREFIX + "background.png" );
        Canvas.getInstance().show(background);


        //character
        Player player = new Player(new Picture(0,370,Game.PREFIX + "player2.png"));
        player.setRightLimit(background.getWidth());
        player.setLeftLimit(background.getHeight());

        //keyboard
        MyKeyboard myKeyboard = new MyKeyboard(player);
        myKeyboard.init();

        //Mouse
        /*MyMouse myMouse = new MyMouse();
        myMouse.setPikachu(pika);
        myMouse.init();

         */
        Picture fruits = Fruit.APPLE.getFruitsPicture();
        Canvas.getInstance().show(fruits);
        String fruitsText = Fruit.APPLE.getDescription();
        System.out.println(fruitsText);

        //Vamos gerar várias bananas de forma aleatória
        /* while (true) {
            Thread.sleep(1000);
        }*/

        Fruit[] lot = Fruit.values();
        for(int i = 0; i < lot.length;i++){
            lot[i].getFruitsPicturePrint();
        }





        int score=0;
        Text text = new Text(0,0,"score:" + score);
        text.draw();


        score+=20;
        text.setText("score: " + score);



    }
}
