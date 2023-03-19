package com.javaproject.me2aevents;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public interface Personable<E> {
    //create Client
    public void inscrire(E C);

    boolean connecter(int id, String mdp);



}

