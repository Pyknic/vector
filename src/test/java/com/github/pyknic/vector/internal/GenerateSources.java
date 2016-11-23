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
import com.github.pyknic.vector.Vec2f;
import com.github.pyknic.vector.Vec3f;
import com.github.pyknic.vector.Vec4f;
import com.github.pyknic.vector.Vecf;
import java.io.IOException;
import static java.nio.charset.StandardCharsets.UTF_8;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.util.stream.Collectors.joining;

/**
 *
 * @author Emil Forslund
 * @since  1.0.0
 */
public final class GenerateSources {
    
    private final static Path ROOT = Paths.get("src", "main", "java");
    
    public static void main(String... param) {
        
        final Config intConfig = new Config(
            "i", "int", "Integer", "Int", "", "", "", "%d"
        );
        
        for (final Class<?> prototype : PROTOTYPES) {
            final Path path = ROOT.resolve(
                prototype.getName().replace('.', '/') + ".java"
            );
            
            try {
                final String filename = intConfig.applyAllRules(
                    path.getFileName().toString()
                );
                final Path target = path.getParent().resolve(filename);
                final String content = Files.lines(path)
                    .map(intConfig::applyAllRules)
                    .collect(joining("\n"));
                
                Files.write(target, content.getBytes(UTF_8));
            } catch (final IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
    
    private final static String ACRONYM        = "%1$s",
                                PRIMITIVE      = "%2$s",
                                WRAPPER        = "%3$s",
                                UC_PRIMITIVE   = "%4$s",
                                SUFFIX         = "%5$s",
                                TO_BITS_PREFIX = "%6$s",
                                TO_BITS_SUFFIX = "%7$s",
                                FORMAT         = "%8$s";
    
    private final static Class<?>[] PROTOTYPES = {
        Vecf.class,
        Vec1f.class,
        Vec2f.class,
        Vec3f.class,
        Vec4f.class,
        AbstractVec1f.class,
        AbstractVec2f.class,
        AbstractVec3f.class,
        AbstractVec4f.class,
        Vec1fConst.class,
        Vec2fConst.class,
        Vec3fConst.class,
        Vec4fConst.class,
        Vec1fImpl.class,
        Vec2fImpl.class,
        Vec3fImpl.class,
        Vec4fImpl.class
    };
    
    private final static Rule[] RULES = {
        rule("Vecf", "Vec" + ACRONYM),
        rule("Vec1f", "Vec1" + ACRONYM),
        rule("Vec2f", "Vec2" + ACRONYM),
        rule("Vec3f", "Vec3" + ACRONYM),
        rule("Vec4f", "Vec4" + ACRONYM),
        rule("%.3f", FORMAT),
        rule("Float\\.floatToIntBits\\(getX\\(\\)\\)", TO_BITS_PREFIX + "getX()" + TO_BITS_SUFFIX),
        rule("Float\\.floatToIntBits\\(getY\\(\\)\\)", TO_BITS_PREFIX + "getY()" + TO_BITS_SUFFIX),
        rule("Float\\.floatToIntBits\\(getZ\\(\\)\\)", TO_BITS_PREFIX + "getZ()" + TO_BITS_SUFFIX),
        rule("Float\\.floatToIntBits\\(getW\\(\\)\\)", TO_BITS_PREFIX + "getW()" + TO_BITS_SUFFIX),
        rule("Float\\.floatToIntBits\\(o\\.getX\\(\\)\\)", TO_BITS_PREFIX + "o.getX()" + TO_BITS_SUFFIX),
        rule("Float\\.floatToIntBits\\(o\\.getY\\(\\)\\)", TO_BITS_PREFIX + "o.getY()" + TO_BITS_SUFFIX),
        rule("Float\\.floatToIntBits\\(o\\.getZ\\(\\)\\)", TO_BITS_PREFIX + "o.getZ()" + TO_BITS_SUFFIX),
        rule("Float\\.floatToIntBits\\(o\\.getW\\(\\)\\)", TO_BITS_PREFIX + "o.getW()" + TO_BITS_SUFFIX),
        rule("float", PRIMITIVE),
        rule("Float ", WRAPPER + " "),
        rule("Float\\.", WRAPPER + "."),
        rule("Float\\)", WRAPPER + ")"),
        rule("Float", UC_PRIMITIVE),
        rule("0f", "0" + SUFFIX),
        rule("1f", "1" + SUFFIX)
    };
    
    private static Rule rule(String regex, String replacement) {
        return new Rule(regex, replacement);
    }
    
    private final static class Rule {
        
        private final Pattern pattern;
        private final String replacement;

        public Rule(String regex, String replacement) {
            this.pattern     = Pattern.compile(regex);
            this.replacement = replacement;
        }
        
        public String apply(String str, Config config) {
            final Matcher matcher = pattern.matcher(str);
            return matcher.replaceAll(String.format(replacement,
                config.acronym,
                config.primitive,
                config.wrapper,
                config.ucPrimitive,
                config.suffix,
                config.toBitsPrefix,
                config.toBitsSuffix,
                config.format
            ));
        }
    }
    
    private final static class Config {
        
        private final String acronym;
        private final String primitive;
        private final String wrapper;
        private final String ucPrimitive;
        private final String suffix;
        private final String toBitsPrefix;
        private final String toBitsSuffix;
        private final String format;

        public Config(
                String acronym, 
                String primitive, 
                String wrapper, 
                String ucPrimitive,
                String suffix,
                String toBitsPrefix,
                String toBitsSuffix,
                String format) {
            
            this.acronym      = acronym;
            this.primitive    = primitive;
            this.wrapper      = wrapper;
            this.ucPrimitive  = ucPrimitive;
            this.suffix       = suffix;
            this.toBitsPrefix = toBitsPrefix;
            this.toBitsSuffix = toBitsSuffix;
            this.format       = format;
        }
        
        public String applyAllRules(String line) {
            String result = line;
            for (final Rule rule : RULES) {
                result = rule.apply(result, this);
            }
            return result;
        }
    }
}