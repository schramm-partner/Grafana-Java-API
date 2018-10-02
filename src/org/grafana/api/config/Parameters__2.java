
package org.grafana.api.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Parameters__2 {

    @SerializedName("Query")
    @Expose
    private String query;
    @SerializedName("Tag")
    @Expose
    private String tag;
    @SerializedName("Type")
    @Expose
    private String type;
    @SerializedName("DashboardIds")
    @Expose
    private String dashboardIds;
    @SerializedName("FolderIds")
    @Expose
    private String folderIds;
    @SerializedName("Starred")
    @Expose
    private String starred;
    @SerializedName("Limit")
    @Expose
    private String limit;

    public String getQuery() {
        return query;
    }

    public String getTag() {
        return tag;
    }

    public String getType() {
        return type;
    }

    public String getDashboardIds() {
        return dashboardIds;
    }

    public String getFolderIds() {
        return folderIds;
    }

    public String getStarred() {
        return starred;
    }

    public String getLimit() {
        return limit;
    }

}
