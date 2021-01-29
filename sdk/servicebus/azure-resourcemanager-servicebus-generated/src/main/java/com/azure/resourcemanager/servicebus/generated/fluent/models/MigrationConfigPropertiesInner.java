// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Single item in List or Get Migration Config operation. */
@JsonFlatten
@Fluent
public class MigrationConfigPropertiesInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MigrationConfigPropertiesInner.class);

    /*
     * Provisioning state of Migration Configuration
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Number of entities pending to be replicated.
     */
    @JsonProperty(value = "properties.pendingReplicationOperationsCount", access = JsonProperty.Access.WRITE_ONLY)
    private Long pendingReplicationOperationsCount;

    /*
     * Existing premium Namespace ARM Id name which has no entities, will be
     * used for migration
     */
    @JsonProperty(value = "properties.targetNamespace")
    private String targetNamespace;

    /*
     * Name to access Standard Namespace after migration
     */
    @JsonProperty(value = "properties.postMigrationName")
    private String postMigrationName;

    /*
     * State in which Standard to Premium Migration is, possible values :
     * Unknown, Reverting, Completing, Initiating, Syncing, Active
     */
    @JsonProperty(value = "properties.migrationState", access = JsonProperty.Access.WRITE_ONLY)
    private String migrationState;

    /**
     * Get the provisioningState property: Provisioning state of Migration Configuration.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
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
     * Get the targetNamespace property: Existing premium Namespace ARM Id name which has no entities, will be used for
     * migration.
     *
     * @return the targetNamespace value.
     */
    public String targetNamespace() {
        return this.targetNamespace;
    }

    /**
     * Set the targetNamespace property: Existing premium Namespace ARM Id name which has no entities, will be used for
     * migration.
     *
     * @param targetNamespace the targetNamespace value to set.
     * @return the MigrationConfigPropertiesInner object itself.
     */
    public MigrationConfigPropertiesInner withTargetNamespace(String targetNamespace) {
        this.targetNamespace = targetNamespace;
        return this;
    }

    /**
     * Get the postMigrationName property: Name to access Standard Namespace after migration.
     *
     * @return the postMigrationName value.
     */
    public String postMigrationName() {
        return this.postMigrationName;
    }

    /**
     * Set the postMigrationName property: Name to access Standard Namespace after migration.
     *
     * @param postMigrationName the postMigrationName value to set.
     * @return the MigrationConfigPropertiesInner object itself.
     */
    public MigrationConfigPropertiesInner withPostMigrationName(String postMigrationName) {
        this.postMigrationName = postMigrationName;
        return this;
    }

    /**
     * Get the migrationState property: State in which Standard to Premium Migration is, possible values : Unknown,
     * Reverting, Completing, Initiating, Syncing, Active.
     *
     * @return the migrationState value.
     */
    public String migrationState() {
        return this.migrationState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
