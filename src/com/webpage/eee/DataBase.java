package com.webpage.eee;

import java.sql.*;

//DataBase class
@SuppressWarnings("Duplicates")
public abstract class DataBase {

    //Constants foк connection
    private static final String urlDB = "jdbc:mysql://localhost:3306/Users";
    private static final String userDB = "root";
    private static final String passwordDB = "Masterdota12";
    private static Connection conDB;
    private static Statement stmtDB;
    private static ResultSet rsDB;


    //Method to put info about current user to db
    public static void putUserIntoDB(User user){

        String query = "INSERT INTO Users.users (fullName, nikName, age, email, password) \n" +
                " VALUES (?,?,?,?,?);";


        try{

            conDB = DriverManager.getConnection(urlDB,userDB,passwordDB);
            stmtDB = conDB.prepareStatement(query);
            ((PreparedStatement) stmtDB).setString(1, user.getFullName());
            ((PreparedStatement) stmtDB).setString(2, user.getNikName());
            ((PreparedStatement) stmtDB).setString(3, user.getAge());
            ((PreparedStatement) stmtDB).setString(4, user.getEmail());
            ((PreparedStatement) stmtDB).setString(5, user.getPassword());
            ((PreparedStatement) stmtDB).executeUpdate();


        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try{
                if(conDB!=null)
                    conDB.close();
            }catch(SQLException se){

            }

            try{
                if(stmtDB!=null)
                    stmtDB.close();
            }catch(SQLException se){

            }
        }

    }

    //Method to get info about current user from bd
    public static User getUserFromDB(){

        String query = "SELECT  fullName, nikName, age, email, password from Users.users where nikName = ?";
        User takenUser = null;

        try{

            conDB = DriverManager.getConnection(urlDB,userDB,passwordDB);
            stmtDB = conDB.prepareStatement(query);

            ((PreparedStatement) stmtDB).setString(1, User.currentUser);
            rsDB = ((PreparedStatement) stmtDB).executeQuery();

            if(rsDB.next()){
                takenUser = new User();
                takenUser.setFullName(rsDB.getString("fullName"));
                takenUser.setNikName(rsDB.getString("nikName"));
                takenUser.setAge(rsDB.getString("age"));
                takenUser.setEmail(rsDB.getString("email"));
                takenUser.setPassword(rsDB.getString("password"));
            }else{
                User.currentUser = "NO";
            }

        }catch (SQLException e){
            e.printStackTrace();
        }finally {

            try{
                if(rsDB!=null)
                    rsDB.close();
            }catch (SQLException se1){

            }

            try{
                if(conDB!=null)
                    conDB.close();
            }catch(SQLException se2){

            }

            try{
                if(stmtDB!=null)
                    stmtDB.close();
            }catch(SQLException se3){

            }

        }

        return takenUser;

    }



    //Mothod to delete current user from db
    public static void deleteFromDB(){

        try{

            conDB = DriverManager.getConnection(urlDB,userDB,passwordDB);
            stmtDB = conDB.createStatement();
            stmtDB.executeUpdate("delete from Users.users where nikName = '" + User.currentUser + "'");

        }catch (SQLException e){
            e.printStackTrace();
        }finally {

            try{
                if(conDB!=null)
                    conDB.close();
            }catch(SQLException se2){

            }

            try{
                if(stmtDB!=null)
                    stmtDB.close();
            }catch(SQLException se3){

            }

        }

    }

    //Mothod to update fullname in db
    public static void updateFullName(String newFullName){

        try{

            conDB = DriverManager.getConnection(urlDB , userDB , passwordDB);
            stmtDB = conDB.prepareStatement("update Users.users set fullName = '" + newFullName + "' where nikName = '" + User.currentUser
            + "'");
            ((PreparedStatement) stmtDB).execute();

        }catch (SQLException e){
            e.printStackTrace();
        }finally {

            try{
                if(conDB!=null)
                    conDB.close();
            }catch(SQLException se2){

            }

            try{
                if(stmtDB!=null)
                    stmtDB.close();
            }catch(SQLException se3){

            }

        }

    }

    //Mothod to update email in db
    public static void updateEmail(String newEmail){

        try{

            conDB = DriverManager.getConnection(urlDB , userDB , passwordDB);
            stmtDB = conDB.prepareStatement("update Users.users set email = '" + newEmail + "' where nikName = '" + User.currentUser
                    + "'");
            ((PreparedStatement) stmtDB).execute();

        }catch (SQLException e){
            e.printStackTrace();
        }finally {

            try{
                if(conDB!=null)
                    conDB.close();
            }catch(SQLException se2){

            }

            try{
                if(stmtDB!=null)
                    stmtDB.close();
            }catch(SQLException se3){

            }

        }

    }

    //Mothod to update age in db
    public static void updateAge(String newAge){

        try{

            conDB = DriverManager.getConnection(urlDB , userDB , passwordDB);
            stmtDB = conDB.prepareStatement("update Users.users set age = '" + newAge + "' where nikName = '" + User.currentUser
                    + "'");
            ((PreparedStatement) stmtDB).execute();

        }catch (SQLException e){
            e.printStackTrace();
        }finally {

            try{
                if(conDB!=null)
                    conDB.close();
            }catch(SQLException se2){

            }

            try{
                if(stmtDB!=null)
                    stmtDB.close();
            }catch(SQLException se3){

            }

        }

    }

    //Mothod to update password in db
    public static void updatePassword(String newPassword){

        try{

            conDB = DriverManager.getConnection(urlDB , userDB , passwordDB);
            stmtDB = conDB.prepareStatement("update Users.users set password = '" + newPassword + "' where nikName = '" + User.currentUser
                    + "'");
            ((PreparedStatement) stmtDB).execute();

        }catch (SQLException e){
            e.printStackTrace();
        }finally {

            try{
                if(conDB!=null)
                    conDB.close();
            }catch(SQLException se2){

            }

            try{
                if(stmtDB!=null)
                    stmtDB.close();
            }catch(SQLException se3){

            }

        }

    }

    //Mothod to update nikname in db
    public static void updateNikName(String newNikName){

        try{

            conDB = DriverManager.getConnection(urlDB , userDB , passwordDB);
            stmtDB = conDB.prepareStatement("update Users.users set nikName = '" + newNikName + "' where nikName = '" + User.currentUser
                    + "'");
            ((PreparedStatement) stmtDB).execute();
            User.currentUser = newNikName;

        }catch (SQLException e){
            e.printStackTrace();
        }finally {

            try{
                if(conDB!=null)
                    conDB.close();
            }catch(SQLException se2){

            }

            try{
                if(stmtDB!=null)
                    stmtDB.close();
            }catch(SQLException se3){

            }

        }

    }





}
