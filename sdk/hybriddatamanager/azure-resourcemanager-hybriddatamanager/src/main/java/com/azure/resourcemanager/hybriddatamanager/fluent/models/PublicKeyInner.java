// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybriddatamanager.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybriddatamanager.models.DmsBaseObject;
import com.azure.resourcemanager.hybriddatamanager.models.Key;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Public key. */
@JsonFlatten
@Fluent
public class PublicKeyInner extends DmsBaseObject {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PublicKeyInner.class);

    /*
     * Level one public key for encryption
     */
    @JsonProperty(value = "properties.dataServiceLevel1Key", required = true)
    private Key dataServiceLevel1Key;

    /*
     * Level two public key for encryption
     */
    @JsonProperty(value = "properties.dataServiceLevel2Key", required = true)
    private Key dataServiceLevel2Key;

    /**
     * Get the dataServiceLevel1Key property: Level one public key for encryption.
     *
     * @return the dataServiceLevel1Key value.
     */
    public Key dataServiceLevel1Key() {
        return this.dataServiceLevel1Key;
    }

    /**
     * Set the dataServiceLevel1Key property: Level one public key for encryption.
     *
     * @param dataServiceLevel1Key the dataServiceLevel1Key value to set.
     * @return the PublicKeyInner object itself.
     */
    public PublicKeyInner withDataServiceLevel1Key(Key dataServiceLevel1Key) {
        this.dataServiceLevel1Key = dataServiceLevel1Key;
        return this;
    }

    /**
     * Get the dataServiceLevel2Key property: Level two public key for encryption.
     *
     * @return the dataServiceLevel2Key value.
     */
    public Key dataServiceLevel2Key() {
        return this.dataServiceLevel2Key;
    }

    /**
     * Set the dataServiceLevel2Key property: Level two public key for encryption.
     *
     * @param dataServiceLevel2Key the dataServiceLevel2Key value to set.
     * @return the PublicKeyInner object itself.
     */
    public PublicKeyInner withDataServiceLevel2Key(Key dataServiceLevel2Key) {
        this.dataServiceLevel2Key = dataServiceLevel2Key;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (dataServiceLevel1Key() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property dataServiceLevel1Key in model PublicKeyInner"));
        } else {
            dataServiceLevel1Key().validate();
        }
        if (dataServiceLevel2Key() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property dataServiceLevel2Key in model PublicKeyInner"));
        } else {
            dataServiceLevel2Key().validate();
        }
    }
}
