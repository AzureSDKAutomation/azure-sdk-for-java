/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview.implementation.DeploymentManagerManager;
import java.util.List;
import com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview.implementation.RolloutInner;

/**
 * Type representing Rollout.
 */
public interface Rollout extends HasInner<RolloutInner>, Resource, GroupableResourceCore<DeploymentManagerManager, RolloutInner>, HasResourceGroup, Refreshable<Rollout>, Updatable<Rollout.Update>, HasManager<DeploymentManagerManager> {
    /**
     * @return the artifactSourceId value.
     */
    String artifactSourceId();

    /**
     * @return the buildVersion value.
     */
    String buildVersion();

    /**
     * @return the identity value.
     */
    Identity identity();

    /**
     * @return the operationInfo value.
     */
    RolloutOperationInfo operationInfo();

    /**
     * @return the services value.
     */
    List<ServiceInner> services();

    /**
     * @return the status value.
     */
    String status();

    /**
     * @return the stepGroups value.
     */
    List<StepGroup> stepGroups();

    /**
     * @return the targetServiceTopologyId value.
     */
    String targetServiceTopologyId();

    /**
     * @return the totalRetryAttempts value.
     */
    Integer totalRetryAttempts();

    /**
     * The entirety of the Rollout definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithBuildVersion, DefinitionStages.WithIdentity, DefinitionStages.WithStepGroups, DefinitionStages.WithTargetServiceTopologyId, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Rollout definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Rollout definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the Rollout definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithBuildVersion> {
        }

        /**
         * The stage of the rollout definition allowing to specify BuildVersion.
         */
        interface WithBuildVersion {
           /**
            * Specifies buildVersion.
            * @param buildVersion The version of the build being deployed
            * @return the next definition stage
*/
            WithIdentity withBuildVersion(String buildVersion);
        }

        /**
         * The stage of the rollout definition allowing to specify Identity.
         */
        interface WithIdentity {
           /**
            * Specifies identity.
            * @param identity Identity for the resource
            * @return the next definition stage
*/
            WithStepGroups withIdentity(Identity identity);
        }

        /**
         * The stage of the rollout definition allowing to specify StepGroups.
         */
        interface WithStepGroups {
           /**
            * Specifies stepGroups.
            * @param stepGroups The list of step groups that define the orchestration
            * @return the next definition stage
*/
            WithTargetServiceTopologyId withStepGroups(List<StepGroup> stepGroups);
        }

        /**
         * The stage of the rollout definition allowing to specify TargetServiceTopologyId.
         */
        interface WithTargetServiceTopologyId {
           /**
            * Specifies targetServiceTopologyId.
            * @param targetServiceTopologyId The resource Id of the service topology from which service units are being referenced in step groups to be deployed
            * @return the next definition stage
*/
            WithCreate withTargetServiceTopologyId(String targetServiceTopologyId);
        }

        /**
         * The stage of the rollout definition allowing to specify ArtifactSourceId.
         */
        interface WithArtifactSourceId {
            /**
             * Specifies artifactSourceId.
             * @param artifactSourceId The reference to the artifact source resource Id where the payload is located
             * @return the next definition stage
             */
            WithCreate withArtifactSourceId(String artifactSourceId);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Rollout>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithArtifactSourceId {
        }
    }
    /**
     * The template for a Rollout update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Rollout>, Resource.UpdateWithTags<Update>, UpdateStages.WithArtifactSourceId {
    }

    /**
     * Grouping of Rollout update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the rollout update allowing to specify ArtifactSourceId.
         */
        interface WithArtifactSourceId {
            /**
             * Specifies artifactSourceId.
             * @param artifactSourceId The reference to the artifact source resource Id where the payload is located
             * @return the next update stage
             */
            Update withArtifactSourceId(String artifactSourceId);
        }

    }
}
