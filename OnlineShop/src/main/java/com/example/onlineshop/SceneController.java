package com.example.onlineshop;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneController {

 private Stage stage;
 private Scene scene;
 private Parent root;
 
 public void switchToScene1(ActionEvent event) throws IOException {
  root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }
 
 public void switchToScene2(ActionEvent event) throws IOException {
  Parent root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }
 
 public void switchToSceneRegisto(ActionEvent event) throws IOException {
	  Parent root = FXMLLoader.load(getClass().getResource("Registo.fxml"));
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
	 }
 
 
 public void switchToSubTecnologia(ActionEvent event) throws IOException {
	  Parent root = FXMLLoader.load(getClass().getResource("SubTecnologia.fxml"));
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
	 }
 
 public void switchToHomeUser(ActionEvent event) throws IOException {
	  Parent root = FXMLLoader.load(getClass().getResource("HomeUser.fxml"));
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
	 }
 
 public void switchToLogin(ActionEvent event) throws IOException {
	  Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
	 }
 public void switchToAdmin(ActionEvent event) throws IOException {
	  Parent root = FXMLLoader.load(getClass().getResource("Administrador.fxml"));
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
	 }
 public void switchToAdminAddProd(ActionEvent event) throws IOException {
	  Parent root = FXMLLoader.load(getClass().getResource("AdminAddProduto.fxml"));
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
	 }
 public void switchToAdminEditProd(ActionEvent event) throws IOException {
	  Parent root = FXMLLoader.load(getClass().getResource("AdminEditProduto.fxml"));
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
	 }
 public void switchToAdminRemoveProd(ActionEvent event) throws IOException {
	  Parent root = FXMLLoader.load(getClass().getResource("AdminRemoveProduto.fxml"));
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
	 }
 public void switchToWishlist(ActionEvent event) throws IOException {
	  Parent root = FXMLLoader.load(getClass().getResource("wishlist.fxml"));
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
	 }
 public void switchToShopCart(ActionEvent event) throws IOException {
	  Parent root = FXMLLoader.load(getClass().getResource("shopcart.fxml"));
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
	 }
 public void switchToTecV(ActionEvent event) throws IOException {
	  Parent root = FXMLLoader.load(getClass().getResource("TecVisitor.fxml"));
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
	 }
 public void switchToPapV(ActionEvent event) throws IOException {
	  Parent root = FXMLLoader.load(getClass().getResource("PapVisitor.fxml"));
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
	 }
 public void switchToCafeV(ActionEvent event) throws IOException {
	  Parent root = FXMLLoader.load(getClass().getResource("CafeVisitor.fxml"));
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
	 }
 public void switchToSubPap(ActionEvent event) throws IOException {
	  Parent root = FXMLLoader.load(getClass().getResource("SubPap.fxml"));
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
	 }
 public void switchToSubCafe(ActionEvent event) throws IOException {
	  Parent root = FXMLLoader.load(getClass().getResource("SubCafe.fxml"));
	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
	 }
 
 
}