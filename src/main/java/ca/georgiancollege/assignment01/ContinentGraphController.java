package ca.georgiancollege.assignment01;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ContinentGraphController implements Initializable {

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
    @FXML
    private void countrygraph(ActionEvent event) throws IOException
    {
        SceneManager.Instance().changeScene(event, "chartview.fxml");
    }
    @FXML
    private void regionalgrah(ActionEvent event) throws IOException
    {
        SceneManager.Instance().changeScene(event, "regionalgrah.fxml");
    }



    @Override
    public void initialize(URL url, ResourceBundle rb){

        XYChart.Series<String, Float> series = new XYChart.Series<>();
        series.setName("Population Comparison");
        series.getData().add(new XYChart.Data<>("Asia" ,178000f));
        series.getData().add(new XYChart.Data<>("Europe" ,237500f));
        series.getData().add(new XYChart.Data<>("Netherlands" ,186800f));
        barChart.getData().add(series);

    }
}
