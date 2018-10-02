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
import org.grafana.api.responses.SearchFolderDashboardRsp;
import org.grafana.api.templates.Search.FolderDashboardTpl;

/**
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
        String mainOrgApiKey = "Bearer eyJrIjoiT2VDRDNWN2RORzREdmNQdzlHTE9nRkZIendWTFJVN2MiLCJuIjoiQWRtaW5fS2V5IiwiaWQiOjF9";
        // Username: admin Password: admin
        String serverAdminKey = "Basic YWRtaW46YWRtaW4=";

        GrafanaAPI grafanaAPI = new GrafanaAPI(grafanaServer);
        
        /* List all Organisations of Grafana Admin Context */
        /*
        grafanaAPI.serverAdminAPI(serverAdminKey).getOrgs().stream().forEach((OrganisationRsp item) -> {
            System.out.println(gsonPretty.toJson(item));
        });
        */
        
        /* Get Grafana Organisation by Name */
        //System.out.println(gsonPretty.toJson(grafanaAPI.serverAdminAPI(serverAdminKey).getOrgByName("Test Org 1")));
        
        /* Get Grafana Organisation by ID */
        //System.out.println(gsonPretty.toJson(grafanaAPI.serverAdminAPI(serverAdminKey).getOrgByID("3")));
        
        /* Get Grafana Organisation Users by Organisation ID */
        /*
        LinkedList<OrganisationUsersRsp> orgUsersByID = grafanaAPI.serverAdminAPI(serverAdminKey).getOrgUsersByID("3");
        orgUsersByID.stream().forEach((item) -> {
            System.out.println(item.getEmail());
        });
        */
        
        /* Create new Grafana Organisation*/
        /*
        CreateUpdateOrgTpl newOrg = new CreateUpdateOrgTpl();
        newOrg.setName("Another Test org2");
        try{    
            System.out.println(grafanaAPI.serverAdminAPI(serverAdminKey).createOrg(newOrg).getMessage());
        }catch(NullPointerException ex){
            Logger.getLogger(TestingAndExample.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        
        /* Get all Grafana Users */
        /*
        LinkedList<UserRsp> users = grafanaAPI.serverAdminAPI(serverAdminKey).getUsers();
        users.stream().forEach((item) -> {
            System.out.println(item.getId());
        });
        */
        
        /* Get Grafana User by ID */
        //System.out.println(grafanaAPI.serverAdminAPI(serverAdminKey).getUserByID("2").getLogin());
        
        /* Get Grafana Organistations of User by ID */
        /*
        LinkedList<UserOrgsRsp> userOrgsByID = grafanaAPI.serverAdminAPI(serverAdminKey).getUserOrgsByID("1");
        userOrgsByID.stream().forEach((item) -> {
        System.out.println(item.getName());
        });
        */
        
        /* Get Grafana User by Login or Emai*/
        //System.out.println(grafanaAPI.serverAdminAPI(serverAdminKey).getUserByLoginOrEmail("abc"));
        
        /* Create Grafana User*/
        /*
        CreateUserTpl newUser = new CreateUserTpl();
        newUser.setEmail("grafanaAPI@test.com");
        newUser.setLogin("test");
        newUser.setName("Test User");
        newUser.setPassword("TestTestTest");
        NewUser createUser;
        System.out.println(gson.toJson(newUser));
        createUser = grafanaAPI.serverAdminAPI(serverAdminKey).createUser(newUser);
        
        try{
            System.out.println(grafanaAPI.serverAdminAPI(serverAdminKey).createUser(newUser).getMessage());
        }catch(NullPointerException ex){
            Logger.getLogger(TestingAndExample.class.getName()).log(Level.SEVERE, null, ex);
        }
         */
        
        /* Get Home Dashboard of current API Key Context*/
        //System.out.println(grafanaAPI.orgAdminAPI(mainOrgApiKey).getDashboardHome().getDashboard().getTitle());
        
        /* Get Dashboard by ID of current API Key Context*/
        //System.out.println(grafanaAPI.orgAdminAPI(mainOrgApiKey).getDashboardByUid("WKdonwFmk").getDashboard().getTitle());
        
        /* Get all Dashboard Tags of current API Key Context*/
        /*
        grafanaAPI.orgAdminAPI(mainOrgApiKey).getDashboardTags().stream().forEach((DashboardTagRsp item) -> {
            System.out.println("Tags: " + item.getTerm());
        });
        */
        
        /* Get Users of current API Key Context*/
        /*
        grafanaAPI.orgAdminAPI(mainOrgApiKey).getCurrOrgUsers().stream().forEach((OrganisationUsersRsp item) -> {
            System.out.println("OrgUsers: " + item.getLogin());
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
        List<String> tags = new ArrayList<String>();
        tags.add("RawDR");
        folderDashSearch.setTags(tags);
        grafanaAPI.orgAdminAPI(mainOrgApiKey).searchFolderDashboard(folderDashSearch).stream().forEach((SearchFolderDashboardRsp item) -> {
            System.out.println(gson.toJson(item));
        });
        */
        
        
    }
}
