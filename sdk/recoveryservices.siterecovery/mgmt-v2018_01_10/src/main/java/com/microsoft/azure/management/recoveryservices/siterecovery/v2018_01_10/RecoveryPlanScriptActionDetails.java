/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Recovery plan script action details.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType", defaultImpl = RecoveryPlanScriptActionDetails.class)
@JsonTypeName("ScriptActionDetails")
public class RecoveryPlanScriptActionDetails extends RecoveryPlanActionDetails {
    /**
     * The script path.
     */
    @JsonProperty(value = "path", required = true)
    private String path;

    /**
     * The script timeout.
     */
    @JsonProperty(value = "timeout")
    private String timeout;

    /**
     * The fabric location. Possible values include: 'Primary', 'Recovery'.
     */
    @JsonProperty(value = "fabricLocation", required = true)
    private RecoveryPlanActionLocation fabricLocation;

    /**
     * Get the script path.
     *
     * @return the path value
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the script path.
     *
     * @param path the path value to set
     * @return the RecoveryPlanScriptActionDetails object itself.
     */
    public RecoveryPlanScriptActionDetails withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the script timeout.
     *
     * @return the timeout value
     */
    public String timeout() {
        return this.timeout;
    }

    /**
     * Set the script timeout.
     *
     * @param timeout the timeout value to set
     * @return the RecoveryPlanScriptActionDetails object itself.
     */
    public RecoveryPlanScriptActionDetails withTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Get the fabric location. Possible values include: 'Primary', 'Recovery'.
     *
     * @return the fabricLocation value
     */
    public RecoveryPlanActionLocation fabricLocation() {
        return this.fabricLocation;
    }

    /**
     * Set the fabric location. Possible values include: 'Primary', 'Recovery'.
     *
     * @param fabricLocation the fabricLocation value to set
     * @return the RecoveryPlanScriptActionDetails object itself.
     */
    public RecoveryPlanScriptActionDetails withFabricLocation(RecoveryPlanActionLocation fabricLocation) {
        this.fabricLocation = fabricLocation;
        return this;
    }

}
