/**
 *
 * Copyright (c) 2016-2016, Emil Forslund. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.github.pyknic.vector.internal;

import com.github.pyknic.vector.Vec4f;

/**
 *
 * @author Emil Forslund
 * @since  1.0.0
 */
abstract class AbstractVec4f implements Vec4f {
    
    AbstractVec4f() {}
    
    @Override
    public final Vec4f setX(float x) {
        return set(x, getY(), getZ(), getW());
    }
    
    @Override
    public final Vec4f setY(float y) {
        return set(getX(), y, getZ(), getW());
    }
    
    @Override
    public final Vec4f setZ(float z) {
        return set(getX(), getY(), z, getW());
    }
    
    @Override
    public final Vec4f setW(float w) {
        return set(getX(), getY(), getZ(), w);
    }

    @Override
    public final Vec4f plus(float x, float y, float z, float w) {
        return set(getX() + x, getY() + y, getZ() + z, getW() + w);
    }

    @Override
    public final Vec4f plus(Vec4f vector) {
        return set(
            getX() + vector.getX(),
            getY() + vector.getY(),
            getZ() + vector.getZ(),
            getW() + vector.getW()
        );
    }

    @Override
    public final Vec4f minus(float x, float y, float z, float w) {
        return set(
            getX() - x, 
            getY() - y,
            getZ() - z,
            getW() - w
        );
    }

    @Override
    public final Vec4f minus(Vec4f vector) {
        return set(
            getX() - vector.getX(),
            getY() - vector.getY(),
            getZ() - vector.getZ(),
            getW() - vector.getW()
        );
    }

    @Override
    public final Vec4f scale(float factor) {
        return scale(factor, factor, factor, factor);
    }

    @Override
    public final Vec4f scale(float x, float y, float z, float w) {
        return set(
            getX() * x,
            getY() * y,
            getZ() * z,
            getW() * w
        );
    }

    @Override
    public final Vec4f scale(Vec4f vector) {
        return set(
            getX() * vector.getX(),
            getY() * vector.getY(),
            getZ() * vector.getZ(),
            getW() * vector.getW()
        );
    }

    @Override
    public final float dot(Vec4f vector) {
        return getX() * vector.getX()
             + getY() * vector.getY()
             + getZ() * vector.getZ()
             + getW() * vector.getW();
    }

    @Override
    public final double magn2() {
        return (double) getX() * getX()
             + (double) getY() * getY()
             + (double) getZ() * getZ()
             + (double) getW() * getW();
    }

    @Override
    public final double magn() {
        return Math.sqrt(magn2());
    }

    @Override
    public final Vec4f normalize() {
        if (getX() == 0 && getY() == 0 && getZ() == 0 && getW() == 0) {
            return this;
        } else {
            final double magn = magn();
            return set(
                (float) (getX() / magn),
                (float) (getY() / magn),
                (float) (getZ() / magn),
                (float) (getW() / magn)
            );
        }
    }
    
    @Override
    public final int hashCode() {
        int hash = 3;
        hash += hash * 97 + Float.floatToIntBits(getX());
        hash += hash * 97 + Float.floatToIntBits(getY());
        hash += hash * 97 + Float.floatToIntBits(getZ());
        hash += hash * 97 + Float.floatToIntBits(getW());
        return hash;
    }

    @Override
    public final boolean equals(Object obj) {
        if      (this == obj)             return true;
        else if (obj == null)             return false;
        else if (!(obj instanceof Vec4f)) return false;
        
        final Vec4f other = (Vec4f) obj;
        return Float.floatToIntBits(getX()) 
            == Float.floatToIntBits(other.getX())
            && Float.floatToIntBits(getY()) 
            == Float.floatToIntBits(other.getY())
            && Float.floatToIntBits(getZ()) 
            == Float.floatToIntBits(other.getZ())
            && Float.floatToIntBits(getW()) 
            == Float.floatToIntBits(other.getW());
    }

    @Override
    public final String toString() {
        return String.format(
            "(%.3f,%.3f,%.3f,%.3f)", 
            getX(), getY(), getZ(), getW()
        );
    }
}