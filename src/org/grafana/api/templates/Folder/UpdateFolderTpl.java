
package org.grafana.api.templates.Folder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UpdateFolderTpl {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("version")
    @Expose
    private Integer version;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

}
