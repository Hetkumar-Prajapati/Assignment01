package ca.georgiancollege.assignment01;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;

public class TableViewController {

    @FXML
    private TableColumn<ModelTable,String> code;

    @FXML
    private TableColumn<ModelTable,Integer> id;

    @FXML
    private TableColumn<ModelTable,String> name;

    @FXML
    private TableColumn<ModelTable,Integer> population;

    @FXML
    private TableColumn<ModelTable,String> region;

    @FXML
    private TableView<ModelTable> table;

    @FXML
    private void switchtochart(ActionEvent event) throws IOException
    {
        SceneManager.Instance().changeScene(event, "chartview.fxml");
    }


}
