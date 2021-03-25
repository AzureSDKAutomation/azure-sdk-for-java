// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The instance view of a virtual machine run command. */
@Fluent
public final class VirtualMachineRunCommandInstanceView {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineRunCommandInstanceView.class);

    /*
     * Script execution status.
     */
    @JsonProperty(value = "executionState")
    private ExecutionState executionState;

    /*
     * Communicate script configuration errors or execution messages.
     */
    @JsonProperty(value = "executionMessage")
    private String executionMessage;

    /*
     * Exit code returned from script execution.
     */
    @JsonProperty(value = "exitCode")
    private Integer exitCode;

    /*
     * Script output stream.
     */
    @JsonProperty(value = "output")
    private String output;

    /*
     * Script error stream.
     */
    @JsonProperty(value = "error")
    private String error;

    /*
     * Script start time.
     */
    @JsonProperty(value = "startTime")
    private OffsetDateTime startTime;

    /*
     * Script end time.
     */
    @JsonProperty(value = "endTime")
    private OffsetDateTime endTime;

    /*
     * The resource status information.
     */
    @JsonProperty(value = "statuses")
    private List<InstanceViewStatus> statuses;

    /**
     * Get the executionState property: Script execution status.
     *
     * @return the executionState value.
     */
    public ExecutionState executionState() {
        return this.executionState;
    }

    /**
     * Set the executionState property: Script execution status.
     *
     * @param executionState the executionState value to set.
     * @return the VirtualMachineRunCommandInstanceView object itself.
     */
    public VirtualMachineRunCommandInstanceView withExecutionState(ExecutionState executionState) {
        this.executionState = executionState;
        return this;
    }

    /**
     * Get the executionMessage property: Communicate script configuration errors or execution messages.
     *
     * @return the executionMessage value.
     */
    public String executionMessage() {
        return this.executionMessage;
    }

    /**
     * Set the executionMessage property: Communicate script configuration errors or execution messages.
     *
     * @param executionMessage the executionMessage value to set.
     * @return the VirtualMachineRunCommandInstanceView object itself.
     */
    public VirtualMachineRunCommandInstanceView withExecutionMessage(String executionMessage) {
        this.executionMessage = executionMessage;
        return this;
    }

    /**
     * Get the exitCode property: Exit code returned from script execution.
     *
     * @return the exitCode value.
     */
    public Integer exitCode() {
        return this.exitCode;
    }

    /**
     * Set the exitCode property: Exit code returned from script execution.
     *
     * @param exitCode the exitCode value to set.
     * @return the VirtualMachineRunCommandInstanceView object itself.
     */
    public VirtualMachineRunCommandInstanceView withExitCode(Integer exitCode) {
        this.exitCode = exitCode;
        return this;
    }

    /**
     * Get the output property: Script output stream.
     *
     * @return the output value.
     */
    public String output() {
        return this.output;
    }

    /**
     * Set the output property: Script output stream.
     *
     * @param output the output value to set.
     * @return the VirtualMachineRunCommandInstanceView object itself.
     */
    public VirtualMachineRunCommandInstanceView withOutput(String output) {
        this.output = output;
        return this;
    }

    /**
     * Get the error property: Script error stream.
     *
     * @return the error value.
     */
    public String error() {
        return this.error;
    }

    /**
     * Set the error property: Script error stream.
     *
     * @param error the error value to set.
     * @return the VirtualMachineRunCommandInstanceView object itself.
     */
    public VirtualMachineRunCommandInstanceView withError(String error) {
        this.error = error;
        return this;
    }

    /**
     * Get the startTime property: Script start time.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Script start time.
     *
     * @param startTime the startTime value to set.
     * @return the VirtualMachineRunCommandInstanceView object itself.
     */
    public VirtualMachineRunCommandInstanceView withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: Script end time.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: Script end time.
     *
     * @param endTime the endTime value to set.
     * @return the VirtualMachineRunCommandInstanceView object itself.
     */
    public VirtualMachineRunCommandInstanceView withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the statuses property: The resource status information.
     *
     * @return the statuses value.
     */
    public List<InstanceViewStatus> statuses() {
        return this.statuses;
    }

    /**
     * Set the statuses property: The resource status information.
     *
     * @param statuses the statuses value to set.
     * @return the VirtualMachineRunCommandInstanceView object itself.
     */
    public VirtualMachineRunCommandInstanceView withStatuses(List<InstanceViewStatus> statuses) {
        this.statuses = statuses;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (statuses() != null) {
            statuses().forEach(e -> e.validate());
        }
    }
}
