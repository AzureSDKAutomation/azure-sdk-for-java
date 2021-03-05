// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.devtestlabs.DevTestLabsManager;
import com.azure.resourcemanager.devtestlabs.fluent.ArtifactSourcesClient;
import com.azure.resourcemanager.devtestlabs.fluent.models.ArtifactSourceInner;
import com.azure.resourcemanager.devtestlabs.models.ArtifactSource;
import com.azure.resourcemanager.devtestlabs.models.ArtifactSources;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ArtifactSourcesImpl implements ArtifactSources {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ArtifactSourcesImpl.class);

    private final ArtifactSourcesClient innerClient;

    private final DevTestLabsManager serviceManager;

    public ArtifactSourcesImpl(ArtifactSourcesClient innerClient, DevTestLabsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ArtifactSource> list(String resourceGroupName, String labName) {
        PagedIterable<ArtifactSourceInner> inner = this.serviceClient().list(resourceGroupName, labName);
        return Utils.mapPage(inner, inner1 -> new ArtifactSourceImpl(inner1, this.manager()));
    }

    public PagedIterable<ArtifactSource> list(
        String resourceGroupName,
        String labName,
        String expand,
        String filter,
        Integer top,
        String orderby,
        Context context) {
        PagedIterable<ArtifactSourceInner> inner =
            this.serviceClient().list(resourceGroupName, labName, expand, filter, top, orderby, context);
        return Utils.mapPage(inner, inner1 -> new ArtifactSourceImpl(inner1, this.manager()));
    }

    public ArtifactSource get(String resourceGroupName, String labName, String name) {
        ArtifactSourceInner inner = this.serviceClient().get(resourceGroupName, labName, name);
        if (inner != null) {
            return new ArtifactSourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ArtifactSource> getWithResponse(
        String resourceGroupName, String labName, String name, String expand, Context context) {
        Response<ArtifactSourceInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, labName, name, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ArtifactSourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String labName, String name) {
        this.serviceClient().delete(resourceGroupName, labName, name);
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String labName, String name, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, labName, name, context);
    }

    public ArtifactSource getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String labName = Utils.getValueFromIdByName(id, "labs");
        if (labName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'labs'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "artifactsources");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'artifactsources'.", id)));
        }
        String localExpand = null;
        return this.getWithResponse(resourceGroupName, labName, name, localExpand, Context.NONE).getValue();
    }

    public Response<ArtifactSource> getByIdWithResponse(String id, String expand, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String labName = Utils.getValueFromIdByName(id, "labs");
        if (labName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'labs'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "artifactsources");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'artifactsources'.", id)));
        }
        return this.getWithResponse(resourceGroupName, labName, name, expand, context);
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
        String labName = Utils.getValueFromIdByName(id, "labs");
        if (labName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'labs'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "artifactsources");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'artifactsources'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, labName, name, Context.NONE).getValue();
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
        String labName = Utils.getValueFromIdByName(id, "labs");
        if (labName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'labs'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "artifactsources");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'artifactsources'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, labName, name, context);
    }

    private ArtifactSourcesClient serviceClient() {
        return this.innerClient;
    }

    private DevTestLabsManager manager() {
        return this.serviceManager;
    }

    public ArtifactSourceImpl define(String name) {
        return new ArtifactSourceImpl(name, this.manager());
    }
}
