
package org.grafana.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import org.grafana.api.config.AddOrgCurrUser;
import org.grafana.api.config.CreateFolder;
import org.grafana.api.config.CreateUpdateDashboard;
import org.grafana.api.config.CreateUserInvite;
import org.grafana.api.config.DashboardByUid;
import org.grafana.api.config.DashboardHome;
import org.grafana.api.config.DashboardTags;
import org.grafana.api.config.DeleteDashboardByUid;
import org.grafana.api.config.CurrOrgList;
import org.grafana.api.config.CurrOrgUsers;
import org.grafana.api.config.DeleteCurrOrgUserByID;
import org.grafana.api.config.FolderByID;
import org.grafana.api.config.FolderByUid;
import org.grafana.api.config.FolderList;
import org.grafana.api.responses.AdminAPI.OrganisationRsp;
import org.grafana.api.responses.AdminAPI.OrganisationUsersRsp;
import org.grafana.api.responses.Dashboard.DashboardRsp;
import org.grafana.api.responses.Dashboard.DashboardTagRsp;
import org.grafana.api.responses.Dashboard.DeleteDashboardRsp;
import org.grafana.api.responses.Dashboard.HomeDashboardRsp;
import org.grafana.api.responses.Dashboard.NewCreateUpdateDashboardRsp;
import org.grafana.api.responses.Folder.FolderRsp;
import org.grafana.api.responses.MessageRsp;
import org.grafana.api.templates.Dashboard.CreateUpdateDashboardTpl;
import org.grafana.api.templates.Folder.CreateFolderTpl;
import org.grafana.api.templates.Organisation.AddOrgUserTpl;
import org.grafana.api.templates.User.CreateUserInviteTpl;
import java.util.Arrays;
import java.util.LinkedList;
import org.grafana.api.config.SearchGrafana;
import org.grafana.api.responses.SearchFolderDashboardRsp;
import org.grafana.api.templates.Search.FolderDashboardTpl;

/**
 *
 * @author Jonathan Hetzer at Schramm und Partner GmbH
 */
public class OrgAdminAPI {

    private final GrafanaAPI grafanaAPI;
    private final Gson gson;

    /**
     *
     * @param grafanaAPI
     */
    public OrgAdminAPI(GrafanaAPI grafanaAPI) {
        this.grafanaAPI = grafanaAPI;
        this.gson = new GsonBuilder().create();
    }

    /**
     *
     * @param dashUid
     * @return
     */
    public DashboardRsp getDashboardByUid(String dashUid) {
        DashboardByUid dashboardByID = grafanaAPI.getConfiguration().getDashboardAPI().getDashboardByUid();

        JsonElement createServerRequest = grafanaAPI.getServerConnection().createServerRequest(dashboardByID.getURL().replace(dashboardByID.getParameter(), dashUid).replace(" ", "%20"),
                dashboardByID.getMethode(),
                grafanaAPI.getoAuth()
        );
        return (gson.fromJson(createServerRequest, DashboardRsp.class));

    }

    /**
     *
     * @return
     */
    public HomeDashboardRsp getDashboardHome() {
        DashboardHome dashboardHome = grafanaAPI.getConfiguration().getDashboardAPI().getDashboardHome();

        JsonElement createServerRequest = grafanaAPI.getServerConnection().createServerRequest(
                dashboardHome.getURL().replace(" ", "%20"),
                dashboardHome.getMethode(),
                grafanaAPI.getoAuth()
        );
        return (gson.fromJson(createServerRequest, HomeDashboardRsp.class));

    }

    /**
     *
     * @return
     */
    public LinkedList<DashboardTagRsp> getDashboardTags() {
        DashboardTags dashboardTag = grafanaAPI.getConfiguration().getDashboardAPI().getDashboardTags();
        
        JsonElement createServerRequest = grafanaAPI.getServerConnection().createServerRequest(
                dashboardTag.getURL().replace(" ", "%20"),
                dashboardTag.getMethode(),
                grafanaAPI.getoAuth()
        );
        return (new LinkedList(Arrays.asList(gson.fromJson(createServerRequest, DashboardTagRsp[].class))));
    }

