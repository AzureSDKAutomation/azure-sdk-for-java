/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.apimanagement.v2019_01_01.implementation.SubscriptionContractInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.apimanagement.v2019_01_01.implementation.ApiManagementManager;
import org.joda.time.DateTime;

/**
 * Type representing SubscriptionContract.
 */
public interface SubscriptionContract extends HasInner<SubscriptionContractInner>, Indexable, Updatable<SubscriptionContract.Update>, HasManager<ApiManagementManager> {
    /**
     * @return the allowTracing value.
     */
    Boolean allowTracing();

    /**
     * @return the createdDate value.
     */
    DateTime createdDate();

    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the endDate value.
     */
    DateTime endDate();

    /**
     * @return the expirationDate value.
     */
    DateTime expirationDate();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the notificationDate value.
     */
    DateTime notificationDate();

    /**
     * @return the ownerId value.
     */
    String ownerId();

    /**
     * @return the primaryKey value.
     */
    String primaryKey();

    /**
     * @return the scope value.
     */
    String scope();

    /**
     * @return the secondaryKey value.
     */
    String secondaryKey();

    /**
     * @return the startDate value.
     */
    DateTime startDate();

    /**
     * @return the state value.
     */
    SubscriptionState state();

    /**
     * @return the stateComment value.
     */
    String stateComment();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the SubscriptionContract definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithResourceGroupName, DefinitionStages.WithServiceName, DefinitionStages.WithNotify, DefinitionStages.WithIfMatch, DefinitionStages.WithDisplayName, DefinitionStages.WithScope, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of SubscriptionContract definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a SubscriptionContract definition.
         */
        interface Blank extends WithResourceGroupName {
        }

        /**
         * The stage of the subscriptioncontract definition allowing to specify ResourceGroupName.
         */
        interface WithResourceGroupName {
           /**
            * Specifies resourceGroupName.
            * @param resourceGroupName The name of the resource group
            * @return the next definition stage
            */
            WithServiceName withResourceGroupName(String resourceGroupName);
        }

        /**
         * The stage of the subscriptioncontract definition allowing to specify ServiceName.
         */
        interface WithServiceName {
           /**
            * Specifies serviceName.
            * @param serviceName The name of the API Management service
            * @return the next definition stage
            */
            WithNotify withServiceName(String serviceName);
        }

        /**
         * The stage of the subscriptioncontract definition allowing to specify Notify.
         */
        interface WithNotify {
           /**
            * Specifies notify.
            * @param notify Notify change in Subscription State.
  - If false, do not send any email notification for change of state of subscription
  - If true, send email notification of change of state of subscription
            * @return the next definition stage
            */
            WithIfMatch withNotify(Boolean notify);
        }

        /**
         * The stage of the subscriptioncontract definition allowing to specify IfMatch.
         */
        interface WithIfMatch {
           /**
            * Specifies ifMatch.
            * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity
            * @return the next definition stage
            */
            WithDisplayName withIfMatch(String ifMatch);
        }

        /**
         * The stage of the subscriptioncontract definition allowing to specify DisplayName.
         */
        interface WithDisplayName {
           /**
            * Specifies displayName.
            * @param displayName Subscription name
            * @return the next definition stage
            */
            WithScope withDisplayName(String displayName);
        }

        /**
         * The stage of the subscriptioncontract definition allowing to specify Scope.
         */
        interface WithScope {
           /**
            * Specifies scope.
            * @param scope Scope like /products/{productId} or /apis or /apis/{apiId}
            * @return the next definition stage
            */
            WithCreate withScope(String scope);
        }

        /**
         * The stage of the subscriptioncontract definition allowing to specify AllowTracing.
         */
        interface WithAllowTracing {
            /**
             * Specifies allowTracing.
             * @param allowTracing Determines whether tracing can be enabled
             * @return the next definition stage
             */
            WithCreate withAllowTracing(Boolean allowTracing);
        }

        /**
         * The stage of the subscriptioncontract definition allowing to specify OwnerId.
         */
        interface WithOwnerId {
            /**
             * Specifies ownerId.
             * @param ownerId User (user id path) for whom subscription is being created in form /users/{userId}
             * @return the next definition stage
             */
            WithCreate withOwnerId(String ownerId);
        }

        /**
         * The stage of the subscriptioncontract definition allowing to specify PrimaryKey.
         */
        interface WithPrimaryKey {
            /**
             * Specifies primaryKey.
             * @param primaryKey Primary subscription key. If not specified during request key will be generated automatically
             * @return the next definition stage
             */
            WithCreate withPrimaryKey(String primaryKey);
        }

