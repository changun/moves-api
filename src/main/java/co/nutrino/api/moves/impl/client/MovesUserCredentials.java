package co.nutrino.api.moves.impl.client;

import java.io.Serializable;

public class MovesUserCredentials implements IMoveUserCredentials, Serializable {
    private String token;
    private String refreshToken;

    public MovesUserCredentials(String token, String refreshToken) {
	this.token = token;
	this.refreshToken = refreshToken;
    }

    @Override
    public String getToken() {
	return this.token;
    }

    @Override
    public String getRefreshToken() {
	return this.refreshToken;
    }

}
