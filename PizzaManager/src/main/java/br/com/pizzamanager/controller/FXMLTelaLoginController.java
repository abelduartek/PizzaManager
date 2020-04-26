package br.com.pizzamanager.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class FXMLTelaLoginController {

    @FXML private AnchorPane anchorPrincipal;
    @FXML private Pane paneLogin;
    @FXML private TextField txtUsuario;
    @FXML private PasswordField txtSenha;
    @FXML private Button btnEntrar;
    @FXML private Button btnSair;
    @FXML private Label lblAreaLogin;
    @FXML private Label lblEsqueciMinhaSenha;
    @FXML private Label lblDireitosReservados;
    @FXML private ImageView imgPizza;

  
    @FXML
    void actionButtonSair(ActionEvent event) {
    	System.exit(0);
    }

    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