    /**
     *
     * @param json
     * @return
     */
    public NewCreateUpdateDashboardRsp createUpdateDashboard(String json) {
        return createUpdateDashboardExtented(json);

    }

    /**
     *
     * @param dashbordObj
     * @return
     */
    public NewCreateUpdateDashboardRsp createUpdateDashboard(CreateUpdateDashboardTpl dashbordObj) {
        return createUpdateDashboardExtented(gson.toJson(dashbordObj));
    }

    /**
     *
     * @param json
     * @return
     */
    private NewCreateUpdateDashboardRsp createUpdateDashboardExtented(String json) {
        CreateUpdateDashboard createUpdateDashboard = grafanaAPI.getConfiguration().getDashboardAPI().getCreateUpdateDashboard();
        
        JsonElement createServerRequest = grafanaAPI.getServerConnection().createServerRequest(
                createUpdateDashboard.getURL().replace(" ", "%20"),
                createUpdateDashboard.getMethode(),
                json,
                grafanaAPI.getoAuth()
        );
        return (gson.fromJson(createServerRequest, NewCreateUpdateDashboardRsp.class));

    }

    /**
     *
     * @param dashUid
     * @return
     */
    public DeleteDashboardRsp deleteDashboardByUid(String dashUid) {
        DeleteDashboardByUid deleteDashboardByUid = grafanaAPI.getConfiguration().getDashboardAPI().getDeleteDashboardByUid();

        JsonElement createServerRequest = grafanaAPI.getServerConnection().createServerRequest(
                deleteDashboardByUid.getURL().replace(deleteDashboardByUid.getParameter(), dashUid).replace(" ", "%20"),
                deleteDashboardByUid.getMethode(),
                grafanaAPI.getoAuth()
        );
        return (gson.fromJson(createServerRequest, DeleteDashboardRsp.class));
    }
    
    /**
     *
     * @return
     */
    public LinkedList<OrganisationRsp> getCurrOrgList(){
        CurrOrgList currorgList = grafanaAPI.getConfiguration().getCurrOrganisationAPI().getCurrOrgList();
        

        JsonElement createServerRequest = grafanaAPI.getServerConnection().createServerRequest(
                currorgList.getURL().replace(" ", "%20"),
                currorgList.getMethode(),
                grafanaAPI.getoAuth()
        );
        return (new LinkedList(Arrays.asList(gson.fromJson(createServerRequest, OrganisationRsp[].class))));
    }

    /**
     *
     * @return
     */
    public LinkedList<OrganisationUsersRsp> getCurrOrgUsers(){
        CurrOrgUsers currOrgUsers = grafanaAPI.getConfiguration().getCurrOrganisationAPI().getCurrOrgUsers();
        
        JsonElement createServerRequest = grafanaAPI.getServerConnection().createServerRequest(
                currOrgUsers.getURL().replace(" ", "%20"),
                currOrgUsers.getMethode(),
                grafanaAPI.getoAuth()
        );
        return (new LinkedList(Arrays.asList(gson.fromJson(createServerRequest, OrganisationUsersRsp[].class))));
    }

    /**
     *
     * @param json
     * @return
     */
    public MessageRsp addOrgCurrUser(String json){
        return addOrgCurrUserExtented(json);
    }

    /**
     *
     * @param json
     * @return
     */
    public MessageRsp addOrgCurrUser(AddOrgUserTpl json){
        return addOrgCurrUserExtented(gson.toJson(json));
    }
    private MessageRsp addOrgCurrUserExtented(String json){
        AddOrgCurrUser addOrgCurrUser = grafanaAPI.getConfiguration().getCurrOrganisationAPI().getAddOrgCurrUser();
        
        JsonElement createServerRequest = grafanaAPI.getServerConnection().createServerRequest(
                addOrgCurrUser.getURL().replace(" ", "%20"),
                addOrgCurrUser.getMethode(),
                json,
                grafanaAPI.getoAuth()
        );
        return (gson.fromJson(createServerRequest, MessageRsp.class));
    }
    
