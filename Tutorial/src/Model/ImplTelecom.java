/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Arnoldkom
 */
public class ImplTelecom implements InterTelcom{

    ConnectionDB cn ;
    @Override
    public void Inserer(Telecommande t) {
       cn= new ConnectionDB();
       
        PreparedStatement ps;
        
        if(t.getId().equals("")){
            System.err.println("Saisir des valeurs dans les champs");
        }else {
            try{
                
                ps = cn.connect().prepareStatement("insert into telecommande values (?, ?, ?, ?, ?)");
                ps.setString(1, t.getCaracteristique());
                ps.setString(2, t.getPhoto());
                ps.setString(3, t.getNotice());
                ps.setString(4, t.getQuantite());
                ps.setString(5, t.getPrix());
                
                ps.execute();
                
            }catch(Exception e){
                System.err.println(e);
            }
        }
        
        
    }

    @Override
    public void Supprimer(Telecommande t) {
        cn = new ConnectionDB();
        
        PreparedStatement ps;
        
        try{
           
            ps = cn.connect().prepareStatement("delete from telecommande where id = ?");
            ps.setString(1, t.getId());
            ps.execute();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
    }

    @Override
    public void Update(Telecommande t) {
        cn = new ConnectionDB();
        
        PreparedStatement ps;
        
        try {
          
            ps = cn.connect().prepareStatement("update telecommande set caracteristique= ?, photo = ?, notice = ?, quantite = ?, prix = ?");
            ps.setString(1, t.getCaracteristique());
            ps.setString(2, t.getPhoto());
            ps.setString(3, t.getNotice());
            ps.setString(4, t.getQuantite());
            ps.setString(5, t.getPrix());
            
            ps.execute();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public ObservableList<Telecommande> Listes() {
        cn = new ConnectionDB();
        
        ObservableList<Telecommande> listdata = FXCollections.observableArrayList();
        try{
            
            String sql = "select * from telecommande";
            ResultSet rs = cn.connect().createStatement().executeQuery(sql);
            while(rs.next()){
                Telecommande telecom = new Telecommande();
                telecom.setId(""+rs.getInt(1));
                telecom.setCaracteristique(rs.getString(2));
                telecom.setPhoto(rs.getString(3));
                telecom.setNotice(rs.getString(4));
                telecom.setQuantite(rs.getString(5));
                telecom.setPrix(rs.getString(6));
                
                listdata.add(telecom);
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return listdata;
    }

    @Override
    public ObservableList<Telecommande> Liste(String a) {
        cn = new ConnectionDB();
        
        ObservableList<Telecommande> listdata = FXCollections.observableArrayList();
        try{
            
            String sql = "select * from telecommande where id = '"+a+"'";
            ResultSet rs = cn.connect().createStatement().executeQuery(sql);
            while(rs.next()){
                Telecommande telecom = new Telecommande();
                telecom.setId(""+rs.getInt(1));
                telecom.setCaracteristique(rs.getString(2));
                telecom.setPhoto(rs.getString(3));
                telecom.setNotice(rs.getString(4));
                telecom.setQuantite(rs.getString(5));
                telecom.setPrix(rs.getString(6));
                
                listdata.add(telecom);
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return listdata;
    }

    @Override
    public ObservableList<Telecommande> Recherche(String a) {
        cn = new ConnectionDB();
        
        ObservableList<Telecommande> listdata = FXCollections.observableArrayList();
        try{
            
            String sql = "select * from telecommande where caracteristique like '%"+a+"%'";
            ResultSet rs = cn.connect().createStatement().executeQuery(sql);
            while(rs.next()){
                Telecommande telecom = new Telecommande();
                telecom.setId(""+rs.getInt(1));
                telecom.setCaracteristique(rs.getString(2));
                telecom.setPhoto(rs.getString(3));
                telecom.setNotice(rs.getString(4));
                telecom.setQuantite(rs.getString(5));
                telecom.setPrix(rs.getString(6));
                
                listdata.add(telecom);
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return listdata;
    }
    
}
