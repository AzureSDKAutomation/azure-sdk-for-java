/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.WorkerPoolResourceInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.CertificateRegistrationManager;
import java.util.List;

/**
 * Type representing WorkerPools.
 */
public interface WorkerPools extends HasInner<WorkerPoolResourceInner>, Indexable, Refreshable<WorkerPools>, Updatable<WorkerPools.Update>, HasManager<CertificateRegistrationManager> {
    /**
     * @return the computeMode value.
     */
    ComputeModeOptions computeMode();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the instanceNames value.
     */
    List<String> instanceNames();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the sku value.
     */
    SkuDescription sku();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the workerCount value.
     */
    Integer workerCount();

    /**
     * @return the workerSize value.
     */
    String workerSize();

    /**
     * @return the workerSizeId value.
     */
    Integer workerSizeId();

    /**
     * The entirety of the WorkerPools definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithHostingEnvironment, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of WorkerPools definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a WorkerPools definition.
         */
        interface Blank extends WithHostingEnvironment {
        }

        /**
         * The stage of the workerpools definition allowing to specify HostingEnvironment.
         */
        interface WithHostingEnvironment {
           /**
            * Specifies resourceGroupName, name.
            * @param resourceGroupName Name of the resource group to which the resource belongs
            * @param name Name of the App Service Environment
            * @return the next definition stage
            */
            WithCreate withExistingHostingEnvironment(String resourceGroupName, String name);
        }

        /**
         * The stage of the workerpools definition allowing to specify ComputeMode.
         */
        interface WithComputeMode {
            /**
             * Specifies computeMode.
             * @param computeMode Shared or dedicated app hosting. Possible values include: 'Shared', 'Dedicated', 'Dynamic'
             * @return the next definition stage
             */
            WithCreate withComputeMode(ComputeModeOptions computeMode);
        }

        /**
         * The stage of the workerpools definition allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             * @param kind Kind of resource
             * @return the next definition stage
             */
            WithCreate withKind(String kind);
        }

        /**
         * The stage of the workerpools definition allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku the sku parameter value
             * @return the next definition stage
             */
            WithCreate withSku(SkuDescription sku);
        }

        /**
         * The stage of the workerpools definition allowing to specify WorkerCount.
         */
        interface WithWorkerCount {
            /**
             * Specifies workerCount.
             * @param workerCount Number of instances in the worker pool
             * @return the next definition stage
             */
            WithCreate withWorkerCount(Integer workerCount);
        }

        /**
         * The stage of the workerpools definition allowing to specify WorkerSize.
         */
        interface WithWorkerSize {
            /**
             * Specifies workerSize.
             * @param workerSize VM size of the worker pool instances
             * @return the next definition stage
             */
            WithCreate withWorkerSize(String workerSize);
        }

        /**
         * The stage of the workerpools definition allowing to specify WorkerSizeId.
         */
        interface WithWorkerSizeId {
            /**
             * Specifies workerSizeId.
             * @param workerSizeId Worker size ID for referencing this worker pool
             * @return the next definition stage
             */
            WithCreate withWorkerSizeId(Integer workerSizeId);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<WorkerPools>, DefinitionStages.WithComputeMode, DefinitionStages.WithKind, DefinitionStages.WithSku, DefinitionStages.WithWorkerCount, DefinitionStages.WithWorkerSize, DefinitionStages.WithWorkerSizeId {
        }
    }
    /**
     * The template for a WorkerPools update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<WorkerPools>, UpdateStages.WithComputeMode, UpdateStages.WithKind, UpdateStages.WithSku, UpdateStages.WithWorkerCount, UpdateStages.WithWorkerSize, UpdateStages.WithWorkerSizeId {
    }

    /**
     * Grouping of WorkerPools update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the workerpools update allowing to specify ComputeMode.
         */
        interface WithComputeMode {
            /**
             * Specifies computeMode.
             * @param computeMode Shared or dedicated app hosting. Possible values include: 'Shared', 'Dedicated', 'Dynamic'
             * @return the next update stage
             */
            Update withComputeMode(ComputeModeOptions computeMode);
        }

        /**
         * The stage of the workerpools update allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             * @param kind Kind of resource
             * @return the next update stage
             */
            Update withKind(String kind);
        }

        /**
         * The stage of the workerpools update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku the sku parameter value
             * @return the next update stage
             */
            Update withSku(SkuDescription sku);
        }

        /**
         * The stage of the workerpools update allowing to specify WorkerCount.
         */
        interface WithWorkerCount {
            /**
             * Specifies workerCount.
             * @param workerCount Number of instances in the worker pool
             * @return the next update stage
             */
            Update withWorkerCount(Integer workerCount);
        }

        /**
         * The stage of the workerpools update allowing to specify WorkerSize.
         */
        interface WithWorkerSize {
            /**
             * Specifies workerSize.
             * @param workerSize VM size of the worker pool instances
             * @return the next update stage
             */
            Update withWorkerSize(String workerSize);
        }

        /**
         * The stage of the workerpools update allowing to specify WorkerSizeId.
         */
        interface WithWorkerSizeId {
            /**
             * Specifies workerSizeId.
             * @param workerSizeId Worker size ID for referencing this worker pool
             * @return the next update stage
             */
            Update withWorkerSizeId(Integer workerSizeId);
        }

    }
}
