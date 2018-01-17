/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.adapter.JavaBeanStringProperty;

/**
 *
 * @author Arnoldkom
 */
public class Telecommande {
    private final StringProperty id = new SimpleStringProperty();
    private final StringProperty caracteristique = new SimpleStringProperty();
    private final StringProperty photo = new SimpleStringProperty();
    private final StringProperty notice = new SimpleStringProperty();
    private final StringProperty quantite = new SimpleStringProperty();
    private final StringProperty prix = new SimpleStringProperty();
    
    public Telecommande(){
        
    }
    
    public String getId(){
        return id.get();
    }
    public StringProperty getIdProperty(){
        return id;
    }
    public void setId(String id){
        this.id.set(id);
    }
    
     public String getCaracteristique(){
        return caracteristique.get();
    }
    public StringProperty getCaracteristiqueProperty(){
        return caracteristique;
    }
    public void setCaracteristique(String caracteristique){
        this.caracteristique.set(caracteristique);
    }
    
     public String getPhoto(){
        return photo.get();
    }
    public StringProperty getPhotoProperty(){
        return photo;
    }
    public void setPhoto(String photo){
        this.photo.set(photo);
    }
    
    public String getNotice(){
        return notice.get();
    }
    public StringProperty getNoticeProperty(){
        return notice;
    }
    public void setNotice(String notice){
        this.notice.set(notice);
    }
    
     public String getQuantite(){
        return quantite.get();
    }
    public StringProperty getQuantiteProperty(){
        return quantite;
    }
    public void setQuantite(String quantite){
        this.quantite.set(quantite);
    }
    
       public String getPrix(){
        return prix.get();
    }
    public StringProperty getPrixProperty(){
        return prix;
    }
    public void setPrix(String prix){
        this.prix.set(prix);
    }
    
}
