/*
 * Copyright (c) 2013, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package java.lang.reflect;

import android.compat.annotation.UnsupportedAppUsage;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class Parameter implements java.lang.reflect.AnnotatedElement {

    @UnsupportedAppUsage(maxTargetSdk = 30, trackingBug = 170729553)
    Parameter(
            java.lang.String name,
            int modifiers,
            java.lang.reflect.Executable executable,
            int index) {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(java.lang.Object obj) {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
        throw new RuntimeException("Stub!");
    }

    public boolean isNamePresent() {
        throw new RuntimeException("Stub!");
    }

    public java.lang.String toString() {
        throw new RuntimeException("Stub!");
    }

    public java.lang.reflect.Executable getDeclaringExecutable() {
        throw new RuntimeException("Stub!");
    }

    public int getModifiers() {
        throw new RuntimeException("Stub!");
    }

    public java.lang.String getName() {
        throw new RuntimeException("Stub!");
    }

    java.lang.String getRealName() {
        throw new RuntimeException("Stub!");
    }

    public java.lang.reflect.Type getParameterizedType() {
        throw new RuntimeException("Stub!");
    }

    public java.lang.Class<?> getType() {
        throw new RuntimeException("Stub!");
    }

    public boolean isImplicit() {
        throw new RuntimeException("Stub!");
    }

    public boolean isSynthetic() {
        throw new RuntimeException("Stub!");
    }

    public boolean isVarArgs() {
        throw new RuntimeException("Stub!");
    }

    public <T extends java.lang.annotation.Annotation> T getAnnotation(
            java.lang.Class<T> annotationClass) {
        throw new RuntimeException("Stub!");
    }

    private static native <A extends java.lang.annotation.Annotation> A getAnnotationNative(
            java.lang.reflect.Executable executable,
            int parameterIndex,
            java.lang.Class<A> annotationType);

    public <T extends java.lang.annotation.Annotation> T[] getAnnotationsByType(
            java.lang.Class<T> annotationClass) {
        throw new RuntimeException("Stub!");
    }

    public java.lang.annotation.Annotation[] getDeclaredAnnotations() {
        throw new RuntimeException("Stub!");
    }

    public <T extends java.lang.annotation.Annotation> T getDeclaredAnnotation(
            java.lang.Class<T> annotationClass) {
        throw new RuntimeException("Stub!");
    }

    public <T extends java.lang.annotation.Annotation> T[] getDeclaredAnnotationsByType(
            java.lang.Class<T> annotationClass) {
        throw new RuntimeException("Stub!");
    }

    public java.lang.annotation.Annotation[] getAnnotations() {
        throw new RuntimeException("Stub!");
    }

    private final java.lang.reflect.Executable executable;

    {
        executable = null;
    }

    private final int index;

    {
        index = 0;
    }

    private final int modifiers;

    {
        modifiers = 0;
    }

    private final java.lang.String name;

    {
        name = null;
    }

    private transient volatile java.lang.Class<?> parameterClassCache;

    private transient volatile java.lang.reflect.Type parameterTypeCache;
}
