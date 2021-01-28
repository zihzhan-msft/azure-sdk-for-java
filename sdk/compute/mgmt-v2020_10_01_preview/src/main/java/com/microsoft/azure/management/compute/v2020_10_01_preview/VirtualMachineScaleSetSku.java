/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.compute.v2020_10_01_preview.implementation.VirtualMachineScaleSetSkuInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.compute.v2020_10_01_preview.implementation.ComputeManager;

/**
 * Type representing VirtualMachineScaleSetSku.
 */
public interface VirtualMachineScaleSetSku extends HasInner<VirtualMachineScaleSetSkuInner>, HasManager<ComputeManager> {
    /**
     * @return the capacity value.
     */
    VirtualMachineScaleSetSkuCapacity capacity();

    /**
     * @return the resourceType value.
     */
    String resourceType();

    /**
     * @return the sku value.
     */
    Sku sku();

}