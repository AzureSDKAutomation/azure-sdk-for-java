// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.PublicIpAddressesClient;
import com.azure.resourcemanager.network.generated.fluent.models.PublicIpAddressInner;
import com.azure.resourcemanager.network.generated.models.PublicIpAddress;
import com.azure.resourcemanager.network.generated.models.PublicIpAddresses;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class PublicIpAddressesImpl implements PublicIpAddresses {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PublicIpAddressesImpl.class);

    private final PublicIpAddressesClient innerClient;

    private final NetworkManager serviceManager;

    public PublicIpAddressesImpl(PublicIpAddressesClient innerClient, NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void deleteByResourceGroup(String resourceGroupName, String publicIpAddressName) {
        this.serviceClient().delete(resourceGroupName, publicIpAddressName);
    }

    public void delete(String resourceGroupName, String publicIpAddressName, Context context) {
        this.serviceClient().delete(resourceGroupName, publicIpAddressName, context);
    }

    public PublicIpAddress getByResourceGroup(String resourceGroupName, String publicIpAddressName) {
        PublicIpAddressInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, publicIpAddressName);
        if (inner != null) {
            return new PublicIpAddressImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PublicIpAddress> getByResourceGroupWithResponse(
        String resourceGroupName, String publicIpAddressName, String expand, Context context) {
        Response<PublicIpAddressInner> inner =
            this
                .serviceClient()
                .getByResourceGroupWithResponse(resourceGroupName, publicIpAddressName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PublicIpAddressImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<PublicIpAddress> list() {
        PagedIterable<PublicIpAddressInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new PublicIpAddressImpl(inner1, this.manager()));
    }

    public PagedIterable<PublicIpAddress> list(Context context) {
        PagedIterable<PublicIpAddressInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new PublicIpAddressImpl(inner1, this.manager()));
    }

    public PagedIterable<PublicIpAddress> listByResourceGroup(String resourceGroupName) {
        PagedIterable<PublicIpAddressInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new PublicIpAddressImpl(inner1, this.manager()));
    }

    public PagedIterable<PublicIpAddress> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<PublicIpAddressInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new PublicIpAddressImpl(inner1, this.manager()));
    }

    public PagedIterable<PublicIpAddress> listVirtualMachineScaleSetPublicIpAddresses(
        String resourceGroupName, String virtualMachineScaleSetName) {
        PagedIterable<PublicIpAddressInner> inner =
            this
                .serviceClient()
                .listVirtualMachineScaleSetPublicIpAddresses(resourceGroupName, virtualMachineScaleSetName);
        return Utils.mapPage(inner, inner1 -> new PublicIpAddressImpl(inner1, this.manager()));
    }

    public PagedIterable<PublicIpAddress> listVirtualMachineScaleSetPublicIpAddresses(
        String resourceGroupName, String virtualMachineScaleSetName, Context context) {
        PagedIterable<PublicIpAddressInner> inner =
            this
                .serviceClient()
                .listVirtualMachineScaleSetPublicIpAddresses(resourceGroupName, virtualMachineScaleSetName, context);
        return Utils.mapPage(inner, inner1 -> new PublicIpAddressImpl(inner1, this.manager()));
    }

    public PagedIterable<PublicIpAddress> listVirtualMachineScaleSetVMPublicIpAddresses(
        String resourceGroupName,
        String virtualMachineScaleSetName,
        String virtualmachineIndex,
        String networkInterfaceName,
        String ipConfigurationName) {
        PagedIterable<PublicIpAddressInner> inner =
            this
                .serviceClient()
                .listVirtualMachineScaleSetVMPublicIpAddresses(
                    resourceGroupName,
                    virtualMachineScaleSetName,
                    virtualmachineIndex,
                    networkInterfaceName,
                    ipConfigurationName);
        return Utils.mapPage(inner, inner1 -> new PublicIpAddressImpl(inner1, this.manager()));
    }

    public PagedIterable<PublicIpAddress> listVirtualMachineScaleSetVMPublicIpAddresses(
        String resourceGroupName,
        String virtualMachineScaleSetName,
        String virtualmachineIndex,
        String networkInterfaceName,
        String ipConfigurationName,
        Context context) {
        PagedIterable<PublicIpAddressInner> inner =
            this
                .serviceClient()
                .listVirtualMachineScaleSetVMPublicIpAddresses(
                    resourceGroupName,
                    virtualMachineScaleSetName,
                    virtualmachineIndex,
                    networkInterfaceName,
                    ipConfigurationName,
                    context);
        return Utils.mapPage(inner, inner1 -> new PublicIpAddressImpl(inner1, this.manager()));
    }

    public PublicIpAddress getVirtualMachineScaleSetPublicIpAddress(
        String resourceGroupName,
        String virtualMachineScaleSetName,
        String virtualmachineIndex,
        String networkInterfaceName,
        String ipConfigurationName,
        String publicIpAddressName) {
        PublicIpAddressInner inner =
            this
                .serviceClient()
                .getVirtualMachineScaleSetPublicIpAddress(
                    resourceGroupName,
                    virtualMachineScaleSetName,
                    virtualmachineIndex,
                    networkInterfaceName,
                    ipConfigurationName,
                    publicIpAddressName);
        if (inner != null) {
            return new PublicIpAddressImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PublicIpAddress> getVirtualMachineScaleSetPublicIpAddressWithResponse(
        String resourceGroupName,
        String virtualMachineScaleSetName,
        String virtualmachineIndex,
        String networkInterfaceName,
        String ipConfigurationName,
        String publicIpAddressName,
        String expand,
        Context context) {
        Response<PublicIpAddressInner> inner =
            this
                .serviceClient()
                .getVirtualMachineScaleSetPublicIpAddressWithResponse(
                    resourceGroupName,
                    virtualMachineScaleSetName,
                    virtualmachineIndex,
                    networkInterfaceName,
                    ipConfigurationName,
                    publicIpAddressName,
                    expand,
                    context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PublicIpAddressImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<PublicIpAddress> listCloudServicePublicIpAddresses(
        String resourceGroupName, String cloudServiceName) {
        PagedIterable<PublicIpAddressInner> inner =
            this.serviceClient().listCloudServicePublicIpAddresses(resourceGroupName, cloudServiceName);
        return Utils.mapPage(inner, inner1 -> new PublicIpAddressImpl(inner1, this.manager()));
    }

    public PagedIterable<PublicIpAddress> listCloudServicePublicIpAddresses(
        String resourceGroupName, String cloudServiceName, Context context) {
        PagedIterable<PublicIpAddressInner> inner =
            this.serviceClient().listCloudServicePublicIpAddresses(resourceGroupName, cloudServiceName, context);
        return Utils.mapPage(inner, inner1 -> new PublicIpAddressImpl(inner1, this.manager()));
    }

    public PagedIterable<PublicIpAddress> listCloudServiceRoleInstancePublicIpAddresses(
        String resourceGroupName,
        String cloudServiceName,
        String roleInstanceName,
        String networkInterfaceName,
        String ipConfigurationName) {
        PagedIterable<PublicIpAddressInner> inner =
            this
                .serviceClient()
                .listCloudServiceRoleInstancePublicIpAddresses(
                    resourceGroupName, cloudServiceName, roleInstanceName, networkInterfaceName, ipConfigurationName);
        return Utils.mapPage(inner, inner1 -> new PublicIpAddressImpl(inner1, this.manager()));
    }

    public PagedIterable<PublicIpAddress> listCloudServiceRoleInstancePublicIpAddresses(
        String resourceGroupName,
        String cloudServiceName,
        String roleInstanceName,
        String networkInterfaceName,
        String ipConfigurationName,
        Context context) {
        PagedIterable<PublicIpAddressInner> inner =
            this
                .serviceClient()
                .listCloudServiceRoleInstancePublicIpAddresses(
                    resourceGroupName,
                    cloudServiceName,
                    roleInstanceName,
                    networkInterfaceName,
                    ipConfigurationName,
                    context);
        return Utils.mapPage(inner, inner1 -> new PublicIpAddressImpl(inner1, this.manager()));
    }

    public PublicIpAddress getCloudServicePublicIpAddress(
        String resourceGroupName,
        String cloudServiceName,
        String roleInstanceName,
        String networkInterfaceName,
        String ipConfigurationName,
        String publicIpAddressName) {
        PublicIpAddressInner inner =
            this
                .serviceClient()
                .getCloudServicePublicIpAddress(
                    resourceGroupName,
                    cloudServiceName,
                    roleInstanceName,
                    networkInterfaceName,
                    ipConfigurationName,
                    publicIpAddressName);
        if (inner != null) {
            return new PublicIpAddressImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PublicIpAddress> getCloudServicePublicIpAddressWithResponse(
        String resourceGroupName,
        String cloudServiceName,
        String roleInstanceName,
        String networkInterfaceName,
        String ipConfigurationName,
        String publicIpAddressName,
        String expand,
        Context context) {
        Response<PublicIpAddressInner> inner =
            this
                .serviceClient()
                .getCloudServicePublicIpAddressWithResponse(
                    resourceGroupName,
                    cloudServiceName,
                    roleInstanceName,
                    networkInterfaceName,
                    ipConfigurationName,
                    publicIpAddressName,
                    expand,
                    context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PublicIpAddressImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PublicIpAddress getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String publicIpAddressName = Utils.getValueFromIdByName(id, "publicIPAddresses");
        if (publicIpAddressName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'publicIPAddresses'.", id)));
        }
        String localExpand = null;
        return this
            .getByResourceGroupWithResponse(resourceGroupName, publicIpAddressName, localExpand, Context.NONE)
            .getValue();
    }

    public Response<PublicIpAddress> getByIdWithResponse(String id, String expand, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String publicIpAddressName = Utils.getValueFromIdByName(id, "publicIPAddresses");
        if (publicIpAddressName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'publicIPAddresses'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, publicIpAddressName, expand, context);
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
        String publicIpAddressName = Utils.getValueFromIdByName(id, "publicIPAddresses");
        if (publicIpAddressName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'publicIPAddresses'.", id)));
        }
        this.delete(resourceGroupName, publicIpAddressName, Context.NONE);
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
        String publicIpAddressName = Utils.getValueFromIdByName(id, "publicIPAddresses");
        if (publicIpAddressName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'publicIPAddresses'.", id)));
        }
        this.delete(resourceGroupName, publicIpAddressName, context);
    }

    private PublicIpAddressesClient serviceClient() {
        return this.innerClient;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    public PublicIpAddressImpl define(String name) {
        return new PublicIpAddressImpl(name, this.manager());
    }
}
