
package org.grafana.api.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SearchGrafana {

    @SerializedName("Methode")
    @Expose
    private String methode;
    @SerializedName("URL")
    @Expose
    private String uRL;
    @SerializedName("Parameters")
    @Expose
    private Parameters__2 parameters;
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

    public Parameters__2 getParameters() {
        return parameters;
    }

    public String getResponse() {
        return response;
    }

    public String getTemplate() {
        return template;
    }

}
