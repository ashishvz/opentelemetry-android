/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.android.instrumentation.hybrid.click

internal data class HybridTapTarget(
    val source: String,
    val widgetId: String,
    val widgetName: String,
    val label: String,
    val x: Long,
    val y: Long,
)

