
package org.grafana.api.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author jh
 */
public class CurrOrganisationAPI {

    @SerializedName("Version")
    @Expose
    private String version;
    @SerializedName("Authentication")
    @Expose
    private String authentication;
    @SerializedName("Link")
    @Expose
    private String link;
    @SerializedName("CurrOrgList")
    @Expose
    private RequestParam currOrgList;
    @SerializedName("CurrOrgUsers")
    @Expose
    private RequestParam currOrgUsers;
    @SerializedName("UpdateCurrOrg")
    @Expose
    private RequestParam updateCurrOrg;
    @SerializedName("UpdateCurrOrgUserByID")
    @Expose
    private RequestParam updateCurrOrgUserByID;
    @SerializedName("AddOrgCurrUser")
    @Expose
    private RequestParam addOrgCurrUser;
    @SerializedName("DeleteCurrOrgUserByID")
    @Expose
    private RequestParam deleteCurrOrgUserByID;

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
    public RequestParam getCurrOrgList() {
        return currOrgList;
    }

    /**
     *
     * @return
     */
    public RequestParam getCurrOrgUsers() {
        return currOrgUsers;
    }

    /**
     *
     * @return
     */
    public RequestParam getUpdateCurrOrg() {
        return updateCurrOrg;
    }

    /**
     *
     * @return
     */
    public RequestParam getUpdateCurrOrgUserByID() {
        return updateCurrOrgUserByID;
    }

    /**
     *
     * @return
     */
    public RequestParam getAddOrgCurrUser() {
        return addOrgCurrUser;
    }

    /**
     *
     * @return
     */
    public RequestParam getDeleteCurrOrgUserByID() {
        return deleteCurrOrgUserByID;
    }

}
