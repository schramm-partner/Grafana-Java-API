
package org.grafana.api.responses.AdminAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OrganisationRsp {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("address")
    @Expose
    private AddressRsp address;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public AddressRsp getAddress() {
        return address;
    }

}
