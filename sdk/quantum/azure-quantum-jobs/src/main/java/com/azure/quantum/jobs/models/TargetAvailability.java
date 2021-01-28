// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.quantum.jobs.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for TargetAvailability. */
public final class TargetAvailability extends ExpandableStringEnum<TargetAvailability> {
    /** Static value Available for TargetAvailability. */
    public static final TargetAvailability AVAILABLE = fromString("Available");

    /** Static value Degraded for TargetAvailability. */
    public static final TargetAvailability DEGRADED = fromString("Degraded");

    /** Static value Unavailable for TargetAvailability. */
    public static final TargetAvailability UNAVAILABLE = fromString("Unavailable");

    /**
     * Creates or finds a TargetAvailability from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TargetAvailability.
     */
    @JsonCreator
    public static TargetAvailability fromString(String name) {
        return fromString(name, TargetAvailability.class);
    }

    /** @return known TargetAvailability values. */
    public static Collection<TargetAvailability> values() {
        return values(TargetAvailability.class);
    }
}