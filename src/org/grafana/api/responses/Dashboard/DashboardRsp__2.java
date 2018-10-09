
package org.grafana.api.responses.Dashboard;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author jh
 */
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

    /**
     *
     * @return
     */
    public Boolean getEditable() {
        return editable;
    }

    /**
     *
     * @return
     */
    public Boolean getHideControls() {
        return hideControls;
    }

    /**
     *
     * @return
     */
    public List<NavRsp> getNav() {
        return nav;
    }

    /**
     *
     * @return
     */
    public String getStyle() {
        return style;
    }

    /**
     *
     * @return
     */
    public List<Object> getTags() {
        return tags;
    }

    /**
     *
     * @return
     */
    public TemplatingRsp getTemplating() {
        return templating;
    }

    /**
     *
     * @return
     */
    public TimeRsp getTime() {
        return time;
    }

    /**
     *
     * @return
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @return
     */
    public Integer getVersion() {
        return version;
    }

}
