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

import com.github.pyknic.vector.vec.Vec2f;

/**
 *
 * @author Emil Forslund
 * @since  1.0.0
 */
abstract class AbstractVec2f implements Vec2f {
    
    AbstractVec2f() {}
    
    @Override
    public final Vec2f setX(float x) {
        return set(x, getY());
    }
    
    @Override
    public final Vec2f setY(float y) {
        return set(getX(), y);
    }
    
    @Override
    public final Vec2f set(Vec2f vector) {
        return set(
            vector.getX(), 
            vector.getY()
        );
    }

    @Override
    public final Vec2f plus(float x, float y) {
        return set(getX() + x, getY() + y);
    }

    @Override
    public final Vec2f plus(Vec2f vector) {
        return set(
            getX() + vector.getX(),
            getY() + vector.getY()
        );
    }

    @Override
    public final Vec2f minus(float x, float y) {
        return set(
            getX() - x, 
            getY() - y
        );
    }

    @Override
    public final Vec2f minus(Vec2f vector) {
        return set(
            getX() - vector.getX(),
            getY() - vector.getY()
        );
    }

    @Override
    public final Vec2f scale(float factor) {
        return scale(factor, factor);
    }

    @Override
    public final Vec2f scale(float x, float y) {
        return set(
            getX() * x,
            getY() * y
        );
    }

    @Override
    public final Vec2f scale(Vec2f vector) {
        return set(
            getX() * vector.getX(),
            getY() * vector.getY()
        );
    }

    @Override
    public final float dot(Vec2f vector) {
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
    public final Vec2f normalize() {
        if (getX() == 0 && getY() == 0) {
            return this;
        } else {
            final double magn = magn();
            return set(
                (float) (getX() / magn),
                (float) (getY() / magn)
            );
        }
    }
    
    private int hashCode = 0;
    
    @Override
    public final int hashCode() {
        if (hashCode == 0) {
            int hash = 3;
            hash += hash * 97 + Float.floatToIntBits(getX());
            hash += hash * 97 + Float.floatToIntBits(getY());
            hashCode = hash;
        }
        
        return hashCode;
    }
    
    @Override
    public final boolean equals(Object obj) {
        if      (this == obj)             return true;
        else if (obj == null)             return false;
        else if (!(obj instanceof Vec2f)) return false;
        
        final Vec2f o = (Vec2f) obj;
        return Float.floatToIntBits(getX()) == Float.floatToIntBits(o.getX())
            && Float.floatToIntBits(getY()) == Float.floatToIntBits(o.getY());
    }

    @Override
    public final String toString() {
        return String.format("(%.3f,%.3f)", getX(), getY());
    }
}