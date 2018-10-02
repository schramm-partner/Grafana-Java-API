
package org.grafana.api.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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
    private FolderList folderList;
    @SerializedName("FolderByUid")
    @Expose
    private FolderByUid folderByUid;
    @SerializedName("FolderByID")
    @Expose
    private FolderByID folderByID;
    @SerializedName("CreateFolder")
    @Expose
    private CreateFolder createFolder;
    @SerializedName("UpdateFolder")
    @Expose
    private UpdateFolder updateFolder;
    @SerializedName("DeleteFolderByUid")
    @Expose
    private DeleteFolderByUid deleteFolderByUid;

    public String getVersion() {
        return version;
    }

    public String getAuthentication() {
        return authentication;
    }

    public String getLink() {
        return link;
    }

    public FolderList getFolderList() {
        return folderList;
    }

    public FolderByUid getFolderByUid() {
        return folderByUid;
    }

    public FolderByID getFolderByID() {
        return folderByID;
    }

    public CreateFolder getCreateFolder() {
        return createFolder;
    }

    public UpdateFolder getUpdateFolder() {
        return updateFolder;
    }

    public DeleteFolderByUid getDeleteFolderByUid() {
        return deleteFolderByUid;
    }

}
