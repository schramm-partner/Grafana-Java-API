
package org.grafana.api.responses.Dashboard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DeleteDashboardRsp {

    @SerializedName("title")
    @Expose
    private String title;

    public String getTitle() {
        return title;
    }

}
