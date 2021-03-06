package com.kodilla.TicTacToe;

public class Score extends TicTacToeApplication{

    static void checkScore() {

        if(fields[0].getState() + fields[1].getState() + fields[2].getState() == 3) {
            label.setText(p1 + " won!");
            for(int i= 0; i<9; i++) {
                fields[i].setDisable(true);
            }
            score1++;
            score.setText(score1 + " - " + score2);
        }
        if(fields[0].getState() + fields[1].getState() + fields[2].getState() == -3) {
            label.setText(p2 + " won!");
            for(int i= 0; i<9; i++) {
                fields[i].setDisable(true);
            }
            score2++;
            score.setText(score1 + " - " + score2);
        }

        if(fields[3].getState() + fields[4].getState() + fields[5].getState() == 3) {
            label.setText(p1 + " won!");
            for(int i= 0; i<9; i++) {
                fields[i].setDisable(true);
            }
            score1++;
            score.setText(score1 + " - " + score2);
        }
        if(fields[3].getState() + fields[4].getState() + fields[5].getState() == -3) {
            label.setText(p2 + " won!");
            for(int i= 0; i<9; i++) {
                fields[i].setDisable(true);
            }
            score2++;
            score.setText(score1 + " - " + score2);
        }

        if(fields[6].getState() + fields[7].getState() + fields[8].getState() == 3) {
            label.setText(p1 + " won!");
            for(int i= 0; i<9; i++) {
                fields[i].setDisable(true);
            }
            score1++;
            score.setText(score1 + " - " + score2);
        }
        if(fields[6].getState() + fields[7].getState() + fields[8].getState() == -3) {
            label.setText(p2 + " won!");
            for(int i= 0; i<9; i++) {
                fields[i].setDisable(true);
            }
            score2++;
            score.setText(score1 + " - " + score2);
        }

        if (fields[0].getState() + fields[3].getState() + fields[6].getState() == 3) {
            label.setText(p1 + " won!");
            for(int i= 0; i<9; i++) {
                fields[i].setDisable(true);
            }
            score1++;
            score.setText(score1 + " - " + score2);
        }
        if(fields[0].getState() + fields[3].getState() + fields[6].getState() == -3) {
            label.setText(p2 + " won!");
            for(int i= 0; i<9; i++) {
                fields[i].setDisable(true);
            }
            score2++;
            score.setText(score1 + " - " + score2);
        }

        if(fields[1].getState() + fields[4].getState() + fields[7].getState() == 3) {
            label.setText(p1 + " won!");
            for(int i= 0; i<9; i++) {
                fields[i].setDisable(true);
            }
            score1++;
            score.setText(score1 + " - " + score2);
        }
        if(fields[1].getState() + fields[4].getState() + fields[7].getState() == -3) {
            label.setText(p2 + " won!");
            for(int i= 0; i<9; i++) {
                fields[i].setDisable(true);
            }
            score2++;
            score.setText(score1 + " - " + score2);
        }

        if(fields[2].getState() + fields[5].getState() + fields[8].getState() == 3) {
            label.setText(p1 + " won!");
            for(int i= 0; i<9; i++) {
                fields[i].setDisable(true);
            }
            score1++;
            score.setText(score1 + " - " + score2);
        }
        if(fields[2].getState() + fields[5].getState() + fields[8].getState() == -3) {
            label.setText(p2 + " won!");
            for(int i= 0; i<9; i++) {
                fields[i].setDisable(true);
            }
            score2++;
            score.setText(score1 + " - " + score2);
        }

        if(fields[0].getState() + fields[4].getState() + fields[8].getState() == 3) {
            label.setText(p1 + " won!");
            for(int i= 0; i<9; i++) {
                fields[i].setDisable(true);
            }
            score1++;
            score.setText(score1 + " - " + score2);
        }
        if(fields[0].getState() + fields[4].getState() + fields[8].getState() == -3) {
            label.setText(p2 + " won!");
            for (int i = 0; i < 9; i++) {
                fields[i].setDisable(true);
            }
            score2++;
            score.setText(score1 + " - " + score2);
        }

        if(fields[2].getState() + fields[4].getState() + fields[6].getState() == 3) {
            label.setText(p1 + " won!");
            for(int i= 0; i<9; i++) {
                fields[i].setDisable(true);
            }
            score1++;
            score.setText(score1 + " - " + score2);
        }
        if(fields[2].getState() + fields[4].getState() + fields[6].getState() == -3) {
            label.setText(p2 + " won!");
            for(int i= 0; i<9; i++) {
                fields[i].setDisable(true);
            }
            score2++;
            score.setText(score1 + " - " + score2);
        }

        if (remis == 9){
            label.setText("It's a remis!");
        }
    }
}
