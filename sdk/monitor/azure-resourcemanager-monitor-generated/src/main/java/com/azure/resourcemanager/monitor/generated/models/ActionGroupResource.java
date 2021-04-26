// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.generated.fluent.models.ActionGroupResourceInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of ActionGroupResource. */
public interface ActionGroupResource {
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
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the kind property: Azure resource kind.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the identity property: Azure resource identity.
     *
     * @return the identity value.
     */
    String identity();

    /**
     * Gets the groupShortName property: The short name of the action group. This will be used in SMS messages.
     *
     * @return the groupShortName value.
     */
    String groupShortName();

    /**
     * Gets the enabled property: Indicates whether this action group is enabled. If an action group is not enabled,
     * then none of its receivers will receive communications.
     *
     * @return the enabled value.
     */
    Boolean enabled();

    /**
     * Gets the emailReceivers property: The list of email receivers that are part of this action group.
     *
     * @return the emailReceivers value.
     */
    List<EmailReceiver> emailReceivers();

    /**
     * Gets the smsReceivers property: The list of SMS receivers that are part of this action group.
     *
     * @return the smsReceivers value.
     */
    List<SmsReceiver> smsReceivers();

    /**
     * Gets the webhookReceivers property: The list of webhook receivers that are part of this action group.
     *
     * @return the webhookReceivers value.
     */
    List<WebhookReceiver> webhookReceivers();

    /**
     * Gets the itsmReceivers property: The list of ITSM receivers that are part of this action group.
     *
     * @return the itsmReceivers value.
     */
    List<ItsmReceiver> itsmReceivers();

    /**
     * Gets the azureAppPushReceivers property: The list of AzureAppPush receivers that are part of this action group.
     *
     * @return the azureAppPushReceivers value.
     */
    List<AzureAppPushReceiver> azureAppPushReceivers();

    /**
     * Gets the automationRunbookReceivers property: The list of AutomationRunbook receivers that are part of this
     * action group.
     *
     * @return the automationRunbookReceivers value.
     */
    List<AutomationRunbookReceiver> automationRunbookReceivers();

    /**
     * Gets the voiceReceivers property: The list of voice receivers that are part of this action group.
     *
     * @return the voiceReceivers value.
     */
    List<VoiceReceiver> voiceReceivers();

    /**
     * Gets the logicAppReceivers property: The list of logic app receivers that are part of this action group.
     *
     * @return the logicAppReceivers value.
     */
    List<LogicAppReceiver> logicAppReceivers();

    /**
     * Gets the azureFunctionReceivers property: The list of azure function receivers that are part of this action
     * group.
     *
     * @return the azureFunctionReceivers value.
     */
    List<AzureFunctionReceiver> azureFunctionReceivers();

    /**
     * Gets the armRoleReceivers property: The list of ARM role receivers that are part of this action group. Roles are
     * Azure RBAC roles and only built-in roles are supported.
     *
     * @return the armRoleReceivers value.
     */
    List<ArmRoleReceiver> armRoleReceivers();

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
     * Gets the inner com.azure.resourcemanager.monitor.generated.fluent.models.ActionGroupResourceInner object.
     *
     * @return the inner object.
     */
    ActionGroupResourceInner innerModel();

