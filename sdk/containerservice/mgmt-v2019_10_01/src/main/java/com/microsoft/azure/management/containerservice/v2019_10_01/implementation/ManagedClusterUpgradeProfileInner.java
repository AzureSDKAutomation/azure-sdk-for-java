/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2019_10_01.implementation;

import com.microsoft.azure.management.containerservice.v2019_10_01.ManagedClusterPoolUpgradeProfile;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The list of available upgrades for compute pools.
 */
@JsonFlatten
public class ManagedClusterUpgradeProfileInner {
    /**
     * Id of upgrade profile.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Name of upgrade profile.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Type of upgrade profile.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * The list of available upgrade versions for the control plane.
     */
    @JsonProperty(value = "properties.controlPlaneProfile", required = true)
    private ManagedClusterPoolUpgradeProfile controlPlaneProfile;

    /**
     * The list of available upgrade versions for agent pools.
     */
    @JsonProperty(value = "properties.agentPoolProfiles", required = true)
    private List<ManagedClusterPoolUpgradeProfile> agentPoolProfiles;

    /**
     * Get id of upgrade profile.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get name of upgrade profile.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get type of upgrade profile.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the list of available upgrade versions for the control plane.
     *
     * @return the controlPlaneProfile value
     */
    public ManagedClusterPoolUpgradeProfile controlPlaneProfile() {
        return this.controlPlaneProfile;
    }

    /**
     * Set the list of available upgrade versions for the control plane.
     *
     * @param controlPlaneProfile the controlPlaneProfile value to set
     * @return the ManagedClusterUpgradeProfileInner object itself.
     */
    public ManagedClusterUpgradeProfileInner withControlPlaneProfile(ManagedClusterPoolUpgradeProfile controlPlaneProfile) {
        this.controlPlaneProfile = controlPlaneProfile;
        return this;
    }

    /**
     * Get the list of available upgrade versions for agent pools.
     *
     * @return the agentPoolProfiles value
     */
    public List<ManagedClusterPoolUpgradeProfile> agentPoolProfiles() {
        return this.agentPoolProfiles;
    }

    /**
     * Set the list of available upgrade versions for agent pools.
     *
     * @param agentPoolProfiles the agentPoolProfiles value to set
     * @return the ManagedClusterUpgradeProfileInner object itself.
     */
    public ManagedClusterUpgradeProfileInner withAgentPoolProfiles(List<ManagedClusterPoolUpgradeProfile> agentPoolProfiles) {
        this.agentPoolProfiles = agentPoolProfiles;
        return this;
    }

}
