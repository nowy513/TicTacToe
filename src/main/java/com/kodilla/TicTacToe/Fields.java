package com.kodilla.TicTacToe;

import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Fields extends Button {

    private int state;


    public Fields()  {

        this.setState(0);
        this.setPrefSize(200,197);
        this.setFont(Font.font("Arial", FontWeight.BLACK,60));

    }

        public void setState(int x){

            if (x==0){
            this.setText("");
                this.state = 0;
            }else if (x==1){
                this.setText("X");
                this.state = 1;
                this.setDisable(true);
            }else if (x==-1){
                this.setText("O");
                this.state = -1;
                this.setDisable(true);
            }
        }

    public int getState(){
        return state;
    }

}