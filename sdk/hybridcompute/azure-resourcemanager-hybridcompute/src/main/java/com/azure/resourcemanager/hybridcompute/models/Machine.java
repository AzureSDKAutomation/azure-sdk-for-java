// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.core.management.exception.ManagementError;
import com.azure.resourcemanager.hybridcompute.fluent.models.MachineInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of Machine. */
public interface Machine {
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
     * Gets the identity property: Managed Identity.
     *
     * @return the identity value.
     */
    Identity identity();

    /**
     * Gets the locationData property: Metadata pertaining to the geographic location of the resource.
     *
     * @return the locationData value.
     */
    LocationData locationData();

    /**
     * Gets the osProfile property: Specifies the operating system settings for the hybrid machine.
     *
     * @return the osProfile value.
     */
    OSProfile osProfile();

    /**
     * Gets the provisioningState property: The provisioning state, which only appears in the response.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the status property: The status of the hybrid machine agent.
     *
     * @return the status value.
     */
    StatusTypes status();

    /**
     * Gets the lastStatusChange property: The time of the last status change.
     *
     * @return the lastStatusChange value.
     */
    OffsetDateTime lastStatusChange();

    /**
     * Gets the errorDetails property: Details about the error state.
     *
     * @return the errorDetails value.
     */
    List<ManagementError> errorDetails();

    /**
     * Gets the agentVersion property: The hybrid machine agent full version.
     *
     * @return the agentVersion value.
     */
    String agentVersion();

    /**
     * Gets the vmId property: Specifies the hybrid machine unique ID.
     *
     * @return the vmId value.
     */
    String vmId();

    /**
     * Gets the displayName property: Specifies the hybrid machine display name.
     *
     * @return the displayName value.
     */
    String displayName();

    /**
     * Gets the machineFqdn property: Specifies the hybrid machine FQDN.
     *
     * @return the machineFqdn value.
     */
    String machineFqdn();

    /**
     * Gets the clientPublicKey property: Public Key that the client provides to be used during initial resource
     * onboarding.
     *
     * @return the clientPublicKey value.
     */
    String clientPublicKey();

    /**
     * Gets the osName property: The Operating System running on the hybrid machine.
     *
     * @return the osName value.
     */
    String osName();

    /**
     * Gets the osVersion property: The version of Operating System running on the hybrid machine.
     *
     * @return the osVersion value.
     */
    String osVersion();

    /**
     * Gets the vmUuid property: Specifies the Arc Machine's unique SMBIOS ID.
     *
     * @return the vmUuid value.
     */
    String vmUuid();

    /**
     * Gets the extensions property: Machine Extensions information.
     *
     * @return the extensions value.
     */
    List<MachineExtensionInstanceView> extensions();

    /**
     * Gets the osSku property: Specifies the Operating System product SKU.
     *
     * @return the osSku value.
     */
    String osSku();

    /**
     * Gets the domainName property: Specifies the Windows domain name.
     *
     * @return the domainName value.
     */
    String domainName();

    /**
     * Gets the adFqdn property: Specifies the AD fully qualified display name.
     *
     * @return the adFqdn value.
     */
    String adFqdn();

    /**
     * Gets the dnsFqdn property: Specifies the DNS fully qualified display name.
     *
     * @return the dnsFqdn value.
     */
    String dnsFqdn();

    /**
     * Gets the inner com.azure.resourcemanager.hybridcompute.fluent.models.MachineInner object.
     *
     * @return the inner object.
     */
    MachineInner innerModel();
}
