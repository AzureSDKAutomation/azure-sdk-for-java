/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_12_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.implementation.TaskRunInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.implementation.ContainerRegistryManager;
import java.util.Map;

/**
 * Type representing TaskRun.
 */
public interface TaskRun extends HasInner<TaskRunInner>, Indexable, Refreshable<TaskRun>, Updatable<TaskRun.Update>, HasManager<ContainerRegistryManager> {
    /**
     * @return the forceUpdateTag value.
     */
    String forceUpdateTag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the identity value.
     */
    IdentityProperties identity();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the runRequest value.
     */
    RunRequest runRequest();

    /**
     * @return the runResult value.
     */
    Run runResult();

    /**
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the TaskRun definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithRegistry, DefinitionStages.WithLocation, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of TaskRun definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a TaskRun definition.
         */
        interface Blank extends WithRegistry {
        }

        /**
         * The stage of the taskrun definition allowing to specify Registry.
         */
        interface WithRegistry {
           /**
            * Specifies resourceGroupName, registryName.
            * @param resourceGroupName The name of the resource group to which the container registry belongs
            * @param registryName The name of the container registry
            * @return the next definition stage
            */
            WithLocation withExistingRegistry(String resourceGroupName, String registryName);
        }

        /**
         * The stage of the taskrun definition allowing to specify Location.
         */
        interface WithLocation {
           /**
            * Specifies location.
            * @param location The location of the resource. This cannot be changed after the resource is created
            * @return the next definition stage
            */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the taskrun definition allowing to specify ForceUpdateTag.
         */
        interface WithForceUpdateTag {
            /**
             * Specifies forceUpdateTag.
             * @param forceUpdateTag How the run should be forced to rerun even if the run request configuration has not changed
             * @return the next definition stage
             */
            WithCreate withForceUpdateTag(String forceUpdateTag);
        }

        /**
         * The stage of the taskrun definition allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity Identity for the resource
             * @return the next definition stage
             */
            WithCreate withIdentity(IdentityProperties identity);
        }

        /**
         * The stage of the taskrun definition allowing to specify RunRequest.
         */
        interface WithRunRequest {
            /**
             * Specifies runRequest.
             * @param runRequest The request (parameters) for the run
             * @return the next definition stage
             */
            WithCreate withRunRequest(RunRequest runRequest);
        }

        /**
         * The stage of the taskrun definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags The tags of the resource
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<TaskRun>, DefinitionStages.WithForceUpdateTag, DefinitionStages.WithIdentity, DefinitionStages.WithRunRequest, DefinitionStages.WithTags {
        }
    }
    /**
     * The template for a TaskRun update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<TaskRun>, UpdateStages.WithForceUpdateTag, UpdateStages.WithIdentity, UpdateStages.WithRunRequest, UpdateStages.WithTags {
    }

    /**
     * Grouping of TaskRun update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the taskrun update allowing to specify ForceUpdateTag.
         */
        interface WithForceUpdateTag {
            /**
             * Specifies forceUpdateTag.
             * @param forceUpdateTag How the run should be forced to rerun even if the run request configuration has not changed
             * @return the next update stage
             */
            Update withForceUpdateTag(String forceUpdateTag);
        }

        /**
         * The stage of the taskrun update allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity Identity for the resource
             * @return the next update stage
             */
            Update withIdentity(IdentityProperties identity);
        }

        /**
         * The stage of the taskrun update allowing to specify RunRequest.
         */
        interface WithRunRequest {
            /**
             * Specifies runRequest.
             * @param runRequest The request (parameters) for the new run
             * @return the next update stage
             */
            Update withRunRequest(RunRequest runRequest);
        }

        /**
         * The stage of the taskrun update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags The ARM resource tags
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

    }
}
