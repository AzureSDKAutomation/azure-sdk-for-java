/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_07_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.compute.v2019_07_01.implementation.VirtualMachineInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.compute.v2019_07_01.implementation.ComputeManager;
import java.util.Map;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.compute.v2019_07_01.implementation.VirtualMachineInstanceViewInner;
import java.util.List;

/**
 * Type representing VirtualMachine.
 */
public interface VirtualMachine extends HasInner<VirtualMachineInner>, Indexable, Updatable<VirtualMachine.Update>, HasManager<ComputeManager> {
    /**
     * @return the additionalCapabilities value.
     */
    AdditionalCapabilities additionalCapabilities();

    /**
     * @return the availabilitySet value.
     */
    SubResource availabilitySet();

    /**
     * @return the billingProfile value.
     */
    BillingProfile billingProfile();

    /**
     * @return the diagnosticsProfile value.
     */
    DiagnosticsProfile diagnosticsProfile();

    /**
     * @return the evictionPolicy value.
     */
    VirtualMachineEvictionPolicyTypes evictionPolicy();

    /**
     * @return the hardwareProfile value.
     */
    HardwareProfile hardwareProfile();

    /**
     * @return the host value.
     */
    SubResource host();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the identity value.
     */
    VirtualMachineIdentity identity();

    /**
     * @return the instanceView value.
     */
    VirtualMachineInstanceView instanceView();

    /**
     * @return the licenseType value.
     */
    String licenseType();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the networkProfile value.
     */
    NetworkProfile networkProfile();

    /**
     * @return the osProfile value.
     */
    OSProfile osProfile();

    /**
     * @return the plan value.
     */
    Plan plan();

    /**
     * @return the priority value.
     */
    VirtualMachinePriorityTypes priority();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the proximityPlacementGroup value.
     */
    SubResource proximityPlacementGroup();

    /**
     * @return the resources value.
     */
    List<VirtualMachineVirtualMachineExtension> resources();

    /**
     * @return the storageProfile value.
     */
    StorageProfile storageProfile();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the virtualMachineScaleSet value.
     */
    SubResource virtualMachineScaleSet();

    /**
     * @return the vmId value.
     */
    String vmId();

    /**
     * @return the zones value.
     */
    List<String> zones();

    /**
     * The entirety of the VirtualMachine definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation, DefinitionStages.WithLocation, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of VirtualMachine definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a VirtualMachine definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the virtualmachine definition allowing to specify Location.
         */
        interface WithLocation {
           /**
            * Specifies resourceGroupName.
            * @param resourceGroupName The name of the resource group
            * @return the next definition stage
            */
            WithLocation withExistingLocation(String resourceGroupName);
        }

        /**
         * The stage of the virtualmachine definition allowing to specify Location.
         */
        interface WithLocation {
           /**
            * Specifies location.
            * @param location Resource location
            * @return the next definition stage
            */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the virtualmachine definition allowing to specify AdditionalCapabilities.
         */
        interface WithAdditionalCapabilities {
            /**
             * Specifies additionalCapabilities.
             * @param additionalCapabilities Specifies additional capabilities enabled or disabled on the virtual machine
             * @return the next definition stage
             */
            WithCreate withAdditionalCapabilities(AdditionalCapabilities additionalCapabilities);
        }

        /**
         * The stage of the virtualmachine definition allowing to specify AvailabilitySet.
         */
        interface WithAvailabilitySet {
            /**
             * Specifies availabilitySet.
             * @param availabilitySet Specifies information about the availability set that the virtual machine should be assigned to. Virtual machines specified in the same availability set are allocated to different nodes to maximize availability. For more information about availability sets, see [Manage the availability of virtual machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-manage-availability?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json). &lt;br&gt;&lt;br&gt; For more information on Azure planned maintenance, see [Planned maintenance for virtual machines in Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-planned-maintenance?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json) &lt;br&gt;&lt;br&gt; Currently, a VM can only be added to availability set at creation time. The availability set to which the VM is being added should be under the same resource group as the availability set resource. An existing VM cannot be added to an availability set. &lt;br&gt;&lt;br&gt;This property cannot exist along with a non-null properties.virtualMachineScaleSet reference
             * @return the next definition stage
             */
            WithCreate withAvailabilitySet(SubResource availabilitySet);
        }

