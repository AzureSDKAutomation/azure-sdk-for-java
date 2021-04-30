// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of VirtualMachines. */
public interface VirtualMachines {
    /**
     * Gets all the virtual machines under the specified subscription for the specified location.
     *
     * @param location The location for which virtual machines under the subscription are queried.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the virtual machines under the specified subscription for the specified location.
     */
    PagedIterable<VirtualMachine> listByLocation(String location);

    /**
     * Gets all the virtual machines under the specified subscription for the specified location.
     *
     * @param location The location for which virtual machines under the subscription are queried.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the virtual machines under the specified subscription for the specified location.
     */
    PagedIterable<VirtualMachine> listByLocation(String location, Context context);

    /**
     * Captures the VM by copying virtual hard disks of the VM and outputs a template that can be used to create similar
     * VMs.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param parameters Parameters supplied to the Capture Virtual Machine operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of virtual machine capture operation.
     */
    VirtualMachineCaptureResult capture(
        String resourceGroupName, String vmName, VirtualMachineCaptureParameters parameters);

    /**
     * Captures the VM by copying virtual hard disks of the VM and outputs a template that can be used to create similar
     * VMs.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param parameters Parameters supplied to the Capture Virtual Machine operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of virtual machine capture operation.
     */
    VirtualMachineCaptureResult capture(
        String resourceGroupName, String vmName, VirtualMachineCaptureParameters parameters, Context context);

    /**
     * The operation to delete a virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param forceDeletion Optional parameter to force delete virtual machines.(Feature in Preview).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String vmName, Boolean forceDeletion);

    /**
     * The operation to delete a virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String vmName);

    /**
     * The operation to delete a virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param forceDeletion Optional parameter to force delete virtual machines.(Feature in Preview).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String vmName, Boolean forceDeletion, Context context);

    /**
     * Retrieves information about the model view or the instance view of a virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Virtual Machine.
     */
    VirtualMachine getByResourceGroup(String resourceGroupName, String vmName);

    /**
     * Retrieves information about the model view or the instance view of a virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param expand The expand expression to apply on the operation. 'InstanceView' retrieves a snapshot of the runtime
     *     properties of the virtual machine that is managed by the platform and can change outside of control plane
     *     operations. 'UserData' retrieves the UserData property as part of the VM model view that was provided by the
     *     user during the VM Create/Update operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Virtual Machine.
     */
    Response<VirtualMachine> getByResourceGroupWithResponse(
        String resourceGroupName, String vmName, InstanceViewTypes expand, Context context);

    /**
     * Retrieves information about the run-time state of a virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the instance view of a virtual machine.
     */
    VirtualMachineInstanceView instanceView(String resourceGroupName, String vmName);

    /**
     * Retrieves information about the run-time state of a virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the instance view of a virtual machine.
     */
    Response<VirtualMachineInstanceView> instanceViewWithResponse(
        String resourceGroupName, String vmName, Context context);

    /**
     * Converts virtual machine disks from blob-based to managed disks. Virtual machine must be stop-deallocated before
     * invoking this operation.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void convertToManagedDisks(String resourceGroupName, String vmName);

    /**
     * Converts virtual machine disks from blob-based to managed disks. Virtual machine must be stop-deallocated before
     * invoking this operation.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void convertToManagedDisks(String resourceGroupName, String vmName, Context context);

    /**
     * Shuts down the virtual machine and releases the compute resources. You are not billed for the compute resources
     * that this virtual machine uses.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deallocate(String resourceGroupName, String vmName);

    /**
     * Shuts down the virtual machine and releases the compute resources. You are not billed for the compute resources
     * that this virtual machine uses.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deallocate(String resourceGroupName, String vmName, Context context);

    /**
     * Sets the OS state of the virtual machine to generalized. It is recommended to sysprep the virtual machine before
     * performing this operation. &lt;br&gt;For Windows, please refer to [Create a managed image of a generalized VM in
     * Azure](https://docs.microsoft.com/azure/virtual-machines/windows/capture-image-resource).&lt;br&gt;For Linux,
     * please refer to [How to create an image of a virtual machine or
     * VHD](https://docs.microsoft.com/azure/virtual-machines/linux/capture-image).
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void generalize(String resourceGroupName, String vmName);

    /**
     * Sets the OS state of the virtual machine to generalized. It is recommended to sysprep the virtual machine before
     * performing this operation. &lt;br&gt;For Windows, please refer to [Create a managed image of a generalized VM in
     * Azure](https://docs.microsoft.com/azure/virtual-machines/windows/capture-image-resource).&lt;br&gt;For Linux,
     * please refer to [How to create an image of a virtual machine or
     * VHD](https://docs.microsoft.com/azure/virtual-machines/linux/capture-image).
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> generalizeWithResponse(String resourceGroupName, String vmName, Context context);

    /**
     * Lists all of the virtual machines in the specified resource group. Use the nextLink property in the response to
     * get the next page of virtual machines.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Virtual Machine operation response.
     */
    PagedIterable<VirtualMachine> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all of the virtual machines in the specified resource group. Use the nextLink property in the response to
     * get the next page of virtual machines.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Virtual Machine operation response.
     */
    PagedIterable<VirtualMachine> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists all of the virtual machines in the specified subscription. Use the nextLink property in the response to get
     * the next page of virtual machines.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Virtual Machine operation response.
     */
    PagedIterable<VirtualMachine> list();

