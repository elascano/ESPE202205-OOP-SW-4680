/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Genaro Chavez, DCCO-ESPE
 */
public abstract class SqlManager extends DbManager {
    private String table;

    public SqlManager(String table, String dbName) {
        super(dbName);
        this.table = table;
    }
    
    

    /**
     * @return the table
     */
    public String getTable() {
        return table;
    }

    /**
     * @param table the table to set
     */
    public void setTable(String table) {
        this.table = table;
    }
    
}
