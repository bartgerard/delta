package be.gerard.delta.core.model;

import java.time.LocalDateTime;

/**
 * Version
 *
 * @author bartgerard
 * @version v0.0.1
 */
public class Version {

    private final String app;

    private final LocalDateTime now = LocalDateTime.now();

    public Version(String app) {
        this.app = app;
    }

    public String getApp() {
        return app;
    }

    public LocalDateTime getNow() {
        return now;
    }

}
