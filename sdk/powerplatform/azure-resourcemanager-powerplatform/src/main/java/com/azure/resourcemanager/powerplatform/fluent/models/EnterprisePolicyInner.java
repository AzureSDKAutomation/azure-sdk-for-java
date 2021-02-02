// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.powerplatform.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.powerplatform.models.EnterprisePolicyIdentity;
import com.azure.resourcemanager.powerplatform.models.PropertiesEncryption;
import com.azure.resourcemanager.powerplatform.models.PropertiesLockbox;
import com.azure.resourcemanager.powerplatform.models.SystemData;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Definition of the EnterprisePolicy. */
@JsonFlatten
@Fluent
public class EnterprisePolicyInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EnterprisePolicyInner.class);

    /*
     * The identity of the EnterprisePolicy.
     */
    @JsonProperty(value = "identity")
    private EnterprisePolicyIdentity identity;

    /*
     * Settings concerning lockbox.
     */
    @JsonProperty(value = "properties.lockbox")
    private PropertiesLockbox lockbox;

    /*
     * The encryption settings for a configuration store.
     */
    @JsonProperty(value = "properties.encryption")
    private PropertiesEncryption encryption;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "properties.systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * The Azure Region where the resource lives
     */
    @JsonProperty(value = "trackedResourceLocation")
    private String trackedResourceLocation;

    /**
     * Get the identity property: The identity of the EnterprisePolicy.
     *
     * @return the identity value.
     */
    public EnterprisePolicyIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the EnterprisePolicy.
     *
     * @param identity the identity value to set.
     * @return the EnterprisePolicyInner object itself.
     */
    public EnterprisePolicyInner withIdentity(EnterprisePolicyIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the lockbox property: Settings concerning lockbox.
     *
     * @return the lockbox value.
     */
    public PropertiesLockbox lockbox() {
        return this.lockbox;
    }

    /**
     * Set the lockbox property: Settings concerning lockbox.
     *
     * @param lockbox the lockbox value to set.
     * @return the EnterprisePolicyInner object itself.
     */
    public EnterprisePolicyInner withLockbox(PropertiesLockbox lockbox) {
        this.lockbox = lockbox;
        return this;
    }

    /**
     * Get the encryption property: The encryption settings for a configuration store.
     *
     * @return the encryption value.
     */
    public PropertiesEncryption encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: The encryption settings for a configuration store.
     *
     * @param encryption the encryption value to set.
     * @return the EnterprisePolicyInner object itself.
     */
    public EnterprisePolicyInner withEncryption(PropertiesEncryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the trackedResourceLocation property: The Azure Region where the resource lives.
     *
     * @return the trackedResourceLocation value.
     */
    public String trackedResourceLocation() {
        return this.trackedResourceLocation;
    }

    /**
     * Set the trackedResourceLocation property: The Azure Region where the resource lives.
     *
     * @param trackedResourceLocation the trackedResourceLocation value to set.
     * @return the EnterprisePolicyInner object itself.
     */
    public EnterprisePolicyInner withTrackedResourceLocation(String trackedResourceLocation) {
        this.trackedResourceLocation = trackedResourceLocation;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EnterprisePolicyInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EnterprisePolicyInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (lockbox() != null) {
            lockbox().validate();
        }
        if (encryption() != null) {
            encryption().validate();
        }
        if (systemData() != null) {
            systemData().validate();
        }
    }
}
