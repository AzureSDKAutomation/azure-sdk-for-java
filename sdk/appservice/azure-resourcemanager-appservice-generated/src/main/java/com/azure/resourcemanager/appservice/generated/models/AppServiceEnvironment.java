// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Description of an App Service Environment. */
@Fluent
public final class AppServiceEnvironment {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AppServiceEnvironment.class);

    /*
     * Provisioning state of the App Service Environment.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Current status of the App Service Environment.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private HostingEnvironmentStatus status;

    /*
     * Description of the Virtual Network.
     */
    @JsonProperty(value = "virtualNetwork", required = true)
    private VirtualNetworkProfile virtualNetwork;

    /*
     * Specifies which endpoints to serve internally in the Virtual Network for
     * the App Service Environment.
     */
    @JsonProperty(value = "internalLoadBalancingMode")
    private LoadBalancingMode internalLoadBalancingMode;

    /*
     * Front-end VM size, e.g. "Medium", "Large".
     */
    @JsonProperty(value = "multiSize")
    private String multiSize;

    /*
     * Number of front-end instances.
     */
    @JsonProperty(value = "multiRoleCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer multiRoleCount;

    /*
     * Number of IP SSL addresses reserved for the App Service Environment.
     */
    @JsonProperty(value = "ipsslAddressCount")
    private Integer ipsslAddressCount;

    /*
     * DNS suffix of the App Service Environment.
     */
    @JsonProperty(value = "dnsSuffix")
    private String dnsSuffix;

    /*
     * Maximum number of VMs in the App Service Environment.
     */
    @JsonProperty(value = "maximumNumberOfMachines", access = JsonProperty.Access.WRITE_ONLY)
    private Integer maximumNumberOfMachines;

    /*
     * Scale factor for front-ends.
     */
    @JsonProperty(value = "frontEndScaleFactor")
    private Integer frontEndScaleFactor;

    /*
     * <code>true</code> if the App Service Environment is suspended;
     * otherwise, <code>false</code>. The environment can be suspended, e.g.
     * when the management endpoint is no longer available
     * (most likely because NSG blocked the incoming traffic).
     */
    @JsonProperty(value = "suspended", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean suspended;

    /*
     * Custom settings for changing the behavior of the App Service
     * Environment.
     */
    @JsonProperty(value = "clusterSettings")
    private List<NameValuePair> clusterSettings;

    /*
     * User added ip ranges to whitelist on ASE db
     */
    @JsonProperty(value = "userWhitelistedIpRanges")
    private List<String> userWhitelistedIpRanges;

    /*
     * Flag that displays whether an ASE has linux workers or not
     */
    @JsonProperty(value = "hasLinuxWorkers", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean hasLinuxWorkers;

    /*
     * Dedicated Host Count
     */
    @JsonProperty(value = "dedicatedHostCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer dedicatedHostCount;

    /**
     * Get the provisioningState property: Provisioning state of the App Service Environment.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the status property: Current status of the App Service Environment.
     *
     * @return the status value.
     */
    public HostingEnvironmentStatus status() {
        return this.status;
    }

    /**
     * Get the virtualNetwork property: Description of the Virtual Network.
     *
     * @return the virtualNetwork value.
     */
    public VirtualNetworkProfile virtualNetwork() {
        return this.virtualNetwork;
    }

    /**
     * Set the virtualNetwork property: Description of the Virtual Network.
     *
     * @param virtualNetwork the virtualNetwork value to set.
     * @return the AppServiceEnvironment object itself.
     */
    public AppServiceEnvironment withVirtualNetwork(VirtualNetworkProfile virtualNetwork) {
        this.virtualNetwork = virtualNetwork;
        return this;
    }

    /**
     * Get the internalLoadBalancingMode property: Specifies which endpoints to serve internally in the Virtual Network
     * for the App Service Environment.
     *
     * @return the internalLoadBalancingMode value.
     */
    public LoadBalancingMode internalLoadBalancingMode() {
        return this.internalLoadBalancingMode;
    }

    /**
     * Set the internalLoadBalancingMode property: Specifies which endpoints to serve internally in the Virtual Network
     * for the App Service Environment.
     *
     * @param internalLoadBalancingMode the internalLoadBalancingMode value to set.
     * @return the AppServiceEnvironment object itself.
     */
    public AppServiceEnvironment withInternalLoadBalancingMode(LoadBalancingMode internalLoadBalancingMode) {
        this.internalLoadBalancingMode = internalLoadBalancingMode;
        return this;
    }

    /**
     * Get the multiSize property: Front-end VM size, e.g. "Medium", "Large".
     *
     * @return the multiSize value.
     */
    public String multiSize() {
        return this.multiSize;
    }

    /**
     * Set the multiSize property: Front-end VM size, e.g. "Medium", "Large".
     *
     * @param multiSize the multiSize value to set.
     * @return the AppServiceEnvironment object itself.
     */
    public AppServiceEnvironment withMultiSize(String multiSize) {
        this.multiSize = multiSize;
        return this;
    }

    /**
     * Get the multiRoleCount property: Number of front-end instances.
     *
     * @return the multiRoleCount value.
     */
    public Integer multiRoleCount() {
        return this.multiRoleCount;
    }

    /**
     * Get the ipsslAddressCount property: Number of IP SSL addresses reserved for the App Service Environment.
     *
     * @return the ipsslAddressCount value.
     */
    public Integer ipsslAddressCount() {
        return this.ipsslAddressCount;
    }

    /**
     * Set the ipsslAddressCount property: Number of IP SSL addresses reserved for the App Service Environment.
     *
     * @param ipsslAddressCount the ipsslAddressCount value to set.
     * @return the AppServiceEnvironment object itself.
     */
    public AppServiceEnvironment withIpsslAddressCount(Integer ipsslAddressCount) {
        this.ipsslAddressCount = ipsslAddressCount;
        return this;
    }

    /**
     * Get the dnsSuffix property: DNS suffix of the App Service Environment.
     *
     * @return the dnsSuffix value.
     */
    public String dnsSuffix() {
        return this.dnsSuffix;
    }

    /**
     * Set the dnsSuffix property: DNS suffix of the App Service Environment.
     *
     * @param dnsSuffix the dnsSuffix value to set.
     * @return the AppServiceEnvironment object itself.
     */
    public AppServiceEnvironment withDnsSuffix(String dnsSuffix) {
        this.dnsSuffix = dnsSuffix;
        return this;
    }

    /**
     * Get the maximumNumberOfMachines property: Maximum number of VMs in the App Service Environment.
     *
     * @return the maximumNumberOfMachines value.
     */
    public Integer maximumNumberOfMachines() {
        return this.maximumNumberOfMachines;
    }

    /**
     * Get the frontEndScaleFactor property: Scale factor for front-ends.
     *
     * @return the frontEndScaleFactor value.
     */
    public Integer frontEndScaleFactor() {
        return this.frontEndScaleFactor;
    }

    /**
     * Set the frontEndScaleFactor property: Scale factor for front-ends.
     *
     * @param frontEndScaleFactor the frontEndScaleFactor value to set.
     * @return the AppServiceEnvironment object itself.
     */
    public AppServiceEnvironment withFrontEndScaleFactor(Integer frontEndScaleFactor) {
        this.frontEndScaleFactor = frontEndScaleFactor;
        return this;
    }

    /**
     * Get the suspended property: &lt;code&gt;true&lt;/code&gt; if the App Service Environment is suspended; otherwise,
     * &lt;code&gt;false&lt;/code&gt;. The environment can be suspended, e.g. when the management endpoint is no longer
     * available (most likely because NSG blocked the incoming traffic).
     *
     * @return the suspended value.
     */
    public Boolean suspended() {
        return this.suspended;
    }

    /**
     * Get the clusterSettings property: Custom settings for changing the behavior of the App Service Environment.
     *
     * @return the clusterSettings value.
     */
    public List<NameValuePair> clusterSettings() {
        return this.clusterSettings;
    }

    /**
     * Set the clusterSettings property: Custom settings for changing the behavior of the App Service Environment.
     *
     * @param clusterSettings the clusterSettings value to set.
     * @return the AppServiceEnvironment object itself.
     */
    public AppServiceEnvironment withClusterSettings(List<NameValuePair> clusterSettings) {
        this.clusterSettings = clusterSettings;
        return this;
    }

    /**
     * Get the userWhitelistedIpRanges property: User added ip ranges to whitelist on ASE db.
     *
     * @return the userWhitelistedIpRanges value.
     */
    public List<String> userWhitelistedIpRanges() {
        return this.userWhitelistedIpRanges;
    }

    /**
     * Set the userWhitelistedIpRanges property: User added ip ranges to whitelist on ASE db.
     *
     * @param userWhitelistedIpRanges the userWhitelistedIpRanges value to set.
     * @return the AppServiceEnvironment object itself.
     */
    public AppServiceEnvironment withUserWhitelistedIpRanges(List<String> userWhitelistedIpRanges) {
        this.userWhitelistedIpRanges = userWhitelistedIpRanges;
        return this;
    }

    /**
     * Get the hasLinuxWorkers property: Flag that displays whether an ASE has linux workers or not.
     *
     * @return the hasLinuxWorkers value.
     */
    public Boolean hasLinuxWorkers() {
        return this.hasLinuxWorkers;
    }

    /**
     * Get the dedicatedHostCount property: Dedicated Host Count.
     *
     * @return the dedicatedHostCount value.
     */
    public Integer dedicatedHostCount() {
        return this.dedicatedHostCount;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (virtualNetwork() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property virtualNetwork in model AppServiceEnvironment"));
        } else {
            virtualNetwork().validate();
        }
        if (clusterSettings() != null) {
            clusterSettings().forEach(e -> e.validate());
        }
    }
}
