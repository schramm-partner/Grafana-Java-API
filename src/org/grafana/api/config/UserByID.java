
package org.grafana.api.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserByID {

    @SerializedName("Methode")
    @Expose
    private String methode;
    @SerializedName("URL")
    @Expose
    private String uRL;
    @SerializedName("Parameter")
    @Expose
    private String parameter;
    @SerializedName("Response")
    @Expose
    private String response;

    public String getMethode() {
        return methode;
    }

    public String getURL() {
        return uRL;
    }

    public String getParameter() {
        return parameter;
    }

    public String getResponse() {
        return response;
    }

}
