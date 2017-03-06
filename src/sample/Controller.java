package sample;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    ObservableList<Contact> items = FXCollections.observableArrayList();

    @FXML
    ListView list;

    @FXML
    TextField Name;

    @FXML
    TextField Phone;

    @FXML
    TextField Email;


    @FXML
    HBox text;


    public void addItem(){
        if (!Name.getText().isEmpty()&& !Phone.getText().isEmpty()&& !Email.getText().isEmpty()){
            Contact contact = new Contact(Name.getText(), Phone.getText(), Email.getText());
            items.add(contact);
            Name.setText("");
            Phone.setText("");
            Email.setText("");
        }


//        items.add(new Contact(Name.getText()));
//        Name.setText("");
//        items.add(new Contact(Phone.getText()));
//        Phone.setText("");
//        items.add(new Contact(Email.getText()));
//        Email.setText("");
    }
//    {System.out.println("addItem");}

    public void removeItem (){
        Contact contact = (Contact) list.getSelectionModel().getSelectedItem();
        items.remove(contact);
    }

//    {System.out.println("removeItem");}


    @Override
    public void initialize(URL location, ResourceBundle resources){
        list.setItems(items);

    }
}
