/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Observable;
import javafx.collections.ObservableList;

/**
 *
 * @author Arnoldkom
 */
public interface InterTelcom {
    void Inserer(Telecommande t);
    void Supprimer(Telecommande t);
    void Update(Telecommande t);
    ObservableList<Telecommande> Listes();
    ObservableList<Telecommande> Liste(String a);
    ObservableList<Telecommande> Recherche(String a);
}
