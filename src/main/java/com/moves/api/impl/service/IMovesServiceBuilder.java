package com.moves.api.impl.service;

import org.scribe.oauth.OAuthService;

public interface IMovesServiceBuilder {

    public OAuthService buildService();

}