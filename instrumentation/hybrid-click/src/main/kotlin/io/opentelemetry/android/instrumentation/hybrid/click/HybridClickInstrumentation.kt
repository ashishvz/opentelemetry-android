/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.android.instrumentation.hybrid.click

import com.google.auto.service.AutoService
import io.opentelemetry.android.instrumentation.AndroidInstrumentation
import io.opentelemetry.android.instrumentation.InstallationContext

@AutoService(AndroidInstrumentation::class)
class HybridClickInstrumentation : AndroidInstrumentation {
    override val name: String = "hybrid.click"

    override fun install(ctx: InstallationContext) {
        val tracer =
            ctx.openTelemetry
                .tracerProvider
                .tracerBuilder("io.opentelemetry.android.instrumentation.hybrid.click")
                .build()

        ctx.application?.registerActivityLifecycleCallbacks(
            HybridClickActivityCallback(
                HybridClickEventGenerator(tracer),
            ),
        )
    }
}

