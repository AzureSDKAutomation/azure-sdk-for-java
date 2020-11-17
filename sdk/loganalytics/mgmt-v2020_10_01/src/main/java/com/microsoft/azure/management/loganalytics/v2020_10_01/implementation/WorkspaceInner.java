/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_10_01.implementation;

import com.microsoft.azure.management.loganalytics.v2020_10_01.WorkspaceEntityStatus;
import com.microsoft.azure.management.loganalytics.v2020_10_01.WorkspaceSku;
import com.microsoft.azure.management.loganalytics.v2020_10_01.WorkspaceCapping;
import com.microsoft.azure.management.loganalytics.v2020_10_01.PublicNetworkAccessType;
import java.util.List;
import com.microsoft.azure.management.loganalytics.v2020_10_01.PrivateLinkScopedResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * The top level Workspace resource container.
 */
@JsonFlatten
public class WorkspaceInner extends Resource {
    /**
     * The provisioning state of the workspace. Possible values include:
     * 'Creating', 'Succeeded', 'Failed', 'Canceled', 'Deleting',
     * 'ProvisioningAccount', 'Updating'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private WorkspaceEntityStatus provisioningState;

    /**
     * This is a read-only property. Represents the ID associated with the
     * workspace.
     */
    @JsonProperty(value = "properties.customerId", access = JsonProperty.Access.WRITE_ONLY)
    private String customerId;

    /**
     * The SKU of the workspace.
     */
    @JsonProperty(value = "properties.sku")
    private WorkspaceSku sku;

    /**
     * The workspace data retention in days, between 30 and 730.
     */
    @JsonProperty(value = "properties.retentionInDays")
    private Integer retentionInDays;

    /**
     * The daily volume cap for ingestion.
     */
    @JsonProperty(value = "properties.workspaceCapping")
    private WorkspaceCapping workspaceCapping;

    /**
     * The network access type for accessing Log Analytics ingestion. Possible
     * values include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "properties.publicNetworkAccessForIngestion")
    private PublicNetworkAccessType publicNetworkAccessForIngestion;

    /**
     * The network access type for accessing Log Analytics query. Possible
     * values include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "properties.publicNetworkAccessForQuery")
    private PublicNetworkAccessType publicNetworkAccessForQuery;

    /**
     * Indicates whether customer managed storage is mandatory for query
     * management.
     */
    @JsonProperty(value = "properties.forceQueryCmk")
    private Boolean forceQueryCmk;

    /**
     * List of linked private link scope resources.
     */
    @JsonProperty(value = "properties.privateLinkScopedResources", access = JsonProperty.Access.WRITE_ONLY)
    private List<PrivateLinkScopedResource> privateLinkScopedResources;

    /**
     * The ETag of the workspace.
     */
    @JsonProperty(value = "eTag")
    private String eTag;

    /**
     * Get the provisioning state of the workspace. Possible values include: 'Creating', 'Succeeded', 'Failed', 'Canceled', 'Deleting', 'ProvisioningAccount', 'Updating'.
     *
     * @return the provisioningState value
     */
    public WorkspaceEntityStatus provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioning state of the workspace. Possible values include: 'Creating', 'Succeeded', 'Failed', 'Canceled', 'Deleting', 'ProvisioningAccount', 'Updating'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withProvisioningState(WorkspaceEntityStatus provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get this is a read-only property. Represents the ID associated with the workspace.
     *
     * @return the customerId value
     */
    public String customerId() {
        return this.customerId;
    }

    /**
     * Get the SKU of the workspace.
     *
     * @return the sku value
     */
    public WorkspaceSku sku() {
        return this.sku;
    }

    /**
     * Set the SKU of the workspace.
     *
     * @param sku the sku value to set
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withSku(WorkspaceSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the workspace data retention in days, between 30 and 730.
     *
     * @return the retentionInDays value
     */
    public Integer retentionInDays() {
        return this.retentionInDays;
    }

    /**
     * Set the workspace data retention in days, between 30 and 730.
     *
     * @param retentionInDays the retentionInDays value to set
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withRetentionInDays(Integer retentionInDays) {
        this.retentionInDays = retentionInDays;
        return this;
    }

    /**
     * Get the daily volume cap for ingestion.
     *
     * @return the workspaceCapping value
     */
    public WorkspaceCapping workspaceCapping() {
        return this.workspaceCapping;
    }

    /**
     * Set the daily volume cap for ingestion.
     *
     * @param workspaceCapping the workspaceCapping value to set
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withWorkspaceCapping(WorkspaceCapping workspaceCapping) {
        this.workspaceCapping = workspaceCapping;
        return this;
    }

    /**
     * Get the network access type for accessing Log Analytics ingestion. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the publicNetworkAccessForIngestion value
     */
    public PublicNetworkAccessType publicNetworkAccessForIngestion() {
        return this.publicNetworkAccessForIngestion;
    }

    /**
     * Set the network access type for accessing Log Analytics ingestion. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param publicNetworkAccessForIngestion the publicNetworkAccessForIngestion value to set
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withPublicNetworkAccessForIngestion(PublicNetworkAccessType publicNetworkAccessForIngestion) {
        this.publicNetworkAccessForIngestion = publicNetworkAccessForIngestion;
        return this;
    }

    /**
     * Get the network access type for accessing Log Analytics query. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the publicNetworkAccessForQuery value
     */
    public PublicNetworkAccessType publicNetworkAccessForQuery() {
        return this.publicNetworkAccessForQuery;
    }

    /**
     * Set the network access type for accessing Log Analytics query. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param publicNetworkAccessForQuery the publicNetworkAccessForQuery value to set
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withPublicNetworkAccessForQuery(PublicNetworkAccessType publicNetworkAccessForQuery) {
        this.publicNetworkAccessForQuery = publicNetworkAccessForQuery;
        return this;
    }

    /**
     * Get indicates whether customer managed storage is mandatory for query management.
     *
     * @return the forceQueryCmk value
     */
    public Boolean forceQueryCmk() {
        return this.forceQueryCmk;
    }

    /**
     * Set indicates whether customer managed storage is mandatory for query management.
     *
     * @param forceQueryCmk the forceQueryCmk value to set
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withForceQueryCmk(Boolean forceQueryCmk) {
        this.forceQueryCmk = forceQueryCmk;
        return this;
    }

    /**
     * Get list of linked private link scope resources.
     *
     * @return the privateLinkScopedResources value
     */
    public List<PrivateLinkScopedResource> privateLinkScopedResources() {
        return this.privateLinkScopedResources;
    }

    /**
     * Get the ETag of the workspace.
     *
     * @return the eTag value
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set the ETag of the workspace.
     *
     * @param eTag the eTag value to set
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

}
