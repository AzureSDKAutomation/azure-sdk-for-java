// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databoxedge.DataBoxEdgeManager;
import com.azure.resourcemanager.databoxedge.fluent.DevicesClient;
import com.azure.resourcemanager.databoxedge.fluent.models.DataBoxEdgeDeviceExtendedInfoInner;
import com.azure.resourcemanager.databoxedge.fluent.models.DataBoxEdgeDeviceInner;
import com.azure.resourcemanager.databoxedge.fluent.models.NetworkSettingsInner;
import com.azure.resourcemanager.databoxedge.fluent.models.UpdateSummaryInner;
import com.azure.resourcemanager.databoxedge.fluent.models.UploadCertificateResponseInner;
import com.azure.resourcemanager.databoxedge.models.DataBoxEdgeDevice;
import com.azure.resourcemanager.databoxedge.models.DataBoxEdgeDeviceExtendedInfo;
import com.azure.resourcemanager.databoxedge.models.Devices;
import com.azure.resourcemanager.databoxedge.models.NetworkSettings;
import com.azure.resourcemanager.databoxedge.models.SecuritySettings;
import com.azure.resourcemanager.databoxedge.models.UpdateSummary;
import com.azure.resourcemanager.databoxedge.models.UploadCertificateRequest;
import com.azure.resourcemanager.databoxedge.models.UploadCertificateResponse;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DevicesImpl implements Devices {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DevicesImpl.class);

    private final DevicesClient innerClient;

    private final DataBoxEdgeManager serviceManager;

    public DevicesImpl(DevicesClient innerClient, DataBoxEdgeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<DataBoxEdgeDevice> list() {
        PagedIterable<DataBoxEdgeDeviceInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new DataBoxEdgeDeviceImpl(inner1, this.manager()));
    }

    public PagedIterable<DataBoxEdgeDevice> list(String expand, Context context) {
        PagedIterable<DataBoxEdgeDeviceInner> inner = this.serviceClient().list(expand, context);
        return inner.mapPage(inner1 -> new DataBoxEdgeDeviceImpl(inner1, this.manager()));
    }

    public PagedIterable<DataBoxEdgeDevice> listByResourceGroup(String resourceGroupName) {
        PagedIterable<DataBoxEdgeDeviceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new DataBoxEdgeDeviceImpl(inner1, this.manager()));
    }

    public PagedIterable<DataBoxEdgeDevice> listByResourceGroup(
        String resourceGroupName, String expand, Context context) {
        PagedIterable<DataBoxEdgeDeviceInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, expand, context);
        return inner.mapPage(inner1 -> new DataBoxEdgeDeviceImpl(inner1, this.manager()));
    }

    public DataBoxEdgeDevice getByResourceGroup(String resourceGroupName, String deviceName) {
        DataBoxEdgeDeviceInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, deviceName);
        if (inner != null) {
            return new DataBoxEdgeDeviceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DataBoxEdgeDevice> getByResourceGroupWithResponse(
        String resourceGroupName, String deviceName, Context context) {
        Response<DataBoxEdgeDeviceInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, deviceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DataBoxEdgeDeviceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String deviceName, String resourceGroupName) {
        this.serviceClient().delete(deviceName, resourceGroupName);
    }

    public void delete(String deviceName, String resourceGroupName, Context context) {
        this.serviceClient().delete(deviceName, resourceGroupName, context);
    }

    public void downloadUpdates(String deviceName, String resourceGroupName) {
        this.serviceClient().downloadUpdates(deviceName, resourceGroupName);
    }

    public void downloadUpdates(String deviceName, String resourceGroupName, Context context) {
        this.serviceClient().downloadUpdates(deviceName, resourceGroupName, context);
    }

    public DataBoxEdgeDeviceExtendedInfo getExtendedInformation(String deviceName, String resourceGroupName) {
        DataBoxEdgeDeviceExtendedInfoInner inner =
            this.serviceClient().getExtendedInformation(deviceName, resourceGroupName);
        if (inner != null) {
            return new DataBoxEdgeDeviceExtendedInfoImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DataBoxEdgeDeviceExtendedInfo> getExtendedInformationWithResponse(
        String deviceName, String resourceGroupName, Context context) {
        Response<DataBoxEdgeDeviceExtendedInfoInner> inner =
            this.serviceClient().getExtendedInformationWithResponse(deviceName, resourceGroupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DataBoxEdgeDeviceExtendedInfoImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void installUpdates(String deviceName, String resourceGroupName) {
        this.serviceClient().installUpdates(deviceName, resourceGroupName);
    }

    public void installUpdates(String deviceName, String resourceGroupName, Context context) {
        this.serviceClient().installUpdates(deviceName, resourceGroupName, context);
    }

    public NetworkSettings getNetworkSettings(String deviceName, String resourceGroupName) {
        NetworkSettingsInner inner = this.serviceClient().getNetworkSettings(deviceName, resourceGroupName);
        if (inner != null) {
            return new NetworkSettingsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<NetworkSettings> getNetworkSettingsWithResponse(
        String deviceName, String resourceGroupName, Context context) {
        Response<NetworkSettingsInner> inner =
            this.serviceClient().getNetworkSettingsWithResponse(deviceName, resourceGroupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new NetworkSettingsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void scanForUpdates(String deviceName, String resourceGroupName) {
        this.serviceClient().scanForUpdates(deviceName, resourceGroupName);
    }

    public void scanForUpdates(String deviceName, String resourceGroupName, Context context) {
        this.serviceClient().scanForUpdates(deviceName, resourceGroupName, context);
    }

    public void createOrUpdateSecuritySettings(
        String deviceName, String resourceGroupName, SecuritySettings securitySettings) {
        this.serviceClient().createOrUpdateSecuritySettings(deviceName, resourceGroupName, securitySettings);
    }

    public void createOrUpdateSecuritySettings(
        String deviceName, String resourceGroupName, SecuritySettings securitySettings, Context context) {
        this.serviceClient().createOrUpdateSecuritySettings(deviceName, resourceGroupName, securitySettings, context);
    }

    public UpdateSummary getUpdateSummary(String deviceName, String resourceGroupName) {
        UpdateSummaryInner inner = this.serviceClient().getUpdateSummary(deviceName, resourceGroupName);
        if (inner != null) {
            return new UpdateSummaryImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<UpdateSummary> getUpdateSummaryWithResponse(
        String deviceName, String resourceGroupName, Context context) {
        Response<UpdateSummaryInner> inner =
            this.serviceClient().getUpdateSummaryWithResponse(deviceName, resourceGroupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new UpdateSummaryImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public UploadCertificateResponse uploadCertificate(
        String deviceName, String resourceGroupName, UploadCertificateRequest parameters) {
        UploadCertificateResponseInner inner =
            this.serviceClient().uploadCertificate(deviceName, resourceGroupName, parameters);
        if (inner != null) {
            return new UploadCertificateResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<UploadCertificateResponse> uploadCertificateWithResponse(
        String deviceName, String resourceGroupName, UploadCertificateRequest parameters, Context context) {
        Response<UploadCertificateResponseInner> inner =
            this.serviceClient().uploadCertificateWithResponse(deviceName, resourceGroupName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new UploadCertificateResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DataBoxEdgeDevice getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String deviceName = Utils.getValueFromIdByName(id, "dataBoxEdgeDevices");
        if (deviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'dataBoxEdgeDevices'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, deviceName, Context.NONE).getValue();
    }

    public Response<DataBoxEdgeDevice> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String deviceName = Utils.getValueFromIdByName(id, "dataBoxEdgeDevices");
        if (deviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'dataBoxEdgeDevices'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, deviceName, context);
    }

    public void deleteById(String id) {
        String deviceName = Utils.getValueFromIdByName(id, "dataBoxEdgeDevices");
        if (deviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'dataBoxEdgeDevices'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        this.delete(deviceName, resourceGroupName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String deviceName = Utils.getValueFromIdByName(id, "dataBoxEdgeDevices");
        if (deviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'dataBoxEdgeDevices'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        this.delete(deviceName, resourceGroupName, context);
    }

    private DevicesClient serviceClient() {
        return this.innerClient;
    }

    private DataBoxEdgeManager manager() {
        return this.serviceManager;
    }

    public DataBoxEdgeDeviceImpl define(String name) {
        return new DataBoxEdgeDeviceImpl(name, this.manager());
    }
}
