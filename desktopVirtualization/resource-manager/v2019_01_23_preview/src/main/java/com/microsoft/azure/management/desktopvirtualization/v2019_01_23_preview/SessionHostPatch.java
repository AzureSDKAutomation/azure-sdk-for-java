/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2019_01_23_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * SessionHost properties that can be patched.
 */
@JsonFlatten
public class SessionHostPatch extends ProxyResource {
    /**
     * Allow a new session.
     */
    @JsonProperty(value = "properties.allowNewSession")
    private Boolean allowNewSession;

    /**
     * User assigned to SessionHost.
     */
    @JsonProperty(value = "properties.assignedUser")
    private String assignedUser;

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
     * @return the SessionHostPatch object itself.
     */
    public SessionHostPatch withAllowNewSession(Boolean allowNewSession) {
        this.allowNewSession = allowNewSession;
        return this;
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
     * @return the SessionHostPatch object itself.
     */
    public SessionHostPatch withAssignedUser(String assignedUser) {
        this.assignedUser = assignedUser;
        return this;
    }

}
