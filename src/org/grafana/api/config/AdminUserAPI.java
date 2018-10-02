
package org.grafana.api.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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
    private UsersList usersList;
    @SerializedName("UserByID")
    @Expose
    private UserByID userByID;
    @SerializedName("UserByLoginEmail")
    @Expose
    private UserByLoginEmail userByLoginEmail;
    @SerializedName("UserOrgsByID")
    @Expose
    private UserOrgsByID userOrgsByID;
    @SerializedName("CurrUserContext")
    @Expose
    private CurrUserContext currUserContext;
    @SerializedName("CreateUserConf")
    @Expose
    private CreateUserConf createUserConf;
    @SerializedName("SwitchUserOrgContext")
    @Expose
    private SwitchUserOrgContext switchUserOrgContext;
    @SerializedName("UpdateUser")
    @Expose
    private UpdateUser updateUser;
    @SerializedName("SetPasswordByID")
    @Expose
    private SetPasswordByID setPasswordByID;
    @SerializedName("SetPermissionByID")
    @Expose
    private SetPermissionByID setPermissionByID;
    @SerializedName("DeleteByID")
    @Expose
    private DeleteByID deleteByID;

    public String getVersion() {
        return version;
    }

    public String getAuthentication() {
        return authentication;
    }

    public String getLink() {
        return link;
    }

    public UsersList getUsersList() {
        return usersList;
    }

    public UserByID getUserByID() {
        return userByID;
    }

    public UserByLoginEmail getUserByLoginEmail() {
        return userByLoginEmail;
    }

    public UserOrgsByID getUserOrgsByID() {
        return userOrgsByID;
    }

    public CurrUserContext getCurrUserContext() {
        return currUserContext;
    }

    public CreateUserConf getCreateUserConf() {
        return createUserConf;
    }

    public SwitchUserOrgContext getSwitchUserOrgContext() {
        return switchUserOrgContext;
    }

    public UpdateUser getUpdateUser() {
        return updateUser;
    }

    public SetPasswordByID getSetPasswordByID() {
        return setPasswordByID;
    }

    public SetPermissionByID getSetPermissionByID() {
        return setPermissionByID;
    }

    public DeleteByID getDeleteByID() {
        return deleteByID;
    }

}
