/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2020_10_19_preview.implementation;

import org.joda.time.DateTime;
import com.microsoft.azure.management.desktopvirtualization.v2020_10_19_preview.Status;
import com.microsoft.azure.management.desktopvirtualization.v2020_10_19_preview.UpdateState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Represents a SessionHost definition.
 */
@JsonFlatten
public class SessionHostInner extends ProxyResource {
    /**
     * Last heart beat from SessionHost.
     */
    @JsonProperty(value = "properties.lastHeartBeat")
    private DateTime lastHeartBeat;

    /**
     * Number of sessions on SessionHost.
     */
    @JsonProperty(value = "properties.sessions")
    private Integer sessions;

    /**
     * Version of agent on SessionHost.
     */
    @JsonProperty(value = "properties.agentVersion")
    private String agentVersion;

    /**
     * Allow a new session.
     */
    @JsonProperty(value = "properties.allowNewSession")
    private Boolean allowNewSession;

    /**
     * Virtual Machine Id of SessionHost's underlying virtual machine.
     */
    @JsonProperty(value = "properties.virtualMachineId", access = JsonProperty.Access.WRITE_ONLY)
    private String virtualMachineId;

    /**
     * Resource Id of SessionHost's underlying virtual machine.
     */
    @JsonProperty(value = "properties.resourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceId;

    /**
     * User assigned to SessionHost.
     */
    @JsonProperty(value = "properties.assignedUser")
    private String assignedUser;

    /**
     * Status for a SessionHost. Possible values include: 'Available',
     * 'Unavailable', 'Shutdown', 'Disconnected', 'Upgrading', 'UpgradeFailed'.
     */
    @JsonProperty(value = "properties.status")
    private Status status;

    /**
     * The timestamp of the status.
     */
    @JsonProperty(value = "properties.statusTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime statusTimestamp;

    /**
     * The version of the OS on the session host.
     */
    @JsonProperty(value = "properties.osVersion")
    private String osVersion;

    /**
     * The version of the side by side stack on the session host.
     */
    @JsonProperty(value = "properties.sxSStackVersion")
    private String sxSStackVersion;

    /**
     * Update state of a SessionHost. Possible values include: 'Initial',
     * 'Pending', 'Started', 'Succeeded', 'Failed'.
     */
    @JsonProperty(value = "properties.updateState")
    private UpdateState updateState;

    /**
     * The timestamp of the last update.
     */
    @JsonProperty(value = "properties.lastUpdateTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastUpdateTime;

    /**
     * The error message.
     */
    @JsonProperty(value = "properties.updateErrorMessage")
    private String updateErrorMessage;

    /**
     * Get last heart beat from SessionHost.
     *
     * @return the lastHeartBeat value
     */
    public DateTime lastHeartBeat() {
        return this.lastHeartBeat;
    }

    /**
     * Set last heart beat from SessionHost.
     *
     * @param lastHeartBeat the lastHeartBeat value to set
     * @return the SessionHostInner object itself.
     */
    public SessionHostInner withLastHeartBeat(DateTime lastHeartBeat) {
        this.lastHeartBeat = lastHeartBeat;
        return this;
    }

    /**
     * Get number of sessions on SessionHost.
     *
     * @return the sessions value
     */
    public Integer sessions() {
        return this.sessions;
    }

    /**
     * Set number of sessions on SessionHost.
     *
     * @param sessions the sessions value to set
     * @return the SessionHostInner object itself.
     */
    public SessionHostInner withSessions(Integer sessions) {
        this.sessions = sessions;
        return this;
    }

    /**
     * Get version of agent on SessionHost.
     *
     * @return the agentVersion value
     */
    public String agentVersion() {
        return this.agentVersion;
    }

    /**
     * Set version of agent on SessionHost.
     *
     * @param agentVersion the agentVersion value to set
     * @return the SessionHostInner object itself.
     */
    public SessionHostInner withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * Get allow a new session.
     *
     * @return the allowNewSession value
     */
    public Boolean allowNewSession() {
        return this.allowNewSession;
    }

    /**
     * Set allow a new session.
     *
     * @param allowNewSession the allowNewSession value to set
     * @return the SessionHostInner object itself.
     */
    public SessionHostInner withAllowNewSession(Boolean allowNewSession) {
        this.allowNewSession = allowNewSession;
        return this;
    }

    /**
     * Get virtual Machine Id of SessionHost's underlying virtual machine.
     *
     * @return the virtualMachineId value
     */
    public String virtualMachineId() {
        return this.virtualMachineId;
    }

    /**
     * Get resource Id of SessionHost's underlying virtual machine.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Get user assigned to SessionHost.
     *
     * @return the assignedUser value
     */
    public String assignedUser() {
        return this.assignedUser;
    }

    /**
     * Set user assigned to SessionHost.
     *
     * @param assignedUser the assignedUser value to set
     * @return the SessionHostInner object itself.
     */
    public SessionHostInner withAssignedUser(String assignedUser) {
        this.assignedUser = assignedUser;
        return this;
    }

    /**
     * Get status for a SessionHost. Possible values include: 'Available', 'Unavailable', 'Shutdown', 'Disconnected', 'Upgrading', 'UpgradeFailed'.
     *
     * @return the status value
     */
    public Status status() {
        return this.status;
    }

    /**
     * Set status for a SessionHost. Possible values include: 'Available', 'Unavailable', 'Shutdown', 'Disconnected', 'Upgrading', 'UpgradeFailed'.
     *
     * @param status the status value to set
     * @return the SessionHostInner object itself.
     */
    public SessionHostInner withStatus(Status status) {
        this.status = status;
        return this;
    }

    /**
     * Get the timestamp of the status.
     *
     * @return the statusTimestamp value
     */
    public DateTime statusTimestamp() {
        return this.statusTimestamp;
    }

    /**
     * Get the version of the OS on the session host.
     *
     * @return the osVersion value
     */
    public String osVersion() {
        return this.osVersion;
    }

    /**
     * Set the version of the OS on the session host.
     *
     * @param osVersion the osVersion value to set
     * @return the SessionHostInner object itself.
     */
    public SessionHostInner withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * Get the version of the side by side stack on the session host.
     *
     * @return the sxSStackVersion value
     */
    public String sxSStackVersion() {
        return this.sxSStackVersion;
    }

    /**
     * Set the version of the side by side stack on the session host.
     *
     * @param sxSStackVersion the sxSStackVersion value to set
     * @return the SessionHostInner object itself.
     */
    public SessionHostInner withSxSStackVersion(String sxSStackVersion) {
        this.sxSStackVersion = sxSStackVersion;
        return this;
    }

    /**
     * Get update state of a SessionHost. Possible values include: 'Initial', 'Pending', 'Started', 'Succeeded', 'Failed'.
     *
     * @return the updateState value
     */
    public UpdateState updateState() {
        return this.updateState;
    }

    /**
     * Set update state of a SessionHost. Possible values include: 'Initial', 'Pending', 'Started', 'Succeeded', 'Failed'.
     *
     * @param updateState the updateState value to set
     * @return the SessionHostInner object itself.
     */
    public SessionHostInner withUpdateState(UpdateState updateState) {
        this.updateState = updateState;
        return this;
    }

    /**
     * Get the timestamp of the last update.
     *
     * @return the lastUpdateTime value
     */
    public DateTime lastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * Get the error message.
     *
     * @return the updateErrorMessage value
     */
    public String updateErrorMessage() {
        return this.updateErrorMessage;
    }

    /**
     * Set the error message.
     *
     * @param updateErrorMessage the updateErrorMessage value to set
     * @return the SessionHostInner object itself.
     */
    public SessionHostInner withUpdateErrorMessage(String updateErrorMessage) {
        this.updateErrorMessage = updateErrorMessage;
        return this;
    }

}
