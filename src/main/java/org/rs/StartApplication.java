package org.rs;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * 项目开始类，定义Stage页面并将‘/fxml/mian.fxml’路径的页面导入，
 * 同时设置main函数启动工程
 */
public class StartApplication extends Application {

    private Stage primaryStage;
    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("城市遥感应用");
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/mian.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
