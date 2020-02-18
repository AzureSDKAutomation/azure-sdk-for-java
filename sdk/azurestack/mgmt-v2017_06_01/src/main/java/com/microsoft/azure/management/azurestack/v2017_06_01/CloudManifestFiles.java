/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azurestack.v2017_06_01;

import rx.Observable;
import com.microsoft.azure.management.azurestack.v2017_06_01.implementation.CloudManifestFilesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing CloudManifestFiles.
 */
public interface CloudManifestFiles extends HasInner<CloudManifestFilesInner> {
    /**
     * Returns a cloud specific manifest JSON file.
     *
     * @param verificationVersion Signing verification key version.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CloudManifestFileResponse> getAsync(String verificationVersion);

    /**
     * Returns a cloud specific manifest JSON file with latest version.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CloudManifestFileResponse> listAsync();

}
