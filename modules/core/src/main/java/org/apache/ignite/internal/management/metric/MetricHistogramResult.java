/*
 * Copyright 2023 JSC SberTech
 */

package org.apache.ignite.internal.management.metric;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import org.apache.ignite.internal.dto.IgniteDataTransferObject;
import org.apache.ignite.internal.processors.task.GridInternal;
import org.apache.ignite.internal.util.typedef.internal.U;

/**
 * List of the histogram bounds and value.
 */
@GridInternal
public class MetricHistogramResult extends IgniteDataTransferObject {
    /** */
    private static final long serialVersionUID = 0L;

    /** */
    private Long[] bounds;

    /** */
    private Long[] value;


    /**
     * Constructor for optimized marshaller.
     */
    public MetricHistogramResult() {
        // No-op.
    }

    /**
     * @param bounds Histogram bounds.
     * @param value Histogram value.
     */
    public MetricHistogramResult(long[] bounds, long[] value) {
        for(int i = 0; i < bounds.length; i++) {
            this.bounds[i] = bounds[i];
        }

        for(int i = 0; i < value.length; i++) {
            this.value[i] = value[i];
        }
    }

    /**
     * Save object's specific data content.
     *
     * @param out Output object to write data content.
     * @throws IOException If I/O errors occur.
     */
    @Override protected void writeExternalData(ObjectOutput out) throws IOException {
        U.writeArray(out, bounds);
        U.writeArray(out, value);
    }

    /**
     * Load object's specific data content.
     *
     * @param protoVer Input object version.
     * @param in       Input object to load data content.
     * @throws IOException            If I/O errors occur.
     * @throws ClassNotFoundException If the class for an object being restored cannot be found.
     */
    @Override protected void readExternalData(byte protoVer,
        ObjectInput in) throws IOException, ClassNotFoundException {
        bounds = U.readArray(in, Long.class);
        value = U.readArray(in, Long.class);
    }

    /**
     * @return Histogram bounds.
     */
    public Long[] bounds() {
        return bounds.clone();
    }

    /**
     * @return Histogram values.
     */
    public Long[] values() {
        return value.clone();
    }
}
