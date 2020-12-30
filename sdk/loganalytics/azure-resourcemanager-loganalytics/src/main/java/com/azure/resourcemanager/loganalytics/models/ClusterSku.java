// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The cluster sku definition. */
@Fluent
public final class ClusterSku {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ClusterSku.class);

    /*
     * The capacity value
     */
    @JsonProperty(value = "capacity")
    private Long capacity;

    /*
     * The name of the SKU.
     */
    @JsonProperty(value = "name")
    private ClusterSkuNameEnum name;

    /**
     * Get the capacity property: The capacity value.
     *
     * @return the capacity value.
     */
    public Long capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: The capacity value.
     *
     * @param capacity the capacity value to set.
     * @return the ClusterSku object itself.
     */
    public ClusterSku withCapacity(Long capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Get the name property: The name of the SKU.
     *
     * @return the name value.
     */
    public ClusterSkuNameEnum name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the SKU.
     *
     * @param name the name value to set.
     * @return the ClusterSku object itself.
     */
    public ClusterSku withName(ClusterSkuNameEnum name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}