package ca.georgiancollege.assignment01;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TableViewController implements Initializable {

    @FXML
    private TableColumn<ModelTable,String> code;

    @FXML
    private TableColumn<ModelTable,String> id;

    @FXML
    private TableColumn<ModelTable,String> name;

    @FXML
    private TableColumn<ModelTable,String> population;

    @FXML
    private TableColumn<ModelTable,String> region;

    @FXML
    private TableView<ModelTable> table;

    ObservableList<ModelTable> list = FXCollections.observableArrayList(
            new ModelTable("4073", "1780000","ZWE","Kabul","Midlands"),
            new ModelTable("4074", "237500","PSE","Qandahar","Rafah"),
            new ModelTable("4075", "186800","ZWE","Herat","Midlands"),
            new ModelTable("4077", "127800","ZPSE","Mazar-e-Sharif","North gaza"),
            new ModelTable("4078", "731200","NLD","Amsterdam","Rafah"),
            new ModelTable("4079", "593321","ZWE","Rotterdam","North gaza"),
            new ModelTable("4080", "440900","NLD","Haag","Midlands"),
            new ModelTable("4081", "234323","AGF","Utrecht","North gaza"),
            new ModelTable("4082", "201843","NLD","Eindhoven","Rafah"),
            new ModelTable("4083", "193238","AGF","Tilburg","North gaza"),
            new ModelTable("4084", "172701","ZWE","Groningen","Midlands"),
            new ModelTable("4085", "160398","NLD","Breda","North gaza"),
            new ModelTable("4086", "153491","ZWE","Apeldoorn","Rafah"),
            new ModelTable("4087", "152463","ZWAGFE","Almere","Midlands")
    );

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    /*
        Connection con = null;
        try {
            con = DBConnection.getConnection();
            ResultSet rs = con.createStatement().executeQuery("select* from worldpopulation.city;");

            while(rs.next())
            {
                oblist.add(new ModelTable(rs.getString("code"),rs.getString("name"),
                        rs.getString("continent"),rs.getString("region"),
                        rs.getString("population")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

     */


        id.setCellValueFactory(new PropertyValueFactory<ModelTable,String>("id"));
        name.setCellValueFactory(new PropertyValueFactory<ModelTable,String>("name"));
        code.setCellValueFactory(new PropertyValueFactory<ModelTable,String>("code"));
        region.setCellValueFactory(new PropertyValueFactory<ModelTable,String>("region"));
        population.setCellValueFactory(new PropertyValueFactory<ModelTable,String>("population"));

        table.setItems(list);
    }

    @FXML
    private void switchtochart(ActionEvent event) throws IOException
    {
        SceneManager.Instance().changeScene(event, "chartview.fxml");
    }



}
