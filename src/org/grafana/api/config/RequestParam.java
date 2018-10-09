
package org.grafana.api.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author jh
 */
public class RequestParam {

    @SerializedName("Methode")
    @Expose
    private String methode;
    @SerializedName("URL")
    @Expose
    private String uRL;
    @SerializedName("URLParameters")
    @Expose
    private URLParameters uRLParameters;
    @SerializedName("Parameter")
    @Expose
    private String parameter;
    @SerializedName("Parameters")
    @Expose
    private Parameters parameters;
    @SerializedName("Response")
    @Expose
    private String response;
    @SerializedName("Template")
    @Expose
    private String template;

    /**
     *
     * @return
     */
    public String getMethode() {
        return methode;
    }

    /**
     *
     * @return
     */
    public String getURL() {
        return uRL;
    }

    /**
     *
     * @return
     */
    public URLParameters getURLParameters() {
        return uRLParameters;
    }

    /**
     *
     * @return
     */
    public String getParameter() {
        return parameter;
    }

    /**
     *
     * @return
     */
    public Parameters getParameters() {
        return parameters;
    }

    /**
     *
     * @return
     */
    public String getResponse() {
        return response;
    }

    /**
     *
     * @return
     */
    public String getTemplate() {
        return template;
    }

}
