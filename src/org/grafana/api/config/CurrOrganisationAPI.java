
package org.grafana.api.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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
    private CurrOrgList currOrgList;
    @SerializedName("CurrOrgUsers")
    @Expose
    private CurrOrgUsers currOrgUsers;
    @SerializedName("UpdateCurrOrgUserByID")
    @Expose
    private UpdateCurrOrgUserByID updateCurrOrgUserByID;
    @SerializedName("UpdateCurrOrg")
    @Expose
    private UpdateCurrOrg updateCurrOrg;
    @SerializedName("AddOrgCurrUser")
    @Expose
    private AddOrgCurrUser addOrgCurrUser;
    @SerializedName("DeleteCurrOrgUserByID")
    @Expose
    private DeleteCurrOrgUserByID deleteCurrOrgUserByID;

    public String getVersion() {
        return version;
    }

    public String getAuthentication() {
        return authentication;
    }

    public String getLink() {
        return link;
    }

    public CurrOrgList getCurrOrgList() {
        return currOrgList;
    }

    public CurrOrgUsers getCurrOrgUsers() {
        return currOrgUsers;
    }

    public UpdateCurrOrgUserByID getUpdateCurrOrgUserByID() {
        return updateCurrOrgUserByID;
    }

    public UpdateCurrOrg getUpdateCurrOrg() {
        return updateCurrOrg;
    }

    public AddOrgCurrUser getAddOrgCurrUser() {
        return addOrgCurrUser;
    }

    public DeleteCurrOrgUserByID getDeleteCurrOrgUserByID() {
        return deleteCurrOrgUserByID;
    }

}
