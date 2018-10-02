/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.grafana.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import org.grafana.api.config.ApiKeyList;
import org.grafana.api.config.CreateApiKey;
import org.grafana.api.config.CreateOrg;
import org.grafana.api.config.CreateUserConf;
import org.grafana.api.config.CurrUserContext;
import org.grafana.api.config.DeleteApiKeyByID;
import org.grafana.api.config.OrgByID;
import org.grafana.api.config.OrgByName;
import org.grafana.api.config.OrgList;
import org.grafana.api.config.OrgUsersByID;
import org.grafana.api.config.SwitchUserOrgContext;
import org.grafana.api.config.UserByID;
import org.grafana.api.config.UserByLoginEmail;
import org.grafana.api.config.UserOrgsByID;
import org.grafana.api.config.UsersList;
import org.grafana.api.responses.AdminAPI.ApiKeyRsp;
import org.grafana.api.responses.AdminAPI.NewApiKeyRsp;
import org.grafana.api.responses.AdminAPI.NewOrganisationRsp;
import org.grafana.api.responses.AdminAPI.NewUserRsp;
import org.grafana.api.responses.AdminAPI.OrganisationRsp;
import org.grafana.api.responses.AdminAPI.OrganisationUsersRsp;
import org.grafana.api.responses.AdminAPI.UserRsp;
import org.grafana.api.responses.AdminAPI.UserOrgsRsp;
import org.grafana.api.responses.MessageRsp;
import org.grafana.api.templates.AdminAPI.CreateApiKeyTpl;
import org.grafana.api.templates.Organisation.CreateUpdateOrgTpl;
import org.grafana.api.templates.User.CreateUserTpl;
import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author Jonathan Hetzer at Schramm und Partner GmbH
 */
public class ServerAdminAPI {

    private final GrafanaAPI grafanaAPI;
    private final Gson gson;

    /**
     *
     * @param grafanaAPI
     */
    public ServerAdminAPI(GrafanaAPI grafanaAPI) {
        this.grafanaAPI = grafanaAPI;
        this.gson = new GsonBuilder().create();
    }

    /**
     * Get all Org of Grafana
     *
     * @return
     *
     */
    public LinkedList<OrganisationRsp> getOrgList() {
        OrgList getOrgs = grafanaAPI.getConfiguration().getAdminOrganisationAPI().getOrgList();
        JsonElement createServerRequest = grafanaAPI.getServerConnection().createServerRequest(
                getOrgs.getURL().replace(" ", "%20"),
                getOrgs.getMethode(),
                grafanaAPI.getBasic()
        );
        return (new LinkedList(Arrays.asList(gson.fromJson(createServerRequest, OrganisationRsp[].class))));

    }

    /**
     * Get Grafana Org by ID from all Org
     *
     * @param id
     * @return
     *
     */
    public OrganisationRsp getOrgByID(String id) {
        OrgByID getOrgByID = grafanaAPI.getConfiguration().getAdminOrganisationAPI().getOrgByID();

        JsonElement createServerRequest = grafanaAPI.getServerConnection().createServerRequest(
                getOrgByID.getURL().replace(getOrgByID.getParameter(), id).replace(" ", "%20"),
                getOrgByID.getMethode(),
                grafanaAPI.getBasic()
        );
        return (gson.fromJson(createServerRequest, OrganisationRsp.class));

    }

    /**
     * Get Grafana Org by Name from all Org
     *
     * @param name
     * @return
     *
     */
    public OrganisationRsp getOrgByName(String name) {
        OrgByName getOrgByName = grafanaAPI.getConfiguration().getAdminOrganisationAPI().getOrgByName();

        JsonElement createServerRequest = grafanaAPI.getServerConnection().createServerRequest(
                getOrgByName.getURL().replace(getOrgByName.getParameter(), name).replace(" ", "%20"),
                getOrgByName.getMethode(),
                grafanaAPI.getBasic()
        );
        return (gson.fromJson(createServerRequest, OrganisationRsp.class));

    }

