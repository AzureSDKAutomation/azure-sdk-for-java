/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_12_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.implementation.TaskInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.implementation.ContainerRegistryManager;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * Type representing Task.
 */
public interface Task extends HasInner<TaskInner>, Indexable, Refreshable<Task>, Updatable<Task.Update>, HasManager<ContainerRegistryManager> {
    /**
     * @return the agentConfiguration value.
     */
    AgentProperties agentConfiguration();

    /**
     * @return the agentPoolName value.
     */
    String agentPoolName();

    /**
     * @return the creationDate value.
     */
    DateTime creationDate();

    /**
     * @return the credentials value.
     */
    Credentials credentials();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the identity value.
     */
    IdentityProperties identity();

    /**
     * @return the isSystemTask value.
     */
    Boolean isSystemTask();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the logTemplate value.
     */
    String logTemplate();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the platform value.
     */
    PlatformProperties platform();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the status value.
     */
    TaskStatus status();

    /**
     * @return the step value.
     */
    TaskStepProperties step();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the timeout value.
     */
    Integer timeout();

    /**
     * @return the trigger value.
     */
    TriggerProperties trigger();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the Task definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithRegistry, DefinitionStages.WithLocation, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Task definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Task definition.
         */
        interface Blank extends WithRegistry {
        }

        /**
         * The stage of the task definition allowing to specify Registry.
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
         * The stage of the task definition allowing to specify Location.
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
         * The stage of the task definition allowing to specify AgentConfiguration.
         */
        interface WithAgentConfiguration {
            /**
             * Specifies agentConfiguration.
             * @param agentConfiguration The machine configuration of the run agent
             * @return the next definition stage
             */
            WithCreate withAgentConfiguration(AgentProperties agentConfiguration);
        }

        /**
         * The stage of the task definition allowing to specify AgentPoolName.
         */
        interface WithAgentPoolName {
            /**
             * Specifies agentPoolName.
             * @param agentPoolName The dedicated agent pool for the task
             * @return the next definition stage
             */
            WithCreate withAgentPoolName(String agentPoolName);
        }

        /**
         * The stage of the task definition allowing to specify Credentials.
         */
        interface WithCredentials {
            /**
             * Specifies credentials.
             * @param credentials The properties that describes a set of credentials that will be used when this run is invoked
             * @return the next definition stage
             */
            WithCreate withCredentials(Credentials credentials);
        }

        /**
         * The stage of the task definition allowing to specify Identity.
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
         * The stage of the task definition allowing to specify IsSystemTask.
         */
        interface WithIsSystemTask {
            /**
             * Specifies isSystemTask.
             * @param isSystemTask The value of this property indicates whether the task resource is system task or not
             * @return the next definition stage
             */
            WithCreate withIsSystemTask(Boolean isSystemTask);
        }

        /**
         * The stage of the task definition allowing to specify LogTemplate.
         */
        interface WithLogTemplate {
            /**
             * Specifies logTemplate.
             * @param logTemplate The template that describes the repository and tag information for run log artifact
             * @return the next definition stage
             */
            WithCreate withLogTemplate(String logTemplate);
        }

        /**
         * The stage of the task definition allowing to specify Platform.
         */
        interface WithPlatform {
            /**
             * Specifies platform.
             * @param platform The platform properties against which the run has to happen
             * @return the next definition stage
             */
            WithCreate withPlatform(PlatformProperties platform);
        }

        /**
         * The stage of the task definition allowing to specify Status.
         */
        interface WithStatus {
            /**
             * Specifies status.
             * @param status The current status of task. Possible values include: 'Disabled', 'Enabled'
             * @return the next definition stage
             */
            WithCreate withStatus(TaskStatus status);
        }

        /**
         * The stage of the task definition allowing to specify Step.
         */
        interface WithStep {
            /**
             * Specifies step.
             * @param step The properties of a task step
             * @return the next definition stage
             */
            WithCreate withStep(TaskStepProperties step);
        }

        /**
         * The stage of the task definition allowing to specify Tags.
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
         * The stage of the task definition allowing to specify Timeout.
         */
        interface WithTimeout {
            /**
             * Specifies timeout.
             * @param timeout Run timeout in seconds
             * @return the next definition stage
             */
            WithCreate withTimeout(Integer timeout);
        }

