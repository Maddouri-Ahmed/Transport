/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author amadd
 */
public class TransportController implements Initializable {

  @FXML
    private Button si_add;

    @FXML
    private Button si_delete;

    @FXML
    private Label si_g;

    @FXML
    private AnchorPane si_gform;

    @FXML
    private Hyperlink si_ret;

    @FXML
    private Button si_search;

    @FXML
    private Button si_update;

    @FXML
    private Button so_b;

    @FXML
    private Button so_bb;

    @FXML
    private AnchorPane so_form;

    @FXML
    private RadioButton so_rad;

    @FXML
    private Label sp_aj;

    @FXML
    private TextField sp_cap;

    @FXML
    private Label sp_capacite;

    @FXML
    private TextField sp_da;

    @FXML
    private Label sp_datea;

    @FXML
    private Label sp_dated;

    @FXML
    private TextField sp_dd;

    @FXML
    private AnchorPane sp_form;

    @FXML
    private Hyperlink sp_ret;

    @FXML
    private Label sp_ty;

    @FXML
    private ComboBox<?> sp_type;

    @FXML
    private Button sp_valide;
    
  @FXML
    public void switchForm(ActionEvent event){
     
    TranslateTransition slider = new TranslateTransition();
    if (event.getSource()== si_add){
        slider.setNode(so_form);
        slider.setToX(300);
        slider.setDuration(Duration.seconds(.5));
        
        slider.play();
    }
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
