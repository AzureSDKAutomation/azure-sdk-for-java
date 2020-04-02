/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2018_09_15_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Information about the storage blob based dead letter destination.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "endpointType", defaultImpl = StorageBlobDeadLetterDestination.class)
@JsonTypeName("StorageBlob")
@JsonFlatten
public class StorageBlobDeadLetterDestination extends DeadLetterDestination {
    /**
     * The Azure Resource ID of the storage account that is the destination of
     * the deadletter events.
     */
    @JsonProperty(value = "properties.resourceId")
    private String resourceId;

    /**
     * The name of the Storage blob container that is the destination of the
     * deadletter events.
     */
    @JsonProperty(value = "properties.blobContainerName")
    private String blobContainerName;

    /**
     * Get the Azure Resource ID of the storage account that is the destination of the deadletter events.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the Azure Resource ID of the storage account that is the destination of the deadletter events.
     *
     * @param resourceId the resourceId value to set
     * @return the StorageBlobDeadLetterDestination object itself.
     */
    public StorageBlobDeadLetterDestination withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the name of the Storage blob container that is the destination of the deadletter events.
     *
     * @return the blobContainerName value
     */
    public String blobContainerName() {
        return this.blobContainerName;
    }

    /**
     * Set the name of the Storage blob container that is the destination of the deadletter events.
     *
     * @param blobContainerName the blobContainerName value to set
     * @return the StorageBlobDeadLetterDestination object itself.
     */
    public StorageBlobDeadLetterDestination withBlobContainerName(String blobContainerName) {
        this.blobContainerName = blobContainerName;
        return this;
    }

}
