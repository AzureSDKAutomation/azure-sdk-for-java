// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.databoxedge.fluent.models.DataBoxEdgeDeviceExtendedInfoInner;
import com.azure.resourcemanager.databoxedge.fluent.models.DataBoxEdgeDeviceInner;
import com.azure.resourcemanager.databoxedge.fluent.models.GenerateCertResponseInner;
import com.azure.resourcemanager.databoxedge.fluent.models.NetworkSettingsInner;
import com.azure.resourcemanager.databoxedge.fluent.models.UpdateSummaryInner;
import com.azure.resourcemanager.databoxedge.fluent.models.UploadCertificateResponseInner;
import com.azure.resourcemanager.databoxedge.models.DataBoxEdgeDeviceExtendedInfoPatch;
import com.azure.resourcemanager.databoxedge.models.DataBoxEdgeDevicePatch;
import com.azure.resourcemanager.databoxedge.models.SecuritySettings;
import com.azure.resourcemanager.databoxedge.models.UploadCertificateRequest;

/** An instance of this class provides access to all the operations defined in DevicesClient. */
public interface DevicesClient {
    /**
     * Gets all the Data Box Edge/Data Box Gateway devices in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Data Box Edge/Data Box Gateway devices in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataBoxEdgeDeviceInner> list();

    /**
     * Gets all the Data Box Edge/Data Box Gateway devices in a subscription.
     *
     * @param expand Specify $expand=details to populate additional fields related to the resource or Specify
     *     $skipToken=&lt;token&gt; to populate the next page in the list.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Data Box Edge/Data Box Gateway devices in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataBoxEdgeDeviceInner> list(String expand, Context context);

    /**
     * Gets all the Data Box Edge/Data Box Gateway devices in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Data Box Edge/Data Box Gateway devices in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataBoxEdgeDeviceInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all the Data Box Edge/Data Box Gateway devices in a resource group.
     *
     * @param resourceGroupName The resource group name.
     * @param expand Specify $expand=details to populate additional fields related to the resource or Specify
     *     $skipToken=&lt;token&gt; to populate the next page in the list.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Data Box Edge/Data Box Gateway devices in a resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataBoxEdgeDeviceInner> listByResourceGroup(String resourceGroupName, String expand, Context context);

    /**
     * Gets the properties of the Data Box Edge/Data Box Gateway device.
     *
     * @param resourceGroupName The resource group name.
     * @param deviceName The device name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the Data Box Edge/Data Box Gateway device.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataBoxEdgeDeviceInner getByResourceGroup(String resourceGroupName, String deviceName);

    /**
     * Gets the properties of the Data Box Edge/Data Box Gateway device.
     *
     * @param resourceGroupName The resource group name.
     * @param deviceName The device name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the Data Box Edge/Data Box Gateway device.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DataBoxEdgeDeviceInner> getByResourceGroupWithResponse(
        String resourceGroupName, String deviceName, Context context);

    /**
     * Creates or updates a Data Box Edge/Data Box Gateway resource.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param dataBoxEdgeDevice The resource object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Data Box Edge/Gateway device.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataBoxEdgeDeviceInner createOrUpdate(
        String deviceName, String resourceGroupName, DataBoxEdgeDeviceInner dataBoxEdgeDevice);

    /**
     * Creates or updates a Data Box Edge/Data Box Gateway resource.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param dataBoxEdgeDevice The resource object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Data Box Edge/Gateway device.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DataBoxEdgeDeviceInner> createOrUpdateWithResponse(
        String deviceName, String resourceGroupName, DataBoxEdgeDeviceInner dataBoxEdgeDevice, Context context);

    /**
     * Deletes the Data Box Edge/Data Box Gateway device.
     *
     * @param resourceGroupName The resource group name.
     * @param deviceName The device name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String deviceName);

    /**
     * Deletes the Data Box Edge/Data Box Gateway device.
     *
     * @param resourceGroupName The resource group name.
     * @param deviceName The device name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String deviceName, Context context);

    /**
     * Deletes the Data Box Edge/Data Box Gateway device.
     *
     * @param resourceGroupName The resource group name.
     * @param deviceName The device name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String deviceName);

    /**
     * Deletes the Data Box Edge/Data Box Gateway device.
     *
     * @param resourceGroupName The resource group name.
     * @param deviceName The device name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String deviceName, Context context);

    /**
     * Modifies a Data Box Edge/Data Box Gateway resource.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param parameters The resource parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Data Box Edge/Gateway device.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataBoxEdgeDeviceInner update(String deviceName, String resourceGroupName, DataBoxEdgeDevicePatch parameters);

    /**
     * Modifies a Data Box Edge/Data Box Gateway resource.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param parameters The resource parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Data Box Edge/Gateway device.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DataBoxEdgeDeviceInner> updateWithResponse(
        String deviceName, String resourceGroupName, DataBoxEdgeDevicePatch parameters, Context context);

    /**
     * Downloads the updates on a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDownloadUpdates(String deviceName, String resourceGroupName);

    /**
     * Downloads the updates on a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDownloadUpdates(
        String deviceName, String resourceGroupName, Context context);

    /**
     * Downloads the updates on a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void downloadUpdates(String deviceName, String resourceGroupName);

    /**
     * Downloads the updates on a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void downloadUpdates(String deviceName, String resourceGroupName, Context context);

    /**
     * Generates certificate for activation key.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return used in activation key generation flow.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GenerateCertResponseInner generateCertificate(String deviceName, String resourceGroupName);

    /**
     * Generates certificate for activation key.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return used in activation key generation flow.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<GenerateCertResponseInner> generateCertificateWithResponse(
        String deviceName, String resourceGroupName, Context context);

    /**
     * Gets additional information for the specified Azure Stack Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return additional information for the specified Azure Stack Edge/Data Box Gateway device.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataBoxEdgeDeviceExtendedInfoInner getExtendedInformation(String deviceName, String resourceGroupName);

    /**
     * Gets additional information for the specified Azure Stack Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return additional information for the specified Azure Stack Edge/Data Box Gateway device.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DataBoxEdgeDeviceExtendedInfoInner> getExtendedInformationWithResponse(
        String deviceName, String resourceGroupName, Context context);

    /**
     * Installs the updates on the Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginInstallUpdates(String deviceName, String resourceGroupName);

    /**
     * Installs the updates on the Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginInstallUpdates(
        String deviceName, String resourceGroupName, Context context);

    /**
     * Installs the updates on the Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void installUpdates(String deviceName, String resourceGroupName);

    /**
     * Installs the updates on the Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void installUpdates(String deviceName, String resourceGroupName, Context context);

    /**
     * Gets the network settings of the specified Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the network settings of the specified Data Box Edge/Data Box Gateway device.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkSettingsInner getNetworkSettings(String deviceName, String resourceGroupName);

    /**
     * Gets the network settings of the specified Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the network settings of the specified Data Box Edge/Data Box Gateway device.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<NetworkSettingsInner> getNetworkSettingsWithResponse(
        String deviceName, String resourceGroupName, Context context);

    /**
     * Scans for updates on a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginScanForUpdates(String deviceName, String resourceGroupName);

    /**
     * Scans for updates on a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginScanForUpdates(
        String deviceName, String resourceGroupName, Context context);

    /**
     * Scans for updates on a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void scanForUpdates(String deviceName, String resourceGroupName);

    /**
     * Scans for updates on a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void scanForUpdates(String deviceName, String resourceGroupName, Context context);

    /**
     * Updates the security settings on a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param securitySettings The security settings.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginCreateOrUpdateSecuritySettings(
        String deviceName, String resourceGroupName, SecuritySettings securitySettings);

    /**
     * Updates the security settings on a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param securitySettings The security settings.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginCreateOrUpdateSecuritySettings(
        String deviceName, String resourceGroupName, SecuritySettings securitySettings, Context context);

    /**
     * Updates the security settings on a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param securitySettings The security settings.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void createOrUpdateSecuritySettings(String deviceName, String resourceGroupName, SecuritySettings securitySettings);

    /**
     * Updates the security settings on a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param securitySettings The security settings.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void createOrUpdateSecuritySettings(
        String deviceName, String resourceGroupName, SecuritySettings securitySettings, Context context);

    /**
     * Gets additional information for the specified Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param parameters The patch object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return additional information for the specified Data Box Edge/Data Box Gateway device.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataBoxEdgeDeviceExtendedInfoInner updateExtendedInformation(
        String deviceName, String resourceGroupName, DataBoxEdgeDeviceExtendedInfoPatch parameters);

    /**
     * Gets additional information for the specified Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param parameters The patch object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return additional information for the specified Data Box Edge/Data Box Gateway device.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DataBoxEdgeDeviceExtendedInfoInner> updateExtendedInformationWithResponse(
        String deviceName, String resourceGroupName, DataBoxEdgeDeviceExtendedInfoPatch parameters, Context context);

    /**
     * Gets information about the availability of updates based on the last scan of the device. It also gets information
     * about any ongoing download or install jobs on the device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the availability of updates based on the last scan of the device.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    UpdateSummaryInner getUpdateSummary(String deviceName, String resourceGroupName);

    /**
     * Gets information about the availability of updates based on the last scan of the device. It also gets information
     * about any ongoing download or install jobs on the device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the availability of updates based on the last scan of the device.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<UpdateSummaryInner> getUpdateSummaryWithResponse(
        String deviceName, String resourceGroupName, Context context);

    /**
     * Uploads registration certificate for the device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param parameters The upload certificate request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the upload registration certificate response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    UploadCertificateResponseInner uploadCertificate(
        String deviceName, String resourceGroupName, UploadCertificateRequest parameters);

    /**
     * Uploads registration certificate for the device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param parameters The upload certificate request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the upload registration certificate response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<UploadCertificateResponseInner> uploadCertificateWithResponse(
        String deviceName, String resourceGroupName, UploadCertificateRequest parameters, Context context);
}