    /**
     * Lists all of the virtual machines in the specified subscription. Use the nextLink property in the response to get
     * the next page of virtual machines.
     *
     * @param statusOnly statusOnly=true enables fetching run time status of all Virtual Machines in the subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Virtual Machine operation response.
     */
    PagedIterable<VirtualMachine> list(String statusOnly, Context context);

    /**
     * Lists all available virtual machine sizes to which the specified virtual machine can be resized.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Virtual Machine operation response.
     */
    PagedIterable<VirtualMachineSize> listAvailableSizes(String resourceGroupName, String vmName);

    /**
     * Lists all available virtual machine sizes to which the specified virtual machine can be resized.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Virtual Machine operation response.
     */
    PagedIterable<VirtualMachineSize> listAvailableSizes(String resourceGroupName, String vmName, Context context);

    /**
     * The operation to power off (stop) a virtual machine. The virtual machine can be restarted with the same
     * provisioned resources. You are still charged for this virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param skipShutdown The parameter to request non-graceful VM shutdown. True value for this flag indicates
     *     non-graceful shutdown whereas false indicates otherwise. Default value for this flag is false if not
     *     specified.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void powerOff(String resourceGroupName, String vmName, Boolean skipShutdown);

    /**
     * The operation to power off (stop) a virtual machine. The virtual machine can be restarted with the same
     * provisioned resources. You are still charged for this virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void powerOff(String resourceGroupName, String vmName);

    /**
     * The operation to power off (stop) a virtual machine. The virtual machine can be restarted with the same
     * provisioned resources. You are still charged for this virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param skipShutdown The parameter to request non-graceful VM shutdown. True value for this flag indicates
     *     non-graceful shutdown whereas false indicates otherwise. Default value for this flag is false if not
     *     specified.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void powerOff(String resourceGroupName, String vmName, Boolean skipShutdown, Context context);

    /**
     * The operation to reapply a virtual machine's state.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void reapply(String resourceGroupName, String vmName);

    /**
     * The operation to reapply a virtual machine's state.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void reapply(String resourceGroupName, String vmName, Context context);

    /**
     * The operation to restart a virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restart(String resourceGroupName, String vmName);

    /**
     * The operation to restart a virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restart(String resourceGroupName, String vmName, Context context);

    /**
     * The operation to start a virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(String resourceGroupName, String vmName);

    /**
     * The operation to start a virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(String resourceGroupName, String vmName, Context context);

    /**
     * Shuts down the virtual machine, moves it to a new node, and powers it back on.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void redeploy(String resourceGroupName, String vmName);

    /**
     * Shuts down the virtual machine, moves it to a new node, and powers it back on.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void redeploy(String resourceGroupName, String vmName, Context context);

    /**
     * Reimages the virtual machine which has an ephemeral OS disk back to its initial state.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param parameters Parameters supplied to the Reimage Virtual Machine operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void reimage(String resourceGroupName, String vmName, VirtualMachineReimageParameters parameters);

    /**
     * Reimages the virtual machine which has an ephemeral OS disk back to its initial state.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void reimage(String resourceGroupName, String vmName);

    /**
     * Reimages the virtual machine which has an ephemeral OS disk back to its initial state.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param parameters Parameters supplied to the Reimage Virtual Machine operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void reimage(String resourceGroupName, String vmName, VirtualMachineReimageParameters parameters, Context context);

    /**
     * The operation to retrieve SAS URIs for a virtual machine's boot diagnostic logs.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SAS URIs of the console screenshot and serial log blobs.
     */
    RetrieveBootDiagnosticsDataResult retrieveBootDiagnosticsData(String resourceGroupName, String vmName);

