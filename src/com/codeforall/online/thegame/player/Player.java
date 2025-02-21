
package com.codeforall.online.thegame.player;

import com.codeforall.online.simplegraphics.pictures.Picture;

public class Player {
    private Picture playerPicture;
    private int rightLimit;
    private int leftLimit;

    public Player(Picture playerPicture){
        this.playerPicture = playerPicture;
        playerPicture.draw();
    }

    public void setRightLimit(int canvasRightLimit){
        rightLimit = canvasRightLimit;
    }

    public void setLeftLimit(int canvasLeftLimit){
        leftLimit = canvasLeftLimit;
    }

    public void moveRight(){
        if(playerPicture.getX() < (rightLimit - (playerPicture.getWidth()))){ //rightLimit do canvas menos a largura da imagem e os +10 é simplesmente uma margem para não sair do tela do canvas
            playerPicture.translate(10, 0);
        }

    }

    public void moveLeft(){
        if(playerPicture.getX() > 0 ) {
            playerPicture.translate(-10, 0);
        }
    }

    public int getTop(){
        return playerPicture.getY();
    }

    public int getLeft(){
        return playerPicture.getX();
    }

    public int getRight(){
        return playerPicture.getX() + playerPicture.getWidth();
    }

    public int getBottom(){
        return playerPicture.getY() + playerPicture.getHeight();
    }

}