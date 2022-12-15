package org.rs;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Set;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

/**
 * 对resources文件夹下fxml的main.fxml界面进行有关逻辑的填充
 */
public class Main implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    @FXML
    private ListView<String> listview;

    @FXML
    private WebView web;
    private ObservableList<String> observableList = FXCollections.observableArrayList();

    private final Image image01 = new Image("icons/buildings.png");
    private final Image image02 = new Image("icons/google-maps.png");

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //左侧listview添加 城市名字
        listview.setItems(observableList);
        observableList.add("地图");
        observableList.add("广州");
        observableList.add("深圳");
        observableList.add("佛山");
        observableList.add("东莞");

        observableList.add("惠州");
        observableList.add("珠海");
        observableList.add("王五");
        observableList.add("江门");

        observableList.add("中山");
        observableList.add("肇庆");
        observableList.add("韶关");
        observableList.add("清远");
        observableList.add("云浮");
        observableList.add("茂名");
        observableList.add("湛江");
        observableList.add("阳江");
        observableList.add("河源");
        observableList.add("梅州");
        observableList.add("潮州");
        observableList.add("汕头");
        observableList.add("揭阳");
        observableList.add("汕尾");

        //设置左侧listview有关图片
        listview.setCellFactory(param -> new ListCell<String>(){
            private ImageView imageView = new ImageView();
            @Override
            public void updateItem(String name, boolean empty){
                super.updateItem(name, empty);
                if (empty){
                    setText(null);
                    setGraphic(null);
                }if ("地图".equals(name)){
                    imageView.setImage(image02);
                    imageView.setFitHeight(20);
                    imageView.setFitWidth(20);
                }else{
                    imageView.setImage(image01);
                    imageView.setFitHeight(20);
                    imageView.setFitWidth(20);
                }
                setText(name);
                setGraphic(imageView);
            }
        });

        //new一个WebEngine对象（main.fxml的右侧定义的是一个WebEngine组件，
        // 可在main.fxml文件的页面右键选择用ScreenBuilder软件打开查看main.fxml的布局）
        final WebEngine webengine = web.getEngine();
        //将能够展现高德地图的html页面导入webengine
        String url = Main.class.getResource("/html/地图全貌.html").toExternalForm();
        webengine.load(url);


    }
}