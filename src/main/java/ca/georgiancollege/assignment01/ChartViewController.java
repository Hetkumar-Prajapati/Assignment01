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

public class ChartViewController implements Initializable {

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
    private void regionalgraph(ActionEvent event) throws IOException
    {
        SceneManager.Instance().changeScene(event, "regionalgraph.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb){

        XYChart.Series<String, Float> series = new XYChart.Series<>();
        series.setName("Population Comparison");
        series.getData().add(new XYChart.Data<>("Kabul" ,178000f));
        series.getData().add(new XYChart.Data<>("Qandahar" ,237500f));
        series.getData().add(new XYChart.Data<>("Herat" ,186800f));
        series.getData().add(new XYChart.Data<>("Mazar-e-Sharif" ,593321f));
        series.getData().add(new XYChart.Data<>("Amsterdam" ,731200f));
        series.getData().add(new XYChart.Data<>("Rotterdam" ,128037f));
        series.getData().add(new XYChart.Data<>("Haag" ,153491f));
        series.getData().add(new XYChart.Data<>("Utrecht" ,440900f));
        series.getData().add(new XYChart.Data<>("Eindhoven" ,234323f));
        series.getData().add(new XYChart.Data<>("Tilburg" ,201843f));
        series.getData().add(new XYChart.Data<>("Groningen" ,193238f));
        series.getData().add(new XYChart.Data<>("Breda" ,160398f));
        series.getData().add(new XYChart.Data<>("Apeldoorn" ,152463f));
        series.getData().add(new XYChart.Data<>("Almere" ,128037f));

        barChart.getData().add(series);

    }
}
