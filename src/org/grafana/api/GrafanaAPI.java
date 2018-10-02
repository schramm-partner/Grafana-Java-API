
package org.grafana.api;

import org.grafana.api.connection.ServerRequest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 *
 * @author Jonathan Hetzer at Schramm und Partner GmbH
 */
public class GrafanaAPI {
    
    private final String serverURL;
    private final ServerRequest serverConnection;
    private String basic;
    private String oAuth;
    private final ConfigLoader configuration;
    
    /**
     *
     * @param serverURL
     */
    public GrafanaAPI(String serverURL){
        this.serverURL = serverURL;
        this.serverConnection = new ServerRequest(this);
        this.configuration = new ConfigLoader();
    }

    /**
     *
     * @return
     */
    public ServerRequest getServerConnection() {
        return serverConnection;
    }
    
    /**
     *
     * @return
     */
    public ConfigLoader getConfiguration() {
        return configuration;
    }

    /**
     *
     * @return
     */
    public String getBasic() {
        return basic;
    }

    /**
     *
     * @return
     */
    public String getoAuth() {
        return oAuth;
    }
    
    /**
     *
     * @return
     */
    public String getServerURL() {
        return serverURL;
    }
    
    /**
     *
     * @param username
     * @param password
     * @return
     */
    public ServerAdminAPI serverAdminAPI(String username,String password){
        this.basic = createAuthKey(username,password);
        return serverAdminAPIExtented();
    }
    
    /**
     *
     * @param basic
     * @return
     */
    public ServerAdminAPI serverAdminAPI(String basic){
        this.basic = basic;
        return serverAdminAPIExtented();
    }
    
    private ServerAdminAPI serverAdminAPIExtented(){
        return (new ServerAdminAPI(this));
    }
    
    /**
     *
     * @param username
     * @param password
     * @return
     */
    public OrgAdminAPI orgAdminAPI(String username,String password){
        this.oAuth = createAuthKey(username,password);
        return orgAdminAPIExtented(oAuth);
    }
    
    /**
     *
     * @param oAuth
     * @return
     */
    public OrgAdminAPI orgAdminAPI(String oAuth){
        this.oAuth = oAuth;
        return orgAdminAPIExtented(oAuth);
    }
    private OrgAdminAPI orgAdminAPIExtented(String oAuth){
        return (new OrgAdminAPI(this));
    }
    
    private String createAuthKey(String username, String password){
        return (
                "Basic " + Base64.getEncoder().encodeToString(
                    (username+":"+password).getBytes(StandardCharsets.UTF_8)
                )
        );
    }

}
