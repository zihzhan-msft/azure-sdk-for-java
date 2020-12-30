// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ResourceRegionType. */
public final class ResourceRegionType extends ExpandableStringEnum<ResourceRegionType> {
    /** Static value RegionalResource for ResourceRegionType. */
    public static final ResourceRegionType REGIONAL_RESOURCE = fromString("RegionalResource");

    /** Static value GlobalResource for ResourceRegionType. */
    public static final ResourceRegionType GLOBAL_RESOURCE = fromString("GlobalResource");

    /**
     * Creates or finds a ResourceRegionType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ResourceRegionType.
     */
    @JsonCreator
    public static ResourceRegionType fromString(String name) {
        return fromString(name, ResourceRegionType.class);
    }

    /** @return known ResourceRegionType values. */
    public static Collection<ResourceRegionType> values() {
        return values(ResourceRegionType.class);
    }
}