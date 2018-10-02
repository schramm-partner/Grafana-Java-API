
package org.grafana.api.responses.Dashboard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NavRsp {

    @SerializedName("enable")
    @Expose
    private Boolean enable;
    @SerializedName("type")
    @Expose
    private String type;

    public Boolean getEnable() {
        return enable;
    }

    public String getType() {
        return type;
    }

}
