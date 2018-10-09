
package org.grafana.api.responses.Dashboard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author jh
 */
public class DeleteDashboardRsp {

    @SerializedName("title")
    @Expose
    private String title;

    /**
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

}