    /**
     *
     * @param userID
     * @return
     */
    public MessageRsp deleteCurrOrgUserByID(String userID){
        DeleteCurrOrgUserByID deleteCurrOrgUserByID = grafanaAPI.getConfiguration().getCurrOrganisationAPI().getDeleteCurrOrgUserByID();

        JsonElement createServerRequest = grafanaAPI.getServerConnection().createServerRequest(
                deleteCurrOrgUserByID.getURL().replace(deleteCurrOrgUserByID.getParameter(), userID).replace(" ", "%20"),
                deleteCurrOrgUserByID.getMethode(),
                grafanaAPI.getoAuth()
        );
        return (gson.fromJson(createServerRequest, MessageRsp.class));
    }

    /**
     *
     * @return
     */
    public LinkedList<FolderRsp> getFolderList(){
        FolderList folderList = grafanaAPI.getConfiguration().getFolderAPI().getFolderList();
        
        JsonElement createServerRequest = grafanaAPI.getServerConnection().createServerRequest(
                folderList.getURL().replace(" ", "%20"),
                folderList.getMethode(),
                grafanaAPI.getoAuth()
        );
        return (new LinkedList(Arrays.asList(gson.fromJson(createServerRequest, FolderRsp[].class))));
    }
    
    /**
     *
     * @param folderUid
     * @return
     */
    public FolderRsp getFolderByUid (String folderUid){
        FolderByUid folderByUid = grafanaAPI.getConfiguration().getFolderAPI().getFolderByUid();
        
        JsonElement createServerRequest = grafanaAPI.getServerConnection().createServerRequest(
                folderByUid.getURL().replace(folderByUid.getParameter(), folderUid).replace(" ", "%20"),
                folderByUid.getMethode(),
                grafanaAPI.getoAuth()
        );
        return (gson.fromJson(createServerRequest, FolderRsp.class));
    }

    /**
     *
     * @param folderID
     * @return
     */
    public FolderRsp getFolderByID (String folderID){
        FolderByID folderByID = grafanaAPI.getConfiguration().getFolderAPI().getFolderByID();
        
        JsonElement createServerRequest = grafanaAPI.getServerConnection().createServerRequest(
                folderByID.getURL().replace(folderByID.getParameter(), folderID).replace(" ", "%20"),
                folderByID.getMethode(),
                grafanaAPI.getoAuth()
        );
        return (gson.fromJson(createServerRequest, FolderRsp.class));
    }

    /**
     *
     * @param json
     * @return
     */
    public FolderRsp createFolder(String json) {
        return createFolderExtented(json);

    }

    /**
     *
     * @param folderObj
     * @return
     */
    public FolderRsp createFolder(CreateFolderTpl folderObj) {
        return createFolderExtented(gson.toJson(folderObj));
    }

    /**
     *
     * @param json
     * @return
     */
    private FolderRsp createFolderExtented(String json) {
        CreateFolder createFolder = grafanaAPI.getConfiguration().getFolderAPI().getCreateFolder();

        JsonElement createServerRequest = grafanaAPI.getServerConnection().createServerRequest(
                createFolder.getURL().replace(" ", "%20"),
                createFolder.getMethode(),
                json,
                grafanaAPI.getoAuth()
        );
        return (gson.fromJson(createServerRequest, FolderRsp.class));

    }
    
