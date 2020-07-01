/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.advisor.v2016_07_12_preview;

import rx.Observable;
import com.microsoft.azure.management.advisor.v2016_07_12_preview.implementation.AdvisorScoresInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing AdvisorScores.
 */
public interface AdvisorScores extends HasInner<AdvisorScoresInner> {
    /**
     * Gets the advisor score.
     *
     * @param name The name of Advisor score entity.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AdvisorScore> getAsync(String name);

    /**
     * Gets the list of advisor scores.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AdvisorScore> listAsync();

}
