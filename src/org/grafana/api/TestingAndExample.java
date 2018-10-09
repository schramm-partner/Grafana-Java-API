package org.grafana.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.grafana.api.config.AdminUserAPI;
import org.grafana.api.responses.AdminAPI.ApiKeyRsp;
import org.grafana.api.responses.AdminAPI.NewApiKeyRsp;
import org.grafana.api.responses.AdminAPI.NewUserRsp;
import org.grafana.api.responses.AdminAPI.OrganisationRsp;
import org.grafana.api.responses.AdminAPI.OrganisationUsersRsp;
import org.grafana.api.responses.AdminAPI.UserRsp;
import org.grafana.api.responses.AdminAPI.UserOrgsRsp;
import org.grafana.api.responses.Dashboard.DashboardTagRsp;
import org.grafana.api.responses.Dashboard.NewCreateUpdateDashboardRsp;
import org.grafana.api.responses.Folder.FolderRsp;
import org.grafana.api.responses.MessageRsp;
import org.grafana.api.templates.AdminAPI.CreateApiKeyTpl;
import org.grafana.api.templates.Dashboard.CreateUpdateDashboardTpl;
import org.grafana.api.templates.Dashboard.DashboardTpl;
import org.grafana.api.templates.Folder.CreateFolderTpl;
import org.grafana.api.templates.Organisation.AddOrgUserTpl;
import org.grafana.api.templates.Organisation.CreateUpdateOrgTpl;
import org.grafana.api.templates.User.CreateUserInviteTpl;
import org.grafana.api.templates.User.CreateUserTpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.grafana.api.config.RequestParam;
import org.grafana.api.responses.SearchFolderDashboardRsp;
import org.grafana.api.templates.Search.FolderDashboardTpl;

/**
 * A Collection of code snippets which show how to use this API
 *
 * @author Jonathan Hetzer at Schramm und Partner GmbH
 */
public class TestingAndExample {
    
