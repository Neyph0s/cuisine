package application;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class Controlleur {

    @FXML
    private ListView<?> ListView;

    @FXML
    private TextField searchBar;

    @FXML
    private Button okButton;

    @FXML
    private RadioButton RdButtonEntree;

    @FXML
    private RadioButton RdButtonPlat;

    @FXML
    private RadioButton RdButtonDessert;


    @FXML
    private Menu btnModif;

    @FXML
    private Menu btnSuppr;

    @FXML
    private Menu btnAjouter;

    @FXML
    void RechercheOk(ActionEvent event) {

    }

    @FXML
    void ajouterRecette(ActionEvent event) {

    }

    @FXML
    void filtrer(ActionEvent event) {

    }

    @FXML
    void modifierRecette(ActionEvent event) {

    }

    @FXML
    void supprimerRecette(ActionEvent event) {

    }

}
