package me.haitam.tech.authentication;

public class AuthenticationResponse {
    private String token;

    public AuthenticationResponse(String token){
        this.token = token;
    }

    public String getToken(){
        return this.token;
    }
}
