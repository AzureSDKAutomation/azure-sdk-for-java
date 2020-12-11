// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** VMware provider specific settings. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("VMwareVirtualMachine")
@Fluent
public final class VMwareVirtualMachineDetails extends ConfigurationSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VMwareVirtualMachineDetails.class);

    /*
     * The ID generated by the InMage agent after it gets installed on guest.
     * This is the ID to be used during InMage CreateProtection.
     */
    @JsonProperty(value = "agentGeneratedId")
    private String agentGeneratedId;

    /*
     * The value indicating if InMage scout agent is installed on guest.
     */
    @JsonProperty(value = "agentInstalled")
    private String agentInstalled;

    /*
     * The OsType installed on VM.
     */
    @JsonProperty(value = "osType")
    private String osType;

    /*
     * The agent version.
     */
    @JsonProperty(value = "agentVersion")
    private String agentVersion;

    /*
     * The IP address.
     */
    @JsonProperty(value = "ipAddress")
    private String ipAddress;

    /*
     * The value indicating whether VM is powered on.
     */
    @JsonProperty(value = "poweredOn")
    private String poweredOn;

    /*
     * The VCenter infrastructure Id.
     */
    @JsonProperty(value = "vCenterInfrastructureId")
    private String vCenterInfrastructureId;

    /*
     * A value indicating the discovery type of the machine. Value can be
     * vCenter or physical.
     */
    @JsonProperty(value = "discoveryType")
    private String discoveryType;

    /*
     * The disk details.
     */
    @JsonProperty(value = "diskDetails")
    private List<InMageDiskDetails> diskDetails;

    /*
     * The validation errors.
     */
    @JsonProperty(value = "validationErrors")
    private List<HealthError> validationErrors;

    /**
     * Get the agentGeneratedId property: The ID generated by the InMage agent after it gets installed on guest. This is
     * the ID to be used during InMage CreateProtection.
     *
     * @return the agentGeneratedId value.
     */
    public String agentGeneratedId() {
        return this.agentGeneratedId;
    }

    /**
     * Set the agentGeneratedId property: The ID generated by the InMage agent after it gets installed on guest. This is
     * the ID to be used during InMage CreateProtection.
     *
     * @param agentGeneratedId the agentGeneratedId value to set.
     * @return the VMwareVirtualMachineDetails object itself.
     */
    public VMwareVirtualMachineDetails withAgentGeneratedId(String agentGeneratedId) {
        this.agentGeneratedId = agentGeneratedId;
        return this;
    }

    /**
     * Get the agentInstalled property: The value indicating if InMage scout agent is installed on guest.
     *
     * @return the agentInstalled value.
     */
    public String agentInstalled() {
        return this.agentInstalled;
    }

    /**
     * Set the agentInstalled property: The value indicating if InMage scout agent is installed on guest.
     *
     * @param agentInstalled the agentInstalled value to set.
     * @return the VMwareVirtualMachineDetails object itself.
     */
    public VMwareVirtualMachineDetails withAgentInstalled(String agentInstalled) {
        this.agentInstalled = agentInstalled;
        return this;
    }

    /**
     * Get the osType property: The OsType installed on VM.
     *
     * @return the osType value.
     */
    public String osType() {
        return this.osType;
    }

    /**
     * Set the osType property: The OsType installed on VM.
     *
     * @param osType the osType value to set.
     * @return the VMwareVirtualMachineDetails object itself.
     */
    public VMwareVirtualMachineDetails withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the agentVersion property: The agent version.
     *
     * @return the agentVersion value.
     */
    public String agentVersion() {
        return this.agentVersion;
    }

    /**
     * Set the agentVersion property: The agent version.
     *
     * @param agentVersion the agentVersion value to set.
     * @return the VMwareVirtualMachineDetails object itself.
     */
    public VMwareVirtualMachineDetails withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * Get the ipAddress property: The IP address.
     *
     * @return the ipAddress value.
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the ipAddress property: The IP address.
     *
     * @param ipAddress the ipAddress value to set.
     * @return the VMwareVirtualMachineDetails object itself.
     */
    public VMwareVirtualMachineDetails withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the poweredOn property: The value indicating whether VM is powered on.
     *
     * @return the poweredOn value.
     */
    public String poweredOn() {
        return this.poweredOn;
    }

    /**
     * Set the poweredOn property: The value indicating whether VM is powered on.
     *
     * @param poweredOn the poweredOn value to set.
     * @return the VMwareVirtualMachineDetails object itself.
     */
    public VMwareVirtualMachineDetails withPoweredOn(String poweredOn) {
        this.poweredOn = poweredOn;
        return this;
    }

    /**
     * Get the vCenterInfrastructureId property: The VCenter infrastructure Id.
     *
     * @return the vCenterInfrastructureId value.
     */
    public String vCenterInfrastructureId() {
        return this.vCenterInfrastructureId;
    }

    /**
     * Set the vCenterInfrastructureId property: The VCenter infrastructure Id.
     *
     * @param vCenterInfrastructureId the vCenterInfrastructureId value to set.
     * @return the VMwareVirtualMachineDetails object itself.
     */
    public VMwareVirtualMachineDetails withVCenterInfrastructureId(String vCenterInfrastructureId) {
        this.vCenterInfrastructureId = vCenterInfrastructureId;
        return this;
    }

    /**
     * Get the discoveryType property: A value indicating the discovery type of the machine. Value can be vCenter or
     * physical.
     *
     * @return the discoveryType value.
     */
    public String discoveryType() {
        return this.discoveryType;
    }

    /**
     * Set the discoveryType property: A value indicating the discovery type of the machine. Value can be vCenter or
     * physical.
     *
     * @param discoveryType the discoveryType value to set.
     * @return the VMwareVirtualMachineDetails object itself.
     */
    public VMwareVirtualMachineDetails withDiscoveryType(String discoveryType) {
        this.discoveryType = discoveryType;
        return this;
    }

    /**
     * Get the diskDetails property: The disk details.
     *
     * @return the diskDetails value.
     */
    public List<InMageDiskDetails> diskDetails() {
        return this.diskDetails;
    }

    /**
     * Set the diskDetails property: The disk details.
     *
     * @param diskDetails the diskDetails value to set.
     * @return the VMwareVirtualMachineDetails object itself.
     */
    public VMwareVirtualMachineDetails withDiskDetails(List<InMageDiskDetails> diskDetails) {
        this.diskDetails = diskDetails;
        return this;
    }

    /**
     * Get the validationErrors property: The validation errors.
     *
     * @return the validationErrors value.
     */
    public List<HealthError> validationErrors() {
        return this.validationErrors;
    }

    /**
     * Set the validationErrors property: The validation errors.
     *
     * @param validationErrors the validationErrors value to set.
     * @return the VMwareVirtualMachineDetails object itself.
     */
    public VMwareVirtualMachineDetails withValidationErrors(List<HealthError> validationErrors) {
        this.validationErrors = validationErrors;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (diskDetails() != null) {
            diskDetails().forEach(e -> e.validate());
        }
        if (validationErrors() != null) {
            validationErrors().forEach(e -> e.validate());
        }
    }
}
