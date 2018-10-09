
package org.grafana.api.responses.Dashboard;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author jh
 */
public class DashboardRsp__1 {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("uid")
    @Expose
    private String uid;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("tags")
    @Expose
    private List<String> tags = new ArrayList<String>();
    @SerializedName("timezone")
    @Expose
    private String timezone;
    @SerializedName("schemaVersion")
    @Expose
    private Integer schemaVersion;
    @SerializedName("version")
    @Expose
    private Integer version;

    /**
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @return
     */
    public String getUid() {
        return uid;
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
    public List<String> getTags() {
        return tags;
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
    public Integer getSchemaVersion() {
        return schemaVersion;
    }

    /**
     *
     * @return
     */
    public Integer getVersion() {
        return version;
    }

}
