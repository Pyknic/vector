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
package com.github.pyknic.vector.mat;

import com.github.pyknic.vector.mat.internal.Mat3x3fConst;
import com.github.pyknic.vector.mat.internal.Mat3x3fImpl;
import com.github.pyknic.vector.vec.Vec3f;

/**
 * A matrix with the dimensions 3-by-3 backed by {@code float} values.
 *
 * @author Emil Forslund
 * @since  1.1.0
 */
public interface Mat3x3f extends Matf<Mat3x3f> {
    
    /**
     * An immutable 3x3 identity matrix.
     */
    Mat3x3f IDENTITY = constant(
        1f, 0f, 0f,
        0f, 1f, 0f,
        0f, 0f, 1f
    );
    
    /**
     * An immutable 3x3 matrix filled with zeroes.
     */
    Mat3x3f EMPTY = constant(
        0f, 0f, 0f,
        0f, 0f, 0f,
        0f, 0f, 0f
    );
    
    /**
     * Returns a copy of the specified matrix.
     * 
     * @param prototype  the vector to copy
     * @return           the copy
     */
    static Mat3x3f copy(Mat3x3f prototype) {
        return new Mat3x3fImpl(prototype);
    }
    
    /**
     * Returns a new (mutable) matrix with the specified elements.
     * 
     * @param e0_0  the top-left element
     * @param e0_1  the top-center element
     * @param e0_2  the top-right element
     * @param e1_0  the middle-left element
     * @param e1_1  the middle-center element
     * @param e1_2  the middle-right element
     * @param e2_0  the bottom-left element
     * @param e2_1  the bottom-center element
     * @param e2_2  the bottom-right element
     * @return      the new (mutable) matrix
     */
    static Mat3x3f of(float e0_0, float e0_1, float e0_2,
                      float e1_0, float e1_1, float e1_2,
                      float e2_0, float e2_1, float e2_2) {
        
        return new Mat3x3fImpl(
            e0_0, e0_1, e0_2,
            e1_0, e1_1, e1_2,
            e2_0, e2_1, e2_2
        );
    }
    
    /**
     * Returns a new (immutable) matrix with the specified elements.
     * 
     * @param e0_0  the top-left element
     * @param e0_1  the top-center element
     * @param e0_2  the top-right element
     * @param e1_0  the middle-left element
     * @param e1_1  the middle-center element
     * @param e1_2  the middle-right element
     * @param e2_0  the bottom-left element
     * @param e2_1  the bottom-center element
     * @param e2_2  the bottom-right element
     * @return      the new (immutable) matrix
     */
    static Mat3x3f constant(float e0_0, float e0_1, float e0_2,
                            float e1_0, float e1_1, float e1_2,
                            float e2_0, float e2_1, float e2_2) {
        
        return new Mat3x3fConst(
            e0_0, e0_1, e0_2,
            e1_0, e1_1, e1_2,
            e2_0, e2_1, e2_2
        );
    }

    /**
     * Returns the top-left element in this matrix.
     * 
     * @return  the top-left element
     */
    float get0_0();
    
    /**
     * Sets the top-left element in this matrix. The returned matrix might be 
     * either this instance (if mutable) or a new matrix (if immutable).
     * 
     * @param value  the top-left element
     * @return       either this (if mutable) or a new matrix
     */
    Mat3x3f set0_0(float value);
    
    /**
     * Returns the top-center element in this matrix.
     * 
     * @return  the top-center element
     */
    float get0_1();
    
    /**
     * Sets the top-center element in this matrix. The returned matrix might be 
     * either this instance (if mutable) or a new matrix (if immutable).
     * 
     * @param value  the top-center element
     * @return       either this (if mutable) or a new matrix
     */
    Mat3x3f set0_1(float value);
    
    /**
     * Returns the top-right element in this matrix.
     * 
     * @return  the top-right element
     */
    float get0_2();
    
