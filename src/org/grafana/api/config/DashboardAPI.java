
package org.grafana.api.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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
    private DashboardByUid dashboardByUid;
    @SerializedName("DashboardHome")
    @Expose
    private DashboardHome dashboardHome;
    @SerializedName("DashboardTags")
    @Expose
    private DashboardTags dashboardTags;
    @SerializedName("CreateUpdateDashboard")
    @Expose
    private CreateUpdateDashboard createUpdateDashboard;
    @SerializedName("DeleteDashboardByUid")
    @Expose
    private DeleteDashboardByUid deleteDashboardByUid;

    public String getVersion() {
        return version;
    }

    public String getAuthentication() {
        return authentication;
    }

    public String getLink() {
        return link;
    }

    public DashboardByUid getDashboardByUid() {
        return dashboardByUid;
    }

    public DashboardHome getDashboardHome() {
        return dashboardHome;
    }

    public DashboardTags getDashboardTags() {
        return dashboardTags;
    }

    public CreateUpdateDashboard getCreateUpdateDashboard() {
        return createUpdateDashboard;
    }

    public DeleteDashboardByUid getDeleteDashboardByUid() {
        return deleteDashboardByUid;
    }

}
