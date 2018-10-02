
package org.grafana.api.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Experimental {

    @SerializedName("Version")
    @Expose
    private String version;
    @SerializedName("Authentication")
    @Expose
    private String authentication;
    @SerializedName("Link")
    @Expose
    private String link;
    @SerializedName("CreateUserInvite")
    @Expose
    private CreateUserInvite createUserInvite;

    public String getVersion() {
        return version;
    }

    public String getAuthentication() {
        return authentication;
    }

    public String getLink() {
        return link;
    }

    public CreateUserInvite getCreateUserInvite() {
        return createUserInvite;
    }

}
