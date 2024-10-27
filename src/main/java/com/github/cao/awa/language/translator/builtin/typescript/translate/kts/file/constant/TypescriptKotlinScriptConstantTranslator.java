package com.github.cao.awa.language.translator.builtin.typescript.translate.kts.file.constant;

import com.github.cao.awa.language.translator.builtin.typescript.translate.base.file.constant.TypescriptConstantTranslator;
import com.github.cao.awa.language.translator.builtin.typescript.translate.kts.TypescriptKotlinScriptTranslator;
import com.github.cao.awa.language.translator.builtin.typescript.tree.result.constant.TypescriptConstant;

public class TypescriptKotlinScriptConstantTranslator extends TypescriptKotlinScriptTranslator<TypescriptConstant<?>> implements TypescriptConstantTranslator<TypescriptConstant<?>> {
    @Override
    public void translate(StringBuilder builder, TypescriptConstant<?> ast) {
        translateConstant(this);
    }
}