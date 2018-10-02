
package org.grafana.api.responses.Dashboard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DashboardTagRsp {

    @SerializedName("term")
    @Expose
    private String term;
    @SerializedName("count")
    @Expose
    private Integer count;

    public String getTerm() {
        return term;
    }

    public Integer getCount() {
        return count;
    }

}