        /**
         * The stage of the virtualmachine definition allowing to specify BillingProfile.
         */
        interface WithBillingProfile {
            /**
             * Specifies billingProfile.
             * @param billingProfile Specifies the billing related details of a Azure Spot virtual machine. &lt;br&gt;&lt;br&gt;Minimum api-version: 2019-03-01
             * @return the next definition stage
             */
            WithCreate withBillingProfile(BillingProfile billingProfile);
        }

        /**
         * The stage of the virtualmachine definition allowing to specify DiagnosticsProfile.
         */
        interface WithDiagnosticsProfile {
            /**
             * Specifies diagnosticsProfile.
             * @param diagnosticsProfile Specifies the boot diagnostic settings state. &lt;br&gt;&lt;br&gt;Minimum api-version: 2015-06-15
             * @return the next definition stage
             */
            WithCreate withDiagnosticsProfile(DiagnosticsProfile diagnosticsProfile);
        }

        /**
         * The stage of the virtualmachine definition allowing to specify EvictionPolicy.
         */
        interface WithEvictionPolicy {
            /**
             * Specifies evictionPolicy.
             * @param evictionPolicy Specifies the eviction policy for the Azure Spot virtual machine and Azure Spot scale set. &lt;br&gt;&lt;br&gt;For Azure Spot virtual machines, the only supported value is 'Deallocate' and the minimum api-version is 2019-03-01. &lt;br&gt;&lt;br&gt;For Azure Spot scale sets, both 'Deallocate' and 'Delete' are supported and the minimum api-version is 2017-10-30-preview. Possible values include: 'Deallocate', 'Delete'
             * @return the next definition stage
             */
            WithCreate withEvictionPolicy(VirtualMachineEvictionPolicyTypes evictionPolicy);
        }

        /**
         * The stage of the virtualmachine definition allowing to specify HardwareProfile.
         */
        interface WithHardwareProfile {
            /**
             * Specifies hardwareProfile.
             * @param hardwareProfile Specifies the hardware settings for the virtual machine
             * @return the next definition stage
             */
            WithCreate withHardwareProfile(HardwareProfile hardwareProfile);
        }

        /**
         * The stage of the virtualmachine definition allowing to specify Host.
         */
        interface WithHost {
            /**
             * Specifies host.
             * @param host Specifies information about the dedicated host that the virtual machine resides in. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-10-01
             * @return the next definition stage
             */
            WithCreate withHost(SubResource host);
        }

        /**
         * The stage of the virtualmachine definition allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity The identity of the virtual machine, if configured
             * @return the next definition stage
             */
            WithCreate withIdentity(VirtualMachineIdentity identity);
        }

        /**
         * The stage of the virtualmachine definition allowing to specify LicenseType.
         */
        interface WithLicenseType {
            /**
             * Specifies licenseType.
             * @param licenseType Specifies that the image or disk that is being used was licensed on-premises. This element is only used for images that contain the Windows Server operating system. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; Windows_Client &lt;br&gt;&lt;br&gt; Windows_Server &lt;br&gt;&lt;br&gt; If this element is included in a request for an update, the value must match the initial value. This value cannot be updated. &lt;br&gt;&lt;br&gt; For more information, see [Azure Hybrid Use Benefit for Windows Server](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-hybrid-use-benefit-licensing?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json) &lt;br&gt;&lt;br&gt; Minimum api-version: 2015-06-15
             * @return the next definition stage
             */
            WithCreate withLicenseType(String licenseType);
        }

        /**
         * The stage of the virtualmachine definition allowing to specify NetworkProfile.
         */
        interface WithNetworkProfile {
            /**
             * Specifies networkProfile.
             * @param networkProfile Specifies the network interfaces of the virtual machine
             * @return the next definition stage
             */
            WithCreate withNetworkProfile(NetworkProfile networkProfile);
        }

        /**
         * The stage of the virtualmachine definition allowing to specify OsProfile.
         */
        interface WithOsProfile {
            /**
             * Specifies osProfile.
             * @param osProfile Specifies the operating system settings used while creating the virtual machine. Some of the settings cannot be changed once VM is provisioned
             * @return the next definition stage
             */
            WithCreate withOsProfile(OSProfile osProfile);
        }

