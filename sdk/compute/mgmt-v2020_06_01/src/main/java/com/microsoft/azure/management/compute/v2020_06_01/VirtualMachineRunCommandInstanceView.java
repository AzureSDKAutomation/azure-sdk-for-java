/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The instance view of a virtual machine run command.
 */
public class VirtualMachineRunCommandInstanceView {
    /**
     * Script execution status. Possible values include: 'Unknown', 'Pending',
     * 'Running', 'Failed', 'Succeeded', 'TimedOut', 'Canceled'.
     */
    @JsonProperty(value = "executionState")
    private ExecutionState executionState;

    /**
     * Communicate script configuration errors or execution messages.
     */
    @JsonProperty(value = "executionMessage")
    private String executionMessage;

    /**
     * Exit code returned from script execution.
     */
    @JsonProperty(value = "exitCode")
    private Integer exitCode;

    /**
     * Script output stream.
     */
    @JsonProperty(value = "output")
    private String output;

    /**
     * Script error stream.
     */
    @JsonProperty(value = "error")
    private String error;

    /**
     * Script start time.
     */
    @JsonProperty(value = "startTime")
    private DateTime startTime;

    /**
     * Script end time.
     */
    @JsonProperty(value = "endTime")
    private DateTime endTime;

    /**
     * The resource status information.
     */
    @JsonProperty(value = "statuses")
    private List<InstanceViewStatus> statuses;

    /**
     * Get script execution status. Possible values include: 'Unknown', 'Pending', 'Running', 'Failed', 'Succeeded', 'TimedOut', 'Canceled'.
     *
     * @return the executionState value
     */
    public ExecutionState executionState() {
        return this.executionState;
    }

    /**
     * Set script execution status. Possible values include: 'Unknown', 'Pending', 'Running', 'Failed', 'Succeeded', 'TimedOut', 'Canceled'.
     *
     * @param executionState the executionState value to set
     * @return the VirtualMachineRunCommandInstanceView object itself.
     */
    public VirtualMachineRunCommandInstanceView withExecutionState(ExecutionState executionState) {
        this.executionState = executionState;
        return this;
    }

    /**
     * Get communicate script configuration errors or execution messages.
     *
     * @return the executionMessage value
     */
    public String executionMessage() {
        return this.executionMessage;
    }

    /**
     * Set communicate script configuration errors or execution messages.
     *
     * @param executionMessage the executionMessage value to set
     * @return the VirtualMachineRunCommandInstanceView object itself.
     */
    public VirtualMachineRunCommandInstanceView withExecutionMessage(String executionMessage) {
        this.executionMessage = executionMessage;
        return this;
    }

    /**
     * Get exit code returned from script execution.
     *
     * @return the exitCode value
     */
    public Integer exitCode() {
        return this.exitCode;
    }

    /**
     * Set exit code returned from script execution.
     *
     * @param exitCode the exitCode value to set
     * @return the VirtualMachineRunCommandInstanceView object itself.
     */
    public VirtualMachineRunCommandInstanceView withExitCode(Integer exitCode) {
        this.exitCode = exitCode;
        return this;
    }

    /**
     * Get script output stream.
     *
     * @return the output value
     */
    public String output() {
        return this.output;
    }

    /**
     * Set script output stream.
     *
     * @param output the output value to set
     * @return the VirtualMachineRunCommandInstanceView object itself.
     */
    public VirtualMachineRunCommandInstanceView withOutput(String output) {
        this.output = output;
        return this;
    }

    /**
     * Get script error stream.
     *
     * @return the error value
     */
    public String error() {
        return this.error;
    }

    /**
     * Set script error stream.
     *
     * @param error the error value to set
     * @return the VirtualMachineRunCommandInstanceView object itself.
     */
    public VirtualMachineRunCommandInstanceView withError(String error) {
        this.error = error;
        return this;
    }

    /**
     * Get script start time.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set script start time.
     *
     * @param startTime the startTime value to set
     * @return the VirtualMachineRunCommandInstanceView object itself.
     */
    public VirtualMachineRunCommandInstanceView withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get script end time.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Set script end time.
     *
     * @param endTime the endTime value to set
     * @return the VirtualMachineRunCommandInstanceView object itself.
     */
    public VirtualMachineRunCommandInstanceView withEndTime(DateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the resource status information.
     *
     * @return the statuses value
     */
    public List<InstanceViewStatus> statuses() {
        return this.statuses;
    }

    /**
     * Set the resource status information.
     *
     * @param statuses the statuses value to set
     * @return the VirtualMachineRunCommandInstanceView object itself.
     */
    public VirtualMachineRunCommandInstanceView withStatuses(List<InstanceViewStatus> statuses) {
        this.statuses = statuses;
        return this;
    }

}
