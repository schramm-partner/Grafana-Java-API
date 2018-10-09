/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.grafana.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
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
import org.grafana.api.config.RequestParam;

/**
 * Methodes/Requests available form the Admin context (Base Auth)
 *
 * @author Jonathan Hetzer at Schramm und Partner GmbH
 */
public class ServerAdminAPI {

    private final GrafanaAPI grafanaAPI;
    private final Gson gson;
    private final RequestBuilder requestBuilder;

    /**
     *
     * @param grafanaAPI
     */
    public ServerAdminAPI(GrafanaAPI grafanaAPI) {
        this.grafanaAPI = grafanaAPI;
        this.gson = new GsonBuilder().create();
        this.requestBuilder = new RequestBuilder(grafanaAPI);
    }
    
    /**
     * Get all Org of Grafana
     *
     * @return
     *
     */
    public LinkedList<OrganisationRsp> getOrgList() {
        RequestParam orgList = grafanaAPI.getConfiguration().getAdminOrganisationAPI().getOrgList();
        return (new LinkedList(Arrays.asList(requestBuilder.setServerRequest(orgList, OrganisationRsp[].class))));
    }

    /**
     * Get Grafana Org by ID from all Org
     *
     * @param id
     * @return
     *
     */
    public OrganisationRsp getOrgByID(String id) {
        RequestParam orgByID = grafanaAPI.getConfiguration().getAdminOrganisationAPI().getOrgByID();
        return requestBuilder.setServerRequest(orgByID, id, OrganisationRsp.class);
    }

    /**
     * Get Grafana Org by Name from all Org
     *
     * @param name
     * @return
     *
     */
    public OrganisationRsp getOrgByName(String name) {
        RequestParam orgByName = grafanaAPI.getConfiguration().getAdminOrganisationAPI().getOrgByName();
        return  requestBuilder.setServerRequest(orgByName, name, OrganisationRsp.class);
    }

    /**
     * Get Users of Org by Org ID from all Grafana Orgs
     *
     * @param orgID
     * @return
     *
     */
    public LinkedList<OrganisationUsersRsp> getOrgUsersByID(String orgID) {
        RequestParam orgUsersByID = grafanaAPI.getConfiguration().getAdminOrganisationAPI().getOrgUsersByID();
        return (new LinkedList(Arrays.asList(requestBuilder.setServerRequest(orgUsersByID, orgID, OrganisationUsersRsp[].class))));
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
        RequestParam createOrg = grafanaAPI.getConfiguration().getAdminOrganisationAPI().getCreateOrg();
        return requestBuilder.setServerRequest(createOrg, NewOrganisationRsp.class, json);
    }

    /**
     *
     * @return
     *
     */
    public LinkedList<UserRsp> getUsers() {
        RequestParam usersList = grafanaAPI.getConfiguration().getAdminUserAPI().getUsersList();
        return (new LinkedList(Arrays.asList(requestBuilder.setServerRequest(usersList, UserRsp[].class))));
    }

    /**
     * Get Global Grafana User by ID
     *
     * @param userID
     * @return
     *
     */
    public UserRsp getUserByID(String userID) {
        RequestParam userByID = grafanaAPI.getConfiguration().getAdminUserAPI().getUserByID();
        return requestBuilder.setServerRequest(userByID, userID, UserRsp.class);
    }

    /**
     * Get Global Grafana User by Login or Email
     *
     * @param loginOrEmail
     * @return
     */
    public UserRsp getUserByLoginOrEmail(String loginOrEmail) {
        RequestParam userByLoginEmail = grafanaAPI.getConfiguration().getAdminUserAPI().getUserByLoginEmail();
        return requestBuilder.setServerRequest(userByLoginEmail, loginOrEmail, UserRsp.class);
    }

    /**
     * Get all Orgs assigned to Global Grafana Users
     *
     * @param userID
     * @return
     *
     */
    public LinkedList<UserOrgsRsp> getUserOrgsByID(String userID) {
        RequestParam userOrgsByID = grafanaAPI.getConfiguration().getAdminUserAPI().getUserOrgsByID();
        return (new LinkedList(Arrays.asList(requestBuilder.setServerRequest(userOrgsByID, userID, UserOrgsRsp[].class))));
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
        RequestParam createUserConf = grafanaAPI.getConfiguration().getAdminUserAPI().getCreateUserConf();
        return requestBuilder.setServerRequest(createUserConf, NewUserRsp.class, json);
    }

    /**
     *
     * @return
     */
    public UserRsp getCurrUserContext(){
        RequestParam currUserContext = grafanaAPI.getConfiguration().getAdminUserAPI().getCurrUserContext();
        return requestBuilder.setServerRequest(currUserContext, UserRsp.class);
    }

    /**
     *
     * @param orgID
     * @return
     */
    public MessageRsp switchUserOrgContext(String orgID){
        RequestParam switchUserOrgContext = grafanaAPI.getConfiguration().getAdminUserAPI().getSwitchUserOrgContext();
        return requestBuilder.setServerRequest(switchUserOrgContext, orgID, MessageRsp.class);
    }
    
    /**
     *
     * @return
     */
    public LinkedList<ApiKeyRsp> getApiKeyList(){
        RequestParam apiKeyList = grafanaAPI.getConfiguration().getAuthAPI().getApiKeyList();
        return (new LinkedList(Arrays.asList(requestBuilder.setServerRequest(apiKeyList, ApiKeyRsp[].class))));
    }
    
    /**
     *
     * @param apiKeyObj
     * @return
     */
    public NewApiKeyRsp createApiKey(CreateApiKeyTpl apiKeyObj){
        return createApiKeyExtented(gson.toJson(apiKeyObj));
    }
    
    /**
     *
     * @param json
     * @return
     */
    public NewApiKeyRsp createApiKey(String json){
        return createApiKeyExtented(json);
    }
    
    private NewApiKeyRsp createApiKeyExtented(String json){
        RequestParam createApiKey = grafanaAPI.getConfiguration().getAuthAPI().getCreateApiKey();
        return requestBuilder.setServerRequest(createApiKey, NewApiKeyRsp.class, json);
    }
    
    /**
     * Methode and/or Grafana  REST API will always return a "API key deleted"
     * message
     *
     * @param apiKeyID
     * @return
     */
    public MessageRsp deleteApiKeyByID(String apiKeyID){
        RequestParam deleteApiKeyByID = grafanaAPI.getConfiguration().getAuthAPI().getDeleteApiKeyByID();
        return requestBuilder.setServerRequest(deleteApiKeyByID, apiKeyID, MessageRsp.class);
    }
    /*
     ToDO:
     Add Set methodes
     Add Delete methodes
     */
}
