
package org.grafana.api.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DeleteOrgUserByID {

    @SerializedName("Methode")
    @Expose
    private String methode;
    @SerializedName("URL")
    @Expose
    private String uRL;
    @SerializedName("Parameters")
    @Expose
    private Parameters__1 parameters;
    @SerializedName("Response")
    @Expose
    private String response;

    public String getMethode() {
        return methode;
    }

    public String getURL() {
        return uRL;
    }

    public Parameters__1 getParameters() {
        return parameters;
    }

    public String getResponse() {
        return response;
    }

}