    /**
     * Sets the top-right element in this matrix. The returned matrix might be 
     * either this instance (if mutable) or a new matrix (if immutable).
     * 
     * @param value  the top-right element
     * @return       either this (if mutable) or a new matrix
     */
    Mat3x3f set0_2(float value);
    
    /**
     * Returns the middle-left element in this matrix.
     * 
     * @return  the middle-left element
     */
    float get1_0();
    
    /**
     * Sets the middle-left element in this matrix. The returned matrix might be 
     * either this instance (if mutable) or a new matrix (if immutable).
     * 
     * @param value  the middle-left element
     * @return       either this (if mutable) or a new matrix
     */
    Mat3x3f set1_0(float value);
    
    /**
     * Returns the middle-center element in this matrix.
     * 
     * @return  the middle-center element
     */
    float get1_1();
    
    /**
     * Sets the middle-center element in this matrix. The returned matrix might 
     * be either this instance (if mutable) or a new matrix (if immutable).
     * 
     * @param value  the middle-center element
     * @return       either this (if mutable) or a new matrix
     */
    Mat3x3f set1_1(float value);
    
    /**
     * Returns the middle-right element in this matrix.
     * 
     * @return  the middle-right element
     */
    float get1_2();
    
    /**
     * Sets the middle-right element in this matrix. The returned matrix might 
     * be either this instance (if mutable) or a new matrix (if immutable).
     * 
     * @param value  the middle-right element
     * @return       either this (if mutable) or a new matrix
     */
    Mat3x3f set1_2(float value);
    
    /**
     * Returns the bottom-left element in this matrix.
     * 
     * @return  the bottom-left element
     */
    float get2_0();
    
    /**
     * Sets the bottom-left element in this matrix. The returned matrix might be 
     * either this instance (if mutable) or a new matrix (if immutable).
     * 
     * @param value  the bottom-left element
     * @return       either this (if mutable) or a new matrix
     */
    Mat3x3f set2_0(float value);
    
    /**
     * Returns the bottom-center element in this matrix.
     * 
     * @return  the bottom-center element
     */
    float get2_1();
    
    /**
     * Sets the bottom-center element in this matrix. The returned matrix might 
     * be either this instance (if mutable) or a new matrix (if immutable).
     * 
     * @param value  the bottom-center element
     * @return       either this (if mutable) or a new matrix
     */
    Mat3x3f set2_1(float value);
    
    /**
     * Returns the bottom-right element in this matrix.
     * 
     * @return  the bottom-right element
     */
    float get2_2();
    
    /**
     * Sets the bottom-right element in this matrix. The returned matrix might 
     * be either this instance (if mutable) or a new matrix (if immutable).
     * 
     * @param value  the bottom-right element
     * @return       either this (if mutable) or a new matrix
     */
    Mat3x3f set2_2(float value);
    
    /**
     * Returns a matrix that is an exact copy of the specified matrix. Depending
     * on the implementation of this interface, that might be either this
     * instance (if this is mutable) or a completely new matrix.
     * 
     * @param e0_0  the top-left element
     * @param e0_1  the top-center element
     * @param e0_2  the top-right element
     * @param e1_0  the middle-left element
     * @param e1_1  the middle-center element
     * @param e1_2  the middle-right element
     * @param e2_0  the bottom-left element
     * @param e2_1  the bottom-center element
     * @param e2_2  the bottom-right element
     * @return      either this (if mutable) or a new matrix
     */
    Mat3x3f set(
        float e0_0, float e0_1, float e0_2,
        float e1_0, float e1_1, float e1_2,
        float e2_0, float e2_1, float e2_2
    );
    
    /**
     * Returns a vector that is the product of the multiplication of this matrix
     * and the specified vector. The given vector will be modified in case it is
     * mutable. Otherwise a new vector will be returned.
     * 
     * @param vector  the vector to multiply with
     * @return        the resulting vector
     */
    Vec3f dot(Vec3f vector);
}