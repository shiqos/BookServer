package bookserver.token.manager;

import bookserver.token.model.TokenModel;

public interface TokenManager {
    TokenModel createToken(String userId);

    boolean checkToken(TokenModel model);

    TokenModel getToken(String authentication);

    void deleteToken(String userId);
}
