/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.compute.v2020_06_01.implementation.VirtualMachineScaleSetVMExtensionInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.compute.v2020_06_01.implementation.ComputeManager;

/**
 * Type representing VirtualMachineScaleSetVMExtension.
 */
public interface VirtualMachineScaleSetVMExtension extends HasInner<VirtualMachineScaleSetVMExtensionInner>, Indexable, Refreshable<VirtualMachineScaleSetVMExtension>, Updatable<VirtualMachineScaleSetVMExtension.Update>, HasManager<ComputeManager> {
    /**
     * @return the autoUpgradeMinorVersion value.
     */
    Boolean autoUpgradeMinorVersion();

    /**
     * @return the enableAutomaticUpgrade value.
     */
    Boolean enableAutomaticUpgrade();

    /**
     * @return the forceUpdateTag value.
     */
    String forceUpdateTag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the instanceView value.
     */
    VirtualMachineExtensionInstanceView instanceView();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the protectedSettings value.
     */
    Object protectedSettings();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the publisher value.
     */
    String publisher();

    /**
     * @return the settings value.
     */
    Object settings();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the type1 value.
     */
    String type1();

    /**
     * @return the typeHandlerVersion value.
     */
    String typeHandlerVersion();

    /**
     * The entirety of the VirtualMachineScaleSetVMExtension definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithVirtualmachine, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of VirtualMachineScaleSetVMExtension definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a VirtualMachineScaleSetVMExtension definition.
         */
        interface Blank extends WithVirtualmachine {
        }

        /**
         * The stage of the virtualmachinescalesetvmextension definition allowing to specify Virtualmachine.
         */
        interface WithVirtualmachine {
           /**
            * Specifies resourceGroupName, vmScaleSetName, instanceId.
            * @param resourceGroupName The name of the resource group
            * @param vmScaleSetName The name of the VM scale set
            * @param instanceId The instance ID of the virtual machine
            * @return the next definition stage
            */
            WithCreate withExistingVirtualmachine(String resourceGroupName, String vmScaleSetName, String instanceId);
        }

        /**
         * The stage of the virtualmachinescalesetvmextension definition allowing to specify AutoUpgradeMinorVersion.
         */
        interface WithAutoUpgradeMinorVersion {
            /**
             * Specifies autoUpgradeMinorVersion.
             * @param autoUpgradeMinorVersion Indicates whether the extension should use a newer minor version if one is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set to true
             * @return the next definition stage
             */
            WithCreate withAutoUpgradeMinorVersion(Boolean autoUpgradeMinorVersion);
        }

        /**
         * The stage of the virtualmachinescalesetvmextension definition allowing to specify EnableAutomaticUpgrade.
         */
        interface WithEnableAutomaticUpgrade {
            /**
             * Specifies enableAutomaticUpgrade.
             * @param enableAutomaticUpgrade Indicates whether the extension should be automatically upgraded by the platform if there is a newer version of the extension available
             * @return the next definition stage
             */
            WithCreate withEnableAutomaticUpgrade(Boolean enableAutomaticUpgrade);
        }

        /**
         * The stage of the virtualmachinescalesetvmextension definition allowing to specify ForceUpdateTag.
         */
        interface WithForceUpdateTag {
            /**
             * Specifies forceUpdateTag.
             * @param forceUpdateTag How the extension handler should be forced to update even if the extension configuration has not changed
             * @return the next definition stage
             */
            WithCreate withForceUpdateTag(String forceUpdateTag);
        }

        /**
         * The stage of the virtualmachinescalesetvmextension definition allowing to specify InstanceView.
         */
        interface WithInstanceView {
            /**
             * Specifies instanceView.
             * @param instanceView The virtual machine extension instance view
             * @return the next definition stage
             */
            WithCreate withInstanceView(VirtualMachineExtensionInstanceView instanceView);
        }

        /**
         * The stage of the virtualmachinescalesetvmextension definition allowing to specify ProtectedSettings.
         */
        interface WithProtectedSettings {
            /**
             * Specifies protectedSettings.
             * @param protectedSettings The extension can contain either protectedSettings or protectedSettingsFromKeyVault or no protected settings at all
             * @return the next definition stage
             */
            WithCreate withProtectedSettings(Object protectedSettings);
        }

        /**
         * The stage of the virtualmachinescalesetvmextension definition allowing to specify Publisher.
         */
        interface WithPublisher {
            /**
             * Specifies publisher.
             * @param publisher The name of the extension handler publisher
             * @return the next definition stage
             */
            WithCreate withPublisher(String publisher);
        }

        /**
         * The stage of the virtualmachinescalesetvmextension definition allowing to specify Settings.
         */
        interface WithSettings {
            /**
             * Specifies settings.
             * @param settings Json formatted public settings for the extension
             * @return the next definition stage
             */
            WithCreate withSettings(Object settings);
        }

