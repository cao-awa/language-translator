package com.github.cao.awa.language.translator.builtin.typescript.translate.kts.file.statement;

import com.github.cao.awa.language.translator.builtin.typescript.translate.base.file.statement.TypescriptStatementElementTranslator;
import com.github.cao.awa.language.translator.builtin.typescript.translate.kts.TypescriptKotlinScriptTranslator;
import com.github.cao.awa.language.translator.builtin.typescript.tree.statement.TypescriptStatement;

public class TypescriptKotlinScriptStatementTranslator extends TypescriptKotlinScriptTranslator<TypescriptStatement> implements TypescriptStatementElementTranslator<TypescriptStatement> {
    @Override
    public void translate(StringBuilder builder, TypescriptStatement ast) {
        translateStatement(this);
    }
}
