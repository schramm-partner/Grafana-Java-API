
package org.grafana.api.templates.Search;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getDashboardIds() {
        return dashboardIds;
    }

    public void setDashboardIds(List<String> dashboardIds) {
        this.dashboardIds = dashboardIds;
    }

    public List<String> getFolderIds() {
        return folderIds;
    }

    public void setFolderIds(List<String> folderIds) {
        this.folderIds = folderIds;
    }

    public Boolean getStarred() {
        return starred;
    }

    public void setStarred(Boolean starred) {
        this.starred = starred;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

}
