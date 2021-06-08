package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    private Button btn_spis;

    @FXML
    private Button btn_zap;

    @FXML
    private Button btn_plenka;

    @FXML
    private GridPane grid1;

    @FXML
    private Label lab_fio;

    @FXML
    private Label lab_date;

    @FXML
    private Label lab_bdate;

    @FXML
    private Label lab_price;

    @FXML
    private ComboBox<?> com_obsl;

    @FXML
    private ComboBox<?> com_time;

    @FXML
    private GridPane grid2;

    @FXML
    private Label lab_date1;

    @FXML
    private ComboBox<?> com_time1;

    @FXML
    private Label lab_fio1;

    @FXML
    private Label lab_tel;

    @FXML
    private GridPane grid3;

    @FXML
    private Label lab_plenka;

    @FXML
    private HBox h1;

    @FXML
    private HBox h2;

    @FXML
    private HBox h3;

    @FXML
    private Label lab_stat;

    public Stage stage;
    public Scene scene;

//  public void zap(ActionEvent event) throws IOException {
//      Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("zap.fxml")));
//      stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//      scene = new Scene(root);
//      stage.setScene(scene);
//      stage.show();
//  }
// // public void ot(){
//
// // }
//  public void plenk(ActionEvent event) throws IOException{
//      Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("plenka.fxml")));
//      stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//      scene = new Scene(root);
//      stage.setScene(scene);
//      stage.show();
//  }
//  public void newp(ActionEvent event) throws IOException {
//      Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("zap.fxml")));
//      stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//      scene = new Scene(root);
//      stage.setScene(scene);
//      stage.show();
//  }
//  public void change(){

//  }
//  public void del(){

//  }
//  public void back(ActionEvent event) throws IOException{
//      Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Main.fxml")));
//      stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//      scene = new Scene(root);
//      stage.setScene(scene);
//      stage.show();
//  }

    public void btnClick(ActionEvent event) throws IOException{
        if(event.getSource() == btn_zap){
            lab_stat.setText("Запись пациентов");
            grid2.setVisible(true);
            grid3.setVisible(false);
            grid1.setVisible(false);
            grid2.toFront();
            h2.setVisible(true);
            h1.setVisible(false);
            h3.setVisible(false);
        }
        else if(event.getSource() == btn_spis){
            lab_stat.setText("Список пациентов");
            grid1.toFront();
        }
        else if(event.getSource() == btn_plenka){
            lab_stat.setText("Изменение колличества пленки");
            grid3.toFront();
        }
    }
}