/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Recovery plan test failover input.
 */
public class RecoveryPlanTestFailoverInput {
    /**
     * The recovery plan test failover input properties.
     */
    @JsonProperty(value = "properties", required = true)
    private RecoveryPlanTestFailoverInputProperties properties;

    /**
     * Get the recovery plan test failover input properties.
     *
     * @return the properties value
     */
    public RecoveryPlanTestFailoverInputProperties properties() {
        return this.properties;
    }

    /**
     * Set the recovery plan test failover input properties.
     *
     * @param properties the properties value to set
     * @return the RecoveryPlanTestFailoverInput object itself.
     */
    public RecoveryPlanTestFailoverInput withProperties(RecoveryPlanTestFailoverInputProperties properties) {
        this.properties = properties;
        return this;
    }

}
