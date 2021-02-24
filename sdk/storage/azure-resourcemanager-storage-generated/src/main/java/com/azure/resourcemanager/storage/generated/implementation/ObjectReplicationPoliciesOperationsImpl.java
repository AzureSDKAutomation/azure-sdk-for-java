// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storage.generated.StorageManager;
import com.azure.resourcemanager.storage.generated.fluent.ObjectReplicationPoliciesOperationsClient;
import com.azure.resourcemanager.storage.generated.fluent.models.ObjectReplicationPolicyInner;
import com.azure.resourcemanager.storage.generated.models.ObjectReplicationPoliciesOperations;
import com.azure.resourcemanager.storage.generated.models.ObjectReplicationPolicy;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ObjectReplicationPoliciesOperationsImpl implements ObjectReplicationPoliciesOperations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ObjectReplicationPoliciesOperationsImpl.class);

    private final ObjectReplicationPoliciesOperationsClient innerClient;

    private final StorageManager serviceManager;

    public ObjectReplicationPoliciesOperationsImpl(
        ObjectReplicationPoliciesOperationsClient innerClient, StorageManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ObjectReplicationPolicy> list(String resourceGroupName, String accountName) {
        PagedIterable<ObjectReplicationPolicyInner> inner = this.serviceClient().list(resourceGroupName, accountName);
        return Utils.mapPage(inner, inner1 -> new ObjectReplicationPolicyImpl(inner1, this.manager()));
    }

    public PagedIterable<ObjectReplicationPolicy> list(String resourceGroupName, String accountName, Context context) {
        PagedIterable<ObjectReplicationPolicyInner> inner =
            this.serviceClient().list(resourceGroupName, accountName, context);
        return Utils.mapPage(inner, inner1 -> new ObjectReplicationPolicyImpl(inner1, this.manager()));
    }

    public ObjectReplicationPolicy get(String resourceGroupName, String accountName, String objectReplicationPolicyId) {
        ObjectReplicationPolicyInner inner =
            this.serviceClient().get(resourceGroupName, accountName, objectReplicationPolicyId);
        if (inner != null) {
            return new ObjectReplicationPolicyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ObjectReplicationPolicy> getWithResponse(
        String resourceGroupName, String accountName, String objectReplicationPolicyId, Context context) {
        Response<ObjectReplicationPolicyInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, accountName, objectReplicationPolicyId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ObjectReplicationPolicyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String accountName, String objectReplicationPolicyId) {
        this.serviceClient().delete(resourceGroupName, accountName, objectReplicationPolicyId);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String accountName, String objectReplicationPolicyId, Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(resourceGroupName, accountName, objectReplicationPolicyId, context);
    }

    public ObjectReplicationPolicy getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "storageAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'storageAccounts'.", id)));
        }
        String objectReplicationPolicyId = Utils.getValueFromIdByName(id, "objectReplicationPolicies");
        if (objectReplicationPolicyId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'objectReplicationPolicies'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, objectReplicationPolicyId, Context.NONE).getValue();
    }

    public Response<ObjectReplicationPolicy> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "storageAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'storageAccounts'.", id)));
        }
        String objectReplicationPolicyId = Utils.getValueFromIdByName(id, "objectReplicationPolicies");
        if (objectReplicationPolicyId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'objectReplicationPolicies'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, objectReplicationPolicyId, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "storageAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'storageAccounts'.", id)));
        }
        String objectReplicationPolicyId = Utils.getValueFromIdByName(id, "objectReplicationPolicies");
        if (objectReplicationPolicyId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'objectReplicationPolicies'.",
                                id)));
        }
        this.deleteWithResponse(resourceGroupName, accountName, objectReplicationPolicyId, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "storageAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'storageAccounts'.", id)));
        }
        String objectReplicationPolicyId = Utils.getValueFromIdByName(id, "objectReplicationPolicies");
        if (objectReplicationPolicyId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'objectReplicationPolicies'.",
                                id)));
        }
        return this.deleteWithResponse(resourceGroupName, accountName, objectReplicationPolicyId, context);
    }

    private ObjectReplicationPoliciesOperationsClient serviceClient() {
        return this.innerClient;
    }

    private StorageManager manager() {
        return this.serviceManager;
    }

    public ObjectReplicationPolicyImpl define(String name) {
        return new ObjectReplicationPolicyImpl(name, this.manager());
    }
}
