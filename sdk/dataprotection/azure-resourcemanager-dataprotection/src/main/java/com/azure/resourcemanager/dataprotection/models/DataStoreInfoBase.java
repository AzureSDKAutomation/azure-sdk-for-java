// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** DataStoreInfo base. */
@Fluent
public final class DataStoreInfoBase {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataStoreInfoBase.class);

    /*
     * type of datastore; Operational/Vault/Archive
     */
    @JsonProperty(value = "dataStoreType", required = true)
    private DataStoreTypes dataStoreType;

    /*
     * Type of Datasource object, used to initialize the right inherited type
     */
    @JsonProperty(value = "objectType", required = true)
    private String objectType;

    /**
     * Get the dataStoreType property: type of datastore; Operational/Vault/Archive.
     *
     * @return the dataStoreType value.
     */
    public DataStoreTypes dataStoreType() {
        return this.dataStoreType;
    }

    /**
     * Set the dataStoreType property: type of datastore; Operational/Vault/Archive.
     *
     * @param dataStoreType the dataStoreType value to set.
     * @return the DataStoreInfoBase object itself.
     */
    public DataStoreInfoBase withDataStoreType(DataStoreTypes dataStoreType) {
        this.dataStoreType = dataStoreType;
        return this;
    }

    /**
     * Get the objectType property: Type of Datasource object, used to initialize the right inherited type.
     *
     * @return the objectType value.
     */
    public String objectType() {
        return this.objectType;
    }

    /**
     * Set the objectType property: Type of Datasource object, used to initialize the right inherited type.
     *
     * @param objectType the objectType value to set.
     * @return the DataStoreInfoBase object itself.
     */
    public DataStoreInfoBase withObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dataStoreType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property dataStoreType in model DataStoreInfoBase"));
        }
        if (objectType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property objectType in model DataStoreInfoBase"));
        }
    }
}
