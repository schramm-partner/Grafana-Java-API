
package org.grafana.api.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author jh
 */
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
    private RequestParam orgList;
    @SerializedName("OrgByID")
    @Expose
    private RequestParam orgByID;
    @SerializedName("OrgByName")
    @Expose
    private RequestParam orgByName;
    @SerializedName("OrgUsersByID")
    @Expose
    private RequestParam orgUsersByID;
    @SerializedName("CreateOrg")
    @Expose
    private RequestParam createOrg;
    @SerializedName("AddOrgUserByID")
    @Expose
    private RequestParam addOrgUserByID;
    @SerializedName("UpdateOrgByID")
    @Expose
    private RequestParam updateOrgByID;
    @SerializedName("UpdateOrgUserByID")
    @Expose
    private RequestParam updateOrgUserByID;
    @SerializedName("DeleteOrgByID")
    @Expose
    private RequestParam deleteOrgByID;
    @SerializedName("DeleteOrgUserByID")
    @Expose
    private RequestParam deleteOrgUserByID;

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
    public RequestParam getOrgList() {
        return orgList;
    }

    /**
     *
     * @return
     */
    public RequestParam getOrgByID() {
        return orgByID;
    }

    /**
     *
     * @return
     */
    public RequestParam getOrgByName() {
        return orgByName;
    }

    /**
     *
     * @return
     */
    public RequestParam getOrgUsersByID() {
        return orgUsersByID;
    }

    /**
     *
     * @return
     */
    public RequestParam getCreateOrg() {
        return createOrg;
    }

    /**
     *
     * @return
     */
    public RequestParam getAddOrgUserByID() {
        return addOrgUserByID;
    }

    /**
     *
     * @return
     */
    public RequestParam getUpdateOrgByID() {
        return updateOrgByID;
    }

    /**
     *
     * @return
     */
    public RequestParam getUpdateOrgUserByID() {
        return updateOrgUserByID;
    }

    /**
     *
     * @return
     */
    public RequestParam getDeleteOrgByID() {
        return deleteOrgByID;
    }

    /**
     *
     * @return
     */
    public RequestParam getDeleteOrgUserByID() {
        return deleteOrgUserByID;
    }

}
