
package org.grafana.api.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author jh
 */
public class URLParameters {

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

    /**
     *
     * @return
     */
    public String getQuery() {
        return query;
    }

    /**
     *
     * @return
     */
    public String getTag() {
        return tag;
    }

    /**
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @return
     */
    public String getDashboardIds() {
        return dashboardIds;
    }

    /**
     *
     * @return
     */
    public String getFolderIds() {
        return folderIds;
    }

    /**
     *
     * @return
     */
    public String getStarred() {
        return starred;
    }

    /**
     *
     * @return
     */
    public String getLimit() {
        return limit;
    }

}
