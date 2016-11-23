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

import com.github.pyknic.vector.Vec1d;

/**
 *
 * @author Emil Forslund
 * @since  1.0.0
 */
abstract class AbstractVec1d implements Vec1d {
    
    AbstractVec1d() {}
    
    @Override
    public final Vec1d setX(double x) {
        return set(x);
    }

    @Override
    public final Vec1d set(Vec1d vector) {
        return set(vector.getX());
    }

    @Override
    public final Vec1d plus(double scalar) {
        return setX(getX() + scalar);
    }

    @Override
    public final Vec1d plus(Vec1d vector) {
        return setX(getX() + vector.getX());
    }

    @Override
    public final Vec1d minus(double scalar) {
        return setX(getX() - scalar);
    }

    @Override
    public final Vec1d minus(Vec1d vector) {
        return setX(getX() - vector.getX());
    }

    @Override
    public final Vec1d scale(double scalar) {
        return setX(getX() * scalar);
    }

    @Override
    public final Vec1d scale(Vec1d vector) {
        return setX(getX() * vector.getX());
    }

    @Override
    public final double dot(Vec1d vector) {
        return getX() * vector.getX();
    }

    @Override
    public final double magn2() {
        return  getX() * getX();
    }

    @Override
    public final double magn() {
        return Math.sqrt(magn2());
    }
    
    @Override
    public final Vec1d normalize() {
        if (getX() != 0) {
            return setX( (getX() / magn()));
        }
        
        return this;
    }
    
    @Override
    public final int hashCode() {
        return 291 + Float.floatToIntBits((float) getX());
    }

    @Override
    public final boolean equals(Object obj) {
        if      (this == obj)             return true;
        else if (obj == null)             return false;
        else if (!(obj instanceof Vec1d)) return false;
        
        final Vec1d o = (Vec1d) obj;
        return Float.floatToIntBits((float) getX()) == Float.floatToIntBits((float) o.getX());
    }

    @Override
    public final String toString() {
        return String.format("(%.3f)", getX());
    }
}