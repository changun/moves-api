package co.nutrino.api.moves.impl.service;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MovesSecurityManager implements IMovesSecurityManager, Serializable {

	private final String OAuthKey;
    private final String OAuthSecret;
    private final String Scope;

    @Autowired
    public MovesSecurityManager(@Value("${com.moves.api.key}") String key, @Value("${com.moves.api.secret}") String secret,
	    @Value("${com.moves.api.scope}") String scope) {
	OAuthKey = key;
	OAuthSecret = secret;
	Scope = scope;
    }

    @Override
    public String getKey() {
	return this.OAuthKey;
    }

    @Override
    public String getSecret() {
	return this.OAuthSecret;
    }

    @Override
    public String getScope() {
	return this.Scope;
    }
}