        /**
         * The stage of the virtualmachinescalesetvmextension definition allowing to specify Type1.
         */
        interface WithType1 {
            /**
             * Specifies type1.
             * @param type1 Specifies the type of the extension; an example is "CustomScriptExtension"
             * @return the next definition stage
             */
            WithCreate withType1(String type1);
        }

        /**
         * The stage of the virtualmachinescalesetvmextension definition allowing to specify TypeHandlerVersion.
         */
        interface WithTypeHandlerVersion {
            /**
             * Specifies typeHandlerVersion.
             * @param typeHandlerVersion Specifies the version of the script handler
             * @return the next definition stage
             */
            WithCreate withTypeHandlerVersion(String typeHandlerVersion);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<VirtualMachineScaleSetVMExtension>, DefinitionStages.WithAutoUpgradeMinorVersion, DefinitionStages.WithEnableAutomaticUpgrade, DefinitionStages.WithForceUpdateTag, DefinitionStages.WithInstanceView, DefinitionStages.WithProtectedSettings, DefinitionStages.WithPublisher, DefinitionStages.WithSettings, DefinitionStages.WithType1, DefinitionStages.WithTypeHandlerVersion {
        }
    }
    /**
     * The template for a VirtualMachineScaleSetVMExtension update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<VirtualMachineScaleSetVMExtension>, UpdateStages.WithAutoUpgradeMinorVersion, UpdateStages.WithEnableAutomaticUpgrade, UpdateStages.WithForceUpdateTag, UpdateStages.WithProtectedSettings, UpdateStages.WithPublisher, UpdateStages.WithSettings, UpdateStages.WithType1, UpdateStages.WithTypeHandlerVersion {
    }

    /**
     * Grouping of VirtualMachineScaleSetVMExtension update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the virtualmachinescalesetvmextension update allowing to specify AutoUpgradeMinorVersion.
         */
        interface WithAutoUpgradeMinorVersion {
            /**
             * Specifies autoUpgradeMinorVersion.
             * @param autoUpgradeMinorVersion Indicates whether the extension should use a newer minor version if one is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set to true
             * @return the next update stage
             */
            Update withAutoUpgradeMinorVersion(Boolean autoUpgradeMinorVersion);
        }

        /**
         * The stage of the virtualmachinescalesetvmextension update allowing to specify EnableAutomaticUpgrade.
         */
        interface WithEnableAutomaticUpgrade {
            /**
             * Specifies enableAutomaticUpgrade.
             * @param enableAutomaticUpgrade Indicates whether the extension should be automatically upgraded by the platform if there is a newer version of the extension available
             * @return the next update stage
             */
            Update withEnableAutomaticUpgrade(Boolean enableAutomaticUpgrade);
        }

        /**
         * The stage of the virtualmachinescalesetvmextension update allowing to specify ForceUpdateTag.
         */
        interface WithForceUpdateTag {
            /**
             * Specifies forceUpdateTag.
             * @param forceUpdateTag How the extension handler should be forced to update even if the extension configuration has not changed
             * @return the next update stage
             */
            Update withForceUpdateTag(String forceUpdateTag);
        }

        /**
         * The stage of the virtualmachinescalesetvmextension update allowing to specify ProtectedSettings.
         */
        interface WithProtectedSettings {
            /**
             * Specifies protectedSettings.
             * @param protectedSettings The extension can contain either protectedSettings or protectedSettingsFromKeyVault or no protected settings at all
             * @return the next update stage
             */
            Update withProtectedSettings(Object protectedSettings);
        }

        /**
         * The stage of the virtualmachinescalesetvmextension update allowing to specify Publisher.
         */
        interface WithPublisher {
            /**
             * Specifies publisher.
             * @param publisher The name of the extension handler publisher
             * @return the next update stage
             */
            Update withPublisher(String publisher);
        }

        /**
         * The stage of the virtualmachinescalesetvmextension update allowing to specify Settings.
         */
        interface WithSettings {
            /**
             * Specifies settings.
             * @param settings Json formatted public settings for the extension
             * @return the next update stage
             */
            Update withSettings(Object settings);
        }

        /**
         * The stage of the virtualmachinescalesetvmextension update allowing to specify Type1.
         */
        interface WithType1 {
            /**
             * Specifies type1.
             * @param type1 Specifies the type of the extension; an example is "CustomScriptExtension"
             * @return the next update stage
             */
            Update withType1(String type1);
        }

        /**
         * The stage of the virtualmachinescalesetvmextension update allowing to specify TypeHandlerVersion.
         */
        interface WithTypeHandlerVersion {
            /**
             * Specifies typeHandlerVersion.
             * @param typeHandlerVersion Specifies the version of the script handler
             * @return the next update stage
             */
            Update withTypeHandlerVersion(String typeHandlerVersion);
        }

    }
}
