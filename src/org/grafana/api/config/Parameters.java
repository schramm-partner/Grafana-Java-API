
package org.grafana.api.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Parameters {

    @SerializedName("Org")
    @Expose
    private String org;
    @SerializedName("User")
    @Expose
    private String user;

    public String getOrg() {
        return org;
    }

    public String getUser() {
        return user;
    }

}
