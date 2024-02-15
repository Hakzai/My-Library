package com.akeir.scene;

import com.akeir.base.SceneBase;
import com.akeir.scene.builder.LibrarySceneBuilder;
import com.akeir.scene.controller.LibrarySceneController;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class LibraryScene extends SceneBase {

    private Label lbSceneTitle;
    private TableView tbBooks;
    private Label lbFilterBy;
    private Label lbTitle;
    private TextField txtTitle;
    private Label lbAuthor;
    private TextField txtAuthor;
    private Label lbGenre;
    private TextField txtGenre;
    private Label lbPublisher;
    private TextField txtPublisher;
    private Button btnClearFilters;
    private Button btnRegister;
    private Button btnEdit;
    private Button btnDelete;

    public LibraryScene()
    {
        super();
        builder = new LibrarySceneBuilder(this);
        executeBuild();

        setElementsAction();
    }

    @Override
    protected void setElementsAction()
    {
        LibrarySceneController.setLibraryScene(this);

        btnRegister.setOnAction(e -> LibrarySceneController.getInstance().openRegisterBookScene());

        btnEdit.setOnAction(e -> LibrarySceneController.getInstance().openRegisterBookScene());

        btnDelete.setOnAction(e -> LibrarySceneController.getInstance().openRegisterBookScene());

        btnClearFilters.setOnAction(e -> LibrarySceneController.getInstance().clearFilterFields());
    }

    public Label getLbSceneTitle() {
        return lbSceneTitle;
    }

    public void setLbSceneTitle(Label lbSceneTitle) {
        this.lbSceneTitle = lbSceneTitle;
    }

    public TableView getTbBooks() {
        return tbBooks;
    }

    public void setTbBooks(TableView tbBooks) {
        this.tbBooks = tbBooks;
    }

    public Label getLbFilterBy() {
        return lbFilterBy;
    }

    public void setLbFilterBy(Label lbFilterBy) {
        this.lbFilterBy = lbFilterBy;
    }

    public Label getLbTitle() {
        return lbTitle;
    }

    public void setLbTitle(Label lbTitle) {
        this.lbTitle = lbTitle;
    }

    public TextField getTxtTitle() {
        return txtTitle;
    }

    public void setTxtTitle(TextField txtTitle) {
        this.txtTitle = txtTitle;
    }

    public Label getLbAuthor() {
        return lbAuthor;
    }

    public void setLbAuthor(Label lbAuthor) {
        this.lbAuthor = lbAuthor;
    }

    public TextField getTxtAuthor() {
        return txtAuthor;
    }

    public void setTxtAuthor(TextField txtAuthor) {
        this.txtAuthor = txtAuthor;
    }

    public Label getLbGenre() {
        return lbGenre;
    }

    public void setLbGenre(Label lbGenre) {
        this.lbGenre = lbGenre;
    }

    public TextField getTxtGenre() {
        return txtGenre;
    }

    public void setTxtGenre(TextField txtGenre) {
        this.txtGenre = txtGenre;
    }

    public Label getLbPublisher() {
        return lbPublisher;
    }

    public void setLbPublisher(Label lbPublisher) {
        this.lbPublisher = lbPublisher;
    }

    public TextField getTxtPublisher() {
        return txtPublisher;
    }

    public void setTxtPublisher(TextField txtPublisher) {
        this.txtPublisher = txtPublisher;
    }

    public Button getBtnClearFilters() {
        return btnClearFilters;
    }

    public void setBtnClearFilters(Button btnClearFilters) {
        this.btnClearFilters = btnClearFilters;
    }

    public Button getBtnRegister() {
        return btnRegister;
    }

    public void setBtnRegister(Button btnRegister) {
        this.btnRegister = btnRegister;
    }

    public Button getBtnEdit() {
        return btnEdit;
    }

    public void setBtnEdit(Button btnEdit) {
        this.btnEdit = btnEdit;
    }

    public Button getBtnDelete() {
        return btnDelete;
    }

    public void setBtnDelete(Button btnDelete) {
        this.btnDelete = btnDelete;
    }
}
