
package org.grafana.api.responses.Dashboard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MetaRsp {

    @SerializedName("isStarred")
    @Expose
    private Boolean isStarred;
    @SerializedName("url")
    @Expose
    private String url;

    public Boolean getIsStarred() {
        return isStarred;
    }

    public String getUrl() {
        return url;
    }

}
