
package org.grafana.api.templates.Organisation;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author jh
 */
public class CreateUpdateOrgTpl {

    @SerializedName("name")
    @Expose
    private String name;

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

}
