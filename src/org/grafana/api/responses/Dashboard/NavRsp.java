
package org.grafana.api.responses.Dashboard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author jh
 */
public class NavRsp {

    @SerializedName("enable")
    @Expose
    private Boolean enable;
    @SerializedName("type")
    @Expose
    private String type;

    /**
     *
     * @return
     */
    public Boolean getEnable() {
        return enable;
    }

    /**
     *
     * @return
     */
    public String getType() {
        return type;
    }

}
