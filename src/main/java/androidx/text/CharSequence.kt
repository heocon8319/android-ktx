/*
 * Copyright (C) 2018 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:Suppress("NOTHING_TO_INLINE") // Aliases to public API.

package androidx.text

import android.text.TextUtils

/**
 * Returns whether the given [CharSequence] contains only digits.
 *
 * @see TextUtils.isDigitsOnly
 */
inline fun CharSequence.isDigitsOnly() = TextUtils.isDigitsOnly(this)

/**
 * Returns the length that the specified [CharSequence] would have if spaces and ASCII control
 * characters were trimmed from the start and end, as by [String.trim].
 *
 * @see TextUtils.getTrimmedLength
 */
inline fun CharSequence.trimmedLength() = TextUtils.getTrimmedLength(this)
