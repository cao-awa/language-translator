package com.github.cao.awa.language.translator.builtin.typescript.translate.kts.file.constant.undefined;

import com.github.cao.awa.language.translator.builtin.typescript.translate.base.file.constant.string.TypescriptStringTranslator;
import com.github.cao.awa.language.translator.builtin.typescript.translate.kts.TypescriptKotlinScriptTranslator;
import com.github.cao.awa.language.translator.builtin.typescript.tree.result.constant.string.TypescriptString;

public class TypescriptKotlinScriptNullTranslator extends TypescriptKotlinScriptTranslator<TypescriptString> implements TypescriptStringTranslator {
    @Override
    public void translate(StringBuilder builder, TypescriptString ast) {
        builder.append("null");
    }
}