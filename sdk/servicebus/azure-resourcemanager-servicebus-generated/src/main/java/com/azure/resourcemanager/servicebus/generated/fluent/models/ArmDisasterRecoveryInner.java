// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.servicebus.generated.models.ProvisioningStateDR;
import com.azure.resourcemanager.servicebus.generated.models.RoleDisasterRecovery;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Single item in List or Get Alias(Disaster Recovery configuration) operation. */
@JsonFlatten
@Fluent
public class ArmDisasterRecoveryInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ArmDisasterRecoveryInner.class);

    /*
     * Provisioning state of the Alias(Disaster Recovery configuration) -
     * possible values 'Accepted' or 'Succeeded' or 'Failed'
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningStateDR provisioningState;

    /*
     * Number of entities pending to be replicated.
     */
    @JsonProperty(value = "properties.pendingReplicationOperationsCount", access = JsonProperty.Access.WRITE_ONLY)
    private Long pendingReplicationOperationsCount;

    /*
     * ARM Id of the Primary/Secondary eventhub namespace name, which is part
     * of GEO DR pairing
     */
    @JsonProperty(value = "properties.partnerNamespace")
    private String partnerNamespace;

    /*
     * Primary/Secondary eventhub namespace name, which is part of GEO DR
     * pairing
     */
    @JsonProperty(value = "properties.alternateName")
    private String alternateName;

    /*
     * role of namespace in GEO DR - possible values 'Primary' or
     * 'PrimaryNotReplicating' or 'Secondary'
     */
    @JsonProperty(value = "properties.role", access = JsonProperty.Access.WRITE_ONLY)
    private RoleDisasterRecovery role;

    /**
     * Get the provisioningState property: Provisioning state of the Alias(Disaster Recovery configuration) - possible
     * values 'Accepted' or 'Succeeded' or 'Failed'.
     *
     * @return the provisioningState value.
     */
    public ProvisioningStateDR provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the pendingReplicationOperationsCount property: Number of entities pending to be replicated.
     *
     * @return the pendingReplicationOperationsCount value.
     */
    public Long pendingReplicationOperationsCount() {
        return this.pendingReplicationOperationsCount;
    }

    /**
     * Get the partnerNamespace property: ARM Id of the Primary/Secondary eventhub namespace name, which is part of GEO
     * DR pairing.
     *
     * @return the partnerNamespace value.
     */
    public String partnerNamespace() {
        return this.partnerNamespace;
    }

    /**
     * Set the partnerNamespace property: ARM Id of the Primary/Secondary eventhub namespace name, which is part of GEO
     * DR pairing.
     *
     * @param partnerNamespace the partnerNamespace value to set.
     * @return the ArmDisasterRecoveryInner object itself.
     */
    public ArmDisasterRecoveryInner withPartnerNamespace(String partnerNamespace) {
        this.partnerNamespace = partnerNamespace;
        return this;
    }

    /**
     * Get the alternateName property: Primary/Secondary eventhub namespace name, which is part of GEO DR pairing.
     *
     * @return the alternateName value.
     */
    public String alternateName() {
        return this.alternateName;
    }

    /**
     * Set the alternateName property: Primary/Secondary eventhub namespace name, which is part of GEO DR pairing.
     *
     * @param alternateName the alternateName value to set.
     * @return the ArmDisasterRecoveryInner object itself.
     */
    public ArmDisasterRecoveryInner withAlternateName(String alternateName) {
        this.alternateName = alternateName;
        return this;
    }

    /**
     * Get the role property: role of namespace in GEO DR - possible values 'Primary' or 'PrimaryNotReplicating' or
     * 'Secondary'.
     *
     * @return the role value.
     */
    public RoleDisasterRecovery role() {
        return this.role;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
