/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginwindow2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.io.*;
        

/**
 *
 * @author ASUS
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField usernameTxt;
    @FXML
    private TextField passwordTxt;
   
    @FXML
    private void clickLoginBtn(ActionEvent event){
        try{
        File credentials = new File("D:\\From DELL\\J'pura All files\\Acedamic\\Assignments\\Assignment JAVA\\TestRuns\\Credentials.txt");
        PrintWriter printer = new PrintWriter(new FileOutputStream(credentials,true));
        printer.write(usernameTxt.getText()+","+passwordTxt.getText()+"\n");
        printer.close();
        usernameTxt.setText("");
        passwordTxt.setText("");
        }catch (Exception io){}
    }
    @FXML
    private void clickClearButton(ActionEvent event){
        usernameTxt.setText("");
        passwordTxt.setText("");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