    /** The entirety of the ActionGroupResource definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The ActionGroupResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the ActionGroupResource definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the ActionGroupResource definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the ActionGroupResource definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the ActionGroupResource definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithGroupShortName,
                DefinitionStages.WithEnabled,
                DefinitionStages.WithEmailReceivers,
                DefinitionStages.WithSmsReceivers,
                DefinitionStages.WithWebhookReceivers,
                DefinitionStages.WithItsmReceivers,
                DefinitionStages.WithAzureAppPushReceivers,
                DefinitionStages.WithAutomationRunbookReceivers,
                DefinitionStages.WithVoiceReceivers,
                DefinitionStages.WithLogicAppReceivers,
                DefinitionStages.WithAzureFunctionReceivers,
                DefinitionStages.WithArmRoleReceivers {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ActionGroupResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ActionGroupResource create(Context context);
        }
        /** The stage of the ActionGroupResource definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the ActionGroupResource definition allowing to specify groupShortName. */
        interface WithGroupShortName {
            /**
             * Specifies the groupShortName property: The short name of the action group. This will be used in SMS
             * messages..
             *
             * @param groupShortName The short name of the action group. This will be used in SMS messages.
             * @return the next definition stage.
             */
            WithCreate withGroupShortName(String groupShortName);
        }
        /** The stage of the ActionGroupResource definition allowing to specify enabled. */
        interface WithEnabled {
            /**
             * Specifies the enabled property: Indicates whether this action group is enabled. If an action group is not
             * enabled, then none of its receivers will receive communications..
             *
             * @param enabled Indicates whether this action group is enabled. If an action group is not enabled, then
             *     none of its receivers will receive communications.
             * @return the next definition stage.
             */
            WithCreate withEnabled(Boolean enabled);
        }
        /** The stage of the ActionGroupResource definition allowing to specify emailReceivers. */
        interface WithEmailReceivers {
            /**
             * Specifies the emailReceivers property: The list of email receivers that are part of this action group..
             *
             * @param emailReceivers The list of email receivers that are part of this action group.
             * @return the next definition stage.
             */
            WithCreate withEmailReceivers(List<EmailReceiver> emailReceivers);
        }
        /** The stage of the ActionGroupResource definition allowing to specify smsReceivers. */
        interface WithSmsReceivers {
            /**
             * Specifies the smsReceivers property: The list of SMS receivers that are part of this action group..
             *
             * @param smsReceivers The list of SMS receivers that are part of this action group.
             * @return the next definition stage.
             */
            WithCreate withSmsReceivers(List<SmsReceiver> smsReceivers);
        }
        /** The stage of the ActionGroupResource definition allowing to specify webhookReceivers. */
        interface WithWebhookReceivers {
            /**
             * Specifies the webhookReceivers property: The list of webhook receivers that are part of this action
             * group..
             *
             * @param webhookReceivers The list of webhook receivers that are part of this action group.
             * @return the next definition stage.
             */
            WithCreate withWebhookReceivers(List<WebhookReceiver> webhookReceivers);
        }
        /** The stage of the ActionGroupResource definition allowing to specify itsmReceivers. */
        interface WithItsmReceivers {
            /**
             * Specifies the itsmReceivers property: The list of ITSM receivers that are part of this action group..
             *
             * @param itsmReceivers The list of ITSM receivers that are part of this action group.
             * @return the next definition stage.
             */
            WithCreate withItsmReceivers(List<ItsmReceiver> itsmReceivers);
        }
        /** The stage of the ActionGroupResource definition allowing to specify azureAppPushReceivers. */
        interface WithAzureAppPushReceivers {
            /**
             * Specifies the azureAppPushReceivers property: The list of AzureAppPush receivers that are part of this
             * action group..
             *
             * @param azureAppPushReceivers The list of AzureAppPush receivers that are part of this action group.
             * @return the next definition stage.
             */
            WithCreate withAzureAppPushReceivers(List<AzureAppPushReceiver> azureAppPushReceivers);
        }
        /** The stage of the ActionGroupResource definition allowing to specify automationRunbookReceivers. */
        interface WithAutomationRunbookReceivers {
            /**
             * Specifies the automationRunbookReceivers property: The list of AutomationRunbook receivers that are part
             * of this action group..
             *
             * @param automationRunbookReceivers The list of AutomationRunbook receivers that are part of this action
             *     group.
             * @return the next definition stage.
             */
            WithCreate withAutomationRunbookReceivers(List<AutomationRunbookReceiver> automationRunbookReceivers);
        }
        /** The stage of the ActionGroupResource definition allowing to specify voiceReceivers. */
        interface WithVoiceReceivers {
            /**
             * Specifies the voiceReceivers property: The list of voice receivers that are part of this action group..
             *
             * @param voiceReceivers The list of voice receivers that are part of this action group.
             * @return the next definition stage.
             */
            WithCreate withVoiceReceivers(List<VoiceReceiver> voiceReceivers);
        }
        /** The stage of the ActionGroupResource definition allowing to specify logicAppReceivers. */
        interface WithLogicAppReceivers {
            /**
             * Specifies the logicAppReceivers property: The list of logic app receivers that are part of this action
             * group..
             *
             * @param logicAppReceivers The list of logic app receivers that are part of this action group.
             * @return the next definition stage.
             */
            WithCreate withLogicAppReceivers(List<LogicAppReceiver> logicAppReceivers);
        }
        /** The stage of the ActionGroupResource definition allowing to specify azureFunctionReceivers. */
        interface WithAzureFunctionReceivers {
            /**
             * Specifies the azureFunctionReceivers property: The list of azure function receivers that are part of this
             * action group..
             *
             * @param azureFunctionReceivers The list of azure function receivers that are part of this action group.
             * @return the next definition stage.
             */
            WithCreate withAzureFunctionReceivers(List<AzureFunctionReceiver> azureFunctionReceivers);
        }
        /** The stage of the ActionGroupResource definition allowing to specify armRoleReceivers. */
        interface WithArmRoleReceivers {
            /**
             * Specifies the armRoleReceivers property: The list of ARM role receivers that are part of this action
             * group. Roles are Azure RBAC roles and only built-in roles are supported..
             *
             * @param armRoleReceivers The list of ARM role receivers that are part of this action group. Roles are
             *     Azure RBAC roles and only built-in roles are supported.
             * @return the next definition stage.
             */
            WithCreate withArmRoleReceivers(List<ArmRoleReceiver> armRoleReceivers);
        }
    }
    /**
     * Begins update for the ActionGroupResource resource.
     *
     * @return the stage of resource update.
     */
    ActionGroupResource.Update update();

    /** The template for ActionGroupResource update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithEnabled {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ActionGroupResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ActionGroupResource apply(Context context);
    }
    /** The ActionGroupResource update stages. */
    interface UpdateStages {
        /** The stage of the ActionGroupResource update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the ActionGroupResource update allowing to specify enabled. */
        interface WithEnabled {
            /**
             * Specifies the enabled property: Indicates whether this action group is enabled. If an action group is not
             * enabled, then none of its actions will be activated..
             *
             * @param enabled Indicates whether this action group is enabled. If an action group is not enabled, then
             *     none of its actions will be activated.
             * @return the next definition stage.
             */
            Update withEnabled(Boolean enabled);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ActionGroupResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ActionGroupResource refresh(Context context);
}
