package com.kodilla.TicTacToe;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import static com.kodilla.TicTacToe.Score.checkScore;

public class TicTacToeApplication extends Application implements EventHandler<ActionEvent>{

    public static void main(String args[]) {
        launch(args);
    }

    private static Image back = new Image("file:src/main/resources/Table.png");
    private GridPane grid = new GridPane();
    static Fields[] fields = new Fields[9];
    static Label label = new Label();
    static int score1 = 0;
    static int score2 = 0;
    static Label score = new Label(score1 + " - " + score2);
    static int remis = 0;
    private boolean singlePlayer = true;
    private boolean playerTurn = true;


    public void start(Stage primaryStage) throws Exception {
        BackgroundSize backgroundSize = new BackgroundSize(600, 600, true, true, true, false);

        BackgroundImage backgroundImage = new BackgroundImage(back, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        grid.setBackground(background);
        grid.setPrefWidth(200);
        grid.setPrefHeight(200);
        grid.setAlignment(Pos.TOP_CENTER);



        Fields b1 = new Fields();
        Fields b2 = new Fields();
        Fields b3 = new Fields();
        Fields b4 = new Fields();
        Fields b5 = new Fields();
        Fields b6 = new Fields();
        Fields b7 = new Fields();
        Fields b8 = new Fields();
        Fields b9 = new Fields();

        fields[0] = b1;
        fields[1] = b2;
        fields[2] = b3;
        fields[3] = b4;
        fields[4] = b5;
        fields[5] = b6;
        fields[6] = b7;
        fields[7] = b8;
        fields[8] = b9;

        for(int i=0; i<9; i++) {
            fields[i].setOnAction(this);
        }

        grid.add(b1, 0, 0);
        grid.add(b2, 1, 0);
        grid.add(b3, 2, 0);
        grid.add(b4, 0, 1);
        grid.add(b5, 1, 1);
        grid.add(b6, 2, 1);
        grid.add(b7, 0, 2);
        grid.add(b8, 1, 2);
        grid.add(b9, 2, 2);


        Button newGame = new Button("New Game");
        newGame.setOnAction(event -> {
            label.setText("");
            for(int i=0; i<9; i++) {
                fields[i].setState(0);
                fields[i].setDisable(false);
            }
            remis = 0;
        });
        newGame.setPrefSize(100, 40);
        newGame.setOnMouseEntered(event -> {
            newGame.setCursor(Cursor.HAND);
        });
        newGame.setOnMouseExited(event -> {
            newGame.setCursor(Cursor.DEFAULT);
        });
        Button resetScore = new Button("Reset Score");
        resetScore.setOnAction(event -> {
            label.setText("");
            for(int i=0; i<9; i++) {
                fields[i].setState(0);
                fields[i].setDisable(false);
            }
            score1 = 0;
            score2 = 0;
            remis = 0;
            score.setText(score1 + " - " + score2);
        });
        resetScore.setPrefSize(100,40);
        resetScore.setOnMouseEntered(event -> {
            resetScore.setCursor(Cursor.HAND);
        });
        resetScore.setOnMouseExited(event -> {
            resetScore.setCursor(Cursor.DEFAULT);
        });
        HBox scoreBox = new HBox(score);
        scoreBox.setAlignment(Pos.TOP_CENTER);
        scoreBox.setPadding(new Insets(10, 0, 0, 180));
        score.setFont(Font.font("Arial", FontWeight.EXTRA_BOLD, 20));

        HBox labelBox = new HBox(label);
        labelBox.setAlignment(Pos.TOP_CENTER);
        labelBox.setPadding(new Insets(10, 0, 0, 50));
        label.setFont(Font.font("Arial", FontWeight.EXTRA_BOLD, 14));


        FlowPane panel1 = new FlowPane(resetScore);
        panel1.setAlignment(Pos.BOTTOM_RIGHT);
        panel1.setPickOnBounds(false);


        FlowPane panel = new FlowPane(newGame, scoreBox, labelBox);
        panel.setAlignment(Pos.BOTTOM_LEFT);
        panel.setPickOnBounds(false);


        StackPane root = new StackPane();
        root.getChildren().addAll(grid, panel, panel1);


        Scene scene = new Scene(root, 600, 630, Color.WHITE);

        Label title = new Label("Tic Tac Toe");
        title.setFont(Font.font("Algerian",FontWeight.BLACK, 90));
        title.setAlignment(Pos.TOP_CENTER);
        title.setPadding(new Insets(0,0,400,0));

        Button play = new Button("PLAY");
        play.setOnAction(event -> primaryStage.setScene(scene));
        play.setPrefSize(200,100);
        play.setFont(Font.font("Arial", FontWeight.BLACK, 15));


        VBox vBox = new VBox();
        vBox.getChildren().addAll(play);
        vBox.setAlignment(Pos.CENTER);
        vBox.setPadding(new Insets(250,0,0,0));
        vBox.setSpacing(40);


        StackPane mainRoot = new StackPane(title, vBox);
        Scene main = new Scene(mainRoot, 600, 700);

        primaryStage.setTitle("TicTacToe");
        primaryStage.setResizable(false);
        primaryStage.setScene(main);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        for(int i=0; i<9; i++) {
            if(fields[i] == event.getSource()){
                if(singlePlayer) {
                    fields[i].setState(1);
                    remis++;
                    Controller.AI();
                } else if(playerTurn){
                    fields[i].setState(0);
                    remis++;
                    playerTurn = false;
                    checkScore();
                } else {
                    fields[i].setState(-1);
                    playerTurn = true;
                    remis++;
                    checkScore();
                }
            }
        }
    }
}


