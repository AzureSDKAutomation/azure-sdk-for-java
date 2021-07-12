// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.datamigration.fluent.models.CommandPropertiesInner;
import com.azure.resourcemanager.datamigration.fluent.models.ProjectTaskInner;

/** An immutable client-side representation of ProjectTask. */
public interface ProjectTask {
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
     * Gets the etag property: HTTP strong entity tag value. This is ignored if submitted.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the properties property: Custom task properties.
     *
     * @return the properties value.
     */
    ProjectTaskProperties properties();

    /**
     * Gets the inner com.azure.resourcemanager.datamigration.fluent.models.ProjectTaskInner object.
     *
     * @return the inner object.
     */
    ProjectTaskInner innerModel();

    /** The entirety of the ProjectTask definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The ProjectTask definition stages. */
    interface DefinitionStages {
        /** The first stage of the ProjectTask definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the ProjectTask definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies groupName, serviceName, projectName.
             *
             * @param groupName Name of the resource group.
             * @param serviceName Name of the service.
             * @param projectName Name of the project.
             * @return the next definition stage.
             */
            WithCreate withExistingProject(String groupName, String serviceName, String projectName);
        }
        /**
         * The stage of the ProjectTask definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithEtag, DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ProjectTask create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ProjectTask create(Context context);
        }
        /** The stage of the ProjectTask definition allowing to specify etag. */
        interface WithEtag {
            /**
             * Specifies the etag property: HTTP strong entity tag value. This is ignored if submitted..
             *
             * @param etag HTTP strong entity tag value. This is ignored if submitted.
             * @return the next definition stage.
             */
            WithCreate withEtag(String etag);
        }
        /** The stage of the ProjectTask definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Custom task properties.
             *
             * @param properties Custom task properties.
             * @return the next definition stage.
             */
            WithCreate withProperties(ProjectTaskProperties properties);
        }
    }
    /**
     * Begins update for the ProjectTask resource.
     *
     * @return the stage of resource update.
     */
    ProjectTask.Update update();

    /** The template for ProjectTask update. */
    interface Update extends UpdateStages.WithEtag, UpdateStages.WithProperties {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ProjectTask apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ProjectTask apply(Context context);
    }
    /** The ProjectTask update stages. */
    interface UpdateStages {
        /** The stage of the ProjectTask update allowing to specify etag. */
        interface WithEtag {
            /**
             * Specifies the etag property: HTTP strong entity tag value. This is ignored if submitted..
             *
             * @param etag HTTP strong entity tag value. This is ignored if submitted.
             * @return the next definition stage.
             */
            Update withEtag(String etag);
        }
        /** The stage of the ProjectTask update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Custom task properties.
             *
             * @param properties Custom task properties.
             * @return the next definition stage.
             */
            Update withProperties(ProjectTaskProperties properties);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ProjectTask refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ProjectTask refresh(Context context);

    /**
     * The tasks resource is a nested, proxy-only resource representing work performed by a DMS instance. This method
     * cancels a task if it's currently queued or running.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a task resource.
     */
    ProjectTask cancel();

    /**
     * The tasks resource is a nested, proxy-only resource representing work performed by a DMS instance. This method
     * cancels a task if it's currently queued or running.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a task resource.
     */
    Response<ProjectTask> cancelWithResponse(Context context);

    /**
     * The tasks resource is a nested, proxy-only resource representing work performed by a DMS instance. This method
     * executes a command on a running task.
     *
     * @param parameters Command to execute.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return base class for all types of DMS command properties.
     */
    CommandProperties command(CommandPropertiesInner parameters);

    /**
     * The tasks resource is a nested, proxy-only resource representing work performed by a DMS instance. This method
     * executes a command on a running task.
     *
     * @param parameters Command to execute.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return base class for all types of DMS command properties.
     */
    Response<CommandProperties> commandWithResponse(CommandPropertiesInner parameters, Context context);
}
