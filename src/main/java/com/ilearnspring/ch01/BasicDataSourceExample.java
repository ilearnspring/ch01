package com.ilearnspring.ch01;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

public class BasicDataSourceExample {
    public static void main(String[] args){
        System.out.println("Test");
        DataSource ds = null;
        BasicDataSource bds = new BasicDataSource();
        bds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        bds.setUsername("oracle");
        bds.setPassword("oracle");
        bds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
        ds = bds;

        Connection conn = null;
        Statement stmt = null;
        ResultSet rset = null;

        try
        {
            //create a connection
            conn = ds.getConnection();
            //from the connection, create a statement
            stmt = conn.createStatement();
            //from the statement, execute the query
            //select BANNER from SYS.V_$VERSION
            //select table_name from user_tables
            //select * from all_tables
            rset = stmt.executeQuery("SELECT * FROM EXAMPLE");
            //get the number of columns in the result set
            int numcols = rset.getMetaData().getColumnCount();
            while(rset.next()){
                for(int i=1;i<=numcols;i++){
                    System.out.println(rset.getString(i));
                }
            }

        } catch(SQLException ex){
            ex.printStackTrace();
        } finally {
            try {if(conn != null) conn.close();} catch(Exception e){}
            try {if(stmt != null) stmt.close();} catch(Exception e){}
            try {if(rset != null) rset.close();} catch(Exception e){}
        }


    }

}

