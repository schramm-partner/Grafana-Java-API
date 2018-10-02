
package org.grafana.api.responses.Dashboard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NewCreateUpdateDashboardRsp {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("uid")
    @Expose
    private String uid;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("version")
    @Expose
    private Integer version;

    public Integer getId() {
        return id;
    }

    public String getUid() {
        return uid;
    }

    public String getUrl() {
        return url;
    }

    public String getStatus() {
        return status;
    }

    public Integer getVersion() {
        return version;
    }

}
