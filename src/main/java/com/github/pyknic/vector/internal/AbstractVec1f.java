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

import com.github.pyknic.vector.Vec1f;

/**
 *
 * @author Emil Forslund
 * @since  1.0.0
 */
abstract class AbstractVec1f implements Vec1f {
    
    AbstractVec1f() {}
    
    @Override
    public final Vec1f setX(float x) {
        return set(x);
    }

    @Override
    public final Vec1f plus(float scalar) {
        return setX(getX() + scalar);
    }

    @Override
    public final Vec1f plus(Vec1f vector) {
        return setX(getX() + vector.getX());
    }

    @Override
    public final Vec1f minus(float scalar) {
        return setX(getX() - scalar);
    }

    @Override
    public final Vec1f minus(Vec1f vector) {
        return setX(getX() - vector.getX());
    }

    @Override
    public final Vec1f scale(float scalar) {
        return setX(getX() * scalar);
    }

    @Override
    public final Vec1f scale(Vec1f vector) {
        return setX(getX() * vector.getX());
    }

    @Override
    public final float dot(Vec1f vector) {
        return getX() * vector.getX();
    }

    @Override
    public final double magn2() {
        return (double) getX() * getX();
    }

    @Override
    public final double magn() {
        return Math.sqrt(magn2());
    }

    @Override
    public final Vec1f normalize() {
        if (getX() != 0) {
            return setX((float) (getX() / magn()));
        }
        
        return this;
    }
    
    @Override
    public final int hashCode() {
        return 291 + Float.floatToIntBits(getX());
    }

    @Override
    public final boolean equals(Object obj) {
        if      (this == obj)             return true;
        else if (obj == null)             return false;
        else if (!(obj instanceof Vec1f)) return false;
        
        final Vec1f other = (Vec1f) obj;
        return Float.floatToIntBits(getX()) 
            == Float.floatToIntBits(other.getX());
    }

    @Override
    public final String toString() {
        return String.format("(%.3f)", getX());
    }
}