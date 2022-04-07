package io.github.dbc.java_collections_roadmap.controller;

import io.github.dbc.java_collections_roadmap.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class SortElementsController {
    @FXML
    public Button setSortingYesButton;

    @FXML
    public Button setSortingNoButton;


    @FXML
    public void sortingYesButtonPressed() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Sort Elements");
        alert.setHeaderText("Use SortedSet");
        alert.setContentText("The code for the SortedSet interface follows.\n" +
                "\n" +
                "public interface SortedSet<E> extends Set<E> {\n" +
                "    // Range-view\n" +
                "    SortedSet<E> subSet(E fromElement, E toElement);\n" +
                "    SortedSet<E> headSet(E toElement);\n" +
                "    SortedSet<E> tailSet(E fromElement);\n" +
                "\n" +
                "    // Endpoints\n" +
                "    E first();\n" +
                "    E last();\n" +
                "\n" +
                "    // Comparator access\n" +
                "    Comparator<? super E> comparator();\n" +
                "}");
        alert.setResizable(false);
        alert.showAndWait();

    }

    @FXML
    public void sortingNoButtonPressed() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("set-methods-elements-view.fxml"));
        Scene scene = new Scene(
                fxmlLoader.load(),
                Screen.getPrimary().getBounds().getMinX(),
                Screen.getPrimary().getBounds().getMinY()
        );
        stage.setTitle("Sort Elements");
        stage.setScene(scene);
        stage.show();
        // close the current stage
        closeCurrentStage();

    }

    private void closeCurrentStage() {
        Stage stage = (Stage) setSortingYesButton.getScene().getWindow();
        stage.close();
    }
}
