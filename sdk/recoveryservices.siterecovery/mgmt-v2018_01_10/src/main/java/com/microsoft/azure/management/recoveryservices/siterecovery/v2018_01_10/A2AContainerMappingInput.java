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
 * A2A container mapping input.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType", defaultImpl = A2AContainerMappingInput.class)
@JsonTypeName("A2A")
public class A2AContainerMappingInput extends ReplicationProviderSpecificContainerMappingInput {
    /**
     * A value indicating whether the auto update is enabled. Possible values
     * include: 'Disabled', 'Enabled'.
     */
    @JsonProperty(value = "agentAutoUpdateStatus")
    private AgentAutoUpdateStatus agentAutoUpdateStatus;

    /**
     * The automation account arm id.
     */
    @JsonProperty(value = "automationAccountArmId")
    private String automationAccountArmId;

    /**
     * Get a value indicating whether the auto update is enabled. Possible values include: 'Disabled', 'Enabled'.
     *
     * @return the agentAutoUpdateStatus value
     */
    public AgentAutoUpdateStatus agentAutoUpdateStatus() {
        return this.agentAutoUpdateStatus;
    }

    /**
     * Set a value indicating whether the auto update is enabled. Possible values include: 'Disabled', 'Enabled'.
     *
     * @param agentAutoUpdateStatus the agentAutoUpdateStatus value to set
     * @return the A2AContainerMappingInput object itself.
     */
    public A2AContainerMappingInput withAgentAutoUpdateStatus(AgentAutoUpdateStatus agentAutoUpdateStatus) {
        this.agentAutoUpdateStatus = agentAutoUpdateStatus;
        return this;
    }

    /**
     * Get the automation account arm id.
     *
     * @return the automationAccountArmId value
     */
    public String automationAccountArmId() {
        return this.automationAccountArmId;
    }

    /**
     * Set the automation account arm id.
     *
     * @param automationAccountArmId the automationAccountArmId value to set
     * @return the A2AContainerMappingInput object itself.
     */
    public A2AContainerMappingInput withAutomationAccountArmId(String automationAccountArmId) {
        this.automationAccountArmId = automationAccountArmId;
        return this;
    }

}
