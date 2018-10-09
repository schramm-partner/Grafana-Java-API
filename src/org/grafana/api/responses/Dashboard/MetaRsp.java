
package org.grafana.api.responses.Dashboard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author jh
 */
public class MetaRsp {

    @SerializedName("isStarred")
    @Expose
    private Boolean isStarred;
    @SerializedName("url")
    @Expose
    private String url;

    /**
     *
     * @return
     */
    public Boolean getIsStarred() {
        return isStarred;
    }

    /**
     *
     * @return
     */
    public String getUrl() {
        return url;
    }

}
