
package org.grafana.api.responses.Dashboard;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DashboardRsp__2 {

    @SerializedName("editable")
    @Expose
    private Boolean editable;
    @SerializedName("hideControls")
    @Expose
    private Boolean hideControls;
    @SerializedName("nav")
    @Expose
    private List<NavRsp> nav = new ArrayList<NavRsp>();
    @SerializedName("style")
    @Expose
    private String style;
    @SerializedName("tags")
    @Expose
    private List<Object> tags = new ArrayList<Object>();
    @SerializedName("templating")
    @Expose
    private TemplatingRsp templating;
    @SerializedName("time")
    @Expose
    private TimeRsp time;
    @SerializedName("timezone")
    @Expose
    private String timezone;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("version")
    @Expose
    private Integer version;

    public Boolean getEditable() {
        return editable;
    }

    public Boolean getHideControls() {
        return hideControls;
    }

    public List<NavRsp> getNav() {
        return nav;
    }

    public String getStyle() {
        return style;
    }

    public List<Object> getTags() {
        return tags;
    }

    public TemplatingRsp getTemplating() {
        return templating;
    }

    public TimeRsp getTime() {
        return time;
    }

    public String getTimezone() {
        return timezone;
    }

    public String getTitle() {
        return title;
    }

    public Integer getVersion() {
        return version;
    }

}
