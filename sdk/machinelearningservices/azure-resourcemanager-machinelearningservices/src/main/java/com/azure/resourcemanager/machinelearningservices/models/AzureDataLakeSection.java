// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.resourcemanager.machinelearningservices.fluent.models.AzureDataLakeSectionInner;

/** An immutable client-side representation of AzureDataLakeSection. */
public interface AzureDataLakeSection {
    /**
     * Gets the credentials property: The credentials property.
     *
     * @return the credentials value.
     */
    DatastoreCredentials credentials();

    /**
     * Gets the storeName property: Azure Data Lake store name.
     *
     * @return the storeName value.
     */
    String storeName();

    /**
     * Gets the inner com.azure.resourcemanager.machinelearningservices.fluent.models.AzureDataLakeSectionInner object.
     *
     * @return the inner object.
     */
    AzureDataLakeSectionInner innerModel();
}
