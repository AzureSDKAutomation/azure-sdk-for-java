// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.storage.generated.StorageManager;
import com.azure.resourcemanager.storage.generated.fluent.models.ObjectReplicationPolicyInner;
import com.azure.resourcemanager.storage.generated.models.ObjectReplicationPolicy;
import com.azure.resourcemanager.storage.generated.models.ObjectReplicationPolicyRule;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

public final class ObjectReplicationPolicyImpl
    implements ObjectReplicationPolicy, ObjectReplicationPolicy.Definition, ObjectReplicationPolicy.Update {
    private ObjectReplicationPolicyInner innerObject;

    private final StorageManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String policyId() {
        return this.innerModel().policyId();
    }

    public OffsetDateTime enabledTime() {
        return this.innerModel().enabledTime();
    }

    public String sourceAccount() {
        return this.innerModel().sourceAccount();
    }

    public String destinationAccount() {
        return this.innerModel().destinationAccount();
    }

    public List<ObjectReplicationPolicyRule> rules() {
        List<ObjectReplicationPolicyRule> inner = this.innerModel().rules();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ObjectReplicationPolicyInner innerModel() {
        return this.innerObject;
    }

    private StorageManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String objectReplicationPolicyId;

    public ObjectReplicationPolicyImpl withExistingStorageAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public ObjectReplicationPolicy create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getObjectReplicationPoliciesOperations()
                .createOrUpdateWithResponse(
                    resourceGroupName, accountName, objectReplicationPolicyId, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ObjectReplicationPolicy create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getObjectReplicationPoliciesOperations()
                .createOrUpdateWithResponse(
                    resourceGroupName, accountName, objectReplicationPolicyId, this.innerModel(), context)
                .getValue();
        return this;
    }

    ObjectReplicationPolicyImpl(String name, StorageManager serviceManager) {
        this.innerObject = new ObjectReplicationPolicyInner();
        this.serviceManager = serviceManager;
        this.objectReplicationPolicyId = name;
    }

    public ObjectReplicationPolicyImpl update() {
        return this;
    }

    public ObjectReplicationPolicy apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getObjectReplicationPoliciesOperations()
                .createOrUpdateWithResponse(
                    resourceGroupName, accountName, objectReplicationPolicyId, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ObjectReplicationPolicy apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getObjectReplicationPoliciesOperations()
                .createOrUpdateWithResponse(
                    resourceGroupName, accountName, objectReplicationPolicyId, this.innerModel(), context)
                .getValue();
        return this;
    }

    ObjectReplicationPolicyImpl(ObjectReplicationPolicyInner innerObject, StorageManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "storageAccounts");
        this.objectReplicationPolicyId = Utils.getValueFromIdByName(innerObject.id(), "objectReplicationPolicies");
    }

    public ObjectReplicationPolicy refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getObjectReplicationPoliciesOperations()
                .getWithResponse(resourceGroupName, accountName, objectReplicationPolicyId, Context.NONE)
                .getValue();
        return this;
    }

    public ObjectReplicationPolicy refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getObjectReplicationPoliciesOperations()
                .getWithResponse(resourceGroupName, accountName, objectReplicationPolicyId, context)
                .getValue();
        return this;
    }

    public ObjectReplicationPolicyImpl withSourceAccount(String sourceAccount) {
        this.innerModel().withSourceAccount(sourceAccount);
        return this;
    }

    public ObjectReplicationPolicyImpl withDestinationAccount(String destinationAccount) {
        this.innerModel().withDestinationAccount(destinationAccount);
        return this;
    }

    public ObjectReplicationPolicyImpl withRules(List<ObjectReplicationPolicyRule> rules) {
        this.innerModel().withRules(rules);
        return this;
    }
}
