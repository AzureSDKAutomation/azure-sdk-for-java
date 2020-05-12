/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview.implementation.DesktopVirtualizationManager;
import java.util.List;
import com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview.implementation.HostPoolInner;

/**
 * Type representing HostPool.
 */
public interface HostPool extends HasInner<HostPoolInner>, Resource, GroupableResourceCore<DesktopVirtualizationManager, HostPoolInner>, HasResourceGroup, Refreshable<HostPool>, Updatable<HostPool.Update>, HasManager<DesktopVirtualizationManager> {
    /**
     * @return the applicationGroupReferences value.
     */
    List<String> applicationGroupReferences();

    /**
     * @return the customRdpProperty value.
     */
    String customRdpProperty();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the friendlyName value.
     */
    String friendlyName();

    /**
     * @return the hostPoolType value.
     */
    HostPoolType hostPoolType();

    /**
     * @return the loadBalancerType value.
     */
    LoadBalancerType loadBalancerType();

    /**
     * @return the maxSessionLimit value.
     */
    Integer maxSessionLimit();

    /**
     * @return the personalDesktopAssignmentType value.
     */
    PersonalDesktopAssignmentType personalDesktopAssignmentType();

    /**
     * @return the registrationInfo value.
     */
    RegistrationInfo registrationInfo();

    /**
     * @return the ring value.
     */
    Integer ring();

    /**
     * @return the ssoContext value.
     */
    String ssoContext();

    /**
     * @return the validationEnvironment value.
     */
    Boolean validationEnvironment();

    /**
     * @return the vmTemplate value.
     */
    String vmTemplate();

    /**
     * The entirety of the HostPool definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithHostPoolType, DefinitionStages.WithLoadBalancerType, DefinitionStages.WithPersonalDesktopAssignmentType, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of HostPool definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a HostPool definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the HostPool definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithHostPoolType> {
        }

        /**
         * The stage of the hostpool definition allowing to specify HostPoolType.
         */
        interface WithHostPoolType {
           /**
            * Specifies hostPoolType.
            * @param hostPoolType HostPool type for desktop. Possible values include: 'Personal', 'Pooled'
            * @return the next definition stage
*/
            WithLoadBalancerType withHostPoolType(HostPoolType hostPoolType);
        }

        /**
         * The stage of the hostpool definition allowing to specify LoadBalancerType.
         */
        interface WithLoadBalancerType {
           /**
            * Specifies loadBalancerType.
            * @param loadBalancerType The type of the load balancer. Possible values include: 'BreadthFirst', 'DepthFirst', 'Persistent'
            * @return the next definition stage
*/
            WithPersonalDesktopAssignmentType withLoadBalancerType(LoadBalancerType loadBalancerType);
        }

        /**
         * The stage of the hostpool definition allowing to specify PersonalDesktopAssignmentType.
         */
        interface WithPersonalDesktopAssignmentType {
           /**
            * Specifies personalDesktopAssignmentType.
            * @param personalDesktopAssignmentType PersonalDesktopAssignment type for HostPool. Possible values include: 'Automatic', 'Direct'
            * @return the next definition stage
*/
            WithCreate withPersonalDesktopAssignmentType(PersonalDesktopAssignmentType personalDesktopAssignmentType);
        }

        /**
         * The stage of the hostpool definition allowing to specify CustomRdpProperty.
         */
        interface WithCustomRdpProperty {
            /**
             * Specifies customRdpProperty.
             * @param customRdpProperty Custom rdp property of HostPool
             * @return the next definition stage
             */
            WithCreate withCustomRdpProperty(String customRdpProperty);
        }