        /**
         * The stage of the virtualmachine definition allowing to specify Plan.
         */
        interface WithPlan {
            /**
             * Specifies plan.
             * @param plan Specifies information about the marketplace image used to create the virtual machine. This element is only used for marketplace images. Before you can use a marketplace image from an API, you must enable the image for programmatic use.  In the Azure portal, find the marketplace image that you want to use and then click **Want to deploy programmatically, Get Started -&gt;**. Enter any required information and then click **Save**
             * @return the next definition stage
             */
            WithCreate withPlan(Plan plan);
        }

        /**
         * The stage of the virtualmachine definition allowing to specify Priority.
         */
        interface WithPriority {
            /**
             * Specifies priority.
             * @param priority Specifies the priority for the virtual machine. &lt;br&gt;&lt;br&gt;Minimum api-version: 2019-03-01. Possible values include: 'Regular', 'Low', 'Spot'
             * @return the next definition stage
             */
            WithCreate withPriority(VirtualMachinePriorityTypes priority);
        }

        /**
         * The stage of the virtualmachine definition allowing to specify ProximityPlacementGroup.
         */
        interface WithProximityPlacementGroup {
            /**
             * Specifies proximityPlacementGroup.
             * @param proximityPlacementGroup Specifies information about the proximity placement group that the virtual machine should be assigned to. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-04-01
             * @return the next definition stage
             */
            WithCreate withProximityPlacementGroup(SubResource proximityPlacementGroup);
        }

        /**
         * The stage of the virtualmachine definition allowing to specify StorageProfile.
         */
        interface WithStorageProfile {
            /**
             * Specifies storageProfile.
             * @param storageProfile Specifies the storage settings for the virtual machine disks
             * @return the next definition stage
             */
            WithCreate withStorageProfile(StorageProfile storageProfile);
        }

        /**
         * The stage of the virtualmachine definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Resource tags
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the virtualmachine definition allowing to specify VirtualMachineScaleSet.
         */
        interface WithVirtualMachineScaleSet {
            /**
             * Specifies virtualMachineScaleSet.
             * @param virtualMachineScaleSet Specifies information about the virtual machine scale set that the virtual machine should be assigned to. Virtual machines specified in the same virtual machine scale set are allocated to different nodes to maximize availability. Currently, a VM can only be added to virtual machine scale set at creation time. An existing VM cannot be added to a virtual machine scale set. &lt;br&gt;&lt;br&gt;This property cannot exist along with a non-null properties.availabilitySet reference. &lt;br&gt;&lt;br&gt;Minimum api‐version: 2019‐03‐01
             * @return the next definition stage
             */
            WithCreate withVirtualMachineScaleSet(SubResource virtualMachineScaleSet);
        }

        /**
         * The stage of the virtualmachine definition allowing to specify Zones.
         */
        interface WithZones {
            /**
             * Specifies zones.
             * @param zones The virtual machine zones
             * @return the next definition stage
             */
            WithCreate withZones(List<String> zones);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<VirtualMachine>, DefinitionStages.WithAdditionalCapabilities, DefinitionStages.WithAvailabilitySet, DefinitionStages.WithBillingProfile, DefinitionStages.WithDiagnosticsProfile, DefinitionStages.WithEvictionPolicy, DefinitionStages.WithHardwareProfile, DefinitionStages.WithHost, DefinitionStages.WithIdentity, DefinitionStages.WithLicenseType, DefinitionStages.WithNetworkProfile, DefinitionStages.WithOsProfile, DefinitionStages.WithPlan, DefinitionStages.WithPriority, DefinitionStages.WithProximityPlacementGroup, DefinitionStages.WithStorageProfile, DefinitionStages.WithTags, DefinitionStages.WithVirtualMachineScaleSet, DefinitionStages.WithZones {
        }
    }
    /**
     * The template for a VirtualMachine update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<VirtualMachine>, UpdateStages.WithAdditionalCapabilities, UpdateStages.WithAvailabilitySet, UpdateStages.WithBillingProfile, UpdateStages.WithDiagnosticsProfile, UpdateStages.WithEvictionPolicy, UpdateStages.WithHardwareProfile, UpdateStages.WithHost, UpdateStages.WithIdentity, UpdateStages.WithLicenseType, UpdateStages.WithNetworkProfile, UpdateStages.WithOsProfile, UpdateStages.WithPlan, UpdateStages.WithPriority, UpdateStages.WithProximityPlacementGroup, UpdateStages.WithStorageProfile, UpdateStages.WithTags, UpdateStages.WithVirtualMachineScaleSet, UpdateStages.WithZones {
    }

    /**
     * Grouping of VirtualMachine update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the virtualmachine update allowing to specify AdditionalCapabilities.
         */
        interface WithAdditionalCapabilities {
            /**
             * Specifies additionalCapabilities.
             * @param additionalCapabilities Specifies additional capabilities enabled or disabled on the virtual machine
             * @return the next update stage
             */
            Update withAdditionalCapabilities(AdditionalCapabilities additionalCapabilities);
        }

