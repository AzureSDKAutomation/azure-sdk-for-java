/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Connector read setting.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = StoreReadSettings.class)
@JsonTypeName("StoreReadSettings")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "HdfsReadSettings", value = HdfsReadSettings.class),
    @JsonSubTypes.Type(name = "HttpReadSettings", value = HttpReadSettings.class),
    @JsonSubTypes.Type(name = "SftpReadSettings", value = SftpReadSettings.class),
    @JsonSubTypes.Type(name = "FtpReadSettings", value = FtpReadSettings.class),
    @JsonSubTypes.Type(name = "GoogleCloudStorageReadSettings", value = GoogleCloudStorageReadSettings.class),
    @JsonSubTypes.Type(name = "AzureFileStorageReadSettings", value = AzureFileStorageReadSettings.class),
    @JsonSubTypes.Type(name = "FileServerReadSettings", value = FileServerReadSettings.class),
    @JsonSubTypes.Type(name = "AmazonS3ReadSettings", value = AmazonS3ReadSettings.class),
    @JsonSubTypes.Type(name = "AzureDataLakeStoreReadSettings", value = AzureDataLakeStoreReadSettings.class),
    @JsonSubTypes.Type(name = "AzureBlobFSReadSettings", value = AzureBlobFSReadSettings.class),
    @JsonSubTypes.Type(name = "AzureBlobStorageReadSettings", value = AzureBlobStorageReadSettings.class)
})
public class StoreReadSettings {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * The maximum concurrent connection count for the source data store. Type:
     * integer (or Expression with resultType integer).
     */
    @JsonProperty(value = "maxConcurrentConnections")
    private Object maxConcurrentConnections;

    /**
     * Get unmatched properties from the message are deserialized this collection.
     *
     * @return the additionalProperties value
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set unmatched properties from the message are deserialized this collection.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the StoreReadSettings object itself.
     */
    public StoreReadSettings withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get the maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     *
     * @return the maxConcurrentConnections value
     */
    public Object maxConcurrentConnections() {
        return this.maxConcurrentConnections;
    }

    /**
     * Set the maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     *
     * @param maxConcurrentConnections the maxConcurrentConnections value to set
     * @return the StoreReadSettings object itself.
     */
    public StoreReadSettings withMaxConcurrentConnections(Object maxConcurrentConnections) {
        this.maxConcurrentConnections = maxConcurrentConnections;
        return this;
    }

}
