
package org.grafana.api.responses.Dashboard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author jh
 */
public class DashboardTagRsp {

    @SerializedName("term")
    @Expose
    private String term;
    @SerializedName("count")
    @Expose
    private Integer count;

    /**
     *
     * @return
     */
    public String getTerm() {
        return term;
    }

    /**
     *
     * @return
     */
    public Integer getCount() {
        return count;
    }

}