        /**
         * The stage of the virtualmachine update allowing to specify AvailabilitySet.
         */
        interface WithAvailabilitySet {
            /**
             * Specifies availabilitySet.
             * @param availabilitySet Specifies information about the availability set that the virtual machine should be assigned to. Virtual machines specified in the same availability set are allocated to different nodes to maximize availability. For more information about availability sets, see [Manage the availability of virtual machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-manage-availability?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json). &lt;br&gt;&lt;br&gt; For more information on Azure planned maintenance, see [Planned maintenance for virtual machines in Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-planned-maintenance?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json) &lt;br&gt;&lt;br&gt; Currently, a VM can only be added to availability set at creation time. The availability set to which the VM is being added should be under the same resource group as the availability set resource. An existing VM cannot be added to an availability set. &lt;br&gt;&lt;br&gt;This property cannot exist along with a non-null properties.virtualMachineScaleSet reference
             * @return the next update stage
             */
            Update withAvailabilitySet(SubResource availabilitySet);
        }

        /**
         * The stage of the virtualmachine update allowing to specify BillingProfile.
         */
        interface WithBillingProfile {
            /**
             * Specifies billingProfile.
             * @param billingProfile Specifies the billing related details of a Azure Spot virtual machine. &lt;br&gt;&lt;br&gt;Minimum api-version: 2019-03-01
             * @return the next update stage
             */
            Update withBillingProfile(BillingProfile billingProfile);
        }

        /**
         * The stage of the virtualmachine update allowing to specify DiagnosticsProfile.
         */
        interface WithDiagnosticsProfile {
            /**
             * Specifies diagnosticsProfile.
             * @param diagnosticsProfile Specifies the boot diagnostic settings state. &lt;br&gt;&lt;br&gt;Minimum api-version: 2015-06-15
             * @return the next update stage
             */
            Update withDiagnosticsProfile(DiagnosticsProfile diagnosticsProfile);
        }

        /**
         * The stage of the virtualmachine update allowing to specify EvictionPolicy.
         */
        interface WithEvictionPolicy {
            /**
             * Specifies evictionPolicy.
             * @param evictionPolicy Specifies the eviction policy for the Azure Spot virtual machine and Azure Spot scale set. &lt;br&gt;&lt;br&gt;For Azure Spot virtual machines, the only supported value is 'Deallocate' and the minimum api-version is 2019-03-01. &lt;br&gt;&lt;br&gt;For Azure Spot scale sets, both 'Deallocate' and 'Delete' are supported and the minimum api-version is 2017-10-30-preview. Possible values include: 'Deallocate', 'Delete'
             * @return the next update stage
             */
            Update withEvictionPolicy(VirtualMachineEvictionPolicyTypes evictionPolicy);
        }

        /**
         * The stage of the virtualmachine update allowing to specify HardwareProfile.
         */
        interface WithHardwareProfile {
            /**
             * Specifies hardwareProfile.
             * @param hardwareProfile Specifies the hardware settings for the virtual machine
             * @return the next update stage
             */
            Update withHardwareProfile(HardwareProfile hardwareProfile);
        }

        /**
         * The stage of the virtualmachine update allowing to specify Host.
         */
        interface WithHost {
            /**
             * Specifies host.
             * @param host Specifies information about the dedicated host that the virtual machine resides in. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-10-01
             * @return the next update stage
             */
            Update withHost(SubResource host);
        }

