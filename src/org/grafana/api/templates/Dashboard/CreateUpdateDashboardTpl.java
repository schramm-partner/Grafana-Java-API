
package org.grafana.api.templates.Dashboard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author jh
 */
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

    /**
     *
     * @return
     */
    public DashboardTpl getDashboard() {
        return dashboard;
    }

    /**
     *
     * @param dashboard
     */
    public void setDashboard(DashboardTpl dashboard) {
        this.dashboard = dashboard;
    }

    /**
     *
     * @return
     */
    public Integer getFolderId() {
        return folderId;
    }

    /**
     *
     * @param folderId
     */
    public void setFolderId(Integer folderId) {
        this.folderId = folderId;
    }

    /**
     *
     * @return
     */
    public Boolean getOverwrite() {
        return overwrite;
    }

    /**
     *
     * @param overwrite
     */
    public void setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
    }

}
