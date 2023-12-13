/*
 * Copyright 2023 JSC SberTech
 */

package org.apache.ignite.internal.management.metric;

import java.util.Collection;
import org.apache.ignite.internal.client.GridClientNode;
import org.apache.ignite.internal.management.api.ComputeCommand;

import static org.apache.ignite.internal.management.api.CommandUtils.nodeOrNull;

public class MetricHistogramCommand implements ComputeCommand<MetricCommandArg, MetricHistogramResult> {
    /** Command description. */
    @Override public String description() {
        return "Print histogram bounds.";
    }

    /** @return Arguments class. */
    @Override public Class<? extends MetricCommandArg> argClass() {
        return MetricCommandArg.class;
    }

    /** {@inheritDoc} */
    @Override public Class<MetricHistogramTask> taskClass() {
        return MetricHistogramTask.class;
    }

    /** {@inheritDoc} */
    @Override public Collection<GridClientNode> nodes(Collection<GridClientNode> nodes, MetricCommandArg arg) {
        return nodeOrNull(arg.nodeId(), nodes);
    }
}
