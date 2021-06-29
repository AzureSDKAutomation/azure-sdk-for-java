// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.PrivateLinkServicesClient;
import com.azure.resourcemanager.network.generated.fluent.models.AutoApprovedPrivateLinkServiceInner;
import com.azure.resourcemanager.network.generated.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.network.generated.fluent.models.PrivateLinkServiceInner;
import com.azure.resourcemanager.network.generated.fluent.models.PrivateLinkServiceVisibilityInner;
import com.azure.resourcemanager.network.generated.models.AutoApprovedPrivateLinkService;
import com.azure.resourcemanager.network.generated.models.CheckPrivateLinkServiceVisibilityRequest;
import com.azure.resourcemanager.network.generated.models.PrivateEndpointConnection;
import com.azure.resourcemanager.network.generated.models.PrivateLinkService;
import com.azure.resourcemanager.network.generated.models.PrivateLinkServiceVisibility;
import com.azure.resourcemanager.network.generated.models.PrivateLinkServices;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class PrivateLinkServicesImpl implements PrivateLinkServices {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateLinkServicesImpl.class);

    private final PrivateLinkServicesClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public PrivateLinkServicesImpl(
        PrivateLinkServicesClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void deleteByResourceGroup(String resourceGroupName, String serviceName) {
        this.serviceClient().delete(resourceGroupName, serviceName);
    }

    public void delete(String resourceGroupName, String serviceName, Context context) {
        this.serviceClient().delete(resourceGroupName, serviceName, context);
    }

    public PrivateLinkService getByResourceGroup(String resourceGroupName, String serviceName) {
        PrivateLinkServiceInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, serviceName);
        if (inner != null) {
            return new PrivateLinkServiceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PrivateLinkService> getByResourceGroupWithResponse(
        String resourceGroupName, String serviceName, String expand, Context context) {
        Response<PrivateLinkServiceInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, serviceName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PrivateLinkServiceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<PrivateLinkService> listByResourceGroup(String resourceGroupName) {
        PagedIterable<PrivateLinkServiceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new PrivateLinkServiceImpl(inner1, this.manager()));
    }

    public PagedIterable<PrivateLinkService> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<PrivateLinkServiceInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new PrivateLinkServiceImpl(inner1, this.manager()));
    }

    public PagedIterable<PrivateLinkService> list() {
        PagedIterable<PrivateLinkServiceInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new PrivateLinkServiceImpl(inner1, this.manager()));
    }

    public PagedIterable<PrivateLinkService> list(Context context) {
        PagedIterable<PrivateLinkServiceInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new PrivateLinkServiceImpl(inner1, this.manager()));
    }

    public PrivateEndpointConnection getPrivateEndpointConnection(
        String resourceGroupName, String serviceName, String peConnectionName) {
        PrivateEndpointConnectionInner inner =
            this.serviceClient().getPrivateEndpointConnection(resourceGroupName, serviceName, peConnectionName);
        if (inner != null) {
            return new PrivateEndpointConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PrivateEndpointConnection> getPrivateEndpointConnectionWithResponse(
        String resourceGroupName, String serviceName, String peConnectionName, String expand, Context context) {
        Response<PrivateEndpointConnectionInner> inner =
            this
                .serviceClient()
                .getPrivateEndpointConnectionWithResponse(
                    resourceGroupName, serviceName, peConnectionName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PrivateEndpointConnectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PrivateEndpointConnection updatePrivateEndpointConnection(
        String resourceGroupName,
        String serviceName,
        String peConnectionName,
        PrivateEndpointConnectionInner parameters) {
        PrivateEndpointConnectionInner inner =
            this
                .serviceClient()
                .updatePrivateEndpointConnection(resourceGroupName, serviceName, peConnectionName, parameters);
        if (inner != null) {
            return new PrivateEndpointConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PrivateEndpointConnection> updatePrivateEndpointConnectionWithResponse(
        String resourceGroupName,
        String serviceName,
        String peConnectionName,
        PrivateEndpointConnectionInner parameters,
        Context context) {
        Response<PrivateEndpointConnectionInner> inner =
            this
                .serviceClient()
                .updatePrivateEndpointConnectionWithResponse(
                    resourceGroupName, serviceName, peConnectionName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PrivateEndpointConnectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deletePrivateEndpointConnection(String resourceGroupName, String serviceName, String peConnectionName) {
        this.serviceClient().deletePrivateEndpointConnection(resourceGroupName, serviceName, peConnectionName);
    }

    public void deletePrivateEndpointConnection(
        String resourceGroupName, String serviceName, String peConnectionName, Context context) {
        this.serviceClient().deletePrivateEndpointConnection(resourceGroupName, serviceName, peConnectionName, context);
    }

    public PagedIterable<PrivateEndpointConnection> listPrivateEndpointConnections(
        String resourceGroupName, String serviceName) {
        PagedIterable<PrivateEndpointConnectionInner> inner =
            this.serviceClient().listPrivateEndpointConnections(resourceGroupName, serviceName);
        return Utils.mapPage(inner, inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()));
    }

    public PagedIterable<PrivateEndpointConnection> listPrivateEndpointConnections(
        String resourceGroupName, String serviceName, Context context) {
        PagedIterable<PrivateEndpointConnectionInner> inner =
            this.serviceClient().listPrivateEndpointConnections(resourceGroupName, serviceName, context);
        return Utils.mapPage(inner, inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()));
    }

    public PrivateLinkServiceVisibility checkPrivateLinkServiceVisibility(
        String location, CheckPrivateLinkServiceVisibilityRequest parameters) {
        PrivateLinkServiceVisibilityInner inner =
            this.serviceClient().checkPrivateLinkServiceVisibility(location, parameters);
        if (inner != null) {
            return new PrivateLinkServiceVisibilityImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PrivateLinkServiceVisibility checkPrivateLinkServiceVisibility(
        String location, CheckPrivateLinkServiceVisibilityRequest parameters, Context context) {
        PrivateLinkServiceVisibilityInner inner =
            this.serviceClient().checkPrivateLinkServiceVisibility(location, parameters, context);
        if (inner != null) {
            return new PrivateLinkServiceVisibilityImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PrivateLinkServiceVisibility checkPrivateLinkServiceVisibilityByResourceGroup(
        String location, String resourceGroupName, CheckPrivateLinkServiceVisibilityRequest parameters) {
        PrivateLinkServiceVisibilityInner inner =
            this
                .serviceClient()
                .checkPrivateLinkServiceVisibilityByResourceGroup(location, resourceGroupName, parameters);
        if (inner != null) {
            return new PrivateLinkServiceVisibilityImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PrivateLinkServiceVisibility checkPrivateLinkServiceVisibilityByResourceGroup(
        String location,
        String resourceGroupName,
        CheckPrivateLinkServiceVisibilityRequest parameters,
        Context context) {
        PrivateLinkServiceVisibilityInner inner =
            this
                .serviceClient()
                .checkPrivateLinkServiceVisibilityByResourceGroup(location, resourceGroupName, parameters, context);
        if (inner != null) {
            return new PrivateLinkServiceVisibilityImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<AutoApprovedPrivateLinkService> listAutoApprovedPrivateLinkServices(String location) {
        PagedIterable<AutoApprovedPrivateLinkServiceInner> inner =
            this.serviceClient().listAutoApprovedPrivateLinkServices(location);
        return Utils.mapPage(inner, inner1 -> new AutoApprovedPrivateLinkServiceImpl(inner1, this.manager()));
    }

    public PagedIterable<AutoApprovedPrivateLinkService> listAutoApprovedPrivateLinkServices(
        String location, Context context) {
        PagedIterable<AutoApprovedPrivateLinkServiceInner> inner =
            this.serviceClient().listAutoApprovedPrivateLinkServices(location, context);
        return Utils.mapPage(inner, inner1 -> new AutoApprovedPrivateLinkServiceImpl(inner1, this.manager()));
    }

    public PagedIterable<AutoApprovedPrivateLinkService> listAutoApprovedPrivateLinkServicesByResourceGroup(
        String location, String resourceGroupName) {
        PagedIterable<AutoApprovedPrivateLinkServiceInner> inner =
            this.serviceClient().listAutoApprovedPrivateLinkServicesByResourceGroup(location, resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new AutoApprovedPrivateLinkServiceImpl(inner1, this.manager()));
    }

    public PagedIterable<AutoApprovedPrivateLinkService> listAutoApprovedPrivateLinkServicesByResourceGroup(
        String location, String resourceGroupName, Context context) {
        PagedIterable<AutoApprovedPrivateLinkServiceInner> inner =
            this
                .serviceClient()
                .listAutoApprovedPrivateLinkServicesByResourceGroup(location, resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new AutoApprovedPrivateLinkServiceImpl(inner1, this.manager()));
    }

    public PrivateLinkService getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "privateLinkServices");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'privateLinkServices'.", id)));
        }
        String localExpand = null;
        return this
            .getByResourceGroupWithResponse(resourceGroupName, serviceName, localExpand, Context.NONE)
            .getValue();
    }

    public Response<PrivateLinkService> getByIdWithResponse(String id, String expand, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "privateLinkServices");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'privateLinkServices'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, serviceName, expand, context);
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
        String serviceName = Utils.getValueFromIdByName(id, "privateLinkServices");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'privateLinkServices'.", id)));
        }
        this.delete(resourceGroupName, serviceName, Context.NONE);
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
        String serviceName = Utils.getValueFromIdByName(id, "privateLinkServices");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'privateLinkServices'.", id)));
        }
        this.delete(resourceGroupName, serviceName, context);
    }

    private PrivateLinkServicesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    public PrivateLinkServiceImpl define(String name) {
        return new PrivateLinkServiceImpl(name, this.manager());
    }
}
