
package org.grafana.api.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AdminOrganisationAPI {

    @SerializedName("Version")
    @Expose
    private String version;
    @SerializedName("Authentication")
    @Expose
    private String authentication;
    @SerializedName("Link")
    @Expose
    private String link;
    @SerializedName("OrgList")
    @Expose
    private OrgList orgList;
    @SerializedName("OrgByID")
    @Expose
    private OrgByID orgByID;
    @SerializedName("OrgByName")
    @Expose
    private OrgByName orgByName;
    @SerializedName("OrgUsersByID")
    @Expose
    private OrgUsersByID orgUsersByID;
    @SerializedName("CreateOrg")
    @Expose
    private CreateOrg createOrg;
    @SerializedName("AddOrgUserByID")
    @Expose
    private AddOrgUserByID addOrgUserByID;
    @SerializedName("UpdateOrgByID")
    @Expose
    private UpdateOrgByID updateOrgByID;
    @SerializedName("UpdateOrgUserByID")
    @Expose
    private UpdateOrgUserByID updateOrgUserByID;
    @SerializedName("DeleteOrgByID")
    @Expose
    private DeleteOrgByID deleteOrgByID;
    @SerializedName("DeleteOrgUserByID")
    @Expose
    private DeleteOrgUserByID deleteOrgUserByID;

    public String getVersion() {
        return version;
    }

    public String getAuthentication() {
        return authentication;
    }

    public String getLink() {
        return link;
    }

    public OrgList getOrgList() {
        return orgList;
    }

    public OrgByID getOrgByID() {
        return orgByID;
    }

    public OrgByName getOrgByName() {
        return orgByName;
    }

    public OrgUsersByID getOrgUsersByID() {
        return orgUsersByID;
    }

    public CreateOrg getCreateOrg() {
        return createOrg;
    }

    public AddOrgUserByID getAddOrgUserByID() {
        return addOrgUserByID;
    }

    public UpdateOrgByID getUpdateOrgByID() {
        return updateOrgByID;
    }

    public UpdateOrgUserByID getUpdateOrgUserByID() {
        return updateOrgUserByID;
    }

    public DeleteOrgByID getDeleteOrgByID() {
        return deleteOrgByID;
    }

    public DeleteOrgUserByID getDeleteOrgUserByID() {
        return deleteOrgUserByID;
    }

}
