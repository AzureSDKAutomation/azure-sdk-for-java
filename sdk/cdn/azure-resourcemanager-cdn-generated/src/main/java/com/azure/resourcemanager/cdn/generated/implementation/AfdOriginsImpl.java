// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cdn.generated.CdnManager;
import com.azure.resourcemanager.cdn.generated.fluent.AfdOriginsClient;
import com.azure.resourcemanager.cdn.generated.fluent.models.AfdOriginInner;
import com.azure.resourcemanager.cdn.generated.models.AfdOrigin;
import com.azure.resourcemanager.cdn.generated.models.AfdOrigins;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class AfdOriginsImpl implements AfdOrigins {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AfdOriginsImpl.class);

    private final AfdOriginsClient innerClient;

    private final CdnManager serviceManager;

    public AfdOriginsImpl(AfdOriginsClient innerClient, CdnManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<AfdOrigin> listByOriginGroup(
        String resourceGroupName, String profileName, String originGroupName) {
        PagedIterable<AfdOriginInner> inner =
            this.serviceClient().listByOriginGroup(resourceGroupName, profileName, originGroupName);
        return inner.mapPage(inner1 -> new AfdOriginImpl(inner1, this.manager()));
    }

    public PagedIterable<AfdOrigin> listByOriginGroup(
        String resourceGroupName, String profileName, String originGroupName, Context context) {
        PagedIterable<AfdOriginInner> inner =
            this.serviceClient().listByOriginGroup(resourceGroupName, profileName, originGroupName, context);
        return inner.mapPage(inner1 -> new AfdOriginImpl(inner1, this.manager()));
    }

    public AfdOrigin get(String resourceGroupName, String profileName, String originGroupName, String originName) {
        AfdOriginInner inner = this.serviceClient().get(resourceGroupName, profileName, originGroupName, originName);
        if (inner != null) {
            return new AfdOriginImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AfdOrigin> getWithResponse(
        String resourceGroupName, String profileName, String originGroupName, String originName, Context context) {
        Response<AfdOriginInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, profileName, originGroupName, originName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AfdOriginImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String profileName, String originGroupName, String originName) {
        this.serviceClient().delete(resourceGroupName, profileName, originGroupName, originName);
    }

    public void delete(
        String resourceGroupName, String profileName, String originGroupName, String originName, Context context) {
        this.serviceClient().delete(resourceGroupName, profileName, originGroupName, originName, context);
    }

    public AfdOrigin getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String profileName = Utils.getValueFromIdByName(id, "profiles");
        if (profileName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'profiles'.", id)));
        }
        String originGroupName = Utils.getValueFromIdByName(id, "originGroups");
        if (originGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'originGroups'.", id)));
        }
        String originName = Utils.getValueFromIdByName(id, "origins");
        if (originName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'origins'.", id)));
        }
        return this
            .getWithResponse(resourceGroupName, profileName, originGroupName, originName, Context.NONE)
            .getValue();
    }

    public Response<AfdOrigin> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String profileName = Utils.getValueFromIdByName(id, "profiles");
        if (profileName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'profiles'.", id)));
        }
        String originGroupName = Utils.getValueFromIdByName(id, "originGroups");
        if (originGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'originGroups'.", id)));
        }
        String originName = Utils.getValueFromIdByName(id, "origins");
        if (originName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'origins'.", id)));
        }
        return this.getWithResponse(resourceGroupName, profileName, originGroupName, originName, context);
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
        String profileName = Utils.getValueFromIdByName(id, "profiles");
        if (profileName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'profiles'.", id)));
        }
        String originGroupName = Utils.getValueFromIdByName(id, "originGroups");
        if (originGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'originGroups'.", id)));
        }
        String originName = Utils.getValueFromIdByName(id, "origins");
        if (originName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'origins'.", id)));
        }
        this.delete(resourceGroupName, profileName, originGroupName, originName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String profileName = Utils.getValueFromIdByName(id, "profiles");
        if (profileName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'profiles'.", id)));
        }
        String originGroupName = Utils.getValueFromIdByName(id, "originGroups");
        if (originGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'originGroups'.", id)));
        }
        String originName = Utils.getValueFromIdByName(id, "origins");
        if (originName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'origins'.", id)));
        }
        this.delete(resourceGroupName, profileName, originGroupName, originName, context);
    }

    private AfdOriginsClient serviceClient() {
        return this.innerClient;
    }

    private CdnManager manager() {
        return this.serviceManager;
    }

    public AfdOriginImpl define(String name) {
        return new AfdOriginImpl(name, this.manager());
    }
}
