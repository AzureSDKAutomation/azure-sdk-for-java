// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.storage.generated.fluent.models.BlobContainerInner;
import com.azure.resourcemanager.storage.generated.fluent.models.LegalHoldInner;
import com.azure.resourcemanager.storage.generated.models.BlobContainer;
import com.azure.resourcemanager.storage.generated.models.ImmutabilityPolicyProperties;
import com.azure.resourcemanager.storage.generated.models.ImmutableStorageWithVersioning;
import com.azure.resourcemanager.storage.generated.models.LeaseContainerRequest;
import com.azure.resourcemanager.storage.generated.models.LeaseContainerResponse;
import com.azure.resourcemanager.storage.generated.models.LeaseDuration;
import com.azure.resourcemanager.storage.generated.models.LeaseState;
import com.azure.resourcemanager.storage.generated.models.LeaseStatus;
import com.azure.resourcemanager.storage.generated.models.LegalHold;
import com.azure.resourcemanager.storage.generated.models.LegalHoldProperties;
import com.azure.resourcemanager.storage.generated.models.PublicAccess;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class BlobContainerImpl implements BlobContainer, BlobContainer.Definition, BlobContainer.Update {
    private BlobContainerInner innerObject;

    private final com.azure.resourcemanager.storage.generated.StorageManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String version() {
        return this.innerModel().version();
    }

    public Boolean deleted() {
        return this.innerModel().deleted();
    }

    public OffsetDateTime deletedTime() {
        return this.innerModel().deletedTime();
    }

    public Integer remainingRetentionDays() {
        return this.innerModel().remainingRetentionDays();
    }

    public String defaultEncryptionScope() {
        return this.innerModel().defaultEncryptionScope();
    }

    public Boolean denyEncryptionScopeOverride() {
        return this.innerModel().denyEncryptionScopeOverride();
    }

    public PublicAccess publicAccess() {
        return this.innerModel().publicAccess();
    }

    public OffsetDateTime lastModifiedTime() {
        return this.innerModel().lastModifiedTime();
    }

    public LeaseStatus leaseStatus() {
        return this.innerModel().leaseStatus();
    }

    public LeaseState leaseState() {
        return this.innerModel().leaseState();
    }

    public LeaseDuration leaseDuration() {
        return this.innerModel().leaseDuration();
    }

    public Map<String, String> metadata() {
        Map<String, String> inner = this.innerModel().metadata();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ImmutabilityPolicyProperties immutabilityPolicy() {
        return this.innerModel().immutabilityPolicy();
    }

    public LegalHoldProperties legalHold() {
        return this.innerModel().legalHold();
    }

    public Boolean hasLegalHold() {
        return this.innerModel().hasLegalHold();
    }

    public Boolean hasImmutabilityPolicy() {
        return this.innerModel().hasImmutabilityPolicy();
    }

    public ImmutableStorageWithVersioning immutableStorageWithVersioning() {
        return this.innerModel().immutableStorageWithVersioning();
    }

    public BlobContainerInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.storage.generated.StorageManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String containerName;

    public BlobContainerImpl withExistingStorageAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public BlobContainer create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBlobContainers()
                .createWithResponse(resourceGroupName, accountName, containerName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public BlobContainer create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBlobContainers()
                .createWithResponse(resourceGroupName, accountName, containerName, this.innerModel(), context)
                .getValue();
        return this;
    }

    BlobContainerImpl(String name, com.azure.resourcemanager.storage.generated.StorageManager serviceManager) {
        this.innerObject = new BlobContainerInner();
        this.serviceManager = serviceManager;
        this.containerName = name;
    }

    public BlobContainerImpl update() {
        return this;
    }

    public BlobContainer apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBlobContainers()
                .updateWithResponse(resourceGroupName, accountName, containerName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public BlobContainer apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBlobContainers()
                .updateWithResponse(resourceGroupName, accountName, containerName, this.innerModel(), context)
                .getValue();
        return this;
    }

    BlobContainerImpl(
        BlobContainerInner innerObject, com.azure.resourcemanager.storage.generated.StorageManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "storageAccounts");
        this.containerName = Utils.getValueFromIdByName(innerObject.id(), "containers");
    }

    public BlobContainer refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBlobContainers()
                .getWithResponse(resourceGroupName, accountName, containerName, Context.NONE)
                .getValue();
        return this;
    }

    public BlobContainer refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBlobContainers()
                .getWithResponse(resourceGroupName, accountName, containerName, context)
                .getValue();
        return this;
    }

    public LegalHold setLegalHold(LegalHoldInner legalHold) {
        return serviceManager.blobContainers().setLegalHold(resourceGroupName, accountName, containerName, legalHold);
    }

    public Response<LegalHold> setLegalHoldWithResponse(LegalHoldInner legalHold, Context context) {
        return serviceManager
            .blobContainers()
            .setLegalHoldWithResponse(resourceGroupName, accountName, containerName, legalHold, context);
    }

    public LegalHold clearLegalHold(LegalHoldInner legalHold) {
        return serviceManager.blobContainers().clearLegalHold(resourceGroupName, accountName, containerName, legalHold);
    }

    public Response<LegalHold> clearLegalHoldWithResponse(LegalHoldInner legalHold, Context context) {
        return serviceManager
            .blobContainers()
            .clearLegalHoldWithResponse(resourceGroupName, accountName, containerName, legalHold, context);
    }

    public LeaseContainerResponse lease() {
        return serviceManager.blobContainers().lease(resourceGroupName, accountName, containerName);
    }

    public Response<LeaseContainerResponse> leaseWithResponse(LeaseContainerRequest parameters, Context context) {
        return serviceManager
            .blobContainers()
            .leaseWithResponse(resourceGroupName, accountName, containerName, parameters, context);
    }

    public void objectLevelWorm() {
        serviceManager.blobContainers().objectLevelWorm(resourceGroupName, accountName, containerName);
    }

    public void objectLevelWorm(Context context) {
        serviceManager.blobContainers().objectLevelWorm(resourceGroupName, accountName, containerName, context);
    }

    public BlobContainerImpl withDefaultEncryptionScope(String defaultEncryptionScope) {
        this.innerModel().withDefaultEncryptionScope(defaultEncryptionScope);
        return this;
    }

    public BlobContainerImpl withDenyEncryptionScopeOverride(Boolean denyEncryptionScopeOverride) {
        this.innerModel().withDenyEncryptionScopeOverride(denyEncryptionScopeOverride);
        return this;
    }

    public BlobContainerImpl withPublicAccess(PublicAccess publicAccess) {
        this.innerModel().withPublicAccess(publicAccess);
        return this;
    }

    public BlobContainerImpl withMetadata(Map<String, String> metadata) {
        this.innerModel().withMetadata(metadata);
        return this;
    }

    public BlobContainerImpl withImmutableStorageWithVersioning(
        ImmutableStorageWithVersioning immutableStorageWithVersioning) {
        this.innerModel().withImmutableStorageWithVersioning(immutableStorageWithVersioning);
        return this;
    }
}
