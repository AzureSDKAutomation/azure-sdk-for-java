/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2020_11-02-preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.desktopvirtualization.v2020_11-02-preview.implementation.DesktopVirtualizationManager;
import com.microsoft.azure.management.desktopvirtualization.v2020_11-02-preview.implementation.ExpandMsixImageInner;
import org.joda.time.DateTime;
import java.util.List;

/**
 * Type representing ExpandMsixImage.
 */
public interface ExpandMsixImage extends HasInner<ExpandMsixImageInner>, HasManager<DesktopVirtualizationManager> {
    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the imagePath value.
     */
    String imagePath();

    /**
     * @return the isActive value.
     */
    boolean isActive();

    /**
     * @return the isRegularRegistration value.
     */
    boolean isRegularRegistration();

    /**
     * @return the lastUpdated value.
     */
    DateTime lastUpdated();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the packageAlias value.
     */
    String packageAlias();

    /**
     * @return the packageApplications value.
     */
    List<MsixPackageApplications> packageApplications();

    /**
     * @return the packageDependencies value.
     */
    List<MsixPackageDependencies> packageDependencies();

    /**
     * @return the packageFamilyName value.
     */
    String packageFamilyName();

    /**
     * @return the packageFullName value.
     */
    String packageFullName();

    /**
     * @return the packageName value.
     */
    String packageName();

    /**
     * @return the packageRelativePath value.
     */
    String packageRelativePath();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the version value.
     */
    String version();

}
