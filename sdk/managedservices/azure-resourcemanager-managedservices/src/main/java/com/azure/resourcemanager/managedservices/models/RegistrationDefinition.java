// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedservices.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.managedservices.fluent.models.RegistrationDefinitionInner;

/** An immutable client-side representation of RegistrationDefinition. */
public interface RegistrationDefinition {
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
     * Gets the properties property: The properties of a registration definition.
     *
     * @return the properties value.
     */
    RegistrationDefinitionProperties properties();

    /**
     * Gets the plan property: The details for the Managed Services offer’s plan in Azure Marketplace.
     *
     * @return the plan value.
     */
    Plan plan();

    /**
     * Gets the inner com.azure.resourcemanager.managedservices.fluent.models.RegistrationDefinitionInner object.
     *
     * @return the inner object.
     */
    RegistrationDefinitionInner innerModel();

    /** The entirety of the RegistrationDefinition definition. */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithScope, DefinitionStages.WithCreate {
    }
    /** The RegistrationDefinition definition stages. */
    interface DefinitionStages {
        /** The first stage of the RegistrationDefinition definition. */
        interface Blank extends WithScope {
        }
        /** The stage of the RegistrationDefinition definition allowing to specify parent resource. */
        interface WithScope {
            /**
             * Specifies scope.
             *
             * @param scope The scope of the resource.
             * @return the next definition stage.
             */
            WithCreate withExistingScope(String scope);
        }
        /**
         * The stage of the RegistrationDefinition definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithProperties, DefinitionStages.WithPlan {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            RegistrationDefinition create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            RegistrationDefinition create(Context context);
        }
        /** The stage of the RegistrationDefinition definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: The properties of a registration definition..
             *
             * @param properties The properties of a registration definition.
             * @return the next definition stage.
             */
            WithCreate withProperties(RegistrationDefinitionProperties properties);
        }
        /** The stage of the RegistrationDefinition definition allowing to specify plan. */
        interface WithPlan {
            /**
             * Specifies the plan property: The details for the Managed Services offer’s plan in Azure Marketplace..
             *
             * @param plan The details for the Managed Services offer’s plan in Azure Marketplace.
             * @return the next definition stage.
             */
            WithCreate withPlan(Plan plan);
        }
    }
    /**
     * Begins update for the RegistrationDefinition resource.
     *
     * @return the stage of resource update.
     */
    RegistrationDefinition.Update update();

    /** The template for RegistrationDefinition update. */
    interface Update extends UpdateStages.WithProperties, UpdateStages.WithPlan {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        RegistrationDefinition apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        RegistrationDefinition apply(Context context);
    }
    /** The RegistrationDefinition update stages. */
    interface UpdateStages {
        /** The stage of the RegistrationDefinition update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: The properties of a registration definition..
             *
             * @param properties The properties of a registration definition.
             * @return the next definition stage.
             */
            Update withProperties(RegistrationDefinitionProperties properties);
        }
        /** The stage of the RegistrationDefinition update allowing to specify plan. */
        interface WithPlan {
            /**
             * Specifies the plan property: The details for the Managed Services offer’s plan in Azure Marketplace..
             *
             * @param plan The details for the Managed Services offer’s plan in Azure Marketplace.
             * @return the next definition stage.
             */
            Update withPlan(Plan plan);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    RegistrationDefinition refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    RegistrationDefinition refresh(Context context);
}
