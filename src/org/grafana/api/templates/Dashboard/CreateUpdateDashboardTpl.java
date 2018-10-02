
package org.grafana.api.templates.Dashboard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CreateUpdateDashboardTpl {

    @SerializedName("dashboard")
    @Expose
    private DashboardTpl dashboard;
    @SerializedName("folderId")
    @Expose
    private Integer folderId;
    @SerializedName("overwrite")
    @Expose
    private Boolean overwrite;

    public DashboardTpl getDashboard() {
        return dashboard;
    }

    public void setDashboard(DashboardTpl dashboard) {
        this.dashboard = dashboard;
    }

    public Integer getFolderId() {
        return folderId;
    }

    public void setFolderId(Integer folderId) {
        this.folderId = folderId;
    }

    public Boolean getOverwrite() {
        return overwrite;
    }

    public void setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
    }

}
