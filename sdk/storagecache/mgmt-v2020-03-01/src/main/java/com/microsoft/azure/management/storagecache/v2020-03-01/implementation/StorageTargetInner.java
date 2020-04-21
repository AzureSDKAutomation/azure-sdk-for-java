/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagecache.v2020-03-01.implementation;

import java.util.List;
import com.microsoft.azure.management.storagecache.v2020-03-01.NamespaceJunction;
import com.microsoft.azure.management.storagecache.v2020-03-01.ProvisioningStateType;
import com.microsoft.azure.management.storagecache.v2020-03-01.Nfs3Target;
import com.microsoft.azure.management.storagecache.v2020-03-01.ClfsTarget;
import com.microsoft.azure.management.storagecache.v2020-03-01.UnknownTarget;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.storagecache.v2020-03-01.StorageTargetResource;

/**
 * Type of the Storage Target.
 */
@JsonFlatten
public class StorageTargetInner extends StorageTargetResource {
    /**
     * List of Cache namespace junctions to target for namespace associations.
     */
    @JsonProperty(value = "properties.junctions")
    private List<NamespaceJunction> junctions;

    /**
     * Type of the Storage Target.
     */
    @JsonProperty(value = "properties.targetType")
    private String targetType;

    /**
     * ARM provisioning state, see
     * https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/Addendum.md#provisioningstate-property.
     * Possible values include: 'Succeeded', 'Failed', 'Cancelled', 'Creating',
     * 'Deleting', 'Updating'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private ProvisioningStateType provisioningState;

    /**
     * Properties when targetType is nfs3.
     */
    @JsonProperty(value = "properties.nfs3")
    private Nfs3Target nfs3;

    /**
     * Properties when targetType is clfs.
     */
    @JsonProperty(value = "properties.clfs")
    private ClfsTarget clfs;

    /**
     * Properties when targetType is unknown.
     */
    @JsonProperty(value = "properties.unknown")
    private UnknownTarget unknown;

    /**
     * Get list of Cache namespace junctions to target for namespace associations.
     *
     * @return the junctions value
     */
    public List<NamespaceJunction> junctions() {
        return this.junctions;
    }

    /**
     * Set list of Cache namespace junctions to target for namespace associations.
     *
     * @param junctions the junctions value to set
     * @return the StorageTargetInner object itself.
     */
    public StorageTargetInner withJunctions(List<NamespaceJunction> junctions) {
        this.junctions = junctions;
        return this;
    }

    /**
     * Get type of the Storage Target.
     *
     * @return the targetType value
     */
    public String targetType() {
        return this.targetType;
    }

    /**
     * Set type of the Storage Target.
     *
     * @param targetType the targetType value to set
     * @return the StorageTargetInner object itself.
     */
    public StorageTargetInner withTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * Get aRM provisioning state, see https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/Addendum.md#provisioningstate-property. Possible values include: 'Succeeded', 'Failed', 'Cancelled', 'Creating', 'Deleting', 'Updating'.
     *
     * @return the provisioningState value
     */
    public ProvisioningStateType provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set aRM provisioning state, see https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/Addendum.md#provisioningstate-property. Possible values include: 'Succeeded', 'Failed', 'Cancelled', 'Creating', 'Deleting', 'Updating'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the StorageTargetInner object itself.
     */
    public StorageTargetInner withProvisioningState(ProvisioningStateType provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get properties when targetType is nfs3.
     *
     * @return the nfs3 value
     */
    public Nfs3Target nfs3() {
        return this.nfs3;
    }

    /**
     * Set properties when targetType is nfs3.
     *
     * @param nfs3 the nfs3 value to set
     * @return the StorageTargetInner object itself.
     */
    public StorageTargetInner withNfs3(Nfs3Target nfs3) {
        this.nfs3 = nfs3;
        return this;
    }

    /**
     * Get properties when targetType is clfs.
     *
     * @return the clfs value
     */
    public ClfsTarget clfs() {
        return this.clfs;
    }

    /**
     * Set properties when targetType is clfs.
     *
     * @param clfs the clfs value to set
     * @return the StorageTargetInner object itself.
     */
    public StorageTargetInner withClfs(ClfsTarget clfs) {
        this.clfs = clfs;
        return this;
    }

    /**
     * Get properties when targetType is unknown.
     *
     * @return the unknown value
     */
    public UnknownTarget unknown() {
        return this.unknown;
    }

    /**
     * Set properties when targetType is unknown.
     *
     * @param unknown the unknown value to set
     * @return the StorageTargetInner object itself.
     */
    public StorageTargetInner withUnknown(UnknownTarget unknown) {
        this.unknown = unknown;
        return this;
    }

}
