/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2020_09_21_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.desktopvirtualization.v2020_09_21_preview.implementation.UserSessionInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.desktopvirtualization.v2020_09_21_preview.implementation.DesktopVirtualizationManager;
import org.joda.time.DateTime;

/**
 * Type representing UserSession.
 */
public interface UserSession extends HasInner<UserSessionInner>, HasManager<DesktopVirtualizationManager> {
    /**
     * @return the activeDirectoryUserName value.
     */
    String activeDirectoryUserName();

    /**
     * @return the applicationType value.
     */
    ApplicationType applicationType();

    /**
     * @return the createTime value.
     */
    DateTime createTime();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the sessionState value.
     */
    SessionState sessionState();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the userPrincipalName value.
     */
    String userPrincipalName();

}
