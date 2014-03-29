package co.nutrino.api.moves.request;


import java.io.Serializable;

import org.springframework.stereotype.Component;

import co.nutrino.api.moves.impl.client.IMoveUserCredentials;


@Component
public class RequestTokenConvertor implements IRequestTokenConvertor, Serializable {

    @Override
    public IAuthToken getRequestToken(IMoveUserCredentials credentials) {
	return new AuthToken(credentials.getToken(), credentials.getRefreshToken(), null);
    }

    @Override
    public IAuthToken getEmptyRequestToken() {
	return new AuthToken("", "", null);
    }
}
