package org.rs;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import org.rs.pojo.City;

import java.net.URL;
import java.util.ResourceBundle;

public class ListviewTest implements Initializable {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    @FXML
    private ListView<String> listview ;



    private final Image image01 = new Image("icons/city.png");
    private final Image image02 = new Image("icons/architecture-and-city.png");
    private final Image image03 = new Image("icons/buildings.png");
    private final Image image04 = new Image("icons/cityscape.png");

    private Image[] listOfImages = {image01, image02, image03, image04};

    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        String[] citys = {"aa","bb","cc","dd","ee","ff","gg"};
//        listview<City> temp = new listview<>();
//        for (int i = 0; i < citys.length; i++){
//            City city = new City(citys[i]);
//            observableList.add(city);
//        }
//        listview.setItems(observableList);
        ObservableList<String> observableList = FXCollections.observableArrayList(
                "test1", "test2", "test3", "test4", "test5"
        );
        listview.setItems(observableList);


    }
}