    /**
     * The operation to retrieve SAS URIs for a virtual machine's boot diagnostic logs.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param sasUriExpirationTimeInMinutes Expiration duration in minutes for the SAS URIs with a value between 1 to
     *     1440 minutes. &lt;br&gt;&lt;br&gt;NOTE: If not specified, SAS URIs will be generated with a default
     *     expiration duration of 120 minutes.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SAS URIs of the console screenshot and serial log blobs.
     */
    Response<RetrieveBootDiagnosticsDataResult> retrieveBootDiagnosticsDataWithResponse(
        String resourceGroupName, String vmName, Integer sasUriExpirationTimeInMinutes, Context context);

    /**
     * The operation to perform maintenance on a virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void performMaintenance(String resourceGroupName, String vmName);

    /**
     * The operation to perform maintenance on a virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void performMaintenance(String resourceGroupName, String vmName, Context context);

    /**
     * The operation to simulate the eviction of spot virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void simulateEviction(String resourceGroupName, String vmName);

    /**
     * The operation to simulate the eviction of spot virtual machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> simulateEvictionWithResponse(String resourceGroupName, String vmName, Context context);

    /**
     * Assess patches on the VM.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the properties of an AssessPatches result.
     */
    VirtualMachineAssessPatchesResult assessPatches(String resourceGroupName, String vmName);

    /**
     * Assess patches on the VM.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the properties of an AssessPatches result.
     */
    VirtualMachineAssessPatchesResult assessPatches(String resourceGroupName, String vmName, Context context);

    /**
     * Installs patches on the VM.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param installPatchesInput Input for InstallPatches as directly received by the API.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result summary of an installation operation.
     */
    VirtualMachineInstallPatchesResult installPatches(
        String resourceGroupName, String vmName, VirtualMachineInstallPatchesParameters installPatchesInput);

    /**
     * Installs patches on the VM.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param installPatchesInput Input for InstallPatches as directly received by the API.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result summary of an installation operation.
     */
    VirtualMachineInstallPatchesResult installPatches(
        String resourceGroupName,
        String vmName,
        VirtualMachineInstallPatchesParameters installPatchesInput,
        Context context);

    /**
     * Run command on the VM.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param parameters Parameters supplied to the Run command operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    RunCommandResult runCommand(String resourceGroupName, String vmName, RunCommandInput parameters);

    /**
     * Run command on the VM.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine.
     * @param parameters Parameters supplied to the Run command operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    RunCommandResult runCommand(String resourceGroupName, String vmName, RunCommandInput parameters, Context context);

    /**
     * Retrieves information about the model view or the instance view of a virtual machine.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Virtual Machine.
     */
    VirtualMachine getById(String id);

    /**
     * Retrieves information about the model view or the instance view of a virtual machine.
     *
     * @param id the resource ID.
     * @param expand The expand expression to apply on the operation. 'InstanceView' retrieves a snapshot of the runtime
     *     properties of the virtual machine that is managed by the platform and can change outside of control plane
     *     operations. 'UserData' retrieves the UserData property as part of the VM model view that was provided by the
     *     user during the VM Create/Update operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Virtual Machine.
     */
    Response<VirtualMachine> getByIdWithResponse(String id, InstanceViewTypes expand, Context context);

    /**
     * The operation to delete a virtual machine.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * The operation to delete a virtual machine.
     *
     * @param id the resource ID.
     * @param forceDeletion Optional parameter to force delete virtual machines.(Feature in Preview).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Boolean forceDeletion, Context context);

    /**
     * Begins definition for a new VirtualMachine resource.
     *
     * @param name resource name.
     * @return the first stage of the new VirtualMachine definition.
     */
    VirtualMachine.DefinitionStages.Blank define(String name);
}
