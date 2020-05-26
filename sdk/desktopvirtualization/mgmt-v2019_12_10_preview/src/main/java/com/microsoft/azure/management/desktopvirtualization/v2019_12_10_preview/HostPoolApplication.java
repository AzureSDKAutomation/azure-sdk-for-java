/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview.implementation.ApplicationInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview.implementation.DesktopVirtualizationManager;

/**
 * Type representing HostPoolApplication.
 */
public interface HostPoolApplication extends HasInner<ApplicationInner>, HasManager<DesktopVirtualizationManager> {
    /**
     * @return the commandLineArguments value.
     */
    String commandLineArguments();

    /**
     * @return the commandLineSetting value.
     */
    CommandLineSetting commandLineSetting();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the filePath value.
     */
    String filePath();

    /**
     * @return the friendlyName value.
     */
    String friendlyName();

    /**
     * @return the iconContent value.
     */
    byte[] iconContent();

    /**
     * @return the iconHash value.
     */
    String iconHash();

    /**
     * @return the iconIndex value.
     */
    Integer iconIndex();

    /**
     * @return the iconPath value.
     */
    String iconPath();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the showInPortal value.
     */
    Boolean showInPortal();

    /**
     * @return the type value.
     */
    String type();

}
