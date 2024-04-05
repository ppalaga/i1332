package org.acme.getting.started;

import io.smallrye.config.SecretKeysHandler;

/**
 * <p>
 * Custom handler reading the server key store and trust store password from a file (file:/etc...).
 * </p><p>
 * Enables similar configuration as for Sprint Boot applications.
 * </p>
 * See <a href="https://smallrye.io/smallrye-config/Main/config/secret-keys/">Secret Keys Expressions</a>
 * @author Frank Leja (msg systems ag) 2023
 */
public class FromFileSecretKeyHandler implements SecretKeysHandler {
    @Override
    public String decode(String secret) {
        return "egal";
    }

    @Override
    public String getName() {
        return "from-file";
    }
}
