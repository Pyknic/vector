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

import com.github.pyknic.vector.vec.Vec2i;

/**
 *
 * @author Emil Forslund
 * @since  1.0.0
 */
abstract class AbstractVec2i implements Vec2i {
    
    AbstractVec2i() {}
    
    @Override
    public final Vec2i setX(int x) {
        return set(x, getY());
    }
    
    @Override
    public final Vec2i setY(int y) {
        return set(getX(), y);
    }
    
    @Override
    public final Vec2i set(Vec2i vector) {
        return set(
            vector.getX(), 
            vector.getY()
        );
    }

    @Override
    public final Vec2i plus(int x, int y) {
        return set(getX() + x, getY() + y);
    }

    @Override
    public final Vec2i plus(Vec2i vector) {
        return set(
            getX() + vector.getX(),
            getY() + vector.getY()
        );
    }

    @Override
    public final Vec2i minus(int x, int y) {
        return set(
            getX() - x, 
            getY() - y
        );
    }

    @Override
    public final Vec2i minus(Vec2i vector) {
        return set(
            getX() - vector.getX(),
            getY() - vector.getY()
        );
    }

    @Override
    public final Vec2i scale(int factor) {
        return scale(factor, factor);
    }

    @Override
    public final Vec2i scale(int x, int y) {
        return set(
            getX() * x,
            getY() * y
        );
    }

    @Override
    public final Vec2i scale(Vec2i vector) {
        return set(
            getX() * vector.getX(),
            getY() * vector.getY()
        );
    }

    @Override
    public final int dot(Vec2i vector) {
        return getX() * vector.getX()
             + getY() * vector.getY();
    }

    @Override
    public final double magn2() {
        return (double) getX() * getX()
             + (double) getY() * getY();
    }

    @Override
    public final double magn() {
        return Math.sqrt(magn2());
    }
    
    @Override
    public final Vec2i normalize() {
        if (getX() == 0 && getY() == 0) {
            return this;
        } else {
            final double magn = magn();
            return set(
                (int) (getX() / magn),
                (int) (getY() / magn)
            );
        }
    }
    
    private int hashCode = 0;
    
    @Override
    public final int hashCode() {
        if (hashCode == 0) {
            int hash = 3;
            hash += hash * 97 + getX();
            hash += hash * 97 + getY();
            hashCode = hash;
        }
        
        return hashCode;
    }
    
    @Override
    public final boolean equals(Object obj) {
        if      (this == obj)             return true;
        else if (obj == null)             return false;
        else if (!(obj instanceof Vec2i)) return false;
        
        final Vec2i o = (Vec2i) obj;
        return getX() == o.getX()
            && getY() == o.getY();
    }

    @Override
    public final String toString() {
        return String.format("(%d,%d)", getX(), getY());
    }
}