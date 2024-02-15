package com.akeir.scene.controller;

import com.akeir.scene.LibraryScene;
import com.akeir.scene.RegisterBookScene;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class LibrarySceneController {

    private static LibrarySceneController instance;
    private static LibraryScene libraryScene;

    private LibrarySceneController() { }

    public static LibrarySceneController getInstance()
    {
        if(null == instance)
        {
            instance = new LibrarySceneController();
        }

        return instance;
    }

    public static void setLibraryScene(LibraryScene librarySceneInstance)
    {
        libraryScene = librarySceneInstance;
    }

    public void openRegisterBookScene()
    {
        Pane pane = new RegisterBookScene();

        libraryScene.getBtnRegister().setDisable(true);
        Stage thisWindow = (Stage) libraryScene.getScene().getWindow();
        thisWindow.hide();

        Scene scene = new Scene(pane);
        Stage newWindow = new Stage();
        newWindow.setTitle("Register Book");
        newWindow.initModality(Modality.WINDOW_MODAL);
        newWindow.setResizable(false);
        newWindow.setScene(scene);
        newWindow.showAndWait();

        libraryScene.getBtnRegister().setDisable(false);
        thisWindow.show();

        readTable();
        clearFilterFields();
        setDefaultCompleteList();
    }

    public void openEditBookScene()
    {
        Pane pane = new RegisterBookScene();

        libraryScene.getBtnRegister().setDisable(true);
        Stage thisWindow = (Stage) libraryScene.getScene().getWindow();
        thisWindow.hide();

        Scene scene = new Scene(pane);
        Stage newWindow = new Stage();
        newWindow.setTitle("Register Book");
        newWindow.initModality(Modality.WINDOW_MODAL);
        newWindow.setResizable(false);
        newWindow.setScene(scene);
        newWindow.showAndWait();

        libraryScene.getBtnRegister().setDisable(false);
        thisWindow.show();

        readTable();
        clearFilterFields();
        setDefaultCompleteList();
    }

    public void readTable()
    {

    }

    public void clearFilterFields()
    {
        libraryScene.getTxtTitle().clear();
        libraryScene.getTxtAuthor().clear();
        libraryScene.getTxtGenre().clear();
        libraryScene.getTxtPublisher().clear();
    }

    private void setDefaultCompleteList()
    {

    }

}