    public MessageRsp createUserInvite(CreateUserInviteTpl userInviteObj){
        return createUserInviteExtented(gson.toJson(userInviteObj));
    }
    public MessageRsp createUserInvite(String json){
        return createUserInviteExtented(json);
    }
    private MessageRsp createUserInviteExtented(String json){
        CreateUserInvite createUserInvite = grafanaAPI.getConfiguration().getExperimental().getCreateUserInvite();
        
        JsonElement createServerRequest = grafanaAPI.getServerConnection().createServerRequest(
                createUserInvite.getURL().replace(" ", "%20"),
                createUserInvite.getMethode(),
                json,
                grafanaAPI.getoAuth()
        );
        return (gson.fromJson(createServerRequest, MessageRsp.class));
    }

    public LinkedList<SearchFolderDashboardRsp> searchFolderDashboard(FolderDashboardTpl folderDashSearch){
        return searchFolderDashboardExtented(folderDashSearch);
    }
    public LinkedList<SearchFolderDashboardRsp> searchFolderDashboard(String json){
        return searchFolderDashboardExtented(gson.fromJson(json, FolderDashboardTpl.class));
    }

    private LinkedList<SearchFolderDashboardRsp> searchFolderDashboardExtented(FolderDashboardTpl folderDashSearch){
        SearchGrafana searchGrafana = grafanaAPI.getConfiguration().getFolderDashboardSearchAPI().getSearchGrafana();
        StringBuilder searchURL = new StringBuilder();
        if(folderDashSearch.getQuery() != null){
            searchURL.append(searchGrafana.getParameters().getQuery());
            searchURL.append(folderDashSearch.getQuery());    
        }
        if(!folderDashSearch.getTags().isEmpty()){
            if(searchURL.length() != 0){
                searchURL.append("&");
            }
            searchURL.append(searchGrafana.getParameters().getTag());
            searchURL.append(String.join("&"+searchGrafana.getParameters().getTag(), folderDashSearch.getTags()));
               
        }
        if(folderDashSearch.getType() != null){
            if(searchURL.length() != 0){
                searchURL.append("&");
            }
            searchURL.append(searchGrafana.getParameters().getType());
            searchURL.append(folderDashSearch.getType()); 
        }
        if(!folderDashSearch.getDashboardIds().isEmpty()){
            if(searchURL.length() != 0){
                searchURL.append("&");
            }
            searchURL.append(searchGrafana.getParameters().getDashboardIds());
            searchURL.append(String.join("&"+searchGrafana.getParameters().getDashboardIds(), folderDashSearch.getDashboardIds()));
               
        }
        if(!folderDashSearch.getFolderIds().isEmpty()){
            if(searchURL.length() != 0){
                searchURL.append("&");
            }
            searchURL.append(searchGrafana.getParameters().getFolderIds());
            searchURL.append(String.join("&"+searchGrafana.getParameters().getFolderIds(), folderDashSearch.getFolderIds()));
               
        }
        if(folderDashSearch.getStarred() != null){
            if(searchURL.length() != 0){
                searchURL.append("&");
            }
            searchURL.append(searchGrafana.getParameters().getStarred());
            searchURL.append(folderDashSearch.getStarred().toString()); 
        }
        if(folderDashSearch.getLimit() != null){
            if(searchURL.length() != 0){
                searchURL.append("&");
            }
            searchURL.append(searchGrafana.getParameters().getLimit());
            searchURL.append(folderDashSearch.getLimit().toString()); 
        }
        System.out.println(searchURL.toString());
        System.out.println((searchGrafana.getURL() + searchURL.toString()).replace(" ", "%20"));
        System.out.println(gson.toJson(folderDashSearch));
        JsonElement createServerRequest = grafanaAPI.getServerConnection().createServerRequest(
                (searchGrafana.getURL() + searchURL.toString()).replace(" ", "%20"),
                searchGrafana.getMethode(),
                grafanaAPI.getoAuth()
        );
        System.out.println(gson.toJson(createServerRequest));
        return (new LinkedList(Arrays.asList(gson.fromJson(createServerRequest, SearchFolderDashboardRsp[].class))));
    }
}
