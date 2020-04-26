package br.com.pizzamanager.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/FXMLTelaLogin.fxml"));
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/fxmltelalogin.css");
        Image applicationIcon = new Image(getClass().getResourceAsStream("/img/iconPizza.png"));
        stage.getIcons().add(applicationIcon);
        
        stage.setTitle("SGP - Sistema Gerenciador de Pizzaria");
        stage.setScene(scene);
        stage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }



}
