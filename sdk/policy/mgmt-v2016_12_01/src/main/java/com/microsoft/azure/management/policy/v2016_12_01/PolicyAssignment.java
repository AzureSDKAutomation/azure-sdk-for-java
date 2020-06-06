/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policy.v2016_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.policy.v2016_12_01.implementation.PolicyAssignmentInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.policy.v2016_12_01.implementation.PolicyManager;

/**
 * Type representing PolicyAssignment.
 */
public interface PolicyAssignment extends HasInner<PolicyAssignmentInner>, Indexable, Updatable<PolicyAssignment.Update>, Refreshable<PolicyAssignment>, HasManager<PolicyManager> {
    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the parameters value.
     */
    Object parameters();

    /**
     * @return the policyDefinitionId value.
     */
    String policyDefinitionId();

    /**
     * @return the scopeProperty value.
     */
    String scopeProperty();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the PolicyAssignment definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithScope, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of PolicyAssignment definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a PolicyAssignment definition.
         */
        interface Blank extends WithScope {
        }

        /**
         * The stage of the policyassignment definition allowing to specify Scope.
         */
        interface WithScope {
           /**
            * Specifies scope.
            * @param scope The scope of the policy assignment
            * @return the next definition stage
            */
            WithCreate withScope(String scope);
        }

        /**
         * The stage of the policyassignment definition allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description This message will be part of response in case of policy violation
             * @return the next definition stage
             */
            WithCreate withDescription(String description);
        }

        /**
         * The stage of the policyassignment definition allowing to specify DisplayName.
         */
        interface WithDisplayName {
            /**
             * Specifies displayName.
             * @param displayName The display name of the policy assignment
             * @return the next definition stage
             */
            WithCreate withDisplayName(String displayName);
        }

        /**
         * The stage of the policyassignment definition allowing to specify Parameters.
         */
        interface WithParameters {
            /**
             * Specifies parameters.
             * @param parameters Required if a parameter is used in policy rule
             * @return the next definition stage
             */
            WithCreate withParameters(Object parameters);
        }

        /**
         * The stage of the policyassignment definition allowing to specify PolicyDefinitionId.
         */
        interface WithPolicyDefinitionId {
            /**
             * Specifies policyDefinitionId.
             * @param policyDefinitionId The ID of the policy definition
             * @return the next definition stage
             */
            WithCreate withPolicyDefinitionId(String policyDefinitionId);
        }

        /**
         * The stage of the policyassignment definition allowing to specify ScopeProperty.
         */
        interface WithScopeProperty {
            /**
             * Specifies scopeProperty.
             * @param scopeProperty The scope for the policy assignment
             * @return the next definition stage
             */
            WithCreate withScopeProperty(String scopeProperty);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<PolicyAssignment>, DefinitionStages.WithDescription, DefinitionStages.WithDisplayName, DefinitionStages.WithParameters, DefinitionStages.WithPolicyDefinitionId, DefinitionStages.WithScopeProperty {
        }
    }
    /**
     * The template for a PolicyAssignment update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<PolicyAssignment>, UpdateStages.WithDescription, UpdateStages.WithDisplayName, UpdateStages.WithParameters, UpdateStages.WithPolicyDefinitionId, UpdateStages.WithScopeProperty {
    }

    /**
     * Grouping of PolicyAssignment update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the policyassignment update allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description This message will be part of response in case of policy violation
             * @return the next update stage
             */
            Update withDescription(String description);
        }

        /**
         * The stage of the policyassignment update allowing to specify DisplayName.
         */
        interface WithDisplayName {
            /**
             * Specifies displayName.
             * @param displayName The display name of the policy assignment
             * @return the next update stage
             */
            Update withDisplayName(String displayName);
        }

        /**
         * The stage of the policyassignment update allowing to specify Parameters.
         */
        interface WithParameters {
            /**
             * Specifies parameters.
             * @param parameters Required if a parameter is used in policy rule
             * @return the next update stage
             */
            Update withParameters(Object parameters);
        }

        /**
         * The stage of the policyassignment update allowing to specify PolicyDefinitionId.
         */
        interface WithPolicyDefinitionId {
            /**
             * Specifies policyDefinitionId.
             * @param policyDefinitionId The ID of the policy definition
             * @return the next update stage
             */
            Update withPolicyDefinitionId(String policyDefinitionId);
        }

        /**
         * The stage of the policyassignment update allowing to specify ScopeProperty.
         */
        interface WithScopeProperty {
            /**
             * Specifies scopeProperty.
             * @param scopeProperty The scope for the policy assignment
             * @return the next update stage
             */
            Update withScopeProperty(String scopeProperty);
        }

    }
}
