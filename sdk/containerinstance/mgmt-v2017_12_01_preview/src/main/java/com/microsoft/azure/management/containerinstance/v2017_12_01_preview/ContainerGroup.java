/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2017_12_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.containerinstance.v2017_12_01_preview.implementation.ContainerInstanceManager;
import java.util.List;
import com.microsoft.azure.management.containerinstance.v2017_12_01_preview.implementation.ContainerGroupInner;

/**
 * Type representing ContainerGroup.
 */
public interface ContainerGroup extends HasInner<ContainerGroupInner>, Resource, GroupableResourceCore<ContainerInstanceManager, ContainerGroupInner>, HasResourceGroup, Refreshable<ContainerGroup>, Updatable<ContainerGroup.Update>, HasManager<ContainerInstanceManager> {
    /**
     * @return the containers value.
     */
    List<Container> containers();

    /**
     * @return the imageRegistryCredentials value.
     */
    List<ImageRegistryCredential> imageRegistryCredentials();

    /**
     * @return the instanceView value.
     */
    ContainerGroupPropertiesInstanceView instanceView();

    /**
     * @return the ipAddress value.
     */
    IpAddress ipAddress();

    /**
     * @return the osType value.
     */
    OperatingSystemTypes osType();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the restartPolicy value.
     */
    ContainerGroupRestartPolicy restartPolicy();

    /**
     * @return the volumes value.
     */
    List<Volume> volumes();

    /**
     * The entirety of the ContainerGroup definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithContainers, DefinitionStages.WithOsType, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ContainerGroup definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ContainerGroup definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the ContainerGroup definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithContainers> {
        }

        /**
         * The stage of the containergroup definition allowing to specify Containers.
         */
        interface WithContainers {
           /**
            * Specifies containers.
            * @param containers The containers within the container group
            * @return the next definition stage
*/
            WithOsType withContainers(List<Container> containers);
        }

        /**
         * The stage of the containergroup definition allowing to specify OsType.
         */
        interface WithOsType {
           /**
            * Specifies osType.
            * @param osType The operating system type required by the containers in the container group. Possible values include: 'Windows', 'Linux'
            * @return the next definition stage
*/
            WithCreate withOsType(OperatingSystemTypes osType);
        }

        /**
         * The stage of the containergroup definition allowing to specify ImageRegistryCredentials.
         */
        interface WithImageRegistryCredentials {
            /**
             * Specifies imageRegistryCredentials.
             * @param imageRegistryCredentials The image registry credentials by which the container group is created from
             * @return the next definition stage
             */
            WithCreate withImageRegistryCredentials(List<ImageRegistryCredential> imageRegistryCredentials);
        }

        /**
         * The stage of the containergroup definition allowing to specify IpAddress.
         */
        interface WithIpAddress {
            /**
             * Specifies ipAddress.
             * @param ipAddress The IP address type of the container group
             * @return the next definition stage
             */
            WithCreate withIpAddress(IpAddress ipAddress);
        }

        /**
         * The stage of the containergroup definition allowing to specify RestartPolicy.
         */
        interface WithRestartPolicy {
            /**
             * Specifies restartPolicy.
             * @param restartPolicy Restart policy for all containers within the container group.
 - `Always` Always restart
 - `OnFailure` Restart on failure
 - `Never` Never restart
 . Possible values include: 'Always', 'OnFailure', 'Never'
             * @return the next definition stage
             */
            WithCreate withRestartPolicy(ContainerGroupRestartPolicy restartPolicy);
        }

        /**
         * The stage of the containergroup definition allowing to specify Volumes.
         */
        interface WithVolumes {
            /**
             * Specifies volumes.
             * @param volumes The list of volumes that can be mounted by containers in this container group
             * @return the next definition stage
             */
            WithCreate withVolumes(List<Volume> volumes);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ContainerGroup>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithImageRegistryCredentials, DefinitionStages.WithIpAddress, DefinitionStages.WithRestartPolicy, DefinitionStages.WithVolumes {
        }
    }
    /**
     * The template for a ContainerGroup update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ContainerGroup>, Resource.UpdateWithTags<Update>, UpdateStages.WithImageRegistryCredentials, UpdateStages.WithIpAddress, UpdateStages.WithRestartPolicy, UpdateStages.WithVolumes {
    }

    /**
     * Grouping of ContainerGroup update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the containergroup update allowing to specify ImageRegistryCredentials.
         */
        interface WithImageRegistryCredentials {
            /**
             * Specifies imageRegistryCredentials.
             * @param imageRegistryCredentials The image registry credentials by which the container group is created from
             * @return the next update stage
             */
            Update withImageRegistryCredentials(List<ImageRegistryCredential> imageRegistryCredentials);
        }

        /**
         * The stage of the containergroup update allowing to specify IpAddress.
         */
        interface WithIpAddress {
            /**
             * Specifies ipAddress.
             * @param ipAddress The IP address type of the container group
             * @return the next update stage
             */
            Update withIpAddress(IpAddress ipAddress);
        }

        /**
         * The stage of the containergroup update allowing to specify RestartPolicy.
         */
        interface WithRestartPolicy {
            /**
             * Specifies restartPolicy.
             * @param restartPolicy Restart policy for all containers within the container group.
 - `Always` Always restart
 - `OnFailure` Restart on failure
 - `Never` Never restart
 . Possible values include: 'Always', 'OnFailure', 'Never'
             * @return the next update stage
             */
            Update withRestartPolicy(ContainerGroupRestartPolicy restartPolicy);
        }

        /**
         * The stage of the containergroup update allowing to specify Volumes.
         */
        interface WithVolumes {
            /**
             * Specifies volumes.
             * @param volumes The list of volumes that can be mounted by containers in this container group
             * @return the next update stage
             */
            Update withVolumes(List<Volume> volumes);
        }

    }
}
