
package org.grafana.api.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author jh
 */
public class DashboardAPI {

    @SerializedName("Version")
    @Expose
    private String version;
    @SerializedName("Authentication")
    @Expose
    private String authentication;
    @SerializedName("Link")
    @Expose
    private String link;
    @SerializedName("DashboardByUid")
    @Expose
    private RequestParam dashboardByUid;
    @SerializedName("DashboardHome")
    @Expose
    private RequestParam dashboardHome;
    @SerializedName("DashboardTags")
    @Expose
    private RequestParam dashboardTags;
    @SerializedName("CreateUpdateDashboard")
    @Expose
    private RequestParam createUpdateDashboard;
    @SerializedName("DeleteDashboardByUid")
    @Expose
    private RequestParam deleteDashboardByUid;

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

    /**
     *
     * @return
     */
    public RequestParam getDashboardByUid() {
        return dashboardByUid;
    }

    /**
     *
     * @return
     */
    public RequestParam getDashboardHome() {
        return dashboardHome;
    }

    /**
     *
     * @return
     */
    public RequestParam getDashboardTags() {
        return dashboardTags;
    }

    /**
     *
     * @return
     */
    public RequestParam getCreateUpdateDashboard() {
        return createUpdateDashboard;
    }

    /**
     *
     * @return
     */
    public RequestParam getDeleteDashboardByUid() {
        return deleteDashboardByUid;
    }

}
