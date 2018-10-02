
package org.grafana.api.responses.Folder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FolderRsp {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("uid")
    @Expose
    private String uid;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("hasAcl")
    @Expose
    private Boolean hasAcl;
    @SerializedName("canSave")
    @Expose
    private Boolean canSave;
    @SerializedName("canEdit")
    @Expose
    private Boolean canEdit;
    @SerializedName("canAdmin")
    @Expose
    private Boolean canAdmin;
    @SerializedName("createdBy")
    @Expose
    private String createdBy;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("updatedBy")
    @Expose
    private String updatedBy;
    @SerializedName("updated")
    @Expose
    private String updated;
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

    public String getUrl() {
        return url;
    }

    public Boolean getHasAcl() {
        return hasAcl;
    }

    public Boolean getCanSave() {
        return canSave;
    }

    public Boolean getCanEdit() {
        return canEdit;
    }

    public Boolean getCanAdmin() {
        return canAdmin;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public String getCreated() {
        return created;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public String getUpdated() {
        return updated;
    }

    public Integer getVersion() {
        return version;
    }

}
