
package org.grafana.api.templates.Folder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CreateFolderTpl {

    @SerializedName("uid")
    @Expose
    private String uid;
    @SerializedName("title")
    @Expose
    private String title;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
