
package org.grafana.api.responses.Dashboard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DashboardRsp {

    @SerializedName("dashboard")
    @Expose
    private DashboardRsp__1 dashboard;
    @SerializedName("meta")
    @Expose
    private MetaRsp meta;

    public DashboardRsp__1 getDashboard() {
        return dashboard;
    }

    public MetaRsp getMeta() {
        return meta;
    }

}
