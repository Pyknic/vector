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
package com.github.pyknic.vector.vec.internal;

import com.github.pyknic.vector.vec.Vec1i;

/**
 *
 * @author Emil Forslund
 * @since  1.0.0
 */
abstract class AbstractVec1i implements Vec1i {
    
    AbstractVec1i() {}
    
    @Override
    public final Vec1i setX(int x) {
        return set(x);
    }

    @Override
    public final Vec1i set(Vec1i vector) {
        return set(vector.getX());
    }

    @Override
    public final Vec1i plus(int scalar) {
        return setX(getX() + scalar);
    }

    @Override
    public final Vec1i plus(Vec1i vector) {
        return setX(getX() + vector.getX());
    }

    @Override
    public final Vec1i minus(int scalar) {
        return setX(getX() - scalar);
    }

    @Override
    public final Vec1i minus(Vec1i vector) {
        return setX(getX() - vector.getX());
    }

    @Override
    public final Vec1i scale(int scalar) {
        return setX(getX() * scalar);
    }

    @Override
    public final Vec1i scale(Vec1i vector) {
        return setX(getX() * vector.getX());
    }

    @Override
    public final int dot(Vec1i vector) {
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
    public final Vec1i normalize() {
        if (getX() != 0) {
            return setX((int) (getX() / magn()));
        }
        
        return this;
    }
    
    @Override
    public final int hashCode() {
        return 291 + getX();
    }

    @Override
    public final boolean equals(Object obj) {
        if      (this == obj)             return true;
        else if (obj == null)             return false;
        else if (!(obj instanceof Vec1i)) return false;
        
        final Vec1i o = (Vec1i) obj;
        return getX() == o.getX();
    }

    @Override
    public final String toString() {
        return String.format("(%d)", getX());
    }
}