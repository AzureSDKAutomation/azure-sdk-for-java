// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Storage setting. */
@Fluent
public final class StorageSetting {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StorageSetting.class);

    /*
     * Gets or sets the type of the datastore.
     */
    @JsonProperty(value = "dataStoreType")
    private StorageSettingStoreTypes dataStoreType;

    /*
     * Gets or sets the type.
     */
    @JsonProperty(value = "type")
    private StorageSettingTypes type;

    /**
     * Get the dataStoreType property: Gets or sets the type of the datastore.
     *
     * @return the dataStoreType value.
     */
    public StorageSettingStoreTypes dataStoreType() {
        return this.dataStoreType;
    }

    /**
     * Set the dataStoreType property: Gets or sets the type of the datastore.
     *
     * @param dataStoreType the dataStoreType value to set.
     * @return the StorageSetting object itself.
     */
    public StorageSetting withDataStoreType(StorageSettingStoreTypes dataStoreType) {
        this.dataStoreType = dataStoreType;
        return this;
    }

    /**
     * Get the type property: Gets or sets the type.
     *
     * @return the type value.
     */
    public StorageSettingTypes type() {
        return this.type;
    }

    /**
     * Set the type property: Gets or sets the type.
     *
     * @param type the type value to set.
     * @return the StorageSetting object itself.
     */
    public StorageSetting withType(StorageSettingTypes type) {
        this.type = type;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
