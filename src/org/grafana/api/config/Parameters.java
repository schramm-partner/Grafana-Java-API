
package org.grafana.api.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author jh
 */
public class Parameters {

    @SerializedName("Org")
    @Expose
    private String org;
    @SerializedName("User")
    @Expose
    private String user;

    /**
     *
     * @return
     */
    public String getOrg() {
        return org;
    }

    /**
     *
     * @return
     */
    public String getUser() {
        return user;
    }

}
