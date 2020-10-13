/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01;

import rx.Observable;
import com.microsoft.azure.management.compute.v2020_06_01.LocationVirtualMachineRunCommand;
import rx.Completable;

/**
 * Type representing VirtualMachineRunCommands.
 */
public interface VirtualMachineRunCommands {
    /**
     * Begins definition for a new RunCommand resource.
     * @param name resource name.
     * @return the first stage of the new RunCommand definition.
     */
    LocationVirtualMachineRunCommand.DefinitionStages.Blank defineRunCommand(String name);

    /**
     * Gets specific run command for a subscription in a location.
     *
     * @param location The location upon which run commands is queried.
     * @param commandId The command id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<LocationVirtualMachineRunCommand> getAsync(String location, String commandId);

    /**
     * Lists all available run commands for a subscription in a location.
     *
     * @param location The location upon which run commands is queried.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<LocationVirtualMachineRunCommand> listAsync(final String location);

    /**
     * The operation to delete the run command.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine where the run command should be deleted.
     * @param runCommandName The name of the virtual machine run command.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String vmName, String runCommandName);

    /**
     * The operation to get the run command.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine containing the run command.
     * @param runCommandName The name of the virtual machine run command.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<LocationVirtualMachineRunCommand> getByVirtualMachineAsync(String resourceGroupName, String vmName, String runCommandName);

    /**
     * The operation to get all run commands of a Virtual Machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine containing the run command.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<LocationVirtualMachineRunCommand> listByVirtualMachineAsync(final String resourceGroupName, final String vmName);

}
