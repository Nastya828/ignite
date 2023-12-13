/*
 * Copyright 2023 JSC SberTech
 */

package org.apache.ignite.internal.management.metric;

import org.apache.ignite.IgniteException;
import org.apache.ignite.internal.processors.metric.MetricRegistry;
import org.apache.ignite.internal.processors.metric.impl.HistogramMetricImpl;
import org.apache.ignite.internal.processors.task.GridInternal;
import org.apache.ignite.internal.processors.task.GridVisorManagementTask;
import org.apache.ignite.internal.visor.VisorJob;
import org.apache.ignite.internal.visor.VisorOneNodeTask;
import org.jetbrains.annotations.Nullable;

/** Reperesents visor task for obtaining metric values. */
@GridInternal
@GridVisorManagementTask
public class MetricHistogramTask  extends VisorOneNodeTask<MetricCommandArg, MetricHistogramResult> {
    /** */
    private static final long serialVersionUID = 0L;

    /**
     * @param arg Task arg.
     * @return New job.
     */
    @Override protected VisorJob<MetricCommandArg, MetricHistogramResult> job(MetricCommandArg arg) {
        return new MetricJob(arg, false);
    }

    /** */
    private static class MetricJob extends VisorJob<MetricCommandArg, MetricHistogramResult> {
        /**
         *
         */
        private static final long serialVersionUID = 0L;

        /**
         * Create job with specified argument.
         *
         * @param arg   Job argument.
         * @param debug Flag indicating whether debug information should be printed into node log.
         */
        protected MetricJob(@Nullable MetricCommandArg arg, boolean debug) {
            super(arg, debug);
        }

        /** {@inheritDoc} */
        @Override protected MetricHistogramResult run(@Nullable MetricCommandArg arg) throws IgniteException {
            MetricRegistry reg = ignite.context().metric().registry(arg.name());

            HistogramMetricImpl h = reg.findMetric(arg.name());

            return new MetricHistogramResult(h.bounds(), h.value());
        }
    }
}
