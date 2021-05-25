// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.containerregistry.generated.fluent.models.TaskRunInner;
import java.util.Map;

/** An immutable client-side representation of TaskRun. */
public interface TaskRun {
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
     * Gets the identity property: Identity for the resource.
     *
     * @return the identity value.
     */
    IdentityProperties identity();

    /**
     * Gets the location property: The location of the resource.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the provisioningState property: The provisioning state of this task run.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the runRequest property: The request (parameters) for the run.
     *
     * @return the runRequest value.
     */
    RunRequest runRequest();

    /**
     * Gets the runResult property: The result of this task run.
     *
     * @return the runResult value.
     */
    Run runResult();

    /**
     * Gets the forceUpdateTag property: How the run should be forced to rerun even if the run request configuration has
     * not changed.
     *
     * @return the forceUpdateTag value.
     */
    String forceUpdateTag();

    /**
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.containerregistry.generated.fluent.models.TaskRunInner object.
     *
     * @return the inner object.
     */
    TaskRunInner innerModel();

    /** The entirety of the TaskRun definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The TaskRun definition stages. */
    interface DefinitionStages {
        /** The first stage of the TaskRun definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the TaskRun definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, registryName.
             *
             * @param resourceGroupName The name of the resource group to which the container registry belongs.
             * @param registryName The name of the container registry.
             * @return the next definition stage.
             */
            WithCreate withExistingRegistry(String resourceGroupName, String registryName);
        }
        /**
         * The stage of the TaskRun definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithLocation,
                DefinitionStages.WithIdentity,
                DefinitionStages.WithRunRequest,
                DefinitionStages.WithForceUpdateTag {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            TaskRun create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            TaskRun create(Context context);
        }
        /** The stage of the TaskRun definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The location of the resource.
             * @return the next definition stage.
             */
            WithCreate withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The location of the resource.
             * @return the next definition stage.
             */
            WithCreate withRegion(String location);
        }
        /** The stage of the TaskRun definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: Identity for the resource..
             *
             * @param identity Identity for the resource.
             * @return the next definition stage.
             */
            WithCreate withIdentity(IdentityProperties identity);
        }
        /** The stage of the TaskRun definition allowing to specify runRequest. */
        interface WithRunRequest {
            /**
             * Specifies the runRequest property: The request (parameters) for the run.
             *
             * @param runRequest The request (parameters) for the run.
             * @return the next definition stage.
             */
            WithCreate withRunRequest(RunRequest runRequest);
        }
        /** The stage of the TaskRun definition allowing to specify forceUpdateTag. */
        interface WithForceUpdateTag {
            /**
             * Specifies the forceUpdateTag property: How the run should be forced to rerun even if the run request
             * configuration has not changed.
             *
             * @param forceUpdateTag How the run should be forced to rerun even if the run request configuration has not
             *     changed.
             * @return the next definition stage.
             */
            WithCreate withForceUpdateTag(String forceUpdateTag);
        }
    }
    /**
     * Begins update for the TaskRun resource.
     *
     * @return the stage of resource update.
     */
    TaskRun.Update update();

    /** The template for TaskRun update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithIdentity,
            UpdateStages.WithRunRequest,
            UpdateStages.WithForceUpdateTag {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        TaskRun apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        TaskRun apply(Context context);
    }
    /** The TaskRun update stages. */
    interface UpdateStages {
        /** The stage of the TaskRun update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: The ARM resource tags..
             *
             * @param tags The ARM resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the TaskRun update allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: Identity for the resource..
             *
             * @param identity Identity for the resource.
             * @return the next definition stage.
             */
            Update withIdentity(IdentityProperties identity);
        }
        /** The stage of the TaskRun update allowing to specify runRequest. */
        interface WithRunRequest {
            /**
             * Specifies the runRequest property: The request (parameters) for the new run.
             *
             * @param runRequest The request (parameters) for the new run.
             * @return the next definition stage.
             */
            Update withRunRequest(RunRequest runRequest);
        }
        /** The stage of the TaskRun update allowing to specify forceUpdateTag. */
        interface WithForceUpdateTag {
            /**
             * Specifies the forceUpdateTag property: How the run should be forced to rerun even if the run request
             * configuration has not changed.
             *
             * @param forceUpdateTag How the run should be forced to rerun even if the run request configuration has not
             *     changed.
             * @return the next definition stage.
             */
            Update withForceUpdateTag(String forceUpdateTag);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    TaskRun refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    TaskRun refresh(Context context);

    /**
     * Gets the detailed information for a given task run that includes all secrets.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the detailed information for a given task run that includes all secrets.
     */
    TaskRun getDetails();

    /**
     * Gets the detailed information for a given task run that includes all secrets.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the detailed information for a given task run that includes all secrets.
     */
    Response<TaskRun> getDetailsWithResponse(Context context);
}
