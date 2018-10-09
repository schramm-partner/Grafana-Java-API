
package org.grafana.api.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author jh
 */
public class FolderAPI {

    @SerializedName("Version")
    @Expose
    private String version;
    @SerializedName("Authentication")
    @Expose
    private String authentication;
    @SerializedName("Link")
    @Expose
    private String link;
    @SerializedName("FolderList")
    @Expose
    private RequestParam folderList;
    @SerializedName("FolderByUid")
    @Expose
    private RequestParam folderByUid;
    @SerializedName("FolderByID")
    @Expose
    private RequestParam folderByID;
    @SerializedName("CreateFolder")
    @Expose
    private RequestParam createFolder;
    @SerializedName("UpdateFolder")
    @Expose
    private RequestParam updateFolder;
    @SerializedName("DeleteFolderByUid")
    @Expose
    private RequestParam deleteFolderByUid;

    /**
     *
     * @return
     */
    public String getVersion() {
        return version;
    }

    /**
     *
     * @return
     */
    public String getAuthentication() {
        return authentication;
    }

    /**
     *
     * @return
     */
    public String getLink() {
        return link;
    }

    /**
     *
     * @return
     */
    public RequestParam getFolderList() {
        return folderList;
    }

    /**
     *
     * @return
     */
    public RequestParam getFolderByUid() {
        return folderByUid;
    }

    /**
     *
     * @return
     */
    public RequestParam getFolderByID() {
        return folderByID;
    }

    /**
     *
     * @return
     */
    public RequestParam getCreateFolder() {
        return createFolder;
    }

    /**
     *
     * @return
     */
    public RequestParam getUpdateFolder() {
        return updateFolder;
    }

    /**
     *
     * @return
     */
    public RequestParam getDeleteFolderByUid() {
        return deleteFolderByUid;
    }

}
