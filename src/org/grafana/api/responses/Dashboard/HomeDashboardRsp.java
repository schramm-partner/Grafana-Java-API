
package org.grafana.api.responses.Dashboard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author jh
 */
public class HomeDashboardRsp {

    @SerializedName("dashboard")
    @Expose
    private DashboardRsp__2 dashboard;
    @SerializedName("meta")
    @Expose
    private MetaRsp__1 meta;
    @SerializedName("redirectUri")
    @Expose
    private String redirectUri;

    /**
     *
     * @return
     */
    public DashboardRsp__2 getDashboard() {
        return dashboard;
    }

    /**
     *
     * @return
     */
    public MetaRsp__1 getMeta() {
        return meta;
    }
    
    /**
     *
     * @return
     */
    public String getRedirectUri() {
        return redirectUri;
    }

}
