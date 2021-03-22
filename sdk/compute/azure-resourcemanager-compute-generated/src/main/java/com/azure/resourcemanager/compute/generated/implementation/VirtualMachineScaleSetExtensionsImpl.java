// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.fluent.VirtualMachineScaleSetExtensionsClient;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineScaleSetExtensionInner;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetExtension;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetExtensions;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class VirtualMachineScaleSetExtensionsImpl implements VirtualMachineScaleSetExtensions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineScaleSetExtensionsImpl.class);

    private final VirtualMachineScaleSetExtensionsClient innerClient;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

    public VirtualMachineScaleSetExtensionsImpl(
        VirtualMachineScaleSetExtensionsClient innerClient,
        com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String vmScaleSetName, String vmssExtensionName) {
        this.serviceClient().delete(resourceGroupName, vmScaleSetName, vmssExtensionName);
    }

    public void delete(String resourceGroupName, String vmScaleSetName, String vmssExtensionName, Context context) {
        this.serviceClient().delete(resourceGroupName, vmScaleSetName, vmssExtensionName, context);
    }

    public VirtualMachineScaleSetExtension get(
        String resourceGroupName, String vmScaleSetName, String vmssExtensionName) {
        VirtualMachineScaleSetExtensionInner inner =
            this.serviceClient().get(resourceGroupName, vmScaleSetName, vmssExtensionName);
        if (inner != null) {
            return new VirtualMachineScaleSetExtensionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VirtualMachineScaleSetExtension> getWithResponse(
        String resourceGroupName, String vmScaleSetName, String vmssExtensionName, String expand, Context context) {
        Response<VirtualMachineScaleSetExtensionInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, vmScaleSetName, vmssExtensionName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VirtualMachineScaleSetExtensionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<VirtualMachineScaleSetExtension> list(String resourceGroupName, String vmScaleSetName) {
        PagedIterable<VirtualMachineScaleSetExtensionInner> inner =
            this.serviceClient().list(resourceGroupName, vmScaleSetName);
        return Utils.mapPage(inner, inner1 -> new VirtualMachineScaleSetExtensionImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualMachineScaleSetExtension> list(
        String resourceGroupName, String vmScaleSetName, Context context) {
        PagedIterable<VirtualMachineScaleSetExtensionInner> inner =
            this.serviceClient().list(resourceGroupName, vmScaleSetName, context);
        return Utils.mapPage(inner, inner1 -> new VirtualMachineScaleSetExtensionImpl(inner1, this.manager()));
    }

    public VirtualMachineScaleSetExtension getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vmScaleSetName = Utils.getValueFromIdByName(id, "virtualMachineScaleSets");
        if (vmScaleSetName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'virtualMachineScaleSets'.",
                                id)));
        }
        String vmssExtensionName = Utils.getValueFromIdByName(id, "extensions");
        if (vmssExtensionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'extensions'.", id)));
        }
        String localExpand = null;
        return this
            .getWithResponse(resourceGroupName, vmScaleSetName, vmssExtensionName, localExpand, Context.NONE)
            .getValue();
    }

    public Response<VirtualMachineScaleSetExtension> getByIdWithResponse(String id, String expand, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vmScaleSetName = Utils.getValueFromIdByName(id, "virtualMachineScaleSets");
        if (vmScaleSetName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'virtualMachineScaleSets'.",
                                id)));
        }
        String vmssExtensionName = Utils.getValueFromIdByName(id, "extensions");
        if (vmssExtensionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'extensions'.", id)));
        }
        return this.getWithResponse(resourceGroupName, vmScaleSetName, vmssExtensionName, expand, context);
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
        String vmScaleSetName = Utils.getValueFromIdByName(id, "virtualMachineScaleSets");
        if (vmScaleSetName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'virtualMachineScaleSets'.",
                                id)));
        }
        String vmssExtensionName = Utils.getValueFromIdByName(id, "extensions");
        if (vmssExtensionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'extensions'.", id)));
        }
        this.delete(resourceGroupName, vmScaleSetName, vmssExtensionName, Context.NONE);
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
        String vmScaleSetName = Utils.getValueFromIdByName(id, "virtualMachineScaleSets");
        if (vmScaleSetName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'virtualMachineScaleSets'.",
                                id)));
        }
        String vmssExtensionName = Utils.getValueFromIdByName(id, "extensions");
        if (vmssExtensionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'extensions'.", id)));
        }
        this.delete(resourceGroupName, vmScaleSetName, vmssExtensionName, context);
    }

    private VirtualMachineScaleSetExtensionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }

    public VirtualMachineScaleSetExtensionImpl define(String name) {
        return new VirtualMachineScaleSetExtensionImpl(name, this.manager());
    }
}
