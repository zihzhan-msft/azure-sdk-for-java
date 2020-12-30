/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2020_11_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appplatform.v2020_11_01_preview.implementation.AppPlatformManager;
import com.microsoft.azure.management.appplatform.v2020_11_01_preview.implementation.ServiceResourceInner;
import com.microsoft.azure.management.appplatform.v2020_11_01_preview.implementation.SkuInner;
import java.util.Map;

/**
 * Type representing ServiceResource.
 */
public interface ServiceResource extends HasInner<ServiceResourceInner>, HasManager<AppPlatformManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    ClusterResourceProperties properties();

    /**
     * @return the sku value.
     */
    SkuInner sku();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

}