    /**
     * Get Users of Org by Org ID from all Grafana Orgs
     *
     * @param orgID
     * @return
     *
     */
    public LinkedList<OrganisationUsersRsp> getOrgUsersByID(String orgID) {
        OrgUsersByID getOrgUsersByID = grafanaAPI.getConfiguration().getAdminOrganisationAPI().getOrgUsersByID();

        JsonElement createServerRequest = grafanaAPI.getServerConnection().createServerRequest(
                getOrgUsersByID.getURL().replace(getOrgUsersByID.getParameter(), orgID).replace(" ", "%20"),
                getOrgUsersByID.getMethode(),
                grafanaAPI.getBasic()
        );
        return (new LinkedList(Arrays.asList(gson.fromJson(createServerRequest, OrganisationUsersRsp[].class))));

    }

    /**
     *
     * @param json
     * @return
     */
    public NewOrganisationRsp createOrg(String json) {
        return createOrgExtented(json);

    }

    /**
     *
     * @param orgObj
     * @return
     */
    public NewOrganisationRsp createOrg(CreateUpdateOrgTpl orgObj) {
        return createOrgExtented(gson.toJson(orgObj));
    }

    /**
     *
     * @param json
     * @return
     */
    private NewOrganisationRsp createOrgExtented(String json) {
        CreateOrg createOrg = grafanaAPI.getConfiguration().getAdminOrganisationAPI().getCreateOrg();
        JsonElement createServerRequest = grafanaAPI.getServerConnection().createServerRequest(
                createOrg.getURL().replace(" ", "%20"),
                createOrg.getMethode(),
                json,
                grafanaAPI.getBasic()
        );
        return (gson.fromJson(createServerRequest, NewOrganisationRsp.class));

    }

    /**
     *
     * @return
     *
     */
    public LinkedList<UserRsp> getUsers() {
        UsersList getUsers = grafanaAPI.getConfiguration().getAdminUserAPI().getUsersList();

        JsonElement createServerRequest = grafanaAPI.getServerConnection().createServerRequest(
                getUsers.getURL().replace(" ", "%20"),
                getUsers.getMethode(),
                grafanaAPI.getBasic()
        );
        return (new LinkedList(Arrays.asList(gson.fromJson(createServerRequest, UserRsp[].class))));

    }

    /**
     * Get Global Grafana User by ID
     *
     * @param userID
     * @return
     *
     */
    public UserRsp getUserByID(String userID) {
        UserByID getUserByID = grafanaAPI.getConfiguration().getAdminUserAPI().getUserByID();

        JsonElement createServerRequest = grafanaAPI.getServerConnection().createServerRequest(
                getUserByID.getURL().replace(getUserByID.getParameter(), userID).replace(" ", "%20"),
                getUserByID.getMethode(),
                grafanaAPI.getBasic()
        );
        return (gson.fromJson(createServerRequest, UserRsp.class));

    }

    /**
     * Get Global Grafana User by Login or Email
     *
     * @param loginOrEmail
     * @return
     */
    public UserRsp getUserByLoginOrEmail(String loginOrEmail) {
        UserByLoginEmail getUserByLoginEmail = grafanaAPI.getConfiguration().getAdminUserAPI().getUserByLoginEmail();

        JsonElement createServerRequest = grafanaAPI.getServerConnection().createServerRequest(
                getUserByLoginEmail.getURL().replace(getUserByLoginEmail.getParameter(), loginOrEmail).replace(" ", "%20"),
                getUserByLoginEmail.getMethode(),
                grafanaAPI.getBasic()
        );
        return (gson.fromJson(createServerRequest, UserRsp.class));

    }

    /**
     * Get all Orgs assigned to Global Grafana Users
     *
     * @param userID
     * @return
     *
     */
    public LinkedList<UserOrgsRsp> getUserOrgsByID(String userID) {
        UserOrgsByID getUserOrgsByID = grafanaAPI.getConfiguration().getAdminUserAPI().getUserOrgsByID();

        JsonElement createServerRequest = grafanaAPI.getServerConnection().createServerRequest(
                getUserOrgsByID.getURL().replace(getUserOrgsByID.getParameter(), userID).replace(" ", "%20"),
                getUserOrgsByID.getMethode(),
                grafanaAPI.getBasic()
        );
        return (new LinkedList(Arrays.asList(gson.fromJson(createServerRequest, UserOrgsRsp[].class))));

    }

    /**
     * Create new Global Grafana User
     *
     * @param json
     * @return
     */
    public NewUserRsp createUser(String json) {
        return createUserExtented(json);
    }

