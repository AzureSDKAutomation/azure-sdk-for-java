// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.testbase.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.testbase.fluent.FavoriteProcessesClient;
import com.azure.resourcemanager.testbase.fluent.models.FavoriteProcessResourceInner;
import com.azure.resourcemanager.testbase.models.FavoriteProcessResource;
import com.azure.resourcemanager.testbase.models.FavoriteProcesses;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class FavoriteProcessesImpl implements FavoriteProcesses {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FavoriteProcessesImpl.class);

    private final FavoriteProcessesClient innerClient;

    private final com.azure.resourcemanager.testbase.TestBaseManager serviceManager;

    public FavoriteProcessesImpl(
        FavoriteProcessesClient innerClient, com.azure.resourcemanager.testbase.TestBaseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<FavoriteProcessResource> list(
        String resourceGroupName, String testBaseAccountName, String packageName) {
        PagedIterable<FavoriteProcessResourceInner> inner =
            this.serviceClient().list(resourceGroupName, testBaseAccountName, packageName);
        return Utils.mapPage(inner, inner1 -> new FavoriteProcessResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<FavoriteProcessResource> list(
        String resourceGroupName, String testBaseAccountName, String packageName, Context context) {
        PagedIterable<FavoriteProcessResourceInner> inner =
            this.serviceClient().list(resourceGroupName, testBaseAccountName, packageName, context);
        return Utils.mapPage(inner, inner1 -> new FavoriteProcessResourceImpl(inner1, this.manager()));
    }

    public void delete(
        String resourceGroupName, String testBaseAccountName, String packageName, String favoriteProcessResourceName) {
        this.serviceClient().delete(resourceGroupName, testBaseAccountName, packageName, favoriteProcessResourceName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName,
        String testBaseAccountName,
        String packageName,
        String favoriteProcessResourceName,
        Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(
                resourceGroupName, testBaseAccountName, packageName, favoriteProcessResourceName, context);
    }

    public FavoriteProcessResource get(
        String resourceGroupName, String testBaseAccountName, String packageName, String favoriteProcessResourceName) {
        FavoriteProcessResourceInner inner =
            this.serviceClient().get(resourceGroupName, testBaseAccountName, packageName, favoriteProcessResourceName);
        if (inner != null) {
            return new FavoriteProcessResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<FavoriteProcessResource> getWithResponse(
        String resourceGroupName,
        String testBaseAccountName,
        String packageName,
        String favoriteProcessResourceName,
        Context context) {
        Response<FavoriteProcessResourceInner> inner =
            this
                .serviceClient()
                .getWithResponse(
                    resourceGroupName, testBaseAccountName, packageName, favoriteProcessResourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new FavoriteProcessResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public FavoriteProcessResource getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String testBaseAccountName = Utils.getValueFromIdByName(id, "testBaseAccounts");
        if (testBaseAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'testBaseAccounts'.", id)));
        }
        String packageName = Utils.getValueFromIdByName(id, "packages");
        if (packageName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'packages'.", id)));
        }
        String favoriteProcessResourceName = Utils.getValueFromIdByName(id, "favoriteProcesses");
        if (favoriteProcessResourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'favoriteProcesses'.", id)));
        }
        return this
            .getWithResponse(
                resourceGroupName, testBaseAccountName, packageName, favoriteProcessResourceName, Context.NONE)
            .getValue();
    }

    public Response<FavoriteProcessResource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String testBaseAccountName = Utils.getValueFromIdByName(id, "testBaseAccounts");
        if (testBaseAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'testBaseAccounts'.", id)));
        }
        String packageName = Utils.getValueFromIdByName(id, "packages");
        if (packageName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'packages'.", id)));
        }
        String favoriteProcessResourceName = Utils.getValueFromIdByName(id, "favoriteProcesses");
        if (favoriteProcessResourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'favoriteProcesses'.", id)));
        }
        return this
            .getWithResponse(resourceGroupName, testBaseAccountName, packageName, favoriteProcessResourceName, context);
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
        String testBaseAccountName = Utils.getValueFromIdByName(id, "testBaseAccounts");
        if (testBaseAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'testBaseAccounts'.", id)));
        }
        String packageName = Utils.getValueFromIdByName(id, "packages");
        if (packageName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'packages'.", id)));
        }
        String favoriteProcessResourceName = Utils.getValueFromIdByName(id, "favoriteProcesses");
        if (favoriteProcessResourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'favoriteProcesses'.", id)));
        }
        this
            .deleteWithResponse(
                resourceGroupName, testBaseAccountName, packageName, favoriteProcessResourceName, Context.NONE)
            .getValue();
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
        String testBaseAccountName = Utils.getValueFromIdByName(id, "testBaseAccounts");
        if (testBaseAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'testBaseAccounts'.", id)));
        }
        String packageName = Utils.getValueFromIdByName(id, "packages");
        if (packageName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'packages'.", id)));
        }
        String favoriteProcessResourceName = Utils.getValueFromIdByName(id, "favoriteProcesses");
        if (favoriteProcessResourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'favoriteProcesses'.", id)));
        }
        return this
            .deleteWithResponse(
                resourceGroupName, testBaseAccountName, packageName, favoriteProcessResourceName, context);
    }

    private FavoriteProcessesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.testbase.TestBaseManager manager() {
        return this.serviceManager;
    }

    public FavoriteProcessResourceImpl define(String name) {
        return new FavoriteProcessResourceImpl(name, this.manager());
    }
}