        /**
         * The stage of the task definition allowing to specify Trigger.
         */
        interface WithTrigger {
            /**
             * Specifies trigger.
             * @param trigger The properties that describe all triggers for the task
             * @return the next definition stage
             */
            WithCreate withTrigger(TriggerProperties trigger);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Task>, DefinitionStages.WithAgentConfiguration, DefinitionStages.WithAgentPoolName, DefinitionStages.WithCredentials, DefinitionStages.WithIdentity, DefinitionStages.WithIsSystemTask, DefinitionStages.WithLogTemplate, DefinitionStages.WithPlatform, DefinitionStages.WithStatus, DefinitionStages.WithStep, DefinitionStages.WithTags, DefinitionStages.WithTimeout, DefinitionStages.WithTrigger {
        }
    }
    /**
     * The template for a Task update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Task>, UpdateStages.WithAgentConfiguration, UpdateStages.WithAgentPoolName, UpdateStages.WithCredentials, UpdateStages.WithIdentity, UpdateStages.WithLogTemplate, UpdateStages.WithPlatform, UpdateStages.WithStatus, UpdateStages.WithStep, UpdateStages.WithTags, UpdateStages.WithTimeout, UpdateStages.WithTrigger {
    }

    /**
     * Grouping of Task update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the task update allowing to specify AgentConfiguration.
         */
        interface WithAgentConfiguration {
            /**
             * Specifies agentConfiguration.
             * @param agentConfiguration The machine configuration of the run agent
             * @return the next update stage
             */
            Update withAgentConfiguration(AgentProperties agentConfiguration);
        }

        /**
         * The stage of the task update allowing to specify AgentPoolName.
         */
        interface WithAgentPoolName {
            /**
             * Specifies agentPoolName.
             * @param agentPoolName The dedicated agent pool for the task
             * @return the next update stage
             */
            Update withAgentPoolName(String agentPoolName);
        }

        /**
         * The stage of the task update allowing to specify Credentials.
         */
        interface WithCredentials {
            /**
             * Specifies credentials.
             * @param credentials The parameters that describes a set of credentials that will be used when this run is invoked
             * @return the next update stage
             */
            Update withCredentials(Credentials credentials);
        }

        /**
         * The stage of the task update allowing to specify Identity.
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
         * The stage of the task update allowing to specify LogTemplate.
         */
        interface WithLogTemplate {
            /**
             * Specifies logTemplate.
             * @param logTemplate The template that describes the repository and tag information for run log artifact
             * @return the next update stage
             */
            Update withLogTemplate(String logTemplate);
        }

        /**
         * The stage of the task update allowing to specify Platform.
         */
        interface WithPlatform {
            /**
             * Specifies platform.
             * @param platform The platform properties against which the run has to happen
             * @return the next update stage
             */
            Update withPlatform(PlatformUpdateParameters platform);
        }

        /**
         * The stage of the task update allowing to specify Status.
         */
        interface WithStatus {
            /**
             * Specifies status.
             * @param status The current status of task. Possible values include: 'Disabled', 'Enabled'
             * @return the next update stage
             */
            Update withStatus(TaskStatus status);
        }

        /**
         * The stage of the task update allowing to specify Step.
         */
        interface WithStep {
            /**
             * Specifies step.
             * @param step The properties for updating a task step
             * @return the next update stage
             */
            Update withStep(TaskStepUpdateParameters step);
        }

        /**
         * The stage of the task update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags The ARM resource tags
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the task update allowing to specify Timeout.
         */
        interface WithTimeout {
            /**
             * Specifies timeout.
             * @param timeout Run timeout in seconds
             * @return the next update stage
             */
            Update withTimeout(Integer timeout);
        }

        /**
         * The stage of the task update allowing to specify Trigger.
         */
        interface WithTrigger {
            /**
             * Specifies trigger.
             * @param trigger The properties for updating trigger properties
             * @return the next update stage
             */
            Update withTrigger(TriggerUpdateParameters trigger);
        }

    }
}
