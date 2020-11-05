/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_12_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.implementation.ExportPipelineInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.implementation.ContainerRegistryManager;
import java.util.List;

/**
 * Type representing ExportPipeline.
 */
public interface ExportPipeline extends HasInner<ExportPipelineInner>, Indexable, Refreshable<ExportPipeline>, Updatable<ExportPipeline.Update>, HasManager<ContainerRegistryManager> {
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
     * @return the options value.
     */
    List<PipelineOptions> options();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the target value.
     */
    ExportPipelineTargetProperties target();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the ExportPipeline definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithRegistry, DefinitionStages.WithTarget, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ExportPipeline definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ExportPipeline definition.
         */
        interface Blank extends WithRegistry {
        }

        /**
         * The stage of the exportpipeline definition allowing to specify Registry.
         */
        interface WithRegistry {
           /**
            * Specifies resourceGroupName, registryName.
            * @param resourceGroupName The name of the resource group to which the container registry belongs
            * @param registryName The name of the container registry
            * @return the next definition stage
            */
            WithTarget withExistingRegistry(String resourceGroupName, String registryName);
        }

        /**
         * The stage of the exportpipeline definition allowing to specify Target.
         */
        interface WithTarget {
           /**
            * Specifies target.
            * @param target The target properties of the export pipeline
            * @return the next definition stage
            */
            WithCreate withTarget(ExportPipelineTargetProperties target);
        }

        /**
         * The stage of the exportpipeline definition allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity The identity of the export pipeline
             * @return the next definition stage
             */
            WithCreate withIdentity(IdentityProperties identity);
        }

        /**
         * The stage of the exportpipeline definition allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location The location of the export pipeline
             * @return the next definition stage
             */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the exportpipeline definition allowing to specify Options.
         */
        interface WithOptions {
            /**
             * Specifies options.
             * @param options The list of all options configured for the pipeline
             * @return the next definition stage
             */
            WithCreate withOptions(List<PipelineOptions> options);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ExportPipeline>, DefinitionStages.WithIdentity, DefinitionStages.WithLocation, DefinitionStages.WithOptions {
        }
    }
    /**
     * The template for a ExportPipeline update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ExportPipeline>, UpdateStages.WithIdentity, UpdateStages.WithLocation, UpdateStages.WithOptions {
    }

    /**
     * Grouping of ExportPipeline update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the exportpipeline update allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity The identity of the export pipeline
             * @return the next update stage
             */
            Update withIdentity(IdentityProperties identity);
        }

        /**
         * The stage of the exportpipeline update allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location The location of the export pipeline
             * @return the next update stage
             */
            Update withLocation(String location);
        }

        /**
         * The stage of the exportpipeline update allowing to specify Options.
         */
        interface WithOptions {
            /**
             * Specifies options.
             * @param options The list of all options configured for the pipeline
             * @return the next update stage
             */
            Update withOptions(List<PipelineOptions> options);
        }

    }
}
