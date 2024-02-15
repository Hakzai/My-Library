package com.akeir.scene;

import com.akeir.base.SceneBase;
import com.akeir.model.Book;
import com.akeir.scene.builder.RegisterBookSceneBuilder;
import com.akeir.scene.control.ButtonImpl;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RegisterBookScene extends SceneBase {

    private Label lbSceneTitle;
    private Label lbTitle;
    private TextField txtTitle;
    private Label lbAuthor;
    private TextField txtAuthor;
    private Label lbGenre;
    private TextField txtGenre;
    private Label lbPublisher;
    private TextField txtPublisher;
    private Label lbYear;
    private TextField txtYear;
    private Label lbEdition;
    private TextField txtEdition;
    private Label lbPages;
    private TextField txtPages;
    private Label lbIsbn;
    private TextField txtIsbn;
    private Label lbLanguage;
    private TextField txtLanguage;
    private Label lbStatus;
    private TextField TxtStatus;
    private Button btnSave;
    private Button btnClear;

    public RegisterBookScene()
    {
        super();
        builder = new RegisterBookSceneBuilder(this);
        executeBuild();

        setElementsAction();
    }

    @Override
    protected void setElementsAction() {
        btnSave.setOnAction(e -> {
            Book book = new Book(
                txtTitle.getText(),
                txtAuthor.getText(),
                txtGenre.getText(),
                txtPublisher.getText(),
                Integer.parseInt(txtYear.getText()),
                Integer.parseInt(txtEdition.getText()),
                Integer.parseInt(txtPages.getText()),
                txtIsbn.getText(),
                txtLanguage.getText(),
                TxtStatus.getText()
            );

            // TODO: create method to save book on database
        });

        btnClear.setOnAction(e -> {
            for(Node node : this.getChildren())
            {
                if(node instanceof TextField)
                {
                    ((TextField) node).clear();
                }
            }
        });
    }

    public Label getLbSceneTitle() {
        return lbSceneTitle;
    }

    public void setLbSceneTitle(Label lbSceneTitle) {
        this.lbSceneTitle = lbSceneTitle;
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

    public Label getLbYear() {
        return lbYear;
    }

    public void setLbYear(Label lbYear) {
        this.lbYear = lbYear;
    }

    public TextField getTxtYear() {
        return txtYear;
    }

    public void setTxtYear(TextField txtYear) {
        this.txtYear = txtYear;
    }

    public Label getLbEdition() {
        return lbEdition;
    }

    public void setLbEdition(Label lbEdition) {
        this.lbEdition = lbEdition;
    }

    public TextField getTxtEdition() {
        return txtEdition;
    }

    public void setTxtEdition(TextField txtEdition) {
        this.txtEdition = txtEdition;
    }

    public Label getLbPages() {
        return lbPages;
    }

    public void setLbPages(Label lbPages) {
        this.lbPages = lbPages;
    }

    public TextField getTxtPages() {
        return txtPages;
    }

    public void setTxtPages(TextField txtPages) {
        this.txtPages = txtPages;
    }

    public Label getLbIsbn() {
        return lbIsbn;
    }

    public void setLbIsbn(Label lbIsbn) {
        this.lbIsbn = lbIsbn;
    }

    public TextField getTxtIsbn() {
        return txtIsbn;
    }

    public void setTxtIsbn(TextField txtIsbn) {
        this.txtIsbn = txtIsbn;
    }

    public Label getLbLanguage() {
        return lbLanguage;
    }

    public void setLbLanguage(Label lbLanguage) {
        this.lbLanguage = lbLanguage;
    }

    public TextField getTxtLanguage() {
        return txtLanguage;
    }

    public void setTxtLanguage(TextField txtLanguage) {
        this.txtLanguage = txtLanguage;
    }

    public Label getLbStatus() {
        return lbStatus;
    }

    public void setLbStatus(Label lbStatus) {
        this.lbStatus = lbStatus;
    }

    public TextField getTxtStatus() {
        return TxtStatus;
    }

    public void setTxtStatus(TextField txtStatus) {
        TxtStatus = txtStatus;
    }

    public Button getBtnSave() {
        return btnSave;
    }

    public void setBtnSave(Button btnSave) {
        this.btnSave = btnSave;
    }

    public Button getBtnClear() {
        return btnClear;
    }

    public void setBtnClear(Button btnClear) {
        this.btnClear = btnClear;
    }
}
