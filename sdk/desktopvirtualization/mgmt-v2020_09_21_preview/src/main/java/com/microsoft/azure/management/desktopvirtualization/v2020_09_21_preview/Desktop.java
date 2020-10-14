/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2020_09_21_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.desktopvirtualization.v2020_09_21_preview.implementation.DesktopInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.desktopvirtualization.v2020_09_21_preview.implementation.DesktopVirtualizationManager;
import java.util.Map;

/**
 * Type representing Desktop.
 */
public interface Desktop extends HasInner<DesktopInner>, Indexable, Refreshable<Desktop>, Updatable<Desktop.Update>, HasManager<DesktopVirtualizationManager> {
    /**
     * @return the description value.
     */
    String description();

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
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The template for a Desktop update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Desktop>, UpdateStages.WithDescription, UpdateStages.WithFriendlyName, UpdateStages.WithTags {
    }

    /**
     * Grouping of Desktop update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the desktop update allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description Description of Desktop
             * @return the next update stage
             */
            Update withDescription(String description);
        }

        /**
         * The stage of the desktop update allowing to specify FriendlyName.
         */
        interface WithFriendlyName {
            /**
             * Specifies friendlyName.
             * @param friendlyName Friendly name of Desktop
             * @return the next update stage
             */
            Update withFriendlyName(String friendlyName);
        }

        /**
         * The stage of the desktop update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags tags to be updated
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

    }
}
