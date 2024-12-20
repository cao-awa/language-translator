package com.github.cao.awa.translator.structuring.builtin.typescript.tree.statement.action;

import com.github.cao.awa.translator.structuring.builtin.typescript.tree.statement.result.TypescriptResultStatement;
import com.github.cao.awa.translator.structuring.builtin.typescript.tree.statement.invoke.access.TypescriptInvokeAccess;
import com.github.cao.awa.translator.structuring.translate.tree.StructuringAst;

public abstract class TypescriptSelfAction extends TypescriptResultStatement {
    private boolean isBefore;
    private TypescriptInvokeAccess access;

    public TypescriptSelfAction access(TypescriptInvokeAccess access) {
        this.access = access;
        return this;
    }

    public TypescriptInvokeAccess access() {
        return this.access;
    }

    public TypescriptSelfAction isBefore(boolean isBefore) {
        this.isBefore = isBefore;
        return this;
    }

    public boolean isBefore() {
        return this.isBefore;
    }

    public TypescriptSelfAction(StructuringAst parent) {
        super(parent);
    }
}
