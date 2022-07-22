/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.ArrayList;

/**
 *
 * @author Genaro Chavez, DCCO-ESPE
 */
public abstract class DbManager extends Persistance {
    private String dbName;

    /**
     * @return the dbName
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * @param dbName the dbName to set
     */
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public DbManager(String dbName) {
        this.dbName = dbName;
    }

    @Override
    public String toString() {
        return "DbManager{" + "dbName=" + dbName + '}';
    }
    
    public abstract boolean create(String table, Object record);
    public abstract ArrayList<String> read(String table  );
    public abstract boolean delete(String table, String criterio);
    public abstract ArrayList<String> read(String table , String seacrhCriterio);
    public abstract boolean update(String table, String criterio, Object newRecord);
    
}
