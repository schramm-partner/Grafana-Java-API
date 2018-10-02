
package org.grafana.api.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AddOrgCurrUser {

    @SerializedName("Methode")
    @Expose
    private String methode;
    @SerializedName("URL")
    @Expose
    private String uRL;
    @SerializedName("Response")
    @Expose
    private String response;
    @SerializedName("Template")
    @Expose
    private String template;

    public String getMethode() {
        return methode;
    }

    public String getURL() {
        return uRL;
    }

    public String getResponse() {
        return response;
    }

    public String getTemplate() {
        return template;
    }

}
