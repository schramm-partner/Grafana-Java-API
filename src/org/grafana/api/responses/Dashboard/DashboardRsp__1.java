
package org.grafana.api.responses.Dashboard;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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

    public Integer getId() {
        return id;
    }

    public String getUid() {
        return uid;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getTags() {
        return tags;
    }

    public String getTimezone() {
        return timezone;
    }

    public Integer getSchemaVersion() {
        return schemaVersion;
    }

    public Integer getVersion() {
        return version;
    }

}
