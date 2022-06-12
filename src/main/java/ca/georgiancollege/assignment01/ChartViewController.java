package ca.georgiancollege.assignment01;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;

import java.io.IOException;

public class ChartViewController {

    @FXML
    private BarChart<String , Float> barChart;

    @FXML
    private CategoryAxis categoryAxis;

    @FXML
    private NumberAxis numberAxis;

    @FXML
    private void switchtotable(ActionEvent event) throws IOException
    {
        SceneManager.Instance().changeScene(event, "tableview.fxml");
    }

}
