package com.example.onlineshop;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.sql.*;
import java.util.Objects;

public class SceneController {

	@FXML
	TextField user_label;
	@FXML
	PasswordField pass_label;
	@FXML
	Label nameLabel;
 private Stage stage;
 private Scene scene;
 private Parent root;
 
 public void switchToScene1(ActionEvent event) throws IOException {
  root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Scene1.fxml")));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }
 
 public void switchToScene2(ActionEvent event) throws IOException {
  Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Scene2.fxml")));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }
 
 public void switchToSceneRegisto(ActionEvent event) throws IOException {
	  Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Registo.fxml")));
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
	 }

 
 public void switchToSubTecnologia(ActionEvent event) throws IOException {
	  Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("SubTecnologia.fxml")));
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
	 }
public void displayName(String name){
	 nameLabel.setText(name);
}
 
 public void switchToHomeUser(ActionEvent event, String name) throws IOException {

	 FXMLLoader loader = new FXMLLoader(getClass().getResource("HomeUser.fxml"));
	 root = loader.load();
	 SceneController controller = loader.getController();
	 controller.displayName(name);
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
	 }
 public void login(ActionEvent event) throws IOException{

	 String username = user_label.getText();
	 String password = pass_label.getText();
	 Connection connection = connectDB.Connect2DB();
	 int val = connectDB.validateLogin(username, password, connection);
	 if (val == 0) {
		 switchToHomeUser(event,username);
	 } else {
		 user_label.clear();
		 pass_label.clear();
	 }

 }
 
 public void switchToLogin(ActionEvent event) throws IOException {
	  Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Login.fxml")));
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
	 }
 public void switchToAdmin(ActionEvent event) throws IOException {
	  Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Administrador.fxml")));
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
	 }
 public void switchToAdminAddProd(ActionEvent event) throws IOException {
	  Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("AdminAddProduto.fxml")));
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
	 }
 public void switchToAdminEditProd(ActionEvent event) throws IOException {
	  Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("AdminEditProduto.fxml")));
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
	 }
 public void switchToAdminRemoveProd(ActionEvent event) throws IOException {
	  Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("AdminRemoveProduto.fxml")));
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
	 }
 public void switchToWishlist(ActionEvent event) throws IOException {
	  Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("wishlist.fxml")));
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
	 }
 public void switchToShopCart(ActionEvent event) throws IOException {
	  Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("shopcart.fxml")));
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
	 }
 public void switchToTecV(ActionEvent event) throws IOException {
	  Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("TecVisitor.fxml")));
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
	 }
 public void switchToPapV(ActionEvent event) throws IOException {
	  Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("PapVisitor.fxml")));
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
	 }
 public void switchToCafeV(ActionEvent event) throws IOException {
	  Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("CafeVisitor.fxml")));
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
	 }
 public void switchToSubPap(ActionEvent event) throws IOException {
	  Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("SubPap.fxml")));
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
	 }
 public void switchToSubCafe(ActionEvent event) throws IOException {
	  Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("SubCafe.fxml")));
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
	 }


}