        /**
         * The stage of the hostpool definition allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description Description of HostPool
             * @return the next definition stage
             */
            WithCreate withDescription(String description);
        }

        /**
         * The stage of the hostpool definition allowing to specify FriendlyName.
         */
        interface WithFriendlyName {
            /**
             * Specifies friendlyName.
             * @param friendlyName Friendly name of HostPool
             * @return the next definition stage
             */
            WithCreate withFriendlyName(String friendlyName);
        }

        /**
         * The stage of the hostpool definition allowing to specify MaxSessionLimit.
         */
        interface WithMaxSessionLimit {
            /**
             * Specifies maxSessionLimit.
             * @param maxSessionLimit The max session limit of HostPool
             * @return the next definition stage
             */
            WithCreate withMaxSessionLimit(Integer maxSessionLimit);
        }

        /**
         * The stage of the hostpool definition allowing to specify RegistrationInfo.
         */
        interface WithRegistrationInfo {
            /**
             * Specifies registrationInfo.
             * @param registrationInfo The registration info of HostPool
             * @return the next definition stage
             */
            WithCreate withRegistrationInfo(RegistrationInfo registrationInfo);
        }

        /**
         * The stage of the hostpool definition allowing to specify Ring.
         */
        interface WithRing {
            /**
             * Specifies ring.
             * @param ring The ring number of HostPool
             * @return the next definition stage
             */
            WithCreate withRing(Integer ring);
        }

        /**
         * The stage of the hostpool definition allowing to specify SsoContext.
         */
        interface WithSsoContext {
            /**
             * Specifies ssoContext.
             * @param ssoContext Path to keyvault containing ssoContext secret
             * @return the next definition stage
             */
            WithCreate withSsoContext(String ssoContext);
        }

        /**
         * The stage of the hostpool definition allowing to specify ValidationEnvironment.
         */
        interface WithValidationEnvironment {
            /**
             * Specifies validationEnvironment.
             * @param validationEnvironment Is validation environment
             * @return the next definition stage
             */
            WithCreate withValidationEnvironment(Boolean validationEnvironment);
        }

        /**
         * The stage of the hostpool definition allowing to specify VmTemplate.
         */
        interface WithVmTemplate {
            /**
             * Specifies vmTemplate.
             * @param vmTemplate VM template for sessionhosts configuration within hostpool
             * @return the next definition stage
             */
            WithCreate withVmTemplate(String vmTemplate);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<HostPool>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithCustomRdpProperty, DefinitionStages.WithDescription, DefinitionStages.WithFriendlyName, DefinitionStages.WithMaxSessionLimit, DefinitionStages.WithRegistrationInfo, DefinitionStages.WithRing, DefinitionStages.WithSsoContext, DefinitionStages.WithValidationEnvironment, DefinitionStages.WithVmTemplate {
        }
    }
    /**
     * The template for a HostPool update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<HostPool>, Resource.UpdateWithTags<Update>, UpdateStages.WithCustomRdpProperty, UpdateStages.WithDescription, UpdateStages.WithFriendlyName, UpdateStages.WithLoadBalancerType, UpdateStages.WithMaxSessionLimit, UpdateStages.WithPersonalDesktopAssignmentType, UpdateStages.WithRegistrationInfo, UpdateStages.WithRing, UpdateStages.WithSsoContext, UpdateStages.WithValidationEnvironment {
    }

    /**
     * Grouping of HostPool update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the hostpool update allowing to specify CustomRdpProperty.
         */
        interface WithCustomRdpProperty {
            /**
             * Specifies customRdpProperty.
             * @param customRdpProperty Custom rdp property of HostPool
             * @return the next update stage
             */
            Update withCustomRdpProperty(String customRdpProperty);
        }

        /**
         * The stage of the hostpool update allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description Description of HostPool
             * @return the next update stage
             */
            Update withDescription(String description);
        }

        /**
         * The stage of the hostpool update allowing to specify FriendlyName.
         */
        interface WithFriendlyName {
            /**
             * Specifies friendlyName.
             * @param friendlyName Friendly name of HostPool
             * @return the next update stage
             */
            Update withFriendlyName(String friendlyName);
        }

        /**
         * The stage of the hostpool update allowing to specify LoadBalancerType.
         */
        interface WithLoadBalancerType {
            /**
             * Specifies loadBalancerType.
             * @param loadBalancerType The type of the load balancer. Possible values include: 'BreadthFirst', 'DepthFirst', 'Persistent'
             * @return the next update stage
             */
            Update withLoadBalancerType(LoadBalancerType loadBalancerType);
        }

        /**
         * The stage of the hostpool update allowing to specify MaxSessionLimit.
         */
        interface WithMaxSessionLimit {
            /**
             * Specifies maxSessionLimit.
             * @param maxSessionLimit The max session limit of HostPool
             * @return the next update stage
             */
            Update withMaxSessionLimit(Integer maxSessionLimit);
        }

        /**
         * The stage of the hostpool update allowing to specify PersonalDesktopAssignmentType.
         */
        interface WithPersonalDesktopAssignmentType {
            /**
             * Specifies personalDesktopAssignmentType.
             * @param personalDesktopAssignmentType PersonalDesktopAssignment type for HostPool. Possible values include: 'Automatic', 'Direct'
             * @return the next update stage
             */
            Update withPersonalDesktopAssignmentType(PersonalDesktopAssignmentType personalDesktopAssignmentType);
        }

        /**
         * The stage of the hostpool update allowing to specify RegistrationInfo.
         */
        interface WithRegistrationInfo {
            /**
             * Specifies registrationInfo.
             * @param registrationInfo The registration info of HostPool
             * @return the next update stage
             */
            Update withRegistrationInfo(RegistrationInfoPatch registrationInfo);
        }

        /**
         * The stage of the hostpool update allowing to specify Ring.
         */
        interface WithRing {
            /**
             * Specifies ring.
             * @param ring The ring number of HostPool
             * @return the next update stage
             */
            Update withRing(Integer ring);
        }

        /**
         * The stage of the hostpool update allowing to specify SsoContext.
         */
        interface WithSsoContext {
            /**
             * Specifies ssoContext.
             * @param ssoContext Path to keyvault containing ssoContext secret
             * @return the next update stage
             */
            Update withSsoContext(String ssoContext);
        }

        /**
         * The stage of the hostpool update allowing to specify ValidationEnvironment.
         */
        interface WithValidationEnvironment {
            /**
             * Specifies validationEnvironment.
             * @param validationEnvironment Is validation environment
             * @return the next update stage
             */
            Update withValidationEnvironment(Boolean validationEnvironment);
        }

    }
}
