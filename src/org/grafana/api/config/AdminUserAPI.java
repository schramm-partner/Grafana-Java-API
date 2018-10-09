
package org.grafana.api.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author jh
 */
public class AdminUserAPI {

    @SerializedName("Version")
    @Expose
    private String version;
    @SerializedName("Authentication")
    @Expose
    private String authentication;
    @SerializedName("Link")
    @Expose
    private String link;
    @SerializedName("UsersList")
    @Expose
    private RequestParam usersList;
    @SerializedName("UserByID")
    @Expose
    private RequestParam userByID;
    @SerializedName("UserByLoginEmail")
    @Expose
    private RequestParam userByLoginEmail;
    @SerializedName("UserOrgsByID")
    @Expose
    private RequestParam userOrgsByID;
    @SerializedName("CurrUserContext")
    @Expose
    private RequestParam currUserContext;
    @SerializedName("CreateUserConf")
    @Expose
    private RequestParam createUserConf;
    @SerializedName("SwitchUserOrgContext")
    @Expose
    private RequestParam switchUserOrgContext;
    @SerializedName("UpdateUser")
    @Expose
    private RequestParam updateUser;
    @SerializedName("SetPasswordByID")
    @Expose
    private RequestParam setPasswordByID;
    @SerializedName("SetPermissionByID")
    @Expose
    private RequestParam setPermissionByID;
    @SerializedName("DeleteByID")
    @Expose
    private RequestParam deleteByID;

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
    public RequestParam getUsersList() {
        return usersList;
    }

    /**
     *
     * @return
     */
    public RequestParam getUserByID() {
        return userByID;
    }

    /**
     *
     * @return
     */
    public RequestParam getUserByLoginEmail() {
        return userByLoginEmail;
    }

    /**
     *
     * @return
     */
    public RequestParam getUserOrgsByID() {
        return userOrgsByID;
    }

    /**
     *
     * @return
     */
    public RequestParam getCurrUserContext() {
        return currUserContext;
    }

    /**
     *
     * @return
     */
    public RequestParam getCreateUserConf() {
        return createUserConf;
    }

    /**
     *
     * @return
     */
    public RequestParam getSwitchUserOrgContext() {
        return switchUserOrgContext;
    }

    /**
     *
     * @return
     */
    public RequestParam getUpdateUser() {
        return updateUser;
    }

    /**
     *
     * @return
     */
    public RequestParam getSetPasswordByID() {
        return setPasswordByID;
    }

    /**
     *
     * @return
     */
    public RequestParam getSetPermissionByID() {
        return setPermissionByID;
    }

    /**
     *
     * @return
     */
    public RequestParam getDeleteByID() {
        return deleteByID;
    }

}
