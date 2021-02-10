// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.WorkerPoolResourceInner;
import java.util.List;

/** An immutable client-side representation of WorkerPoolResource. */
public interface WorkerPoolResource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the systemData property: The system metadata relating to this resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the sku property: Description of a SKU for a scalable resource.
     *
     * @return the sku value.
     */
    SkuDescription sku();

    /**
     * Gets the workerSizeId property: Worker size ID for referencing this worker pool.
     *
     * @return the workerSizeId value.
     */
    Integer workerSizeId();

    /**
     * Gets the computeMode property: Shared or dedicated app hosting.
     *
     * @return the computeMode value.
     */
    ComputeModeOptions computeMode();

    /**
     * Gets the workerSize property: VM size of the worker pool instances.
     *
     * @return the workerSize value.
     */
    String workerSize();

    /**
     * Gets the workerCount property: Number of instances in the worker pool.
     *
     * @return the workerCount value.
     */
    Integer workerCount();

    /**
     * Gets the instanceNames property: Names of all instances in the worker pool (read only).
     *
     * @return the instanceNames value.
     */
    List<String> instanceNames();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.WorkerPoolResourceInner object.
     *
     * @return the inner object.
     */
    WorkerPoolResourceInner innerModel();

    /** The entirety of the WorkerPoolResource definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The WorkerPoolResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the WorkerPoolResource definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the WorkerPoolResource definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, name.
             *
             * @param resourceGroupName Name of the resource group to which the resource belongs.
             * @param name Name of the App Service Environment.
             * @return the next definition stage.
             */
            WithCreate withExistingHostingEnvironment(String resourceGroupName, String name);
        }
        /**
         * The stage of the WorkerPoolResource definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithKind,
                DefinitionStages.WithSku,
                DefinitionStages.WithWorkerSizeId,
                DefinitionStages.WithComputeMode,
                DefinitionStages.WithWorkerSize,
                DefinitionStages.WithWorkerCount {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            WorkerPoolResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            WorkerPoolResource create(Context context);
        }
        /** The stage of the WorkerPoolResource definition allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: Kind of resource..
             *
             * @param kind Kind of resource.
             * @return the next definition stage.
             */
            WithCreate withKind(String kind);
        }
        /** The stage of the WorkerPoolResource definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: Description of a SKU for a scalable resource..
             *
             * @param sku Description of a SKU for a scalable resource.
             * @return the next definition stage.
             */
            WithCreate withSku(SkuDescription sku);
        }
        /** The stage of the WorkerPoolResource definition allowing to specify workerSizeId. */
        interface WithWorkerSizeId {
            /**
             * Specifies the workerSizeId property: Worker size ID for referencing this worker pool..
             *
             * @param workerSizeId Worker size ID for referencing this worker pool.
             * @return the next definition stage.
             */
            WithCreate withWorkerSizeId(Integer workerSizeId);
        }
        /** The stage of the WorkerPoolResource definition allowing to specify computeMode. */
        interface WithComputeMode {
            /**
             * Specifies the computeMode property: Shared or dedicated app hosting..
             *
             * @param computeMode Shared or dedicated app hosting.
             * @return the next definition stage.
             */
            WithCreate withComputeMode(ComputeModeOptions computeMode);
        }
        /** The stage of the WorkerPoolResource definition allowing to specify workerSize. */
        interface WithWorkerSize {
            /**
             * Specifies the workerSize property: VM size of the worker pool instances..
             *
             * @param workerSize VM size of the worker pool instances.
             * @return the next definition stage.
             */
            WithCreate withWorkerSize(String workerSize);
        }
        /** The stage of the WorkerPoolResource definition allowing to specify workerCount. */
        interface WithWorkerCount {
            /**
             * Specifies the workerCount property: Number of instances in the worker pool..
             *
             * @param workerCount Number of instances in the worker pool.
             * @return the next definition stage.
             */
            WithCreate withWorkerCount(Integer workerCount);
        }
    }
    /**
     * Begins update for the WorkerPoolResource resource.
     *
     * @return the stage of resource update.
     */
    WorkerPoolResource.Update update();

    /** The template for WorkerPoolResource update. */
    interface Update
        extends UpdateStages.WithKind,
            UpdateStages.WithSku,
            UpdateStages.WithWorkerSizeId,
            UpdateStages.WithComputeMode,
            UpdateStages.WithWorkerSize,
            UpdateStages.WithWorkerCount {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        WorkerPoolResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        WorkerPoolResource apply(Context context);
    }
    /** The WorkerPoolResource update stages. */
    interface UpdateStages {
        /** The stage of the WorkerPoolResource update allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: Kind of resource..
             *
             * @param kind Kind of resource.
             * @return the next definition stage.
             */
            Update withKind(String kind);
        }
        /** The stage of the WorkerPoolResource update allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: Description of a SKU for a scalable resource..
             *
             * @param sku Description of a SKU for a scalable resource.
             * @return the next definition stage.
             */
            Update withSku(SkuDescription sku);
        }
        /** The stage of the WorkerPoolResource update allowing to specify workerSizeId. */
        interface WithWorkerSizeId {
            /**
             * Specifies the workerSizeId property: Worker size ID for referencing this worker pool..
             *
             * @param workerSizeId Worker size ID for referencing this worker pool.
             * @return the next definition stage.
             */
            Update withWorkerSizeId(Integer workerSizeId);
        }
        /** The stage of the WorkerPoolResource update allowing to specify computeMode. */
        interface WithComputeMode {
            /**
             * Specifies the computeMode property: Shared or dedicated app hosting..
             *
             * @param computeMode Shared or dedicated app hosting.
             * @return the next definition stage.
             */
            Update withComputeMode(ComputeModeOptions computeMode);
        }
        /** The stage of the WorkerPoolResource update allowing to specify workerSize. */
        interface WithWorkerSize {
            /**
             * Specifies the workerSize property: VM size of the worker pool instances..
             *
             * @param workerSize VM size of the worker pool instances.
             * @return the next definition stage.
             */
            Update withWorkerSize(String workerSize);
        }
        /** The stage of the WorkerPoolResource update allowing to specify workerCount. */
        interface WithWorkerCount {
            /**
             * Specifies the workerCount property: Number of instances in the worker pool..
             *
             * @param workerCount Number of instances in the worker pool.
             * @return the next definition stage.
             */
            Update withWorkerCount(Integer workerCount);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    WorkerPoolResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    WorkerPoolResource refresh(Context context);
}
