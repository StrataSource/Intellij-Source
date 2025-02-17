// This is a generated file. Not intended for manual editing.
package com.enderzombi102.css.lang.angelscript.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.enderzombi102.css.lang.angelscript.psi.AngelScriptElementTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.enderzombi102.css.lang.angelscript.psi.*;

public class AngelScriptExpropImpl extends ASTWrapperPsiElement implements AngelScriptExprop {

  public AngelScriptExpropImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AngelScriptVisitor visitor) {
    visitor.visitExprop(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AngelScriptVisitor) accept((AngelScriptVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AngelScriptBitop getBitop() {
    return findChildByClass(AngelScriptBitop.class);
  }

  @Override
  @Nullable
  public AngelScriptCompop getCompop() {
    return findChildByClass(AngelScriptCompop.class);
  }

  @Override
  @Nullable
  public AngelScriptLogicop getLogicop() {
    return findChildByClass(AngelScriptLogicop.class);
  }

  @Override
  @Nullable
  public AngelScriptMathop getMathop() {
    return findChildByClass(AngelScriptMathop.class);
  }

}
