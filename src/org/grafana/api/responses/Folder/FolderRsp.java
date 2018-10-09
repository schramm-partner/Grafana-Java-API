
package org.grafana.api.responses.Folder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author jh
 */
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
    public String getUrl() {
        return url;
    }

    /**
     *
     * @return
     */
    public Boolean getHasAcl() {
        return hasAcl;
    }

    /**
     *
     * @return
     */
    public Boolean getCanSave() {
        return canSave;
    }

    /**
     *
     * @return
     */
    public Boolean getCanEdit() {
        return canEdit;
    }

    /**
     *
     * @return
     */
    public Boolean getCanAdmin() {
        return canAdmin;
    }

    /**
     *
     * @return
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     *
     * @return
     */
    public String getCreated() {
        return created;
    }

    /**
     *
     * @return
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     *
     * @return
     */
    public String getUpdated() {
        return updated;
    }

    /**
     *
     * @return
     */
    public Integer getVersion() {
        return version;
    }

}
