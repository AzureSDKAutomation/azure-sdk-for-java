// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagesync.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Post Restore Request. */
@Fluent
public final class PostRestoreRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PostRestoreRequest.class);

    /*
     * Post Restore partition.
     */
    @JsonProperty(value = "partition")
    private String partition;

    /*
     * Post Restore replica group.
     */
    @JsonProperty(value = "replicaGroup")
    private String replicaGroup;

    /*
     * Post Restore request id.
     */
    @JsonProperty(value = "requestId")
    private String requestId;

    /*
     * Post Restore Azure file share uri.
     */
    @JsonProperty(value = "azureFileShareUri")
    private String azureFileShareUri;

    /*
     * Post Restore Azure status.
     */
    @JsonProperty(value = "status")
    private String status;

    /*
     * Post Restore Azure source azure file share uri.
     */
    @JsonProperty(value = "sourceAzureFileShareUri")
    private String sourceAzureFileShareUri;

    /*
     * Post Restore Azure failed file list.
     */
    @JsonProperty(value = "failedFileList")
    private String failedFileList;

    /*
     * Post Restore restore file spec array.
     */
    @JsonProperty(value = "restoreFileSpec")
    private List<RestoreFileSpec> restoreFileSpec;

    /**
     * Get the partition property: Post Restore partition.
     *
     * @return the partition value.
     */
    public String partition() {
        return this.partition;
    }

    /**
     * Set the partition property: Post Restore partition.
     *
     * @param partition the partition value to set.
     * @return the PostRestoreRequest object itself.
     */
    public PostRestoreRequest withPartition(String partition) {
        this.partition = partition;
        return this;
    }

    /**
     * Get the replicaGroup property: Post Restore replica group.
     *
     * @return the replicaGroup value.
     */
    public String replicaGroup() {
        return this.replicaGroup;
    }

    /**
     * Set the replicaGroup property: Post Restore replica group.
     *
     * @param replicaGroup the replicaGroup value to set.
     * @return the PostRestoreRequest object itself.
     */
    public PostRestoreRequest withReplicaGroup(String replicaGroup) {
        this.replicaGroup = replicaGroup;
        return this;
    }

    /**
     * Get the requestId property: Post Restore request id.
     *
     * @return the requestId value.
     */
    public String requestId() {
        return this.requestId;
    }

    /**
     * Set the requestId property: Post Restore request id.
     *
     * @param requestId the requestId value to set.
     * @return the PostRestoreRequest object itself.
     */
    public PostRestoreRequest withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the azureFileShareUri property: Post Restore Azure file share uri.
     *
     * @return the azureFileShareUri value.
     */
    public String azureFileShareUri() {
        return this.azureFileShareUri;
    }

    /**
     * Set the azureFileShareUri property: Post Restore Azure file share uri.
     *
     * @param azureFileShareUri the azureFileShareUri value to set.
     * @return the PostRestoreRequest object itself.
     */
    public PostRestoreRequest withAzureFileShareUri(String azureFileShareUri) {
        this.azureFileShareUri = azureFileShareUri;
        return this;
    }

    /**
     * Get the status property: Post Restore Azure status.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: Post Restore Azure status.
     *
     * @param status the status value to set.
     * @return the PostRestoreRequest object itself.
     */
    public PostRestoreRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the sourceAzureFileShareUri property: Post Restore Azure source azure file share uri.
     *
     * @return the sourceAzureFileShareUri value.
     */
    public String sourceAzureFileShareUri() {
        return this.sourceAzureFileShareUri;
    }

    /**
     * Set the sourceAzureFileShareUri property: Post Restore Azure source azure file share uri.
     *
     * @param sourceAzureFileShareUri the sourceAzureFileShareUri value to set.
     * @return the PostRestoreRequest object itself.
     */
    public PostRestoreRequest withSourceAzureFileShareUri(String sourceAzureFileShareUri) {
        this.sourceAzureFileShareUri = sourceAzureFileShareUri;
        return this;
    }

    /**
     * Get the failedFileList property: Post Restore Azure failed file list.
     *
     * @return the failedFileList value.
     */
    public String failedFileList() {
        return this.failedFileList;
    }

    /**
     * Set the failedFileList property: Post Restore Azure failed file list.
     *
     * @param failedFileList the failedFileList value to set.
     * @return the PostRestoreRequest object itself.
     */
    public PostRestoreRequest withFailedFileList(String failedFileList) {
        this.failedFileList = failedFileList;
        return this;
    }

    /**
     * Get the restoreFileSpec property: Post Restore restore file spec array.
     *
     * @return the restoreFileSpec value.
     */
    public List<RestoreFileSpec> restoreFileSpec() {
        return this.restoreFileSpec;
    }

    /**
     * Set the restoreFileSpec property: Post Restore restore file spec array.
     *
     * @param restoreFileSpec the restoreFileSpec value to set.
     * @return the PostRestoreRequest object itself.
     */
    public PostRestoreRequest withRestoreFileSpec(List<RestoreFileSpec> restoreFileSpec) {
        this.restoreFileSpec = restoreFileSpec;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (restoreFileSpec() != null) {
            restoreFileSpec().forEach(e -> e.validate());
        }
    }
}