        /**
         * The stage of the subscriptioncontract definition allowing to specify SecondaryKey.
         */
        interface WithSecondaryKey {
            /**
             * Specifies secondaryKey.
             * @param secondaryKey Secondary subscription key. If not specified during request key will be generated automatically
             * @return the next definition stage
             */
            WithCreate withSecondaryKey(String secondaryKey);
        }

        /**
         * The stage of the subscriptioncontract definition allowing to specify State.
         */
        interface WithState {
            /**
             * Specifies state.
             * @param state Initial subscription state. If no value is specified, subscription is created with Submitted state. Possible states are * active – the subscription is active, * suspended – the subscription is blocked, and the subscriber cannot call any APIs of the product, * submitted – the subscription request has been made by the developer, but has not yet been approved or rejected, * rejected – the subscription request has been denied by an administrator, * cancelled – the subscription has been cancelled by the developer or administrator, * expired – the subscription reached its expiration date and was deactivated. Possible values include: 'suspended', 'active', 'expired', 'submitted', 'rejected', 'cancelled'
             * @return the next definition stage
             */
            WithCreate withState(SubscriptionState state);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<SubscriptionContract>, DefinitionStages.WithAllowTracing, DefinitionStages.WithOwnerId, DefinitionStages.WithPrimaryKey, DefinitionStages.WithSecondaryKey, DefinitionStages.WithState {
        }
    }
    /**
     * The template for a SubscriptionContract update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<SubscriptionContract>, UpdateStages.WithNotify, UpdateStages.WithIfMatch, UpdateStages.WithAllowTracing, UpdateStages.WithOwnerId, UpdateStages.WithPrimaryKey, UpdateStages.WithSecondaryKey, UpdateStages.WithState {
    }

    /**
     * Grouping of SubscriptionContract update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the subscriptioncontract update allowing to specify Notify.
         */
        interface WithNotify {
            /**
             * Specifies notify.
             * @param notify Notify change in Subscription State.
  - If false, do not send any email notification for change of state of subscription
  - If true, send email notification of change of state of subscription
             * @return the next update stage
             */
            Update withNotify(Boolean notify);
        }

        /**
         * The stage of the subscriptioncontract update allowing to specify IfMatch.
         */
        interface WithIfMatch {
            /**
             * Specifies ifMatch.
             * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity
             * @return the next update stage
             */
            Update withIfMatch(String ifMatch);
        }

        /**
         * The stage of the subscriptioncontract update allowing to specify AllowTracing.
         */
        interface WithAllowTracing {
            /**
             * Specifies allowTracing.
             * @param allowTracing Determines whether tracing can be enabled
             * @return the next update stage
             */
            Update withAllowTracing(Boolean allowTracing);
        }

        /**
         * The stage of the subscriptioncontract update allowing to specify OwnerId.
         */
        interface WithOwnerId {
            /**
             * Specifies ownerId.
             * @param ownerId User (user id path) for whom subscription is being created in form /users/{userId}
             * @return the next update stage
             */
            Update withOwnerId(String ownerId);
        }

        /**
         * The stage of the subscriptioncontract update allowing to specify PrimaryKey.
         */
        interface WithPrimaryKey {
            /**
             * Specifies primaryKey.
             * @param primaryKey Primary subscription key. If not specified during request key will be generated automatically
             * @return the next update stage
             */
            Update withPrimaryKey(String primaryKey);
        }

        /**
         * The stage of the subscriptioncontract update allowing to specify SecondaryKey.
         */
        interface WithSecondaryKey {
            /**
             * Specifies secondaryKey.
             * @param secondaryKey Secondary subscription key. If not specified during request key will be generated automatically
             * @return the next update stage
             */
            Update withSecondaryKey(String secondaryKey);
        }

        /**
         * The stage of the subscriptioncontract update allowing to specify State.
         */
        interface WithState {
            /**
             * Specifies state.
             * @param state Initial subscription state. If no value is specified, subscription is created with Submitted state. Possible states are * active – the subscription is active, * suspended – the subscription is blocked, and the subscriber cannot call any APIs of the product, * submitted – the subscription request has been made by the developer, but has not yet been approved or rejected, * rejected – the subscription request has been denied by an administrator, * cancelled – the subscription has been cancelled by the developer or administrator, * expired – the subscription reached its expiration date and was deactivated. Possible values include: 'suspended', 'active', 'expired', 'submitted', 'rejected', 'cancelled'
             * @return the next update stage
             */
            Update withState(SubscriptionState state);
        }

    }
}
