// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Management policy action for blob version. */
@Fluent
public final class ManagementPolicyVersion {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagementPolicyVersion.class);

    /*
     * The function to tier blob version to cool storage. Support blob version
     * currently at Hot tier
     */
    @JsonProperty(value = "tierToCool")
    private DateAfterCreation tierToCool;

    /*
     * The function to tier blob version to archive storage. Support blob
     * version currently at Hot or Cool tier
     */
    @JsonProperty(value = "tierToArchive")
    private DateAfterCreation tierToArchive;

    /*
     * The function to delete the blob version
     */
    @JsonProperty(value = "delete")
    private DateAfterCreation delete;

    /**
     * Get the tierToCool property: The function to tier blob version to cool storage. Support blob version currently at
     * Hot tier.
     *
     * @return the tierToCool value.
     */
    public DateAfterCreation tierToCool() {
        return this.tierToCool;
    }

    /**
     * Set the tierToCool property: The function to tier blob version to cool storage. Support blob version currently at
     * Hot tier.
     *
     * @param tierToCool the tierToCool value to set.
     * @return the ManagementPolicyVersion object itself.
     */
    public ManagementPolicyVersion withTierToCool(DateAfterCreation tierToCool) {
        this.tierToCool = tierToCool;
        return this;
    }

    /**
     * Get the tierToArchive property: The function to tier blob version to archive storage. Support blob version
     * currently at Hot or Cool tier.
     *
     * @return the tierToArchive value.
     */
    public DateAfterCreation tierToArchive() {
        return this.tierToArchive;
    }

    /**
     * Set the tierToArchive property: The function to tier blob version to archive storage. Support blob version
     * currently at Hot or Cool tier.
     *
     * @param tierToArchive the tierToArchive value to set.
     * @return the ManagementPolicyVersion object itself.
     */
    public ManagementPolicyVersion withTierToArchive(DateAfterCreation tierToArchive) {
        this.tierToArchive = tierToArchive;
        return this;
    }

    /**
     * Get the delete property: The function to delete the blob version.
     *
     * @return the delete value.
     */
    public DateAfterCreation delete() {
        return this.delete;
    }

    /**
     * Set the delete property: The function to delete the blob version.
     *
     * @param delete the delete value to set.
     * @return the ManagementPolicyVersion object itself.
     */
    public ManagementPolicyVersion withDelete(DateAfterCreation delete) {
        this.delete = delete;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (tierToCool() != null) {
            tierToCool().validate();
        }
        if (tierToArchive() != null) {
            tierToArchive().validate();
        }
        if (delete() != null) {
            delete().validate();
        }
    }
}