        /**
         * The stage of the virtualmachine update allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity The identity of the virtual machine, if configured
             * @return the next update stage
             */
            Update withIdentity(VirtualMachineIdentity identity);
        }

        /**
         * The stage of the virtualmachine update allowing to specify LicenseType.
         */
        interface WithLicenseType {
            /**
             * Specifies licenseType.
             * @param licenseType Specifies that the image or disk that is being used was licensed on-premises. This element is only used for images that contain the Windows Server operating system. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; Windows_Client &lt;br&gt;&lt;br&gt; Windows_Server &lt;br&gt;&lt;br&gt; If this element is included in a request for an update, the value must match the initial value. This value cannot be updated. &lt;br&gt;&lt;br&gt; For more information, see [Azure Hybrid Use Benefit for Windows Server](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-hybrid-use-benefit-licensing?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json) &lt;br&gt;&lt;br&gt; Minimum api-version: 2015-06-15
             * @return the next update stage
             */
            Update withLicenseType(String licenseType);
        }

        /**
         * The stage of the virtualmachine update allowing to specify NetworkProfile.
         */
        interface WithNetworkProfile {
            /**
             * Specifies networkProfile.
             * @param networkProfile Specifies the network interfaces of the virtual machine
             * @return the next update stage
             */
            Update withNetworkProfile(NetworkProfile networkProfile);
        }

        /**
         * The stage of the virtualmachine update allowing to specify OsProfile.
         */
        interface WithOsProfile {
            /**
             * Specifies osProfile.
             * @param osProfile Specifies the operating system settings used while creating the virtual machine. Some of the settings cannot be changed once VM is provisioned
             * @return the next update stage
             */
            Update withOsProfile(OSProfile osProfile);
        }

        /**
         * The stage of the virtualmachine update allowing to specify Plan.
         */
        interface WithPlan {
            /**
             * Specifies plan.
             * @param plan Specifies information about the marketplace image used to create the virtual machine. This element is only used for marketplace images. Before you can use a marketplace image from an API, you must enable the image for programmatic use.  In the Azure portal, find the marketplace image that you want to use and then click **Want to deploy programmatically, Get Started -&gt;**. Enter any required information and then click **Save**
             * @return the next update stage
             */
            Update withPlan(Plan plan);
        }

        /**
         * The stage of the virtualmachine update allowing to specify Priority.
         */
        interface WithPriority {
            /**
             * Specifies priority.
             * @param priority Specifies the priority for the virtual machine. &lt;br&gt;&lt;br&gt;Minimum api-version: 2019-03-01. Possible values include: 'Regular', 'Low', 'Spot'
             * @return the next update stage
             */
            Update withPriority(VirtualMachinePriorityTypes priority);
        }

        /**
         * The stage of the virtualmachine update allowing to specify ProximityPlacementGroup.
         */
        interface WithProximityPlacementGroup {
            /**
             * Specifies proximityPlacementGroup.
             * @param proximityPlacementGroup Specifies information about the proximity placement group that the virtual machine should be assigned to. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-04-01
             * @return the next update stage
             */
            Update withProximityPlacementGroup(SubResource proximityPlacementGroup);
        }

        /**
         * The stage of the virtualmachine update allowing to specify StorageProfile.
         */
        interface WithStorageProfile {
            /**
             * Specifies storageProfile.
             * @param storageProfile Specifies the storage settings for the virtual machine disks
             * @return the next update stage
             */
            Update withStorageProfile(StorageProfile storageProfile);
        }

        /**
         * The stage of the virtualmachine update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Resource tags
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the virtualmachine update allowing to specify VirtualMachineScaleSet.
         */
        interface WithVirtualMachineScaleSet {
            /**
             * Specifies virtualMachineScaleSet.
             * @param virtualMachineScaleSet Specifies information about the virtual machine scale set that the virtual machine should be assigned to. Virtual machines specified in the same virtual machine scale set are allocated to different nodes to maximize availability. Currently, a VM can only be added to virtual machine scale set at creation time. An existing VM cannot be added to a virtual machine scale set. &lt;br&gt;&lt;br&gt;This property cannot exist along with a non-null properties.availabilitySet reference. &lt;br&gt;&lt;br&gt;Minimum api‐version: 2019‐03‐01
             * @return the next update stage
             */
            Update withVirtualMachineScaleSet(SubResource virtualMachineScaleSet);
        }

        /**
         * The stage of the virtualmachine update allowing to specify Zones.
         */
        interface WithZones {
            /**
             * Specifies zones.
             * @param zones The virtual machine zones
             * @return the next update stage
             */
            Update withZones(List<String> zones);
        }

    }
}
