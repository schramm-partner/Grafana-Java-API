
package org.grafana.api.responses.Dashboard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HomeDashboardRsp {

    @SerializedName("dashboard")
    @Expose
    private DashboardRsp__2 dashboard;
    @SerializedName("meta")
    @Expose
    private MetaRsp__1 meta;

    public DashboardRsp__2 getDashboard() {
        return dashboard;
    }

    public MetaRsp__1 getMeta() {
        return meta;
    }

}