    /**
     *
     * @param args
     */
    public static void main(String[] args){
        
        /* Default required variables */
        Gson gson = new GsonBuilder().create();
        Gson gsonPretty = new GsonBuilder().setPrettyPrinting().create();
        String grafanaServer = "http://10.100.100.140";
        
        /* Organisation Admin API Key */
        String mainOrgApiKey = "Bearer eyJrIjoiRzFlZjZiVHlxNXZiNW5RbGNuM1BnTU5ZZklkV0lQMzEiLCJuIjoiVGVzdCBBUEkgS2V5IDIiLCJpZCI6MX0=";
        // Username: admin Password: admin
        String serverAdminKey = "Basic YWRtaW46YWRtaW4=";

        GrafanaAPI grafanaAPI = new GrafanaAPI(grafanaServer);
        
        /* List all Organisations of Grafana Admin Context */
        /*
        grafanaAPI.serverAdminAPI(serverAdminKey).getOrgList().stream().forEach((OrganisationRsp item) -> {
            System.out.println(gsonPretty.toJson(item));
        });
        */
        
        /* Get Grafana Organisation by Name */
        //System.out.println(gsonPretty.toJson(grafanaAPI.serverAdminAPI(serverAdminKey).getOrgByName("NewTestOrg1")));
        
        /* Get Grafana Organisation by ID */
        //System.out.println(gsonPretty.toJson(grafanaAPI.serverAdminAPI(serverAdminKey).getOrgByID("25")));
        
        /* Get Grafana Organisation Users by Organisation ID */
        /*
        LinkedList<OrganisationUsersRsp> orgUsersByID = grafanaAPI.serverAdminAPI(serverAdminKey).getOrgUsersByID("1");
        orgUsersByID.stream().forEach((item) -> {
            System.out.println(gsonPretty.toJson(item));
        });
        */
        
        /* Create new Grafana Organisation*/
        /*
        CreateUpdateOrgTpl newOrg = new CreateUpdateOrgTpl();
        newOrg.setName("Another Test Org3");
        try{    
            System.out.println(gsonPretty.toJson(grafanaAPI.serverAdminAPI(serverAdminKey).createOrg(newOrg)));
        }catch(NullPointerException ex){
            Logger.getLogger(TestingAndExample.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        
        /* Get all Grafana Users */
        /*
        LinkedList<UserRsp> users = grafanaAPI.serverAdminAPI(serverAdminKey).getUsers();
        users.stream().forEach((item) -> {
            System.out.println(gsonPretty.toJson(item));
        });
        */
        
        /* Get Grafana User by ID */
        //System.out.println(gsonPretty.toJson(grafanaAPI.serverAdminAPI(serverAdminKey).getUserByID("2")));
        
        /* Get Grafana Organistations of User by ID */
        /*
        LinkedList<UserOrgsRsp> userOrgsByID = grafanaAPI.serverAdminAPI(serverAdminKey).getUserOrgsByID("1");
        userOrgsByID.stream().forEach((item) -> {
            System.out.println(gsonPretty.toJson(item));
        });
        */
        
        /* Get Grafana User by Login or Emai*/
        //System.out.println(gsonPretty.toJson(grafanaAPI.serverAdminAPI(serverAdminKey).getUserByLoginOrEmail("admin")));
        
        /* Create Grafana User*/
        /*
        CreateUserTpl newUser = new CreateUserTpl();
        newUser.setEmail("grafanaAPI@test1234.com");
        newUser.setLogin("test");
        newUser.setName("Test User");
        newUser.setPassword("TestTestTest");
        System.out.println(gsonPretty.toJson(newUser));
        NewUserRsp createUser1 = grafanaAPI.serverAdminAPI(serverAdminKey).createUser(newUser);
        
        try{
            System.out.println(gsonPretty.toJson(grafanaAPI.serverAdminAPI(serverAdminKey).createUser(newUser)));
        }catch(NullPointerException ex){
            Logger.getLogger(TestingAndExample.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        
        /* Get Home Dashboard of current API Key Context*/
        //System.out.println(gsonPretty.toJson(grafanaAPI.orgAdminAPI(mainOrgApiKey).getDashboardHome()));
        
        /* Get Dashboard by ID of current API Key Context*/
        //System.out.println(gsonPretty.toJson(grafanaAPI.orgAdminAPI(mainOrgApiKey).getDashboardByUid("fSIYerFiz")));
        
        /* Get all Dashboard Tags of current API Key Context*/
        /*
        grafanaAPI.orgAdminAPI(mainOrgApiKey).getDashboardTags().stream().forEach((DashboardTagRsp item) -> {
            System.out.println("Tags:");
            System.out.println(gsonPretty.toJson(item));
        });
        */
        
        /* Get Users of current API Key Context*/
        /*
        grafanaAPI.orgAdminAPI(mainOrgApiKey).getCurrOrgUsers().stream().forEach((OrganisationUsersRsp item) -> {
            System.out.println("OrgUsers:");
            System.out.println(gsonPretty.toJson(item));
        });
        */
        
        /* Add User to Organisation of current API Key Context*/
        /*
        AddOrgUserTpl newOrgUser = new AddOrgUserTpl();
        newOrgUser.setLoginOrEmail(userByLoginOrEmail.getLogin());
        newOrgUser.setRole("Viewer");
        try{
            System.out.println(grafanaAPI.orgAdminAPI(mainOrgApiKey).addOrgCurrUser(newOrgUser).getMessage());
        }catch(NullPointerException ex){
            Logger.getLogger(TestingAndExample.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        
        /* Remove User from Organisation of current API Key Context*/
        //System.out.println(grafanaAPI.orgAdminAPI(mainOrgApiKey).deleteCurrOrgUserByID(userByLoginOrEmail.getId().toString()).getMessage());
        
        /* Get Folders of current API Key Context*/
        /*
        grafanaAPI.orgAdminAPI(mainOrgApiKey).getFolderList().stream().forEach((FolderRsp item) -> {
            System.out.println("Folder Name: " + item.getTitle());
            System.out.println("Folder ID: " + item.getId());
            System.out.println("UID: " + item.getUid());
        });
        */
        
        /* Get Folders by ID of current API Key Context*/
        //System.out.println(grafanaAPI.orgAdminAPI(mainOrgApiKey).getFolderByID("50").getTitle());
        
        /* Get Folders by UID of current API Key Context*/
        //System.out.println(grafanaAPI.orgAdminAPI(mainOrgApiKey).getFolderByUid("WcOTB0Amk").getTitle());
        
        /* Create Folder in the Organisation of current API Key Context*/
        /*
        CreateFolderTpl folderTemp = new CreateFolderTpl();
        folderTemp.setTitle("APITestFolder");
        try{
            System.out.println(grafanaAPI.orgAdminAPI(mainOrgApiKey).createFolder(folderTemp).getUid());
        }catch(NullPointerException ex){
            Logger.getLogger(TestingAndExample.class.getName()).log(Level.SEVERE, null, ex);
        }
        */

        /* Create Dashboard in the Organisation of current API Key Context*/
        /*
        CreateUpdateDashboardTpl dashTest = new CreateUpdateDashboardTpl();
        DashboardTpl dashItems = new DashboardTpl();
        dashItems.setTitle("MyTestTitel");
        dashTest.setDashboard(dashItems);

        NewCreateUpdateDashboardRsp createUpdateDashboard = grafanaAPI.orgAdminAPI(mainOrgApiKey).createUpdateDashboard(dashTest);
        System.out.println(gson.toJson(createUpdateDashboard));
        */
        
        /* Get current Organisation context of Grafana Admin*/
        /*
        UserRsp currUserContext = grafanaAPI.serverAdminAPI(serverAdminKey).getCurrUserContext();
        System.out.println(gson.toJson(currUserContext));
        
        OrganisationRsp orgByID = grafanaAPI.serverAdminAPI(serverAdminKey).getOrgByID(currUserContext.getOrgId().toString());
        System.out.println(gson.toJson(orgByID));
        /*
        
        /* Create new Organisation API Key*/
        /*
        CreateApiKeyTpl newAuthKey = new CreateApiKeyTpl();
        newAuthKey.setName("MyTestAuthKey1234");
        newAuthKey.setRole("Viewer");
        try{
            System.out.println((gson.toJson(grafanaAPI.serverAdminAPI(serverAdminKey).createApiKey(newAuthKey))));
        }catch(NullPointerException ex){
            Logger.getLogger(TestingAndExample.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        
        /* Get API Key of current context Organisation by Grafana Admin*/
        /*
        grafanaAPI.serverAdminAPI(serverAdminKey).getApiKeyList().stream().forEach((ApiKeyRsp item) -> {
            System.out.println("Key ID: " + item.getId());
            System.out.println("Key Name: " + item.getName());
            System.out.println("Key Role: " + item.getRole());
            System.out.println("-------");

        });
        */
        
        /* Swich Grafana Admin Organisation context*/
        //System.out.println(grafanaAPI.serverAdminAPI(serverAdminKey).switchUserOrgContext("1").getMessage());
        
        /* Delete API Key of current context Organisation by Grafana Admin*/
        /*
        try{
            System.out.println(grafanaAPI.serverAdminAPI(serverAdminKey).deleteApiKeyByID("aasdf").getMessage());
        }catch(NullPointerException ex){
            Logger.getLogger(TestingAndExample.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        
        /* Create User Invite of current Organisation*/
        /*
        CreateUserInviteTpl userInvite = new CreateUserInviteTpl();
        userInvite.setEmail("test@test123.test");
        userInvite.setLoginOrEmail("jh");
        userInvite.setName("Jonathan Hetzer");
        userInvite.setRole("Admin");
        userInvite.setSendEmail(true);
        MessageRsp createUserInvite = grafanaAPI.orgAdminAPI(mainOrgApiKey).createUserInvite(userInvite);
        
        System.out.println(gson.toJson(createUserInvite));
                
        */
        
        /* Create Grafana Search of current Organisation*/
        /*
        FolderDashboardTpl folderDashSearch = new FolderDashboardTpl();
        List<String> tags = new ArrayList<>();
        tags.add("");
        folderDashSearch.setTags(tags);
        folderDashSearch.setQuery("abc");
        grafanaAPI.orgAdminAPI(mainOrgApiKey).searchFolderDashboard(folderDashSearch).stream().forEach((SearchFolderDashboardRsp item) -> {
            System.out.println(gson.toJson(item));
        });
        */
        
        
    }
}
