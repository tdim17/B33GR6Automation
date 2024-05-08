package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {

        System.out.println("Login to app in Before method");
    }

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        //based on input enter that user information
        String username =null;
        String password =null;

        if(userType.equalsIgnoreCase("user")){
            username = ConfigurationReader.getProperty("username");
            password = ConfigurationReader.getProperty("password");
        }else if(userType.equalsIgnoreCase("employee")){
            username = ConfigurationReader.getProperty("username_role2");
            password = ConfigurationReader.getProperty("password_role2");
        }
        //send username and password and login        
        loginPage.login(username,password);
    }

    @Given("the user logged in with username as {string} and password as {string}")
    public void the_user_logged_in_with_username_as_and_password_as(String username, String password) {
      //LoginPage loginPage = new LoginPage();
      loginPage.login(username,password);
    }

}
