package co.nutrino.api.moves.impl.client.authentication;

import java.io.Serializable;
import java.util.Arrays;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import co.nutrino.api.moves.exception.OAuthException;
import co.nutrino.api.moves.exception.ResourceException;
import co.nutrino.api.moves.impl.client.IMoveUserCredentials;
import co.nutrino.api.moves.impl.client.IMovesClient;
import co.nutrino.api.moves.impl.dto.authentication.UserMovesAuthentication;
import co.nutrino.api.moves.impl.request.MovesAuthenticationResource;
import co.nutrino.api.moves.impl.service.IMovesSecurityManager;
import co.nutrino.api.moves.request.RequestParameter;
import co.nutrino.api.moves.request.RequestParameters;


@Component
public class MovesAuthenticationClient implements IMovesAuthenticationClient, Serializable {

    private IMovesClient client;
    private IMovesSecurityManager securityManager;

    @Inject
    public MovesAuthenticationClient(IMovesClient client, IMovesSecurityManager securityManager) {
	this.client = client;
	this.securityManager = securityManager;
    }

    @Override
    public boolean validateAuthentication(IMoveUserCredentials credentials) throws OAuthException {

	try {
	    this.client.getAuthenticationResource(credentials, MovesAuthenticationResource.tokeninfo, null);
	} catch (ResourceException e) {
	    return false;
	}

	return true;
    }

    @Override
    public UserMovesAuthentication refreshAuthentication(IMoveUserCredentials credentials) throws ResourceException, OAuthException {
	RequestParameter requestParameter1 = new RequestParameter("grant_type", "refresh_token");
	RequestParameter requestParameter2 = new RequestParameter("refresh_token", credentials.getRefreshToken());
	RequestParameter requestParameter3 = new RequestParameter("client_id", this.securityManager.getKey());
	RequestParameter requestParameter4 = new RequestParameter("client_secret", this.securityManager.getSecret());

	RequestParameters requestParameters = new RequestParameters(Arrays.asList(new RequestParameter[] { requestParameter1, requestParameter2,
		requestParameter3, requestParameter4 }));

	UserMovesAuthentication authentication = this.client.postAuthenticationResourceWithoutAccessToken(credentials, MovesAuthenticationResource.access_token,
		requestParameters);

	return authentication;
    }
}
