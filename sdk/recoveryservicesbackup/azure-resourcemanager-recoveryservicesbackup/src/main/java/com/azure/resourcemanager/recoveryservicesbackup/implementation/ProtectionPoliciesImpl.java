// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.ProtectionPoliciesClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.ProtectionPolicyResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionPolicies;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionPolicyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ProtectionPoliciesImpl implements ProtectionPolicies {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProtectionPoliciesImpl.class);

    private final ProtectionPoliciesClient innerClient;

    private final RecoveryServicesBackupManager serviceManager;

    public ProtectionPoliciesImpl(ProtectionPoliciesClient innerClient, RecoveryServicesBackupManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ProtectionPolicyResource get(String vaultName, String resourceGroupName, String policyName) {
        ProtectionPolicyResourceInner inner = this.serviceClient().get(vaultName, resourceGroupName, policyName);
        if (inner != null) {
            return new ProtectionPolicyResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ProtectionPolicyResource> getWithResponse(
        String vaultName, String resourceGroupName, String policyName, Context context) {
        Response<ProtectionPolicyResourceInner> inner =
            this.serviceClient().getWithResponse(vaultName, resourceGroupName, policyName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ProtectionPolicyResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String vaultName, String resourceGroupName, String policyName) {
        this.serviceClient().delete(vaultName, resourceGroupName, policyName);
    }

    public void delete(String vaultName, String resourceGroupName, String policyName, Context context) {
        this.serviceClient().delete(vaultName, resourceGroupName, policyName, context);
    }

    public ProtectionPolicyResource getById(String id) {
        String vaultName = Utils.getValueFromIdByName(id, "vaults");
        if (vaultName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'vaults'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String policyName = Utils.getValueFromIdByName(id, "backupPolicies");
        if (policyName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'backupPolicies'.", id)));
        }
        return this.getWithResponse(vaultName, resourceGroupName, policyName, Context.NONE).getValue();
    }

    public Response<ProtectionPolicyResource> getByIdWithResponse(String id, Context context) {
        String vaultName = Utils.getValueFromIdByName(id, "vaults");
        if (vaultName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'vaults'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String policyName = Utils.getValueFromIdByName(id, "backupPolicies");
        if (policyName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'backupPolicies'.", id)));
        }
        return this.getWithResponse(vaultName, resourceGroupName, policyName, context);
    }

    public void deleteById(String id) {
        String vaultName = Utils.getValueFromIdByName(id, "vaults");
        if (vaultName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'vaults'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String policyName = Utils.getValueFromIdByName(id, "backupPolicies");
        if (policyName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'backupPolicies'.", id)));
        }
        this.delete(vaultName, resourceGroupName, policyName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String vaultName = Utils.getValueFromIdByName(id, "vaults");
        if (vaultName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'vaults'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String policyName = Utils.getValueFromIdByName(id, "backupPolicies");
        if (policyName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'backupPolicies'.", id)));
        }
        this.delete(vaultName, resourceGroupName, policyName, context);
    }

    private ProtectionPoliciesClient serviceClient() {
        return this.innerClient;
    }

    private RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }

    public ProtectionPolicyResourceImpl define(String name) {
        return new ProtectionPolicyResourceImpl(name, this.manager());
    }
}
