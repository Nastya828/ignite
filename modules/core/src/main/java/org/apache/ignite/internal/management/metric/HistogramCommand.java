/*
 * Copyright 2023 JSC SberTech
 */

package org.apache.ignite.internal.management.metric;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import org.apache.ignite.internal.client.GridClientNode;
import org.apache.ignite.internal.management.api.CliSubcommandsWithPrefix;
import org.apache.ignite.internal.management.api.CommandRegistryImpl;
import org.apache.ignite.internal.management.api.ComputeCommand;
import org.apache.ignite.internal.util.typedef.F;

import static java.util.Arrays.asList;
import static org.apache.ignite.internal.management.SystemViewCommand.printTable;
import static org.apache.ignite.internal.management.SystemViewTask.SimpleType.STRING;
import static org.apache.ignite.internal.management.api.CommandUtils.nodeOrNull;

/** Command for printing histogram data. */
@CliSubcommandsWithPrefix
public class HistogramCommand extends CommandRegistryImpl<MetricCommandArg, MetricHistogramResult>
    implements ComputeCommand<MetricCommandArg, MetricHistogramResult> {
    /** */
    public HistogramCommand() {
        super(
            new MetricHistogramCommand()
        );
    }
    /** {@inheritDoc} */
    @Override public String description() {
        return "Print histogram bounds, value";
    }

    /** {@inheritDoc} */
    @Override public Class<MetricCommandArg> argClass() {
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

    /** {@inheritDoc} */
    @Override public void printResult(MetricCommandArg arg, MetricHistogramResult res, Consumer<String> printer) {
        if (res != null) {
            List<List<?>> data = new ArrayList<>();

            data.add(asList(res.bounds()));
            data.add(F.asList(res.values()));

            printTable(asList("bounds", "values"), asList(STRING, STRING), data, printer);
        }
        else
            printer.accept("No histogram with specified name was found [name=" + arg.name() + "]");
    }
}