    /**
     * Create new Global Grafana User
     *
     * @param userObj
     * @return
     */
    public NewUserRsp createUser(CreateUserTpl userObj) {
        return createUserExtented(gson.toJson(userObj));
    }

    /**
     *
     * @param userObj
     * @return
     */
    private NewUserRsp createUserExtented(String json) {
        CreateUserConf createUserConf = grafanaAPI.getConfiguration().getAdminUserAPI().getCreateUserConf();

        JsonElement createServerRequest = grafanaAPI.getServerConnection().createServerRequest(
                createUserConf.getURL().replace(" ", "%20"),
                createUserConf.getMethode(),
                json,
                grafanaAPI.getBasic()
        );
        return (gson.fromJson(createServerRequest, NewUserRsp.class));

    }
    public UserRsp getCurrUserContext(){
        CurrUserContext currUserContext = grafanaAPI.getConfiguration().getAdminUserAPI().getCurrUserContext();

        JsonElement createServerRequest = grafanaAPI.getServerConnection().createServerRequest(
                currUserContext.getURL().replace(" ", "%20"),
                currUserContext.getMethode(),
                grafanaAPI.getBasic()
        );
        return (gson.fromJson(createServerRequest, UserRsp.class));

    }

    public MessageRsp switchUserOrgContext(String orgID){
        SwitchUserOrgContext switchUserOrgContext = grafanaAPI.getConfiguration().getAdminUserAPI().getSwitchUserOrgContext();

        JsonElement createServerRequest = grafanaAPI.getServerConnection().createServerRequest(
                switchUserOrgContext.getURL().replace(switchUserOrgContext.getParameter(), orgID).replace(" ", "%20"),
                switchUserOrgContext.getMethode(),
                grafanaAPI.getBasic()
        );
        return (gson.fromJson(createServerRequest, MessageRsp.class));

    }
    
    public LinkedList<ApiKeyRsp> getApiKeyList(){
        ApiKeyList apiKeyList = grafanaAPI.getConfiguration().getAuthAPI().getApiKeyList();

        JsonElement createServerRequest = grafanaAPI.getServerConnection().createServerRequest(
                apiKeyList.getURL().replace(" ", "%20"),
                apiKeyList.getMethode(),
                grafanaAPI.getBasic()
        );
        return (new LinkedList(Arrays.asList(gson.fromJson(createServerRequest, ApiKeyRsp[].class))));

    }
    
    public NewApiKeyRsp createApiKey(CreateApiKeyTpl apiKeyObj){
        return createApiKeyExtented(gson.toJson(apiKeyObj));
    }
    
    public NewApiKeyRsp createApiKey(String json){
        return createApiKeyExtented(json);
    }
    
    private NewApiKeyRsp createApiKeyExtented(String json){
        CreateApiKey createApiKey = grafanaAPI.getConfiguration().getAuthAPI().getCreateApiKey();

        JsonElement createServerRequest = grafanaAPI.getServerConnection().createServerRequest(
                createApiKey.getURL().replace(" ", "%20"),
                createApiKey.getMethode(),
                json,
                grafanaAPI.getBasic()
        );
        return (gson.fromJson(createServerRequest, NewApiKeyRsp.class));
    }
    
    /**
     * Methode and/or Grafana  REST API will always return a "API key deleted"
     * message
     *
     * @param apiKeyID
     * @return
     */
    public MessageRsp deleteApiKeyByID(String apiKeyID){
        DeleteApiKeyByID deleteApiKeyByID = grafanaAPI.getConfiguration().getAuthAPI().getDeleteApiKeyByID();

        JsonElement createServerRequest = grafanaAPI.getServerConnection().createServerRequest(
                deleteApiKeyByID.getURL().replace(deleteApiKeyByID.getParameter(), apiKeyID).replace(" ", "%20"),
                deleteApiKeyByID.getMethode(),
                grafanaAPI.getBasic()
        );
        System.out.println(deleteApiKeyByID.getURL().replace(deleteApiKeyByID.getParameter(), apiKeyID).replace(" ", "%20"));
        System.out.println(gson.toJson(createServerRequest));
        return (gson.fromJson(createServerRequest, MessageRsp.class));
    }
    /*
     ToDO:
     Add Set methodes
     Add Delete methodes
     */
}
