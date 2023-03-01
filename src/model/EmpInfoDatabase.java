/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;


public class EmpInfoDatabase {
    
    private ArrayList<EmpInfo> database;
    
    public EmpInfoDatabase(){ // constructor for EmpInfoDatabase
        
        this.database = new ArrayList<EmpInfo>();    
    } 

    public ArrayList<EmpInfo> getDatabase() {
        return database;
    }

    public void setDatabase(ArrayList<EmpInfo> database) {
        this.database = database;
    }

     public EmpInfo addNewEmp(){
         
         EmpInfo newEmp = new EmpInfo();
         database.add(newEmp);
         return newEmp;
     } 
     
     public void deleteEmpInfo(EmpInfo  ei){
         database.remove(ei);
     }
}
