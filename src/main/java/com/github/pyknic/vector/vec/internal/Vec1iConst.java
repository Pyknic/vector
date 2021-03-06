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
public final class Vec1iConst extends AbstractVec1i {
    
    private final int x;
    
    public Vec1iConst(int x) {
        this.x = x;
    }
    
    public Vec1iConst(Vec1i prototype) {
        this.x = prototype.getX();
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public Vec1i set(int x) {
        return new Vec1iConst(x);
    }
}