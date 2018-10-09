
package org.grafana.api.templates.Search;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author jh
 */
public class FolderDashboardTpl {

    @SerializedName("Query")
    @Expose
    private String query;
    @SerializedName("Tags")
    @Expose
    private List<String> tags = new ArrayList<String>();
    @SerializedName("Type")
    @Expose
    private String type;
    @SerializedName("DashboardIds")
    @Expose
    private List<String> dashboardIds = new ArrayList<String>();
    @SerializedName("FolderIds")
    @Expose
    private List<String> folderIds = new ArrayList<String>();
    @SerializedName("Starred")
    @Expose
    private Boolean starred;
    @SerializedName("Limit")
    @Expose
    private Integer limit;

    /**
     *
     * @return
     */
    public String getQuery() {
        return query;
    }

    /**
     *
     * @param query
     */
    public void setQuery(String query) {
        this.query = query;
    }

    /**
     *
     * @return
     */
    public List<String> getTags() {
        return tags;
    }

    /**
     *
     * @param tags
     */
    public void setTags(List<String> tags) {
        this.tags = tags;
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
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     */
    public List<String> getDashboardIds() {
        return dashboardIds;
    }

    /**
     *
     * @param dashboardIds
     */
    public void setDashboardIds(List<String> dashboardIds) {
        this.dashboardIds = dashboardIds;
    }

    /**
     *
     * @return
     */
    public List<String> getFolderIds() {
        return folderIds;
    }

    /**
     *
     * @param folderIds
     */
    public void setFolderIds(List<String> folderIds) {
        this.folderIds = folderIds;
    }

    /**
     *
     * @return
     */
    public Boolean getStarred() {
        return starred;
    }

    /**
     *
     * @param starred
     */
    public void setStarred(Boolean starred) {
        this.starred = starred;
    }

    /**
     *
     * @return
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     *
     * @param limit
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

}
