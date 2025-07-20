package com.javafiles.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import com.javafiles.dao.UserDao;

import com.javafiles.model.UserDetail;

/**
 * Controller class to manage user-related operations.
 */
public class authcontroller{
    private UserDao c2w_pi_userDao = new UserDao(); // Instance of UserDao to interact with the database
    public boolean bit=false;
    /**
     * Method to authenticate a user based on username and
     * password.
     * 
     * @param c2w_pi_emailid The username of the user.
     * @param c2w_pi_elid The password of the user.
     * @param c2w_pi_safid
     * @return true if the authentication is successful, false
     *         otherwise.
     */
    public boolean authenticateUser(String ansemmail, String c2w_pi_elid,String c2w_pi_safid) {
        System.out.println("Inside Authnetication");
        try {
            UserDetail c2w_pi_user = c2w_pi_userDao.getData("user", ansemmail); // Retrieve user details from the
            System.out.println("Inside Authnetication-2");                                                 // database
            if (c2w_pi_user != null) {
                System.out.println("Inside 1 if");
                 String eleccid = c2w_pi_user.getElecid(); // Get the stored password
                  String c2w_dbid=c2w_pi_elid;

                if( (c2w_dbid.equals(eleccid)) ){  // Compare stored password with the provided password
                    
                    bit=true;
                }
                else{
                    bit=false;
                }
            }else{
                bit=true;
            }
        }
         
        catch (ExecutionException | InterruptedException ex) {
             ex.printStackTrace(); // Print stack trace for debugging
            
            }
        // Return false if authentication fails or an exception occur  
        return bit;
    }

    /**
     * Method to handle user signup.
     * 
     * @param c2w_pi_username The username of the new user.
     * @param c2w_pi_password The password of the new user.
     * @return true if the signup is successful, false otherwise.
     */
    /*public boolean handleSignup(String c2w_pi_username, String dob, String tx2, String mailId,String c2w_pi_password) {
        try {
            // Create a map to store user details
            Map<String, Object> c2w_pi_data = new HashMap<>();
            c2w_pi_data.put("userName", c2w_pi_username); // Add username to the map
            c2w_pi_data.put("password", c2w_pi_password); // Add password to the map
            c2w_pi_data.put("dob", dob);
            c2w_pi_data.put("mailId", mailId);
            c2w_pi_data.put("Elec-ID",tx2);

            c2w_pi_data.put("role", "USER"); // Add user role to the map
            c2w_pi_userDao.addData("user", c2w_pi_data); // Add user details to the database

            System.out.println("User registered successfully");

            // Print success message

            return true; // Return true if signup is successful
        } catch (Exception ex) {
            ex.printStackTrace(); // Print stack trace for debugging

            return false; // Return false if an exception occurs
        }
    }
*/
    /**
     * Method to get user details based on username.
     * 
     * @param c2w_pi_userName The username of the user.
     * @return UserDetail object containing user details, or null
     *         if an exception occurs.
     */
    // public UserDetail getUserDetail(String c2w_pi_userName) {
    //     // try {
    //     //     return c2w_pi_userDao.getData("user", c2w_pi_userName); // Retrieve user details from the database
    //     // } catch (ExecutionException | InterruptedException ex) {
    //     //     ex.printStackTrace(); // Print stack trace for debugging
    //     // }
    //     return null; // Return null if an exception occurs
    // }
}