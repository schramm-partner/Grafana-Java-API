
package org.grafana.api.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author jh
 */
public class AdminAPI {

    @SerializedName("Version")
    @Expose
    private String version;
    @SerializedName("Authentication")
    @Expose
    private String authentication;
    @SerializedName("Link")
    @Expose
    private String link;

    /**
     *
     * @return
     */
    public String getVersion() {
        return version;
    }

    /**
     *
     * @return
     */
    public String getAuthentication() {
        return authentication;
    }

    /**
     *
     * @return
     */
    public String getLink() {
        return link;
    }

}
